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
public final class f4 implements Runnable {
    public final int f17212a;
    public final long f17213b;
    public final Object f17214c;
    public final Object d;

    public f4(Object obj, long j10, Object obj2, int i10) {
        this.f17212a = i10;
        this.f17214c = obj;
        this.f17213b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17212a) {
            case 0:
                ((GiftAuctionController) this.f17214c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f17213b);
                return;
            case 1:
                ((TranslateController) this.f17214c).lambda$pushPollToTranslate$27(this.f17213b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f17214c).lambda$pushRichMessageToTranslate$30(this.f17213b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f17214c, this.f17213b, (org.telegram.ui.Components.bd[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f17214c).lambda$processUpdate$13(this.f17213b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f17214c).lambda$loadLiveLocations$25(this.f17213b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f17214c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.f17213b);
                return;
            case 7:
                ((MediaDataController) this.f17214c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f17213b);
                return;
            case 8:
                ((MediaDataController) this.f17214c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.f17213b);
                return;
            case 9:
                MessagesController.lambda$convertToMegaGroup$262((MessagesStorage.LongCallback) this.f17214c, (TLRPC.Updates) this.d, this.f17213b);
                return;
            case 10:
                ((MessagesController) this.f17214c).lambda$addUsersToChannel$272((TLRPC.TL_messages_invitedUsers) this.d, this.f17213b);
                return;
            case 11:
                ((MessagesController) this.f17214c).lambda$updateTimerProc$158(this.f17213b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 12:
                ((MessagesController) this.f17214c).lambda$getSavedReactionTags$490((TLRPC.messages_SavedReactionTags) this.d, this.f17213b);
                return;
            case 13:
                ((MessagesController) this.f17214c).lambda$addUserToChat$303((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f17213b);
                return;
            case 14:
                ((MessagesController) this.f17214c).lambda$saveSavedReactionsTags$492(this.f17213b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 15:
                ((MessagesController) this.f17214c).lambda$didAddedNewTask$81(this.f17213b, (SparseArray) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f17214c).lambda$updateUserInfoContactBlocked$131(this.f17213b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f17214c).lambda$isDialogHasTopMessage$175(this.f17213b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17214c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f17213b);
                return;
            case 19:
                ((MessagesStorage) this.f17214c).lambda$saveStoryAlbumsCache$269(this.f17213b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f17214c).lambda$overwriteChannel$189(this.f17213b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f17214c).lambda$createOrEditTopic$199(this.f17213b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f17214c).lambda$createPendingTask$10(this.f17213b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f17214c).lambda$putChannelAdmins$124(this.f17213b, (a0.h) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f17214c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f17213b);
                return;
            case 25:
                ((NotificationsController) this.f17214c).lambda$showTonConnectNotification$2((String) this.d, this.f17213b);
                return;
            case 26:
                ((NotificationsController) this.f17214c).lambda$loadTopicsNotificationsExceptions$55(this.f17213b, (Consumer) this.d);
                return;
            case 27:
                ((SavedMessagesController) this.f17214c).lambda$hasSavedMessages$14((TLObject) this.d, this.f17213b);
                return;
            case 28:
                ((SecretChatHelper) this.f17214c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f17213b);
                return;
            default:
                ((TopicsController) this.f17214c).lambda$loadTopics$4(this.f17213b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
        }
    }

    public f4(Object obj, Object obj2, long j10, int i10) {
        this.f17212a = i10;
        this.f17214c = obj;
        this.d = obj2;
        this.f17213b = j10;
    }
}
