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
public final class j4 implements Runnable {
    public final int f20403a;
    public final long f20404b;
    public final Object f20405c;
    public final Object d;

    public j4(Object obj, long j10, Object obj2, int i10) {
        this.f20403a = i10;
        this.f20405c = obj;
        this.f20404b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f20403a) {
            case 0:
                ((GiftAuctionController) this.f20405c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f20404b);
                return;
            case 1:
                ((TranslateController) this.f20405c).lambda$pushPollToTranslate$27(this.f20404b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f20405c).lambda$pushRichMessageToTranslate$30(this.f20404b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f20405c, this.f20404b, (org.telegram.ui.Components.yc[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f20405c).lambda$processUpdate$13(this.f20404b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f20405c).lambda$loadLiveLocations$25(this.f20404b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f20405c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.f20404b);
                return;
            case 7:
                ((MediaDataController) this.f20405c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f20404b);
                return;
            case 8:
                ((MediaDataController) this.f20405c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.f20404b);
                return;
            case 9:
                MessagesController.lambda$convertToMegaGroup$262((MessagesStorage.LongCallback) this.f20405c, (TLRPC.Updates) this.d, this.f20404b);
                return;
            case 10:
                ((MessagesController) this.f20405c).lambda$addUsersToChannel$272((TLRPC.TL_messages_invitedUsers) this.d, this.f20404b);
                return;
            case 11:
                ((MessagesController) this.f20405c).lambda$updateTimerProc$158(this.f20404b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 12:
                ((MessagesController) this.f20405c).lambda$processUpdateArray$399(this.f20404b, (TL_update.TL_updateMessageWidgetData) this.d);
                return;
            case 13:
                ((MessagesController) this.f20405c).lambda$saveSavedReactionsTags$495(this.f20404b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 14:
                ((MessagesController) this.f20405c).lambda$getSavedReactionTags$493((TLRPC.messages_SavedReactionTags) this.d, this.f20404b);
                return;
            case 15:
                ((MessagesController) this.f20405c).lambda$addUserToChat$303((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f20404b);
                return;
            case 16:
                ((MessagesController) this.f20405c).lambda$didAddedNewTask$81(this.f20404b, (SparseArray) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f20405c).lambda$updateUserInfoContactBlocked$135(this.f20404b, (TL_account.RequirementToContact) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f20405c).lambda$deleteAllReactionsFromChat$86((SparseArray) this.d, this.f20404b);
                return;
            case 19:
                ((MessagesStorage) this.f20405c).lambda$isDialogHasTopMessage$179(this.f20404b, (Runnable) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f20405c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f20404b);
                return;
            case 21:
                ((MessagesStorage) this.f20405c).lambda$saveStoryAlbumsCache$273(this.f20404b, (List) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f20405c).lambda$overwriteChannel$193(this.f20404b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f20405c).lambda$createOrEditTopic$203(this.f20404b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f20405c).lambda$createPendingTask$10(this.f20404b, (NativeByteBuffer) this.d);
                return;
            case 25:
                ((MessagesStorage) this.f20405c).lambda$putChannelAdmins$128(this.f20404b, (a0.h) this.d);
                return;
            case 26:
                ((NotificationsController) this.f20405c).lambda$showTonConnectNotification$2((String) this.d, this.f20404b);
                return;
            case 27:
                ((NotificationsController) this.f20405c).lambda$loadTopicsNotificationsExceptions$55(this.f20404b, (Consumer) this.d);
                return;
            case 28:
                ((SavedMessagesController) this.f20405c).lambda$hasSavedMessages$14((TLObject) this.d, this.f20404b);
                return;
            default:
                ((SecretChatHelper) this.f20405c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f20404b);
                return;
        }
    }

    public j4(Object obj, Object obj2, long j10, int i10) {
        this.f20403a = i10;
        this.f20405c = obj;
        this.d = obj2;
        this.f20404b = j10;
    }
}
