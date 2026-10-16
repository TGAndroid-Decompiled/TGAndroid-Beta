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
    public final int f17545a;
    public final Object f17546b;
    public final Object f17547c;
    public final Object d;

    public m8(Object obj, Object obj2, Object obj3, int i10) {
        this.f17545a = i10;
        this.f17546b = obj;
        this.f17547c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                ((MediaDataController) this.f17546b).lambda$verifyAnimatedStickerMessage$68((TLRPC.Message) this.f17547c, (String) this.d);
                return;
            case 1:
                ((MediaDataController) this.f17546b).lambda$preloadPremiumPreviewStickers$206((TLRPC.TL_error) this.f17547c, (TLObject) this.d);
                return;
            case 2:
                ((MediaDataController) this.f17546b).lambda$clearBotKeyboard$194((ArrayList) this.f17547c, (MessagesStorage.TopicKey) this.d);
                return;
            case 3:
                ((MediaDataController) this.f17546b).lambda$findStickerSetByNameInCache$30((String) this.d, (Utilities.Callback) this.f17547c);
                return;
            case 4:
                ((MediaDataController) this.f17546b).lambda$processLoadedMedia$135((ArrayList) this.f17547c, (e9) this.d);
                return;
            case 5:
                ((MediaDataController) this.f17546b).lambda$findStickerSetByNameInCache$29((TLRPC.TL_messages_stickerSet) this.f17547c, (Utilities.Callback) this.d);
                return;
            case 6:
                ((MessagesController) this.f17546b).lambda$addUsersToChat$295((TLRPC.Chat) this.f17547c, (TLRPC.TL_messages_invitedUsers) this.d);
                return;
            case 7:
                ((MessagesController) this.f17546b).lambda$setUserAdminRole$103((TLRPC.TL_channels_editAdmin) this.f17547c, (mb) this.d);
                return;
            case 8:
                ((MessagesController) this.f17546b).lambda$setUserAdminRole$108((TLRPC.TL_messages_editChatAdmin) this.f17547c, (nb) this.d);
                return;
            case 9:
                MessagesController.lambda$openByUserName$461((org.telegram.ui.ActionBar.a2[]) this.f17546b, (boolean[]) this.f17547c, (org.telegram.ui.ActionBar.m2) this.d);
                return;
            case 10:
                ((MessagesController) this.f17546b).lambda$updateChatAbout$288((TLRPC.ChatFull) this.f17547c, (String) this.d);
                return;
            case 11:
                ((MessagesController) this.f17546b).lambda$processMessageIDUpdate$375((long[]) this.f17547c, (TL_update.TL_updateMessageID) this.d);
                return;
            case 12:
                ((MessagesController) this.f17546b).lambda$processDialogsUpdateRead$222((LongSparseIntArray) this.f17547c, (LongSparseIntArray) this.d);
                return;
            case 13:
                ((MessagesController) this.f17546b).lambda$getDifference$352((ArrayList) this.f17547c, (TLRPC.updates_Difference) this.d);
                return;
            case 14:
                ((MessagesController) this.f17546b).lambda$didReceivedNotification$49((org.telegram.ui.ActionBar.f6) this.f17547c, (org.telegram.ui.ActionBar.e6) this.d);
                return;
            case 15:
                ((MessagesController) this.f17546b).lambda$getChannelDifference$341((ArrayList) this.f17547c, (TLRPC.updates_ChannelDifference) this.d);
                return;
            case 16:
                ((MessagesController) this.f17546b).lambda$requestIsUserContactBlocked$497((TLObject) this.f17547c, (ArrayList) this.d);
                return;
            case 17:
                ((MessagesController.SavedMusicList) this.f17546b).lambda$load$0((TLObject) this.f17547c, (ArrayList) this.d);
                return;
            case 18:
                ((MessagesStorage) this.f17546b).lambda$saveBotCache$126((TLObject) this.f17547c, (String) this.d);
                return;
            case 19:
                ((MessagesStorage) this.f17546b).lambda$applyPhoneBookUpdates$148((String) this.d, (String) this.f17547c);
                return;
            case 20:
                ((MessagesStorage) this.f17546b).lambda$replaceMessageIfExists$232((MessageObject) this.f17547c, (ArrayList) this.d);
                return;
            case 21:
                ((MessagesStorage) this.f17546b).lambda$getNewTask$111((a0.h) this.f17547c, (a0.h) this.d);
                return;
            case 22:
                ((SavedMessagesController) this.f17546b).lambda$saveCache$11((MessagesStorage) this.f17547c, (ArrayList) this.d);
                return;
            case 23:
                ((SecretChatHelper) this.f17546b).lambda$processUpdateEncryption$2((TLRPC.EncryptedChat) this.f17547c, (TLRPC.EncryptedChat) this.d);
                return;
            case 24:
                ((SendMessagesHelper) this.f17546b).lambda$sendVote$34((String) this.d, (Runnable) this.f17547c);
                return;
            case 25:
                ((SendMessagesHelper) this.f17546b).lambda$performSendDelayedMessage$52((TLObject) this.f17547c, (SendMessagesHelper.DelayedMessage) this.d);
                return;
            case 26:
                ((SendMessagesHelper) this.f17546b).lambda$sendMessage$17((TLRPC.TL_error) this.f17547c, (TLRPC.TL_messages_forwardMessages) this.d);
                return;
            case 27:
                ((TelegramMediaSession) this.f17546b).lambda$loadBrowseChildren$3((TelegramMediaSession.BrowseChildrenCallback) this.f17547c, (String) this.d);
                return;
            case 28:
                ((TranslateController) this.f17546b).lambda$checkDialogMessageSure$10((ArrayList) this.f17547c, (ArrayList) this.d);
                return;
            default:
                Utilities.lambda$raceCallbacks$1((int[]) this.f17546b, (Utilities.Callback[]) this.f17547c, (Runnable) this.d);
                return;
        }
    }

    public m8(BaseController baseController, String str, Object obj, int i10) {
        this.f17545a = i10;
        this.f17546b = baseController;
        this.d = str;
        this.f17547c = obj;
    }
}
