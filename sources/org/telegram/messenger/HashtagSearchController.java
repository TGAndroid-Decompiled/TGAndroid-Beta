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
        final int f14637id;

        public MessageCompositeID(TLRPC.Message message) {
            this(MessageObject.getDialogId(message), message.f17216id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && MessageCompositeID.class == obj.getClass()) {
                MessageCompositeID messageCompositeID = (MessageCompositeID) obj;
                if (this.dialog_id == messageCompositeID.dialog_id && this.f14637id == messageCompositeID.f14637id) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialog_id), Integer.valueOf(this.f14637id));
        }

        public MessageCompositeID(long j3, int i10) {
            this.dialog_id = j3;
            this.f14637id = i10;
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

        public SearchResult(int i10) {
            this.currentAccount = i10;
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
            int i10 = 1;
            if (this.selectedIndex >= this.messages.size() - 1) {
                i10 = 0;
            }
            if (this.selectedIndex > 0) {
                return i10 | 2;
            }
            return i10;
        }
    }

    static {
        for (int i10 = 0; i10 < 4; i10++) {
            lockObjects[i10] = new Object();
        }
    }

    private HashtagSearchController(int i10) {
        this.currentAccount = i10;
        this.myMessagesSearch = new SearchResult(i10);
        this.channelPostsSearch = new SearchResult(i10);
        this.localPostsSearch = new SearchResult(i10);
        Context context = ApplicationLoader.applicationContext;
        this.historyPreferences = context.getSharedPreferences("hashtag_search_history" + i10, 0);
        loadHistoryFromPref();
    }

    public static HashtagSearchController getInstance(int i10) {
        HashtagSearchController hashtagSearchController;
        HashtagSearchController hashtagSearchController2 = Instance[i10];
        if (hashtagSearchController2 == null) {
            synchronized (lockObjects[i10]) {
                try {
                    hashtagSearchController = Instance[i10];
                    if (hashtagSearchController == null) {
                        HashtagSearchController[] hashtagSearchControllerArr = Instance;
                        HashtagSearchController hashtagSearchController3 = new HashtagSearchController(i10);
                        hashtagSearchControllerArr[i10] = hashtagSearchController3;
                        hashtagSearchController = hashtagSearchController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hashtagSearchController;
        }
        return hashtagSearchController2;
    }

    public void lambda$searchHashtag$0(SearchResult searchResult, String str, String str2, Runnable[] runnableArr, int i10, int i11, int i12, Long l4) {
        if (TextUtils.equals(searchResult.lastHashtag, str)) {
            if (MessagesController.getInstance(this.currentAccount).getUserOrChat(str2) == null) {
                if (runnableArr[0] == searchResult.cancel) {
                    searchResult.cancel = null;
                    searchResult.loading = false;
                    searchResult.endReached = true;
                    searchResult.count = 0;
                    NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i10), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
                    return;
                }
                return;
            }
            searchHashtag(str, i10, i11, i12);
        }
    }

    public void lambda$searchHashtag$1(int[] iArr, SearchResult searchResult, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i10, int i11, int i12) {
        boolean z10;
        if (iArr[0] == searchResult.reqId) {
            searchResult.reqId = -1;
            searchResult.loading = false;
            searchResult.lastOffsetRate = messages_messages.next_rate;
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                MessageObject messageObject = (MessageObject) obj;
                MessageCompositeID messageCompositeID = new MessageCompositeID(messageObject.messageOwner);
                Integer num = searchResult.generatedIds.get(messageCompositeID);
                if (num == null) {
                    int i14 = searchResult.lastGeneratedId;
                    searchResult.lastGeneratedId = i14 - 1;
                    num = Integer.valueOf(i14);
                    searchResult.generatedIds.put(messageCompositeID, num);
                    searchResult.messages.add(messageObject);
                }
                TLRPC.Message message = messageObject.messageOwner;
                message.realId = message.f17216id;
                message.f17216id = num.intValue();
            }
            if (!messages_messages.messages.isEmpty()) {
                TLRPC.Message message2 = (TLRPC.Message) hc.b.i(1, messages_messages.messages);
                searchResult.lastOffsetId = message2.realId;
                searchResult.lastOffsetPeer = message2.peer_id;
            }
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            if (messages_messages.messages.size() < i10) {
                z10 = true;
            } else {
                z10 = false;
            }
            searchResult.endReached = z10;
            searchResult.count = Math.max(messages_messages.count, messages_messages.messages.size());
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, 0L, Integer.valueOf(arrayList.size()), arrayList, Boolean.FALSE, 0, 0, 0, 0, 2, Boolean.TRUE, Integer.valueOf(i11), Integer.valueOf(i12), 0, 0, 7);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i11), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
        }
    }

    public void lambda$searchHashtag$2(int i10, String str, final int[] iArr, final SearchResult searchResult, final int i11, final int i12, final int i13, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            final ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i14 = 0;
            while (i14 < size) {
                TLRPC.Message message = arrayList2.get(i14);
                i14++;
                MessageObject messageObject = new MessageObject(this.currentAccount, message, null, null, null, null, null, true, true, 0L, false, false, false, i10);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, false);
                arrayList.add(messageObject);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    HashtagSearchController.this.lambda$searchHashtag$1(iArr, searchResult, messages_messages, arrayList, i11, i12, i13);
                }
            });
        }
    }

    private void loadHistoryFromPref() {
        int i10 = this.historyPreferences.getInt("count", 0);
        this.history.clear();
        this.history.ensureCapacity(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            SharedPreferences sharedPreferences = this.historyPreferences;
            String string = sharedPreferences.getString("e_" + i11, "");
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
        for (int i10 = 0; i10 < this.history.size(); i10++) {
            edit.putString(hc.b.j(i10, "e_"), this.history.get(i10));
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

    public int getCount(int i10) {
        return getSearchResult(i10).count;
    }

    public ArrayList<MessageObject> getMessages(int i10) {
        return getSearchResult(i10).messages;
    }

    public SearchResult getSearchResult(int i10) {
        if (i10 == 1) {
            return this.myMessagesSearch;
        }
        if (i10 == 2) {
            return this.channelPostsSearch;
        }
        if (i10 == 3) {
            return this.localPostsSearch;
        }
        throw new RuntimeException("Unknown search type");
    }

    public boolean isEndReached(int i10) {
        return getSearchResult(i10).endReached;
    }

    public void jumpToMessage(int i10, int i11, int i12) {
        SearchResult searchResult = getSearchResult(i12);
        if (i11 >= 0 && i11 < searchResult.messages.size()) {
            searchResult.selectedIndex = i11;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i10), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), Integer.valueOf(searchResult.messages.get(i11).messageOwner.f17216id));
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

    public void searchHashtag(String str, final int i10, final int i11, final int i12) {
        final String str2;
        String str3;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        final SearchResult searchResult = getSearchResult(i11);
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
                    Runnable resolve = MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new e2.h() {
                        @Override
                        public final void accept(Object obj) {
                            HashtagSearchController.this.lambda$searchHashtag$0(searchResult, str4, str2, r5, i10, i11, i12, (Long) obj);
                        }
                    });
                    searchResult.cancel = resolve;
                    final Runnable[] runnableArr = {resolve};
                    return;
                }
                if (i11 == 1) {
                    TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                    tL_messages_searchGlobal.limit = 21;
                    tL_messages_searchGlobal.f17306q = str4;
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
                    tL_messages_search.f17304q = str3;
                    tL_messages_search.limit = 21;
                    int i13 = searchResult.lastOffsetId;
                    if (i13 != 0) {
                        tL_messages_search.offset_id = i13;
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
                        HashtagSearchController.this.lambda$searchHashtag$2(i11, str4, r4, searchResult, 21, i10, i12, tLObject2, tL_error);
                    }
                });
                searchResult.reqId = sendRequest;
                final int[] iArr = {sendRequest};
            }
        }
    }

    public void clearSearchResults(int i10) {
        getSearchResult(i10).clear();
    }
}
