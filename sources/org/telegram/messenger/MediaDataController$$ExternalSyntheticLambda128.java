package org.telegram.messenger;

import androidx.collection.LongSparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.DialogsActivity;

public final class MediaDataController$$ExternalSyntheticLambda128 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final TLObject f$1;
    public final ArrayList f$2;
    public final int f$3;
    public final Object f$4;
    public final Object f$5;
    public final TLObject f$6;
    public final int f$7;

    public MediaDataController$$ExternalSyntheticLambda128(MediaDataController mediaDataController, TLObject tLObject, ArrayList arrayList, int i, LongSparseArray longSparseArray, TLRPC.StickerSet stickerSet, TLRPC.TL_messages_allStickers tL_messages_allStickers, int i2) {
        this.$r8$classId = 0;
        this.f$0 = mediaDataController;
        this.f$1 = tLObject;
        this.f$2 = arrayList;
        this.f$3 = i;
        this.f$4 = longSparseArray;
        this.f$5 = stickerSet;
        this.f$6 = tL_messages_allStickers;
        this.f$7 = i2;
    }

    @Override
    public final void run() {
        int i;
        ConcurrentHashMap<Long, Integer> concurrentHashMap;
        Integer num;
        boolean z;
        ArrayList arrayList = this.f$2;
        TLObject tLObject = this.f$1;
        int i2 = this.f$7;
        int i3 = this.f$3;
        TLObject tLObject2 = this.f$6;
        Object obj = this.f$5;
        Object obj2 = this.f$4;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((MediaDataController) obj3).lambda$processLoadStickersResponse$73(this.f$1, this.f$2, this.f$3, (LongSparseArray) obj2, (TLRPC.StickerSet) obj, (TLRPC.TL_messages_allStickers) tLObject2, this.f$7);
                break;
            case 1:
                DialogsSearchAdapter dialogsSearchAdapter = (DialogsSearchAdapter) obj3;
                if (i3 == dialogsSearchAdapter.lastForumReqId && (i2 <= 0 || i2 == dialogsSearchAdapter.lastSearchId)) {
                    dialogsSearchAdapter.waitingResponseCount--;
                    if (((TLRPC.TL_error) obj2) == null) {
                        dialogsSearchAdapter.currentMessagesQuery = (String) obj;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        int i4 = dialogsSearchAdapter.currentAccount;
                        MessagesStorage.getInstance(i4).putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                        MessagesController.getInstance(i4).putUsers(messages_messages.users, false);
                        MessagesController.getInstance(i4).putChats(messages_messages.chats, false);
                        int i5 = ((TLRPC.TL_messages_search) tLObject2).add_offset;
                        ArrayList arrayList2 = dialogsSearchAdapter.searchForumResultMessages;
                        if (i5 == 0) {
                            arrayList2.clear();
                        }
                        dialogsSearchAdapter.nextSearchRate = messages_messages.next_rate;
                        for (int i6 = 0; i6 < messages_messages.messages.size(); i6++) {
                            TLRPC.Message message = messages_messages.messages.get(i6);
                            int i7 = MessagesController.getInstance(i4).deletedHistory.get(MessageObject.getDialogId(message));
                            if (i7 == 0 || message.id > i7) {
                                arrayList2.add((MessageObject) arrayList.get(i6));
                            }
                        }
                        dialogsSearchAdapter.searchWas = true;
                        dialogsSearchAdapter.localMessagesSearchEndReached = messages_messages.messages.size() != 20;
                        DialogsSearchAdapter.AnonymousClass1 anonymousClass1 = dialogsSearchAdapter.searchAdapterHelper;
                        if (i2 > 0) {
                            dialogsSearchAdapter.lastMessagesSearchId = i2;
                            if (dialogsSearchAdapter.lastLocalSearchId != i2) {
                                dialogsSearchAdapter.searchResult.clear();
                            }
                            if (dialogsSearchAdapter.lastGlobalSearchId != i2) {
                                anonymousClass1.clear();
                            }
                        }
                        anonymousClass1.mergeResults(dialogsSearchAdapter.searchResult, dialogsSearchAdapter.filtered2RecentSearchObjects);
                        DialogsActivity.AnonymousClass48 anonymousClass48 = dialogsSearchAdapter.delegate;
                        if (anonymousClass48 != null) {
                            anonymousClass48.searchStateChanged(dialogsSearchAdapter.waitingResponseCount > 0, true);
                            dialogsSearchAdapter.delegate.runResultsEnterAnimation();
                        }
                        dialogsSearchAdapter.notifyDataSetChanged();
                    }
                }
                dialogsSearchAdapter.reqForumId = 0;
                break;
            default:
                DialogsSearchAdapter dialogsSearchAdapter2 = (DialogsSearchAdapter) obj3;
                if (i3 != dialogsSearchAdapter2.lastReqId || (i2 > 0 && i2 != dialogsSearchAdapter2.lastSearchId)) {
                    i = 0;
                } else {
                    dialogsSearchAdapter2.waitingResponseCount--;
                    if (((TLRPC.TL_error) obj2) == null) {
                        dialogsSearchAdapter2.currentMessagesQuery = (String) obj;
                        TLRPC.messages_Messages messages_messages2 = (TLRPC.messages_Messages) tLObject;
                        int i8 = dialogsSearchAdapter2.currentAccount;
                        MessagesStorage.getInstance(i8).putUsersAndChats(messages_messages2.users, messages_messages2.chats, true, true);
                        MessagesController.getInstance(i8).putUsers(messages_messages2.users, false);
                        MessagesController.getInstance(i8).putChats(messages_messages2.chats, false);
                        int i9 = ((TLRPC.TL_messages_searchGlobal) tLObject2).offset_id;
                        ArrayList arrayList3 = dialogsSearchAdapter2.searchResultMessages;
                        if (i9 == 0) {
                            arrayList3.clear();
                        }
                        dialogsSearchAdapter2.nextSearchRate = messages_messages2.next_rate;
                        for (int i10 = 0; i10 < messages_messages2.messages.size(); i10++) {
                            TLRPC.Message message2 = messages_messages2.messages.get(i10);
                            int i11 = MessagesController.getInstance(i8).deletedHistory.get(MessageObject.getDialogId(message2));
                            if (i11 == 0 || message2.id > i11) {
                                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                                ArrayList arrayList4 = dialogsSearchAdapter2.searchForumResultMessages;
                                if (arrayList4.isEmpty()) {
                                    arrayList3.add(messageObject);
                                    long dialogId = MessageObject.getDialogId(message2);
                                    if (message2.out) {
                                        concurrentHashMap = MessagesController.getInstance(i8).dialogs_read_outbox_max;
                                    } else {
                                        concurrentHashMap = MessagesController.getInstance(i8).dialogs_read_inbox_max;
                                    }
                                    num = concurrentHashMap.get(Long.valueOf(dialogId));
                                    if (num == null) {
                                        if (num.intValue() < message2.id) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        message2.unread = z;
                                    }
                                } else {
                                    int i12 = 0;
                                    while (true) {
                                        if (i12 < arrayList4.size()) {
                                            MessageObject messageObject2 = (MessageObject) arrayList4.get(i12);
                                            if (messageObject2 == null || messageObject == null || messageObject.getId() != messageObject2.getId() || messageObject.getDialogId() != messageObject2.getDialogId()) {
                                                i12++;
                                            }
                                        } else {
                                            arrayList3.add(messageObject);
                                            long dialogId2 = MessageObject.getDialogId(message2);
                                            if (message2.out) {
                                                concurrentHashMap = MessagesController.getInstance(i8).dialogs_read_outbox_max;
                                            } else {
                                                concurrentHashMap = MessagesController.getInstance(i8).dialogs_read_inbox_max;
                                            }
                                            num = concurrentHashMap.get(Long.valueOf(dialogId2));
                                            if (num == null) {
                                                if (num.intValue() < message2.id) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                message2.unread = z;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        dialogsSearchAdapter2.searchWas = true;
                        dialogsSearchAdapter2.messagesSearchEndReached = messages_messages2.messages.size() != 20;
                        DialogsSearchAdapter.AnonymousClass1 anonymousClass2 = dialogsSearchAdapter2.searchAdapterHelper;
                        if (i2 > 0) {
                            dialogsSearchAdapter2.lastMessagesSearchId = i2;
                            if (dialogsSearchAdapter2.lastLocalSearchId != i2) {
                                dialogsSearchAdapter2.searchResult.clear();
                            }
                            if (dialogsSearchAdapter2.lastGlobalSearchId != i2) {
                                anonymousClass2.clear();
                            }
                        }
                        anonymousClass2.mergeResults(dialogsSearchAdapter2.searchResult, dialogsSearchAdapter2.filtered2RecentSearchObjects);
                        DialogsActivity.AnonymousClass48 anonymousClass49 = dialogsSearchAdapter2.delegate;
                        if (anonymousClass49 != null) {
                            anonymousClass49.searchStateChanged(dialogsSearchAdapter2.waitingResponseCount > 0, true);
                            dialogsSearchAdapter2.delegate.runResultsEnterAnimation();
                        }
                        dialogsSearchAdapter2.globalSearchCollapsed = true;
                        dialogsSearchAdapter2.phoneCollapsed = true;
                        i = 0;
                        dialogsSearchAdapter2.forceLoadingMessages = false;
                        DialogsSearchAdapter.EmptyLayout emptyLayout = dialogsSearchAdapter2.messagesEmptyLayout;
                        if (emptyLayout != null) {
                            emptyLayout.textView.setText(LocaleController.formatString(R.string.SearchMessagesFilterEmptyText, dialogsSearchAdapter2.lastMessagesSearchString));
                        }
                        dialogsSearchAdapter2.notifyDataSetChanged();
                    } else {
                        i = 0;
                    }
                }
                dialogsSearchAdapter2.reqId = i;
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda128(DialogsSearchAdapter dialogsSearchAdapter, int i, int i2, TLRPC.TL_error tL_error, String str, TLObject tLObject, TLMethod tLMethod, ArrayList arrayList, int i3) {
        this.$r8$classId = i3;
        this.f$0 = dialogsSearchAdapter;
        this.f$3 = i;
        this.f$7 = i2;
        this.f$4 = tL_error;
        this.f$5 = str;
        this.f$1 = tLObject;
        this.f$6 = tLMethod;
        this.f$2 = arrayList;
    }
}
