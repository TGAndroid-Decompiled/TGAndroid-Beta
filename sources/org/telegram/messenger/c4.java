package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;
public final class c4 implements Runnable {
    public final int f19869a;
    public final long f19870b;
    public final Object f19871c;
    public final Object d;

    public c4(Object obj, Object obj2, long j10, int i10) {
        this.f19869a = i10;
        this.f19871c = obj;
        this.d = obj2;
        this.f19870b = j10;
    }

    @Override
    public final void run() {
        switch (this.f19869a) {
            case 0:
                ((GiftAuctionController) this.f19871c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f19870b);
                return;
            case 1:
                ((TranslateController) this.f19871c).lambda$pushPollToTranslate$27(this.f19870b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f19871c).lambda$pushRichMessageToTranslate$30(this.f19870b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                ((ChatThemeController) this.f19871c).lambda$processUpdate$13(this.f19870b, (TLRPC.UserFull) this.d);
                return;
            case 4:
                ((LocationController) this.f19871c).lambda$loadLiveLocations$25(this.f19870b, (TLObject) this.d);
                return;
            case 5:
                ((MediaDataController) this.f19871c).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.d, this.f19870b);
                return;
            case 6:
                ((MediaDataController) this.f19871c).lambda$putBotInfo$201((TL_bots.BotInfo) this.d, this.f19870b);
                return;
            case 7:
                ((MediaDataController) this.f19871c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f19870b);
                return;
            case 8:
                ((MessagesController) this.f19871c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.f19870b);
                return;
            case 9:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f19871c, (TLRPC.Updates) this.d, this.f19870b);
                return;
            case 10:
                ((MessagesController) this.f19871c).lambda$saveSavedReactionsTags$489(this.f19870b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 11:
                ((MessagesController) this.f19871c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.f19870b);
                return;
            case 12:
                ((MessagesController) this.f19871c).lambda$didAddedNewTask$82(this.f19870b, (SparseArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f19871c).lambda$updateTimerProc$159(this.f19870b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 14:
                ((MessagesController) this.f19871c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f19870b);
                return;
            case 15:
                ((MessagesStorage) this.f19871c).lambda$updateUserInfoContactBlocked$131(this.f19870b, (TL_account.RequirementToContact) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f19871c).lambda$isDialogHasTopMessage$175(this.f19870b, (Runnable) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f19871c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f19870b);
                return;
            case 18:
                ((MessagesStorage) this.f19871c).lambda$saveStoryAlbumsCache$269(this.f19870b, (List) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f19871c).lambda$overwriteChannel$189(this.f19870b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f19871c).lambda$createOrEditTopic$199(this.f19870b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f19871c).lambda$createPendingTask$10(this.f19870b, (NativeByteBuffer) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f19871c).lambda$putChannelAdmins$124(this.f19870b, (a0.h) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f19871c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f19870b);
                return;
            case 24:
                ((NotificationsController) this.f19871c).lambda$loadTopicsNotificationsExceptions$54(this.f19870b, (Consumer) this.d);
                return;
            case 25:
                ((SavedMessagesController) this.f19871c).lambda$hasSavedMessages$14((TLObject) this.d, this.f19870b);
                return;
            case 26:
                ((SecretChatHelper) this.f19871c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f19870b);
                return;
            case 27:
                ((TopicsController) this.f19871c).lambda$loadTopics$4(this.f19870b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
            default:
                ((TopicsController) this.f19871c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19870b);
                return;
        }
    }

    public c4(BaseController baseController, long j10, Object obj, int i10) {
        this.f19869a = i10;
        this.f19871c = baseController;
        this.f19870b = j10;
        this.d = obj;
    }
}
