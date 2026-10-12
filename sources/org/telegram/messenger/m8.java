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
    public final int f17849a;
    public final Object f17850b;
    public final Object f17851c;
    public final Object d;

    public m8(Object obj, Object obj2, Object obj3, int i10) {
        this.f17849a = i10;
        this.f17850b = obj;
        this.f17851c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17849a) {
            case 0:
                ((MediaDataController) this.f17850b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f17851c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f17850b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f17851c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f17850b).lambda$clearBotKeyboard$194((ArrayList) this.f17851c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f17850b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f17851c);
                return;
            case 4:
                ((MediaDataController) this.f17850b).lambda$processLoadedMedia$135((ArrayList) this.f17851c, (e9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f17850b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f17851c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f17850b).lambda$addUsersToChat$295((TLRPC.Chat) this.f17851c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f17850b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f17851c, (mb) this.d);
                return;
            case 8:
                ((MessagesController) this.f17850b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f17851c, (nb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.a2[]) this.f17850b, (boolean[]) this.f17851c, (org.telegram.ui.ActionBar.m2) this.d);
                return;
            case 10:
                ((MessagesController) this.f17850b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f17851c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f17850b).lambda$processMessageIDUpdate$375((long[]) this.f17851c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f17850b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f17851c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f17850b).lambda$getDifference$352((ArrayList) this.f17851c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f17850b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.f6) this.f17851c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 15:
                ((MessagesController) this.f17850b).lambda$getChannelDifference$341((ArrayList) this.f17851c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f17850b).lambda$requestIsUserContactBlocked$497((TLObject) this.f17851c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f17850b).lambda$load$0((TLObject) this.f17851c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17850b).lambda$saveBotCache$126((TLObject) this.f17851c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f17850b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f17851c);
                return;
            case 20:
                ((MessagesStorage) this.f17850b).lambda$replaceMessageIfExists$232((MessageObject) this.f17851c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f17850b).lambda$getNewTask$111((a0.h) this.f17851c, (a0.h) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f17850b).lambda$saveCache$11((MessagesStorage) this.f17851c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f17850b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f17851c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f17850b).lambda$sendVote$34((String) this.d, (Runnable) this.f17851c);
                return;
            case 25:
                ((SendMessagesHelper) this.f17850b).lambda$performSendDelayedMessage$52((TLObject) this.f17851c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f17850b).lambda$sendMessage$17((TLRPC.TL_error) this.f17851c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f17850b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f17851c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f17850b).lambda$checkDialogMessageSure$10((ArrayList) this.f17851c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f17850b, (Utilities.Callback[]) this.f17851c, (Runnable) this.d);
                return;
        }
    }

    public m8(BaseController baseController, String str, Object obj, int i10) {
        this.f17849a = i10;
        this.f17850b = baseController;
        this.d = str;
        this.f17851c = obj;
    }
}
