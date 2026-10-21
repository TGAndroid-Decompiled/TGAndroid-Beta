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
public final class g4 implements Runnable {
    public final int f18408a;
    public final long f18409b;
    public final Object f18410c;
    public final Object d;

    public g4(Object obj, long j10, Object obj2, int i10) {
        this.f18408a = i10;
        this.f18410c = obj;
        this.f18409b = j10;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18408a) {
            case 0:
                ((GiftAuctionController) this.f18410c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f18409b);
                return;
            case 1:
                ((TranslateController) this.f18410c).lambda$pushPollToTranslate$27(this.f18409b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f18410c).lambda$pushRichMessageToTranslate$30(this.f18409b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f18410c, this.f18409b, (org.telegram.ui.Components.zc[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f18410c).lambda$processUpdate$13(this.f18409b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f18410c).lambda$loadLiveLocations$25(this.f18409b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f18410c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.f18409b);
                return;
            case 7:
                ((MediaDataController) this.f18410c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f18409b);
                return;
            case 8:
                ((MediaDataController) this.f18410c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.f18409b);
                return;
            case 9:
                MessagesController.lambda$convertToMegaGroup$262((MessagesStorage.LongCallback) this.f18410c, (TLRPC.Updates) this.d, this.f18409b);
                return;
            case 10:
                ((MessagesController) this.f18410c).lambda$addUsersToChannel$272((TLRPC.TL_messages_invitedUsers) this.d, this.f18409b);
                return;
            case 11:
                ((MessagesController) this.f18410c).lambda$updateTimerProc$158(this.f18409b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 12:
                ((MessagesController) this.f18410c).lambda$getSavedReactionTags$490((TLRPC.messages_SavedReactionTags) this.d, this.f18409b);
                return;
            case 13:
                ((MessagesController) this.f18410c).lambda$addUserToChat$303((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f18409b);
                return;
            case 14:
                ((MessagesController) this.f18410c).lambda$saveSavedReactionsTags$492(this.f18409b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 15:
                ((MessagesController) this.f18410c).lambda$didAddedNewTask$81(this.f18409b, (SparseArray) this.d);
                return;
            case 16:
                ((MessagesStorage) this.f18410c).lambda$updateUserInfoContactBlocked$131(this.f18409b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f18410c).lambda$isDialogHasTopMessage$175(this.f18409b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18410c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f18409b);
                return;
            case 19:
                ((MessagesStorage) this.f18410c).lambda$saveStoryAlbumsCache$269(this.f18409b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f18410c).lambda$overwriteChannel$189(this.f18409b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18410c).lambda$createOrEditTopic$199(this.f18409b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f18410c).lambda$createPendingTask$10(this.f18409b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f18410c).lambda$putChannelAdmins$124(this.f18409b, (a0.h) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f18410c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f18409b);
                return;
            case 25:
                ((NotificationsController) this.f18410c).lambda$showTonConnectNotification$2((String) this.d, this.f18409b);
                return;
            case 26:
                ((NotificationsController) this.f18410c).lambda$loadTopicsNotificationsExceptions$55(this.f18409b, (Consumer) this.d);
                return;
            case 27:
                ((SavedMessagesController) this.f18410c).lambda$hasSavedMessages$14((TLObject) this.d, this.f18409b);
                return;
            case 28:
                ((SecretChatHelper) this.f18410c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f18409b);
                return;
            default:
                ((TopicsController) this.f18410c).lambda$loadTopics$4(this.f18409b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
        }
    }

    public g4(Object obj, Object obj2, long j10, int i10) {
        this.f18408a = i10;
        this.f18410c = obj;
        this.d = obj2;
        this.f18409b = j10;
    }
}
