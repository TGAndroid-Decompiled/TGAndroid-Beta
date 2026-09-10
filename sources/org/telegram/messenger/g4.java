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
    public final int f15240a;
    public final long f15241b;
    public final Object f15242c;
    public final Object d;

    public g4(Object obj, long j3, Object obj2, int i10) {
        this.f15240a = i10;
        this.f15242c = obj;
        this.f15241b = j3;
        this.d = obj2;
    }

    @Override
    public final void run() {
        switch (this.f15240a) {
            case 0:
                ((GiftAuctionController) this.f15242c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f15241b);
                return;
            case 1:
                ((TranslateController) this.f15242c).lambda$pushPollToTranslate$27(this.f15241b, (TranslateController.PendingPollTranslation) this.d);
                return;
            case 2:
                ((TranslateController) this.f15242c).lambda$pushRichMessageToTranslate$30(this.f15241b, (TranslateController.PendingRichTranslation) this.d);
                return;
            case 3:
                AndroidUtilities.lambda$showProxyAlert$17((boolean[]) this.f15242c, this.f15241b, (org.telegram.ui.Components.yc[]) this.d);
                return;
            case 4:
                ((ChatThemeController) this.f15242c).lambda$processUpdate$13(this.f15241b, (TLRPC.UserFull) this.d);
                return;
            case 5:
                ((LocationController) this.f15242c).lambda$loadLiveLocations$25(this.f15241b, (TLObject) this.d);
                return;
            case 6:
                ((MediaDataController) this.f15242c).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.d, this.f15241b);
                return;
            case 7:
                ((MediaDataController) this.f15242c).lambda$putBotInfo$201((TL_bots.BotInfo) this.d, this.f15241b);
                return;
            case 8:
                ((MediaDataController) this.f15242c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f15241b);
                return;
            case 9:
                ((MessagesController) this.f15242c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.f15241b);
                return;
            case 10:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f15242c, (TLRPC.Updates) this.d, this.f15241b);
                return;
            case 11:
                ((MessagesController) this.f15242c).lambda$saveSavedReactionsTags$489(this.f15241b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                return;
            case 12:
                ((MessagesController) this.f15242c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.f15241b);
                return;
            case 13:
                ((MessagesController) this.f15242c).lambda$didAddedNewTask$82(this.f15241b, (SparseArray) this.d);
                return;
            case 14:
                ((MessagesController) this.f15242c).lambda$updateTimerProc$159(this.f15241b, (TLRPC.TL_chatOnlines) this.d);
                return;
            case 15:
                ((MessagesController) this.f15242c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f15241b);
                return;
            case 16:
                ((MessagesStorage) this.f15242c).lambda$updateUserInfoContactBlocked$131(this.f15241b, (TL_account.RequirementToContact) this.d);
                return;
            case 17:
                ((MessagesStorage) this.f15242c).lambda$isDialogHasTopMessage$175(this.f15241b, (Runnable) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f15242c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f15241b);
                return;
            case 19:
                ((MessagesStorage) this.f15242c).lambda$saveStoryAlbumsCache$269(this.f15241b, (List) this.d);
                return;
            case 20:
                ((MessagesStorage) this.f15242c).lambda$overwriteChannel$189(this.f15241b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f15242c).lambda$createOrEditTopic$199(this.f15241b, (TLRPC.TL_forumTopic) this.d);
                return;
            case 22:
                ((MessagesStorage) this.f15242c).lambda$createPendingTask$10(this.f15241b, (NativeByteBuffer) this.d);
                return;
            case 23:
                ((MessagesStorage) this.f15242c).lambda$putChannelAdmins$124(this.f15241b, (a0.i) this.d);
                return;
            case 24:
                ((MessagesStorage) this.f15242c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f15241b);
                return;
            case 25:
                ((NotificationsController) this.f15242c).lambda$loadTopicsNotificationsExceptions$54(this.f15241b, (Consumer) this.d);
                return;
            case 26:
                ((SavedMessagesController) this.f15242c).lambda$hasSavedMessages$14((TLObject) this.d, this.f15241b);
                return;
            case 27:
                ((SecretChatHelper) this.f15242c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f15241b);
                return;
            case 28:
                ((TopicsController) this.f15242c).lambda$loadTopics$4(this.f15241b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                return;
            default:
                ((TopicsController) this.f15242c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f15241b);
                return;
        }
    }

    public g4(Object obj, Object obj2, long j3, int i10) {
        this.f15240a = i10;
        this.f15242c = obj;
        this.d = obj2;
        this.f15241b = j3;
    }
}
