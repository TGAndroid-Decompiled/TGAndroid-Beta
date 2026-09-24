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
public final class b4 implements Runnable {
    public final int f15937a;
    public final long f15938b;
    public final Object f15939c;
    public final Object d;

    public b4(Object obj, long j3, Object obj2, int i10) {
        this.f15937a = i10;
        this.f15939c = obj;
        this.f15938b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15937a) {
            case 0:
                ((GiftAuctionController) this.f15939c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f15938b);
                return;
            case 1:
                ((TranslateController) this.f15939c).lambda$pushPollToTranslate$27(this.f15938b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f15939c).lambda$pushRichMessageToTranslate$30(this.f15938b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f15939c, this.f15938b, (org.telegram.ui.Components.ad[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f15939c).lambda$processUpdate$13(this.f15938b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f15939c).lambda$loadLiveLocations$25(this.f15938b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f15939c).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.d, this.f15938b);
                return;
            case 7:
                ((MediaDataController) this.f15939c).lambda$putBotInfo$201((TL_bots.BotInfo) this.d, this.f15938b);
                return;
            case 8:
                ((MediaDataController) this.f15939c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f15938b);
                return;
            case 9:
                ((MessagesController) this.f15939c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.f15938b);
                return;
            case 10:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f15939c, (TLRPC.Updates) this.d, this.f15938b);
                return;
            case 11:
                ((MessagesController) this.f15939c).lambda$saveSavedReactionsTags$489(this.f15938b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 12:
                ((MessagesController) this.f15939c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.f15938b);
                return;
            case 13:
                ((MessagesController) this.f15939c).lambda$didAddedNewTask$82(this.f15938b, (SparseArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f15939c).lambda$updateTimerProc$159(this.f15938b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 15:
                ((MessagesController) this.f15939c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f15938b);
                return;
            case 16:
                ((MessagesStorage) this.f15939c).lambda$updateUserInfoContactBlocked$131(this.f15938b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f15939c).lambda$isDialogHasTopMessage$175(this.f15938b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f15939c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f15938b);
                return;
            case 19:
                ((MessagesStorage) this.f15939c).lambda$saveStoryAlbumsCache$269(this.f15938b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f15939c).lambda$overwriteChannel$189(this.f15938b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f15939c).lambda$createOrEditTopic$199(this.f15938b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f15939c).lambda$createPendingTask$10(this.f15938b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f15939c).lambda$putChannelAdmins$124(this.f15938b, (a0.i) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f15939c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f15938b);
                return;
            case 25:
                ((NotificationsController) this.f15939c).lambda$loadTopicsNotificationsExceptions$54(this.f15938b, (Consumer) this.d);
                return;
            case 26:
                ((SavedMessagesController) this.f15939c).lambda$hasSavedMessages$14((TLObject) this.d, this.f15938b);
                return;
            case 27:
                ((SecretChatHelper) this.f15939c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f15938b);
                return;
            case 28:
                ((TopicsController) this.f15939c).lambda$loadTopics$4(this.f15938b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
            default:
                ((TopicsController) this.f15939c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f15938b);
                return;
        }
    }

    public b4(Object obj, Object obj2, long j3, int i10) {
        this.f15937a = i10;
        this.f15939c = obj;
        this.d = obj2;
        this.f15938b = j3;
    }
}
