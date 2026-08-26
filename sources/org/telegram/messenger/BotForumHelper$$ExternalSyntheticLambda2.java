package org.telegram.messenger;

import android.content.Context;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda10;
import org.telegram.ui.Gifts.SendGiftSheet;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.BotStarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class BotForumHelper$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final int f$3;
    public final Object f$4;

    public BotForumHelper$$ExternalSyntheticLambda2(Context context, int i, GiftAuctionController.Auction auction, long j, GiftSheet$$ExternalSyntheticLambda10 giftSheet$$ExternalSyntheticLambda10) {
        this.$r8$classId = 9;
        this.f$0 = context;
        this.f$3 = i;
        this.f$1 = auction;
        this.f$2 = j;
        this.f$4 = giftSheet$$ExternalSyntheticLambda10;
    }

    @Override
    public final void run() {
        long j = this.f$2;
        storyItem = null;
        TL_stories.StoryItem storyItem = null;
        int i = this.f$3;
        Object obj = this.f$4;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                ((BotForumHelper) obj3).lambda$beforeSendingFinalRequest$3((long[]) obj2, this.f$2, this.f$3, (Runnable) obj);
                break;
            case 1:
                ((MediaDataController) obj3).lambda$loadStickers$100((TLObject) obj2, this.f$3, (Utilities.Callback) obj, this.f$2);
                break;
            case 2:
                ((MessagesStorage) obj3).lambda$checkMessageId$154(this.f$2, this.f$3, (boolean[]) obj2, (CountDownLatch) obj);
                break;
            case 3:
                ((MessagesStorage) obj3).lambda$overwriteChannel$190(this.f$2, this.f$3, (TLRPC.TL_updates_channelDifferenceTooLong) obj2, (Runnable) obj);
                break;
            case 4:
                ((MessagesStorage) obj3).lambda$updateMessageVoiceTranscription$109(this.f$3, this.f$2, (TLRPC.Message) obj2, (String) obj);
                break;
            case 5:
                ((MessagesStorage) obj3).lambda$setDialogsFolderId$244((ArrayList) obj2, (ArrayList) obj, this.f$3, this.f$2);
                break;
            case 6:
                ((TopicsController) obj3).lambda$loadTopics$2((TLRPC.TL_messages_savedDialogs) obj2, this.f$2, (LongSparseArray) obj, this.f$3);
                break;
            case 7:
                ((TopicsController) obj3).lambda$loadTopics$3((TLRPC.TL_messages_savedDialogsSlice) obj2, this.f$2, (LongSparseArray) obj, this.f$3);
                break;
            case 8:
                ChatMessageCell chatMessageCell = (ChatMessageCell) obj3;
                int i2 = chatMessageCell.currentAccount;
                TLRPC.User user = (TLRPC.User) obj2;
                if (user != null) {
                    chatMessageCell.commentAvatarDrawables[i].setInfo(i2, user);
                    chatMessageCell.commentAvatarImages[i].setForUserOrChat(user, chatMessageCell.commentAvatarDrawables[i]);
                } else {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    if (chat != null) {
                        chatMessageCell.commentAvatarDrawables[i].setInfo(i2, chat);
                        chatMessageCell.commentAvatarImages[i].setForUserOrChat(chat, chatMessageCell.commentAvatarDrawables[i]);
                    } else {
                        chatMessageCell.commentAvatarDrawables[i].setInfo(this.f$2, "", "", null, null);
                    }
                }
                break;
            case 9:
                new SendGiftSheet((Context) obj3, this.f$3, ((GiftAuctionController.Auction) obj2).gift, null, this.f$2, (GiftSheet$$ExternalSyntheticLambda10) obj, false, false).show();
                break;
            case 10:
                BotStarsController botStarsController = (BotStarsController) obj3;
                botStarsController.getClass();
                BotStarsController.TransactionsState transactionsState = (BotStarsController.TransactionsState) obj2;
                transactionsState.loading[i] = false;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    int i3 = botStarsController.currentAccount;
                    MessagesController.getInstance(i3).putUsers(starsStatus.users, false);
                    MessagesController.getInstance(i3).putChats(starsStatus.chats, false);
                    ArrayList[] arrayListArr = transactionsState.transactions;
                    arrayListArr[i].addAll(starsStatus.history);
                    boolean zIsEmpty = arrayListArr[i].isEmpty();
                    boolean[] zArr = transactionsState.transactionsExist;
                    zArr[i] = !zIsEmpty || zArr[i];
                    boolean z = (starsStatus.flags & 1) == 0;
                    transactionsState.endReached[i] = z;
                    transactionsState.offset[i] = z ? null : starsStatus.next_offset;
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsTransactionsLoaded, Long.valueOf(j));
                }
                break;
            case 11:
                ButtonWithCounterView buttonWithCounterView = (ButtonWithCounterView) obj3;
                buttonWithCounterView.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i4 = this.f$3;
                ConnectionsManager.getInstance(i4).sendRequest(tL_fulfillStarsSubscription, new MessageSeenView$$ExternalSyntheticLambda0(buttonWithCounterView, (BottomSheet[]) obj, i4, this.f$2, 6));
                break;
            default:
                StoriesController storiesController = (StoriesController) obj3;
                int i5 = storiesController.currentAccount;
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(i5).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i5).putChats(tL_stories_stories.chats, false);
                    for (int i6 = 0; i6 < tL_stories_stories.stories.size(); i6++) {
                        if (tL_stories_stories.stories.get(i6).id == i) {
                            storyItem = tL_stories_stories.stories.get(i6);
                        }
                    }
                }
                String str = (String) obj;
                storiesController.requestingUnsupportedStories.remove(str);
                if (storyItem != null) {
                    storyItem.dialogId = j;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = MessagesController.getInstance(i5).getPeer(j);
                    tL_updateStory.story = storyItem;
                    storiesController.processUpdate(tL_updateStory);
                } else {
                    HashSet<String> hashSet = storiesController.unsupportedStoriesChecked;
                    for (String str2 : hashSet) {
                        if (str2.endsWith(":" + j + ":" + i)) {
                            hashSet.remove(str2);
                            hashSet.add(str);
                            storiesController.mainSettings.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                            break;
                        }
                    }
                    hashSet.add(str);
                    storiesController.mainSettings.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                }
                break;
        }
    }

    public BotForumHelper$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, Object obj3, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i;
        this.f$4 = obj3;
        this.f$2 = j;
    }

    public BotForumHelper$$ExternalSyntheticLambda2(BotForumHelper botForumHelper, long[] jArr, long j, int i, Runnable runnable) {
        this.$r8$classId = 0;
        this.f$0 = botForumHelper;
        this.f$1 = jArr;
        this.f$2 = j;
        this.f$3 = i;
        this.f$4 = runnable;
    }

    public BotForumHelper$$ExternalSyntheticLambda2(MessagesStorage messagesStorage, int i, long j, TLRPC.Message message, String str) {
        this.$r8$classId = 4;
        this.f$0 = messagesStorage;
        this.f$3 = i;
        this.f$2 = j;
        this.f$1 = message;
        this.f$4 = str;
    }

    public BotForumHelper$$ExternalSyntheticLambda2(MessagesStorage messagesStorage, long j, int i, Object obj, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = messagesStorage;
        this.f$2 = j;
        this.f$3 = i;
        this.f$1 = obj;
        this.f$4 = obj2;
    }

    public BotForumHelper$$ExternalSyntheticLambda2(MessagesStorage messagesStorage, ArrayList arrayList, ArrayList arrayList2, int i, long j) {
        this.$r8$classId = 5;
        this.f$0 = messagesStorage;
        this.f$1 = arrayList;
        this.f$4 = arrayList2;
        this.f$3 = i;
        this.f$2 = j;
    }

    public BotForumHelper$$ExternalSyntheticLambda2(TopicsController topicsController, TLRPC.messages_SavedDialogs messages_saveddialogs, long j, LongSparseArray longSparseArray, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = topicsController;
        this.f$1 = messages_saveddialogs;
        this.f$2 = j;
        this.f$4 = longSparseArray;
        this.f$3 = i;
    }
}
