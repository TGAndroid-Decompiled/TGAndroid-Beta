package org.telegram.messenger;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
public final class l0 implements Runnable {
    public final int f20555a;
    public final int f20556b;
    public final Object f20557c;
    public final Object d;
    public final Object e;

    public l0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f20555a = i11;
        this.f20557c = obj;
        this.f20556b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20555a) {
            case 0:
                BirthdayController.b((BirthdayController) this.f20557c, this.f20556b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.e);
                return;
            case 1:
                ((MessagesController) this.f20557c).lambda$checkChatlistFolderUpdate$483((TLObject) this.d, this.f20556b, (MessagesController.ChatlistUpdatesStat) this.e);
                return;
            case 2:
                ((ContactsController) this.f20557c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.e, this.f20556b);
                return;
            case 3:
                ((ContactsController) this.f20557c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f20556b, (ArrayList) this.e);
                return;
            case 4:
                ((ImageLoader) this.f20557c).lambda$fileDidLoaded$11((String) this.d, this.f20556b, (File) this.e);
                return;
            case 5:
                ((LocaleController) this.f20557c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f20556b, (Runnable) this.e);
                return;
            case 6:
                ((MediaDataController) this.f20557c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.e, this.f20556b);
                return;
            case 7:
                ((MediaDataController) this.f20557c).lambda$loadBotInfo$198((Utilities.Callback) this.d, (TL_bots.BotInfo) this.e, this.f20556b);
                return;
            case 8:
                ((MediaDataController) this.f20557c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.e, this.f20556b);
                return;
            case 9:
                ((MessagesController) this.f20557c).lambda$loadMessagesInternal$176(this.f20556b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 10:
                ((MessagesController) this.f20557c).lambda$processLoadedDeleteTask$87((a0.h) this.d, (a0.h) this.e, this.f20556b);
                return;
            case 11:
                ((MessagesController) this.f20557c).lambda$loadFullUser$69((TLRPC.UserFull) this.d, (TLRPC.User) this.e, this.f20556b);
                return;
            case 12:
                ((MessagesController) this.f20557c).lambda$loadMessagesInternal$181(this.f20556b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                return;
            case 13:
                ((MessagesController) this.f20557c).lambda$loadMessagesInternal$178(this.f20556b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                return;
            case 14:
                ((MessagesController) this.f20557c).lambda$loadMessagesInternal$183(this.f20556b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 15:
                ((MessagesStorage) this.f20557c).lambda$hasAuthMessage$180(this.f20556b, (boolean[]) this.d, (CountDownLatch) this.e);
                return;
            case 16:
                ((MessagesStorage) this.f20557c).lambda$getBotCache$131(this.f20556b, (String) this.d, (RequestDelegate) this.e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f20557c, this.f20556b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.e);
                return;
            default:
                ((SecretChatHelper) this.f20557c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.e, this.f20556b);
                return;
        }
    }

    public l0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f20555a = i11;
        this.f20557c = obj;
        this.d = obj2;
        this.f20556b = i10;
        this.e = obj3;
    }

    public l0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f20555a = i11;
        this.f20557c = baseController;
        this.d = obj;
        this.e = obj2;
        this.f20556b = i10;
    }
}
