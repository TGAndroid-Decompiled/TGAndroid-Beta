package org.telegram.messenger;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_update;

public final class c4 implements Runnable {

    public final int f19878a;

    public final long f19879b;

    public final Object f19880c;
    public final Object d;

    public c4(Object obj, Object obj2, long j10, int i10) {
        this.f19878a = i10;
        this.f19880c = obj;
        this.d = obj2;
        this.f19879b = j10;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19878a) {
            case 0:
                ((GiftAuctionController) this.f19880c).lambda$onGiftAuctionStateReceivedInternal$2((GiftAuctionController.AuctionInternal) this.d, this.f19879b);
                break;
            case 1:
                ((TranslateController) this.f19880c).lambda$pushPollToTranslate$27(this.f19879b, (TranslateController.PendingPollTranslation) this.d);
                break;
            case 2:
                ((TranslateController) this.f19880c).lambda$pushRichMessageToTranslate$30(this.f19879b, (TranslateController.PendingRichTranslation) this.d);
                break;
            case 3:
                ((ChatThemeController) this.f19880c).lambda$processUpdate$13(this.f19879b, (TLRPC.UserFull) this.d);
                break;
            case 4:
                ((LocationController) this.f19880c).lambda$loadLiveLocations$25(this.f19879b, (TLObject) this.d);
                break;
            case 5:
                ((MediaDataController) this.f19880c).lambda$updateBotInfo$202((TL_update.TL_updateBotCommands) this.d, this.f19879b);
                break;
            case 6:
                ((MediaDataController) this.f19880c).lambda$putBotInfo$201((TL_bots.BotInfo) this.d, this.f19879b);
                break;
            case 7:
                ((MediaDataController) this.f19880c).lambda$savePinnedMessages$166((ArrayList) this.d, this.f19879b);
                break;
            case 8:
                ((MessagesController) this.f19880c).lambda$addUsersToChannel$273((TLRPC.TL_messages_invitedUsers) this.d, this.f19879b);
                break;
            case 9:
                MessagesController.lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f19880c, (TLRPC.Updates) this.d, this.f19879b);
                break;
            case 10:
                ((MessagesController) this.f19880c).lambda$saveSavedReactionsTags$489(this.f19879b, (TLRPC.TL_messages_savedReactionsTags) this.d);
                break;
            case 11:
                ((MessagesController) this.f19880c).lambda$getSavedReactionTags$487((TLRPC.messages_SavedReactionTags) this.d, this.f19879b);
                break;
            case 12:
                ((MessagesController) this.f19880c).lambda$didAddedNewTask$82(this.f19879b, (SparseArray) this.d);
                break;
            case 13:
                ((MessagesController) this.f19880c).lambda$updateTimerProc$159(this.f19879b, (TLRPC.TL_chatOnlines) this.d);
                break;
            case 14:
                ((MessagesController) this.f19880c).lambda$addUserToChat$304((TLRPC.TL_chatInviteJoinResultWebView) this.d, this.f19879b);
                break;
            case 15:
                ((MessagesStorage) this.f19880c).lambda$updateUserInfoContactBlocked$131(this.f19879b, (TL_account.RequirementToContact) this.d);
                break;
            case 16:
                ((MessagesStorage) this.f19880c).lambda$isDialogHasTopMessage$175(this.f19879b, (Runnable) this.d);
                break;
            case 17:
                ((MessagesStorage) this.f19880c).lambda$loadPendingTasks$12((TLRPC.Chat) this.d, this.f19879b);
                break;
            case 18:
                ((MessagesStorage) this.f19880c).lambda$saveStoryAlbumsCache$269(this.f19879b, (List) this.d);
                break;
            case 19:
                ((MessagesStorage) this.f19880c).lambda$overwriteChannel$189(this.f19879b, (TLRPC.TL_updates_channelDifferenceTooLong) this.d);
                break;
            case 20:
                ((MessagesStorage) this.f19880c).lambda$createOrEditTopic$199(this.f19879b, (TLRPC.TL_forumTopic) this.d);
                break;
            case 21:
                ((MessagesStorage) this.f19880c).lambda$createPendingTask$10(this.f19879b, (NativeByteBuffer) this.d);
                break;
            case 22:
                ((MessagesStorage) this.f19880c).lambda$putChannelAdmins$124(this.f19879b, (a0.h) this.d);
                break;
            case 23:
                ((MessagesStorage) this.f19880c).lambda$deleteAllReactionsFromChat$83((SparseArray) this.d, this.f19879b);
                break;
            case 24:
                ((NotificationsController) this.f19880c).lambda$loadTopicsNotificationsExceptions$54(this.f19879b, (Consumer) this.d);
                break;
            case 25:
                ((SavedMessagesController) this.f19880c).lambda$hasSavedMessages$14((TLObject) this.d, this.f19879b);
                break;
            case 26:
                ((SecretChatHelper) this.f19880c).lambda$processUpdateEncryption$1((TLRPC.TL_dialog) this.d, this.f19879b);
                break;
            case 27:
                ((TopicsController) this.f19880c).lambda$loadTopics$4(this.f19879b, (TLRPC.TL_messages_savedDialogsNotModified) this.d);
                break;
            default:
                ((TopicsController) this.f19880c).lambda$updateTopicsWithDeletedMessages$10((ArrayList) this.d, this.f19879b);
                break;
        }
    }

    public c4(BaseController baseController, long j10, Object obj, int i10) {
        this.f19878a = i10;
        this.f19880c = baseController;
        this.f19879b = j10;
        this.d = obj;
    }
}
