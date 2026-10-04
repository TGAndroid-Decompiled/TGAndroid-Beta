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
    public final int f17385a;
    public final long f17386b;
    public final Object f17387c;
    public final Object d;

    public b4(Object obj, long j3, Object obj2, int i10) {
        this.f17385a = i10;
        this.f17387c = obj;
        this.f17386b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f17385a) {
            case 0:
                ((GiftAuctionController) this.f17387c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f17386b);
                return;
            case 1:
                ((TranslateController) this.f17387c).lambda$pushPollToTranslate$27(this.f17386b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f17387c).lambda$pushRichMessageToTranslate$30(this.f17386b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f17387c, this.f17386b, (org.telegram.ui.Components.ad[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f17387c).lambda$processUpdate$13(this.f17386b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f17387c).lambda$loadLiveLocations$25(this.f17386b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f17387c).lambda$putBotInfo$202((TL_bots.BotInfo) this.d, this.f17386b);
                return;
            case 7:
                ((MediaDataController) this.f17387c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f17386b);
                return;
            case 8:
                ((MediaDataController) this.f17387c).lambda$updateBotInfo$203((TL_update.TL_updateBotCommands) this.d, this.f17386b);
                return;
            case 9:
                ((MessagesController) this.f17387c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.f17386b);
                return;
            case 10:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f17387c, (TLRPC.Updates) this.d, this.f17386b);
                return;
            case 11:
                ((MessagesController) this.f17387c).lambda$saveSavedReactionsTags$489(this.f17386b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 12:
                ((MessagesController) this.f17387c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.f17386b);
                return;
            case 13:
                ((MessagesController) this.f17387c).lambda$didAddedNewTask$82(this.f17386b, (SparseArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f17387c).lambda$updateTimerProc$159(this.f17386b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 15:
                ((MessagesController) this.f17387c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f17386b);
                return;
            case 16:
                ((MessagesStorage) this.f17387c).lambda$updateUserInfoContactBlocked$131(this.f17386b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f17387c).lambda$isDialogHasTopMessage$175(this.f17386b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17387c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f17386b);
                return;
            case 19:
                ((MessagesStorage) this.f17387c).lambda$saveStoryAlbumsCache$269(this.f17386b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f17387c).lambda$overwriteChannel$189(this.f17386b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f17387c).lambda$createOrEditTopic$199(this.f17386b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f17387c).lambda$createPendingTask$10(this.f17386b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f17387c).lambda$putChannelAdmins$124(this.f17386b, (a0.i) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f17387c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f17386b);
                return;
            case 25:
                ((NotificationsController) this.f17387c).lambda$loadTopicsNotificationsExceptions$54(this.f17386b, (Consumer) this.d);
                return;
            case 26:
                ((SavedMessagesController) this.f17387c).lambda$hasSavedMessages$14((TLObject) this.d, this.f17386b);
                return;
            case 27:
                ((SecretChatHelper) this.f17387c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f17386b);
                return;
            case 28:
                ((TopicsController) this.f17387c).lambda$loadTopics$4(this.f17386b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
            default:
                ((TopicsController) this.f17387c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f17386b);
                return;
        }
    }

    public b4(Object obj, Object obj2, long j3, int i10) {
        this.f17385a = i10;
        this.f17387c = obj;
        this.d = obj2;
        this.f17386b = j3;
    }
}
