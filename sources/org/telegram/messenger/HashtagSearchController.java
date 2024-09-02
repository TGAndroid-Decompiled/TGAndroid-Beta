package org.telegram.messenger;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_channels_searchPosts;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputPeerEmpty;
import org.telegram.tgnet.TLRPC$TL_messages_searchGlobal;
import org.telegram.tgnet.TLRPC$messages_Messages;

public class HashtagSearchController {
    public static final int HISTORY_LIMIT = 100;
    private static volatile HashtagSearchController[] Instance = new HashtagSearchController[4];
    private static final Object[] lockObjects = new Object[4];
    private final SearchResult channelPostsSearch;
    public final int currentAccount;
    public final ArrayList<String> history = new ArrayList<>();
    private final SharedPreferences historyPreferences;
    private final SearchResult myMessagesSearch;

    static {
        for (int i = 0; i < 4; i++) {
            lockObjects[i] = new Object();
        }
    }

    public static HashtagSearchController getInstance(int i) {
        HashtagSearchController hashtagSearchController = Instance[i];
        if (hashtagSearchController == null) {
            synchronized (lockObjects[i]) {
                hashtagSearchController = Instance[i];
                if (hashtagSearchController == null) {
                    HashtagSearchController[] hashtagSearchControllerArr = Instance;
                    HashtagSearchController hashtagSearchController2 = new HashtagSearchController(i);
                    hashtagSearchControllerArr[i] = hashtagSearchController2;
                    hashtagSearchController = hashtagSearchController2;
                }
            }
        }
        return hashtagSearchController;
    }

    private HashtagSearchController(int i) {
        this.myMessagesSearch = new SearchResult();
        this.channelPostsSearch = new SearchResult();
        this.currentAccount = i;
        this.historyPreferences = ApplicationLoader.applicationContext.getSharedPreferences("hashtag_search_history" + i, 0);
        loadHistoryFromPref();
    }

    private void loadHistoryFromPref() {
        int i = this.historyPreferences.getInt("count", 0);
        this.history.clear();
        this.history.ensureCapacity(i);
        for (int i2 = 0; i2 < i; i2++) {
            String string = this.historyPreferences.getString("e_" + i2, "");
            if (!string.startsWith("#") && !string.startsWith("$")) {
                string = "#" + string;
            }
            this.history.add(string);
        }
    }

    private void saveHistoryToPref() {
        SharedPreferences.Editor edit = this.historyPreferences.edit();
        edit.clear();
        edit.putInt("count", this.history.size());
        for (int i = 0; i < this.history.size(); i++) {
            edit.putString("e_" + i, this.history.get(i));
        }
        edit.apply();
    }

    public void putToHistory(String str) {
        if (str.startsWith("#") || str.startsWith("$")) {
            int indexOf = this.history.indexOf(str);
            if (indexOf != -1) {
                if (indexOf == 0) {
                    return;
                } else {
                    this.history.remove(indexOf);
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

    public void clearHistory() {
        this.history.clear();
        saveHistoryToPref();
    }

    public void removeHashtagFromHistory(String str) {
        int indexOf = this.history.indexOf(str);
        if (indexOf != -1) {
            this.history.remove(indexOf);
            saveHistoryToPref();
        }
    }

    private SearchResult getSearchResult(int i) {
        if (i == 1) {
            return this.myMessagesSearch;
        }
        if (i == 2) {
            return this.channelPostsSearch;
        }
        throw new RuntimeException("Unknown search type");
    }

    public ArrayList<MessageObject> getMessages(int i) {
        return getSearchResult(i).messages;
    }

    public int getCount(int i) {
        return getSearchResult(i).count;
    }

    public boolean isEndReached(int i) {
        return getSearchResult(i).endReached;
    }

    public void searchHashtag(String str, final int i, final int i2, final int i3) {
        TLRPC$TL_channels_searchPosts tLRPC$TL_channels_searchPosts;
        final SearchResult searchResult = getSearchResult(i2);
        if (searchResult.lastHashtag == null && str == null) {
            return;
        }
        if (str == null || !str.isEmpty()) {
            if (str == null) {
                str = searchResult.lastHashtag;
            } else if (!TextUtils.equals(str, searchResult.lastHashtag)) {
                searchResult.clear();
            }
            final String str2 = str;
            searchResult.lastHashtag = str2;
            if (i2 == 1) {
                TLRPC$TL_messages_searchGlobal tLRPC$TL_messages_searchGlobal = new TLRPC$TL_messages_searchGlobal();
                tLRPC$TL_messages_searchGlobal.limit = 30;
                tLRPC$TL_messages_searchGlobal.q = str2;
                tLRPC$TL_messages_searchGlobal.filter = new TLRPC$TL_inputMessagesFilterEmpty();
                tLRPC$TL_messages_searchGlobal.offset_peer = new TLRPC$TL_inputPeerEmpty();
                tLRPC$TL_channels_searchPosts = tLRPC$TL_messages_searchGlobal;
                if (searchResult.lastOffsetPeer != null) {
                    tLRPC$TL_messages_searchGlobal.offset_rate = searchResult.lastOffsetRate;
                    tLRPC$TL_messages_searchGlobal.offset_id = searchResult.lastOffsetId;
                    tLRPC$TL_messages_searchGlobal.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                    tLRPC$TL_channels_searchPosts = tLRPC$TL_messages_searchGlobal;
                }
            } else {
                TLRPC$TL_channels_searchPosts tLRPC$TL_channels_searchPosts2 = new TLRPC$TL_channels_searchPosts();
                tLRPC$TL_channels_searchPosts2.limit = 30;
                tLRPC$TL_channels_searchPosts2.hashtag = str2;
                tLRPC$TL_channels_searchPosts2.offset_peer = new TLRPC$TL_inputPeerEmpty();
                tLRPC$TL_channels_searchPosts = tLRPC$TL_channels_searchPosts2;
                if (searchResult.lastOffsetPeer != null) {
                    tLRPC$TL_channels_searchPosts2.offset_rate = searchResult.lastOffsetRate;
                    tLRPC$TL_channels_searchPosts2.offset_id = searchResult.lastOffsetId;
                    tLRPC$TL_channels_searchPosts2.offset_peer = MessagesController.getInstance(this.currentAccount).getInputPeer(searchResult.lastOffsetPeer);
                    tLRPC$TL_channels_searchPosts = tLRPC$TL_channels_searchPosts2;
                }
            }
            final int i4 = 30;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_searchPosts, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    HashtagSearchController.this.lambda$searchHashtag$1(i2, str2, searchResult, i4, i, i3, tLObject, tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$searchHashtag$1(int i, String str, final SearchResult searchResult, final int i2, final int i3, final int i4, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject instanceof TLRPC$messages_Messages) {
            final TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            final ArrayList arrayList = new ArrayList();
            Iterator<TLRPC$Message> it = tLRPC$messages_Messages.messages.iterator();
            while (it.hasNext()) {
                MessageObject messageObject = new MessageObject(this.currentAccount, it.next(), null, null, null, null, null, true, true, 0L, false, false, false, i);
                if (messageObject.hasValidGroupId()) {
                    messageObject.isPrimaryGroupMessage = true;
                }
                messageObject.setQuery(str);
                arrayList.add(messageObject);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    HashtagSearchController.this.lambda$searchHashtag$0(searchResult, tLRPC$messages_Messages, arrayList, i2, i3, i4);
                }
            });
        }
    }

    public void lambda$searchHashtag$0(SearchResult searchResult, TLRPC$messages_Messages tLRPC$messages_Messages, ArrayList arrayList, int i, int i2, int i3) {
        searchResult.lastOffsetRate = tLRPC$messages_Messages.next_rate;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) it.next();
            MessageCompositeID messageCompositeID = new MessageCompositeID(messageObject.messageOwner);
            Integer num = searchResult.generatedIds.get(messageCompositeID);
            if (num == null) {
                int i4 = searchResult.lastGeneratedId;
                searchResult.lastGeneratedId = i4 - 1;
                num = Integer.valueOf(i4);
                searchResult.generatedIds.put(messageCompositeID, num);
                searchResult.messages.add(messageObject);
            }
            TLRPC$Message tLRPC$Message = messageObject.messageOwner;
            tLRPC$Message.realId = tLRPC$Message.id;
            tLRPC$Message.id = num.intValue();
        }
        if (!tLRPC$messages_Messages.messages.isEmpty()) {
            ArrayList<TLRPC$Message> arrayList2 = tLRPC$messages_Messages.messages;
            TLRPC$Message tLRPC$Message2 = arrayList2.get(arrayList2.size() - 1);
            searchResult.lastOffsetId = tLRPC$Message2.id;
            searchResult.lastOffsetPeer = tLRPC$Message2.peer_id;
        }
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
        MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$messages_Messages.users, false);
        MessagesController.getInstance(this.currentAccount).putChats(tLRPC$messages_Messages.chats, false);
        searchResult.endReached = tLRPC$messages_Messages.messages.size() < i;
        searchResult.count = Math.max(tLRPC$messages_Messages.count, tLRPC$messages_Messages.messages.size());
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.messagesDidLoad, 0L, Integer.valueOf(arrayList.size()), arrayList, Boolean.FALSE, 0, 0, 0, 0, 2, Boolean.TRUE, Integer.valueOf(i2), Integer.valueOf(i3), 0, 0, 7);
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i2), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), 0);
    }

    public void jumpToMessage(int i, int i2, int i3) {
        SearchResult searchResult = getSearchResult(i3);
        if (i2 < 0 || i2 >= searchResult.messages.size()) {
            return;
        }
        searchResult.selectedIndex = i2;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.hashtagSearchUpdated, Integer.valueOf(i), Integer.valueOf(searchResult.count), Boolean.valueOf(searchResult.endReached), Integer.valueOf(searchResult.getMask()), Integer.valueOf(searchResult.selectedIndex), Integer.valueOf(searchResult.messages.get(i2).messageOwner.id));
    }

    public void clearSearchResults() {
        this.myMessagesSearch.clear();
        this.channelPostsSearch.clear();
    }

    public void clearSearchResults(int i) {
        getSearchResult(i).clear();
    }

    public static final class MessageCompositeID {
        final long dialog_id;
        final int id;

        MessageCompositeID(TLRPC$Message tLRPC$Message) {
            this(MessageObject.getDialogId(tLRPC$Message), tLRPC$Message.id);
        }

        MessageCompositeID(long j, int i) {
            this.dialog_id = j;
            this.id = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || MessageCompositeID.class != obj.getClass()) {
                return false;
            }
            MessageCompositeID messageCompositeID = (MessageCompositeID) obj;
            return this.dialog_id == messageCompositeID.dialog_id && this.id == messageCompositeID.id;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.dialog_id), Integer.valueOf(this.id));
        }
    }

    public static class SearchResult {
        int count;
        boolean endReached;
        HashMap<MessageCompositeID, Integer> generatedIds;
        int lastGeneratedId;
        String lastHashtag;
        int lastOffsetId;
        TLRPC$Peer lastOffsetPeer;
        int lastOffsetRate;
        ArrayList<MessageObject> messages;
        int selectedIndex;

        private SearchResult() {
            this.messages = new ArrayList<>();
            this.generatedIds = new HashMap<>();
            this.lastGeneratedId = Integer.MAX_VALUE;
        }

        int getMask() {
            int i = this.selectedIndex >= this.messages.size() - 1 ? 0 : 1;
            return this.selectedIndex > 0 ? i | 2 : i;
        }

        void clear() {
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
    }
}
