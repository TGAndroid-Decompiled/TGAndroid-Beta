package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TelegramMediaSession;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
public final class m8 implements Runnable {
    public final int f18260a;
    public final Object f18261b;
    public final Object f18262c;
    public final Object d;

    public m8(Object obj, Object obj2, Object obj3, int i10) {
        this.f18260a = i10;
        this.f18261b = obj;
        this.f18262c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18260a) {
            case 0:
                ((MediaDataController) this.f18261b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f18262c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f18261b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f18262c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f18261b).lambda$clearBotKeyboard$194((ArrayList) this.f18262c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f18261b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f18262c);
                return;
            case 4:
                ((MediaDataController) this.f18261b).lambda$processLoadedMedia$135((ArrayList) this.f18262c, (e9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f18261b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f18262c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f18261b).lambda$addUsersToChat$295((TLRPC.Chat) this.f18262c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f18261b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f18262c, (mb) this.d);
                return;
            case 8:
                ((MessagesController) this.f18261b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f18262c, (nb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.a2[]) this.f18261b, (boolean[]) this.f18262c, (org.telegram.ui.ActionBar.m2) this.d);
                return;
            case 10:
                ((MessagesController) this.f18261b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f18262c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f18261b).lambda$processMessageIDUpdate$375((long[]) this.f18262c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f18261b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f18262c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f18261b).lambda$getDifference$352((ArrayList) this.f18262c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f18261b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.g6) this.f18262c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 15:
                ((MessagesController) this.f18261b).lambda$getChannelDifference$341((ArrayList) this.f18262c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f18261b).lambda$requestIsUserContactBlocked$497((TLObject) this.f18262c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f18261b).lambda$load$0((TLObject) this.f18262c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f18261b).lambda$saveBotCache$126((TLObject) this.f18262c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f18261b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f18262c);
                return;
            case 20:
                ((MessagesStorage) this.f18261b).lambda$replaceMessageIfExists$232((MessageObject) this.f18262c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f18261b).lambda$getNewTask$111((a0.i) this.f18262c, (a0.i) this.d);
                return;
            case 22:
                ((RecordedAudioTranscriptionRequest) this.f18261b).lambda$startInternal$1((TLObject) this.f18262c, (TLRPC.TL_error) this.d);
                return;
            case 23:
                ((SavedMessagesController) this.f18261b).lambda$saveCache$11((MessagesStorage) this.f18262c, (ArrayList) this.d);
                return;
            case 24:
                ((SecretChatHelper) this.f18261b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f18262c, (TLRPC.EncryptedChat) this.d);
                return;
            case 25:
                ((SendMessagesHelper) this.f18261b).lambda$sendVote$34((String) this.d, (Runnable) this.f18262c);
                return;
            case 26:
                ((SendMessagesHelper) this.f18261b).lambda$performSendDelayedMessage$52((TLObject) this.f18262c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 27:
                ((SendMessagesHelper) this.f18261b).lambda$sendMessage$17((TLRPC.TL_error) this.f18262c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 28:
                ((TelegramMediaSession) this.f18261b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f18262c, (String) this.d);
                return;
            default:
                ((TranslateController) this.f18261b).lambda$checkDialogMessageSure$10((ArrayList) this.f18262c, (ArrayList) this.d);
                return;
        }
    }

    public m8(BaseController baseController, String str, Object obj, int i10) {
        this.f18260a = i10;
        this.f18261b = baseController;
        this.d = str;
        this.f18262c = obj;
    }
}
