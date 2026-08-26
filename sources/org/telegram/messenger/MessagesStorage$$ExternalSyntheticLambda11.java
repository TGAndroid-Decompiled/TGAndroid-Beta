package org.telegram.messenger;

import android.util.SparseArray;
import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;

public final class MessagesStorage$$ExternalSyntheticLambda11 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public MessagesStorage$$ExternalSyntheticLambda11(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesStorage) this.f$0).lambda$updateUserInfoContactBlocked$131(this.f$1, (TL_account.RequirementToContact) this.f$2);
                break;
            case 1:
                ((GiftAuctionController) this.f$0).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.f$2, this.f$1);
                break;
            case 2:
                ((TranslateController) this.f$0).lambda$pushPollToTranslate$27(this.f$1, (TranslateController.PendingPollTranslation) this.f$2);
                break;
            case 3:
                ((TranslateController) this.f$0).lambda$pushRichMessageToTranslate$30(this.f$1, (TranslateController.PendingRichTranslation) this.f$2);
                break;
            case 4:
                ((ChatThemeController) this.f$0).lambda$processUpdate$13(this.f$1, (TLRPC.UserFull) this.f$2);
                break;
            case 5:
                ((LocationController) this.f$0).lambda$loadLiveLocations$25(this.f$1, (TLObject) this.f$2);
                break;
            case 6:
                ((MediaDataController) this.f$0).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.f$2, this.f$1);
                break;
            case 7:
                ((MediaDataController) this.f$0).lambda$putBotInfo$201((TL_bots.BotInfo) this.f$2, this.f$1);
                break;
            case 8:
                ((MediaDataController) this.f$0).lambda$savePinnedMessages$166((ArrayList) this.f$2, this.f$1);
                break;
            case 9:
                ((MessagesController) this.f$0).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.f$2, this.f$1);
                break;
            case 10:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f$0, (TLRPC.Updates) this.f$2, this.f$1);
                break;
            case 11:
                ((MessagesController) this.f$0).lambda$saveSavedReactionsTags$489(this.f$1, (TLRPC.TL_messages_savedReactionsTags) this.f$2);
                break;
            case 12:
                ((MessagesController) this.f$0).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.f$2, this.f$1);
                break;
            case 13:
                ((MessagesController) this.f$0).lambda$didAddedNewTask$82(this.f$1, (SparseArray) this.f$2);
                break;
            case 14:
                ((MessagesController) this.f$0).lambda$updateTimerProc$159(this.f$1, (TLRPC.TL_chatOnlines) this.f$2);
                break;
            case 15:
                ((MessagesController) this.f$0).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.f$2, this.f$1);
                break;
            case 16:
                ((MessagesStorage) this.f$0).lambda$isDialogHasTopMessage$175(this.f$1, (Runnable) this.f$2);
                break;
            case 17:
                ((MessagesStorage) this.f$0).lambda$saveStoryAlbumsCache$269(this.f$1, (List) this.f$2);
                break;
            case 18:
                ((MessagesStorage) this.f$0).lambda$overwriteChannel$189(this.f$1, (TLRPC.TL_updates_channelDifferenceTooLong) this.f$2);
                break;
            case 19:
                ((MessagesStorage) this.f$0).lambda$loadPendingTasks$12((TLRPC.Chat) this.f$2, this.f$1);
                break;
            case 20:
                ((MessagesStorage) this.f$0).lambda$createOrEditTopic$199(this.f$1, (TLRPC.TL_forumTopic) this.f$2);
                break;
            case 21:
                ((MessagesStorage) this.f$0).lambda$createPendingTask$10(this.f$1, (NativeByteBuffer) this.f$2);
                break;
            case 22:
                ((MessagesStorage) this.f$0).lambda$putChannelAdmins$124(this.f$1, (LongSparseArray) this.f$2);
                break;
            case 23:
                ((MessagesStorage) this.f$0).lambda$deleteAllReactionsFromChat$83((SparseArray) this.f$2, this.f$1);
                break;
            case 24:
                ((NotificationsController) this.f$0).lambda$loadTopicsNotificationsExceptions$54(this.f$1, (Consumer) this.f$2);
                break;
            case 25:
                ((SavedMessagesController) this.f$0).lambda$hasSavedMessages$14((TLObject) this.f$2, this.f$1);
                break;
            case 26:
                ((SecretChatHelper) this.f$0).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.f$2, this.f$1);
                break;
            case 27:
                ((TopicsController) this.f$0).lambda$loadTopics$4(this.f$1, (TLRPC.TL_messages_savedDialogsNotModified) this.f$2);
                break;
            default:
                ((TopicsController) this.f$0).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.f$2, this.f$1);
                break;
        }
    }

    public MessagesStorage$$ExternalSyntheticLambda11(BaseController baseController, long j, Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = j;
        this.f$2 = obj;
    }
}
