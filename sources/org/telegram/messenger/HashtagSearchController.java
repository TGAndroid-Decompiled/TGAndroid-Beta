package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public class HashtagSearchController {
    public static final int HISTORY_LIMIT = 100;
    private static volatile HashtagSearchController[] Instance = new HashtagSearchController[4];
    private static final Object[] lockObjects = new Object[4];
    private final SearchResult channelPostsSearch;
    public final int currentAccount;
    public final ArrayList<String> history = new ArrayList<>();
    private final SharedPreferences historyPreferences;
    private final SearchResult localPostsSearch;
    private final SearchResult myMessagesSearch;

    public static final class MessageCompositeID {
        final long dialog_id;
        final int f19641id;

        public MessageCompositeID(TLRPC.Message message) {
            this(MessageObject.getDialogId(message), message.f22401id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && MessageCompositeID.class == obj.getClass()) {
                MessageCompositeID messageCompositeID = (MessageCompositeID) obj;
                if (this.dialog_id == messageCompositeID.dialog_id && this.f19641id == messageCompositeID.f19641id) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialog_id), Integer.valueOf(this.f19641id));
        }

        public MessageCompositeID(long j10, int i9) {
            this.dialog_id = j10;
            this.f19641id = i9;
        }
    }

    public static class SearchResult {
        public Runnable cancel;
        public int count;
        private final int currentAccount;
        public boolean endReached;
        public String lastHashtag;
        public int lastOffsetId;
        public TLRPC.Peer lastOffsetPeer;
        public int lastOffsetRate;
        public boolean loading;
        public int selectedIndex;
        public final ArrayList<MessageObject> messages = new ArrayList<>();
        public final HashMap<MessageCompositeID, Integer> generatedIds = new HashMap<>();
        public int reqId = -1;
        public int lastGeneratedId = Integer.MAX_VALUE;

        public SearchResult(int i9) {
            this.currentAccount = i9;
        }

        public void clear() {
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            Runnable runnable = this.cancel;
            if (runnable != null) {
                runnable.run();
                this.cancel = null;
            }
            this.messages.clear();
            this.generatedIds.clear();
            this.lastOffsetRate = 0;
            this.lastOffsetId = 0;
            this.lastOffsetPeer = null;
            this.lastGeneratedId = 2147483637;
            this.lastHashtag = null;
            this.selectedIndex = 0;
            this.count = 0;
            this.endReached = false;
        }

        public int getMask() {
            int i9 = 1;
            if (this.selectedIndex >= this.messages.size() - 1) {
                i9 = 0;
            }
            if (this.selectedIndex > 0) {
                return i9 | 2;
            }
            return i9;
        }
    }

    static {
        for (int i9 = 0; i9 < 4; i9++) {
            lockObjects[i9] = new Object();
        }
    }

    private HashtagSearchController(int i9) {
        this.currentAccount = i9;
        this.myMessagesSearch = new SearchResult(i9);
        this.channelPostsSearch = new SearchResult(i9);
        this.localPostsSearch = new SearchResult(i9);
        Context context = ApplicationLoader.applicationContext;
        this.historyPreferences = context.getSharedPreferences("hashtag_search_history" + i9, 0);
        loadHistoryFromPref();
    }

    public static HashtagSearchController getInstance(int i9) {
        HashtagSearchController hashtagSearchController;
        HashtagSearchController hashtagSearchController2 = Instance[i9];
        if (hashtagSearchController2 == null) {
            synchronized (lockObjects[i9]) {
                try {
                    hashtagSearchController = Instance[i9];
                    if (hashtagSearchController == null) {
                        HashtagSearchController[] hashtagSearchControllerArr = Instance;
                        HashtagSearchController hashtagSearchController3 = new HashtagSearchController(i9);
                        hashtagSearchControllerArr[i9] = hashtagSearchController3;
                        hashtagSearchController = hashtagSearchController3;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return hashtagSearchController;
        }
        return hashtagSearchController2;
    }

    public void lambda$searchHashtag$0(SearchResult searchResult, String str, String str2, Runnable[] runnableArr, int i9, int i10, int i11, Long l10) {
        if (TextUtils.equals(searchResult.lastHashtag, str)) {
            if (MessagesController.getInstance(this.currentAccount).getUserOrChat(str2) == null) {
                if (runnableArr[0] == searchResult.cancel) {
                    searchResult.cancel = null;
                    searchResult.loading = false;
                    searchResult.endReached = true;
                    searchResult.count = 0;
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i9), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
                    return;
                }
                return;
            }
            searchHashtag(str, i9, i10, i11);
        }
    }

    public void lambda$searchHashtag$1(int[] iArr, SearchResult searchResult, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i9, int i10, int i11) {
        boolean z10;
        if (iArr[0] == searchResult.reqId) {
            searchResult.reqId = -1;
            searchResult.loading = false;
            searchResult.lastOffsetRate = messages_messages.next_rate;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                MessageObject messageObject = (MessageObject) obj;
                MessageCompositeID messageCompositeID = new MessageCompositeID(messageObject.messageOwner);
                Integer num = searchResult.generatedIds.get(messageCompositeID);
                if (num == null) {
                    int i13 = searchResult.lastGeneratedId;
                    searchResult.lastGeneratedId = i13 - 1;
                    num = Integer.valueOf(i13);
                    searchResult.generatedIds.put(messageCompositeID, num);
                    searchResult.messages.add(messageObject);
                }
                TLRPC.Message message = messageObject.messageOwner;
                message.realId = message.f22401id;
                message.f22401id = num.intValue();
            }
            if (!messages_messages.messages.isEmpty()) {
                TLRPC.Message message2 = (TLRPC.Message) j3.r0.j(1, messages_messages.messages);
                searchResult.lastOffsetId = message2.realId;
                searchResult.lastOffsetPeer = message2.peer_id;
            }
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            if (messages_messages.messages.size() < i9) {
                z10 = true;
            } else {
                z10 = false;
            }
            searchResult.endReached = z10;
            searchResult.count = Math.max(messages_messages.count, messages_messages.messages.size());
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, 0L, Integer.valueOf(arrayList.size()), arrayList, Boolean.FALSE, 0, 0, 0, 0, 2, Boolean.TRUE, Integer.valueOf(i10), Integer.valueOf(i11), 0, 0, 7);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i10), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
        }
    }

    public void lambda$searchHashtag$2(int i9, String str, final int[] iArr, final SearchResult searchResult, final int i10, final int i11, final int i12, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            final ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i13 = 0;
            while (i13 < size) {
                TLRPC.Message message = arrayList2.get(i13);
                i13++;
                MessageObject messageObject = new MessageObject(this.currentAccount, message, null, null, null, null, null, true, true, 0L, false, false, false, i9);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, false);
                arrayList.add(messageObject);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    HashtagSearchController.this.lambda$searchHashtag$1(iArr, searchResult, messages_messages, arrayList, i10, i11, i12);
                }
            });
        }
    }

    private void loadHistoryFromPref() {
        int i9 = this.historyPreferences.getInt("count", 0);
        this.history.clear();
        this.history.ensureCapacity(i9);
        for (int i10 = 0; i10 < i9; i10++) {
            SharedPreferences sharedPreferences = this.historyPreferences;
            String string = sharedPreferences.getString("e_" + i10, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            this.history.add(string);
        }
    }

    private void saveHistoryToPref() {
        SharedPreferences.Editor edit = this.historyPreferences.edit();
        edit.clear();
        edit.putInt("count", this.history.size());
        for (int i9 = 0; i9 < this.history.size(); i9++) {
            edit.putString(j3.r0.l(i9, "e_"), this.history.get(i9));
        }
        edit.apply();
    }

    public void clearHistory() {
        this.history.clear();
        saveHistoryToPref();
    }

    public void clearSearchResults() {
        this.myMessagesSearch.clear();
        this.channelPostsSearch.clear();
    }

    public int getCount(int i9) {
        return getSearchResult(i9).count;
    }

    public ArrayList<MessageObject> getMessages(int i9) {
        return getSearchResult(i9).messages;
    }

    public SearchResult getSearchResult(int i9) {
        if (i9 == 1) {
            return this.myMessagesSearch;
        }
        if (i9 == 2) {
            return this.channelPostsSearch;
        }
        if (i9 == 3) {
            return this.localPostsSearch;
        }
        throw new RuntimeException("Unknown search type");
    }

    public boolean isEndReached(int i9) {
        return getSearchResult(i9).endReached;
    }

    public void jumpToMessage(int i9, int i10, int i11) {
        SearchResult searchResult = getSearchResult(i11);
        if (i10 >= 0 && i10 < searchResult.messages.size()) {
            searchResult.selectedIndex = i10;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i9), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), Integer.valueOf(searchResult.messages.get(i10).messageOwner.f22401id));
        }
    }

    public void putToHistory(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            int indexOf = this.history.indexOf(str);
            if (indexOf != -1) {
                if (indexOf == 0) {
                    return;
                }
                this.history.remove(indexOf);
            }
            this.history.add(0, str);
            if (this.history.size() >= 100) {
                ArrayList<String> arrayList = this.history;
                arrayList.subList(99, arrayList.size()).clear();
            }
            saveHistoryToPref();
        }
    }

    public void removeHashtagFromHistory(String str) {
        int indexOf = this.history.indexOf(str);
        if (indexOf != -1) {
            this.history.remove(indexOf);
            saveHistoryToPref();
        }
    }

    public void searchHashtag(String str, final int i9, final int i10, final int i11) {
        final String str2;
        String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final SearchResult searchResult = getSearchResult(i10);
        if (searchResult.lastHashtag != null || str != null) {
            if (str == null || !str.isEmpty()) {
                if (str == null) {
                    str = searchResult.lastHashtag;
                } else if (!TextUtils.equals(str, searchResult.lastHashtag)) {
                    searchResult.clear();
                } else if (searchResult.loading) {
                    return;
                }
                final String str4 = str;
                searchResult.lastHashtag = str4;
                int indexOf = str4.indexOf(64);
                TLObject tLObject = null;
                if (indexOf >= 0) {
                    String substring = str4.substring(indexOf + 1);
                    str3 = str4.substring(0, indexOf);
                    str2 = substring;
                } else {
                    str2 = null;
                    str3 = str4;
                }
                searchResult.loading = true;
                if (!TextUtils.isEmpty(str2) && (tLObject = MessagesController.getInstance(this.currentAccount).getUserOrChat(str2)) == null) {
                    Runnable resolve = MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new d5.d() {
                        @Override
                        public final void accept(Object obj) {
                            HashtagSearchController.this.lambda$searchHashtag$0(searchResult, str4, str2, r5, i9, i10, i11, (Long) obj);
                        }
                    });
                    searchResult.cancel = resolve;
                    final Runnable[] runnableArr = {resolve};
                    return;
                }
                if (i10 == 1) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = 21;
                    tL_messages_searchGlobal.f22491q = str4;
                    tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_messages_searchGlobal;
                    if (searchResult.lastOffsetPeer != null) {
                        tL_messages_searchGlobal.offset_rate = searchResult.lastOffsetRate;
                        tL_messages_searchGlobal.offset_id = searchResult.lastOffsetId;
                        tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                        tL_channels_searchPosts = tL_messages_searchGlobal;
                    }
                } else if (tLObject != null) {
                    TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                    tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                    tL_messages_search.peer = MessagesController.getInputPeer(tLObject);
                    tL_messages_search.f22489q = str3;
                    tL_messages_search.limit = 21;
                    int i12 = searchResult.lastOffsetId;
                    if (i12 != 0) {
                        tL_messages_search.offset_id = i12;
                    }
                    tL_channels_searchPosts = tL_messages_search;
                } else {
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts2 = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts2.flags |= 1;
                    tL_channels_searchPosts2.hashtag = str4;
                    tL_channels_searchPosts2.limit = 21;
                    tL_channels_searchPosts2.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    tL_channels_searchPosts = tL_channels_searchPosts2;
                    if (searchResult.lastOffsetPeer != null) {
                        tL_channels_searchPosts2.offset_rate = searchResult.lastOffsetRate;
                        tL_channels_searchPosts2.offset_id = searchResult.lastOffsetId;
                        tL_channels_searchPosts2.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                        tL_channels_searchPosts = tL_channels_searchPosts2;
                    }
                }
                int sendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_searchPosts, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                        HashtagSearchController.this.lambda$searchHashtag$2(i10, str4, r4, searchResult, 21, i9, i11, tLObject2, tL_error);
                    }
                });
                searchResult.reqId = sendRequest;
                final int[] iArr = {sendRequest};
            }
        }
    }

    public void clearSearchResults(int i9) {
        getSearchResult(i9).clear();
    }
}
