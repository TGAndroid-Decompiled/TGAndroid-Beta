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
public final class h4 implements Runnable {
    public final int f18555a;
    public final long f18556b;
    public final Object f18557c;
    public final Object d;

    public h4(Object obj, long j10, Object obj2, int i10) {
        this.f18555a = i10;
        this.f18557c = obj;
        this.f18556b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18555a) {
            case 0:
                ((GiftAuctionController) this.f18557c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f18556b);
                return;
            case 1:
                ((TranslateController) this.f18557c).lambda$pushPollToTranslate$27(this.f18556b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f18557c).lambda$pushRichMessageToTranslate$30(this.f18556b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f18557c, this.f18556b, (org.telegram.ui.Components.xc[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f18557c).lambda$processUpdate$13(this.f18556b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f18557c).lambda$loadLiveLocations$25(this.f18556b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f18557c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.f18556b);
                return;
            case 7:
                ((MediaDataController) this.f18557c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f18556b);
                return;
            case 8:
                ((MediaDataController) this.f18557c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.f18556b);
                return;
            case 9:
                MessagesController.lambda$convertToMegaGroup$262((MessagesStorage.LongCallback) this.f18557c, (TLRPC.Updates) this.d, this.f18556b);
                return;
            case 10:
                ((MessagesController) this.f18557c).lambda$addUsersToChannel$272((TLRPC.TL_messages_invitedUsers) this.d, this.f18556b);
                return;
            case 11:
                ((MessagesController) this.f18557c).lambda$updateTimerProc$158(this.f18556b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 12:
                ((MessagesController) this.f18557c).lambda$getSavedReactionTags$490((TLRPC.messages_SavedReactionTags) this.d, this.f18556b);
                return;
            case 13:
                ((MessagesController) this.f18557c).lambda$addUserToChat$303((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f18556b);
                return;
            case 14:
                ((MessagesController) this.f18557c).lambda$saveSavedReactionsTags$492(this.f18556b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 15:
                ((MessagesController) this.f18557c).lambda$didAddedNewTask$81(this.f18556b, (SparseArray) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f18557c).lambda$updateUserInfoContactBlocked$131(this.f18556b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f18557c).lambda$isDialogHasTopMessage$175(this.f18556b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18557c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f18556b);
                return;
            case 19:
                ((MessagesStorage) this.f18557c).lambda$saveStoryAlbumsCache$269(this.f18556b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f18557c).lambda$overwriteChannel$189(this.f18556b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18557c).lambda$createOrEditTopic$199(this.f18556b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f18557c).lambda$createPendingTask$10(this.f18556b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f18557c).lambda$putChannelAdmins$124(this.f18556b, (a0.h) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f18557c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f18556b);
                return;
            case 25:
                ((NotificationsController) this.f18557c).lambda$showTonConnectNotification$2((String) this.d, this.f18556b);
                return;
            case 26:
                ((NotificationsController) this.f18557c).lambda$loadTopicsNotificationsExceptions$55(this.f18556b, (Consumer) this.d);
                return;
            case 27:
                ((SavedMessagesController) this.f18557c).lambda$hasSavedMessages$14((TLObject) this.d, this.f18556b);
                return;
            case 28:
                ((SecretChatHelper) this.f18557c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f18556b);
                return;
            default:
                ((TopicsController) this.f18557c).lambda$loadTopics$4(this.f18556b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
        }
    }

    public h4(Object obj, Object obj2, long j10, int i10) {
        this.f18555a = i10;
        this.f18557c = obj;
        this.d = obj2;
        this.f18556b = j10;
    }
}
