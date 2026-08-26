package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.recyclerview.widget.DiffUtil;
import com.google.android.exoplayer2.util.Consumer;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
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
        final int id;

        public MessageCompositeID(TLRPC.Message message) {
            this(MessageObject.getDialogId(message), message.id);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && MessageCompositeID.class == obj.getClass()) {
                MessageCompositeID messageCompositeID = (MessageCompositeID) obj;
                if (this.dialog_id == messageCompositeID.dialog_id && this.id == messageCompositeID.id) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialog_id), Integer.valueOf(this.id));
        }

        public MessageCompositeID(long j, int i) {
            this.dialog_id = j;
            this.id = i;
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

        public SearchResult(int i) {
            this.currentAccount = i;
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
            int i = this.selectedIndex >= this.messages.size() - 1 ? 0 : 1;
            return this.selectedIndex > 0 ? i | 2 : i;
        }
    }

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    private HashtagSearchController(int i) {
        this.currentAccount = i;
        this.myMessagesSearch = new SearchResult(i);
        this.channelPostsSearch = new SearchResult(i);
        this.localPostsSearch = new SearchResult(i);
        this.historyPreferences = ApplicationLoader.applicationContext.getSharedPreferences("hashtag_search_history" + i, 0);
        loadHistoryFromPref();
    }

    public static HashtagSearchController getInstance(int i) {
        HashtagSearchController hashtagSearchController;
        HashtagSearchController hashtagSearchController2 = Instance[i];
        if (hashtagSearchController2 != null) {
            return hashtagSearchController2;
        }
        synchronized (lockObjects[i]) {
            try {
                hashtagSearchController = Instance[i];
                if (hashtagSearchController == null) {
                    HashtagSearchController[] hashtagSearchControllerArr = Instance;
                    HashtagSearchController hashtagSearchController3 = new HashtagSearchController(i);
                    hashtagSearchControllerArr[i] = hashtagSearchController3;
                    hashtagSearchController = hashtagSearchController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return hashtagSearchController;
    }

    public void lambda$searchHashtag$0(SearchResult searchResult, String str, String str2, Runnable[] runnableArr, int i, int i2, int i3, Long l) {
        if (TextUtils.equals(searchResult.lastHashtag, str)) {
            if (MessagesController.getInstance(this.currentAccount).getUserOrChat(str2) != null) {
                searchHashtag(str, i, i2, i3);
                return;
            }
            if (runnableArr[0] == searchResult.cancel) {
                searchResult.cancel = null;
                searchResult.loading = false;
                searchResult.endReached = true;
                searchResult.count = 0;
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
            }
        }
    }

    public void lambda$searchHashtag$1(int[] iArr, SearchResult searchResult, TLRPC.messages_Messages messages_messages, ArrayList arrayList, int i, int i2, int i3) {
        if (iArr[0] == searchResult.reqId) {
            searchResult.reqId = -1;
            searchResult.loading = false;
            searchResult.lastOffsetRate = messages_messages.next_rate;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                MessageObject messageObject = (MessageObject) obj;
                MessageCompositeID messageCompositeID = new MessageCompositeID(messageObject.messageOwner);
                Integer numValueOf = searchResult.generatedIds.get(messageCompositeID);
                if (numValueOf == null) {
                    int i5 = searchResult.lastGeneratedId;
                    searchResult.lastGeneratedId = i5 - 1;
                    numValueOf = Integer.valueOf(i5);
                    searchResult.generatedIds.put(messageCompositeID, numValueOf);
                    searchResult.messages.add(messageObject);
                }
                TLRPC.Message message = messageObject.messageOwner;
                message.realId = message.id;
                message.id = numValueOf.intValue();
            }
            if (!messages_messages.messages.isEmpty()) {
                TLRPC.Message message2 = (TLRPC.Message) zziq.m(1, messages_messages.messages);
                searchResult.lastOffsetId = message2.realId;
                searchResult.lastOffsetPeer = message2.peer_id;
            }
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
            MessagesController.getInstance(this.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(messages_messages.chats, false);
            searchResult.endReached = messages_messages.messages.size() < i;
            searchResult.count = Math.max(messages_messages.count, messages_messages.messages.size());
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, 0L, Integer.valueOf(arrayList.size()), arrayList, Boolean.FALSE, 0, 0, 0, 0, 2, Boolean.TRUE, Integer.valueOf(i2), Integer.valueOf(i3), 0, 0, 7);
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i2), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
        }
    }

    public void lambda$searchHashtag$2(int i, String str, final int[] iArr, final SearchResult searchResult, final int i2, final int i3, final int i4, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            final TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            final ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC.Message> arrayList2 = messages_messages.messages;
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                TLRPC.Message message = arrayList2.get(i5);
                i5++;
                MessageObject messageObject = new MessageObject(this.currentAccount, message, null, null, null, null, null, true, true, 0L, false, false, false, i);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str, false);
                arrayList.add(messageObject);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchHashtag$1(iArr, searchResult, messages_messages, arrayList, i2, i3, i4);
                }
            });
        }
    }

    private void loadHistoryFromPref() {
        int i = this.historyPreferences.getInt("count", 0);
        this.history.clear();
        this.history.ensureCapacity(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string = this.historyPreferences.getString("e_" + i2, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#".concat(string);
            }
            this.history.add(string);
        }
    }

    private void saveHistoryToPref() {
        SharedPreferences.Editor editorEdit = this.historyPreferences.edit();
        editorEdit.clear();
        editorEdit.putInt("count", this.history.size());
        for (int i = 0; i < this.history.size(); i++) {
            editorEdit.putString(DiffUtil.m(i, "e_"), this.history.get(i));
        }
        editorEdit.apply();
    }

    public void clearHistory() {
        this.history.clear();
        saveHistoryToPref();
    }

    public void clearSearchResults() {
        this.myMessagesSearch.clear();
        this.channelPostsSearch.clear();
    }

    public int getCount(int i) {
        return getSearchResult(i).count;
    }

    public ArrayList<MessageObject> getMessages(int i) {
        return getSearchResult(i).messages;
    }

    public SearchResult getSearchResult(int i) {
        if (i == 1) {
            return this.myMessagesSearch;
        }
        if (i == 2) {
            return this.channelPostsSearch;
        }
        if (i == 3) {
            return this.localPostsSearch;
        }
        throw new RuntimeException("Unknown search type");
    }

    public boolean isEndReached(int i) {
        return getSearchResult(i).endReached;
    }

    public void jumpToMessage(int i, int i2, int i3) {
        SearchResult searchResult = getSearchResult(i3);
        if (i2 < 0 || i2 >= searchResult.messages.size()) {
            return;
        }
        searchResult.selectedIndex = i2;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), Integer.valueOf(searchResult.messages.get(i2).messageOwner.id));
    }

    public void putToHistory(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            int iIndexOf = this.history.indexOf(str);
            if (iIndexOf != -1) {
                if (iIndexOf == 0) {
                    return;
                } else {
                    this.history.remove(iIndexOf);
                }
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
        int iIndexOf = this.history.indexOf(str);
        if (iIndexOf != -1) {
            this.history.remove(iIndexOf);
            saveHistoryToPref();
        }
    }

    public void searchHashtag(String str, final int i, final int i2, final int i3) {
        final String str2;
        String strSubstring;
        TLRPC.TL_channels_searchPosts tL_channels_searchPosts;
        TLObject tLObject;
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal;
        final SearchResult searchResult = getSearchResult(i2);
        if (searchResult.lastHashtag == null && str == null) {
            return;
        }
        if (str == null || !str.isEmpty()) {
            if (str == null) {
                str = searchResult.lastHashtag;
            } else if (!TextUtils.equals(str, searchResult.lastHashtag)) {
                searchResult.clear();
            } else if (searchResult.loading) {
                return;
            }
            final String str3 = str;
            searchResult.lastHashtag = str3;
            int iIndexOf = str3.indexOf(64);
            TLObject userOrChat = null;
            if (iIndexOf >= 0) {
                String strSubstring2 = str3.substring(iIndexOf + 1);
                strSubstring = str3.substring(0, iIndexOf);
                str2 = strSubstring2;
            } else {
                str2 = null;
                strSubstring = str3;
            }
            searchResult.loading = true;
            if (!TextUtils.isEmpty(str2) && (userOrChat = MessagesController.getInstance(this.currentAccount).getUserOrChat(str2)) == null) {
                Runnable runnableResolve = MessagesController.getInstance(this.currentAccount).getUserNameResolver().resolve(str2, new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        HashtagSearchController hashtagSearchController = this.f$0;
                        HashtagSearchController.SearchResult searchResult2 = searchResult;
                        String str4 = str3;
                        Runnable[] runnableArr = runnableArr;
                        int i4 = i;
                        int i5 = i2;
                        hashtagSearchController.lambda$searchHashtag$0(searchResult2, str4, str2, runnableArr, i4, i5, i3, (Long) obj);
                    }
                });
                searchResult.cancel = runnableResolve;
                final Runnable[] runnableArr = {runnableResolve};
                return;
            }
            if (i2 == 1) {
                tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
                tL_messages_searchGlobal.limit = 21;
                tL_messages_searchGlobal.q = str3;
                tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
                if (searchResult.lastOffsetPeer != null) {
                    tLObject = tL_messages_searchGlobal;
                    tL_messages_searchGlobal.offset_rate = searchResult.lastOffsetRate;
                    tL_messages_searchGlobal.offset_id = searchResult.lastOffsetId;
                    tL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                    tLObject = tL_messages_searchGlobal;
                }
            } else if (userOrChat != null) {
                TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
                tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
                tL_messages_search.peer = MessagesController.getInputPeer(userOrChat);
                tL_messages_search.q = strSubstring;
                tL_messages_search.limit = 21;
                int i4 = searchResult.lastOffsetId;
                if (i4 != 0) {
                    tL_messages_search.offset_id = i4;
                }
                tLObject = tL_messages_search;
            } else {
                tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                tL_channels_searchPosts.flags |= 1;
                tL_channels_searchPosts.hashtag = str3;
                tL_channels_searchPosts.limit = 21;
                tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                if (searchResult.lastOffsetPeer != null) {
                    tLObject = tL_channels_searchPosts;
                    tL_channels_searchPosts.offset_rate = searchResult.lastOffsetRate;
                    tL_channels_searchPosts.offset_id = searchResult.lastOffsetId;
                    tL_channels_searchPosts.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                    tLObject = tL_channels_searchPosts;
                }
            }
            tLObject = tL_channels_searchPosts;
            tLObject = tL_messages_searchGlobal;
            int iSendRequest = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$searchHashtag$2(i2, str3, iArr, searchResult, 21, i, i3, tLObject2, tL_error);
                }
            });
            searchResult.reqId = iSendRequest;
            final int[] iArr = {iSendRequest};
        }
    }

    public void clearSearchResults(int i) {
        getSearchResult(i).clear();
    }
}
