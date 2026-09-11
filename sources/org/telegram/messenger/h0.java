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
public final class h0 implements Runnable {
    public final int f17835a;
    public final int f17836b;
    public final Object f17837c;
    public final Object d;
    public final Object f17838e;

    public h0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f17835a = i11;
        this.f17837c = obj;
        this.f17836b = i10;
        this.d = obj2;
        this.f17838e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17835a) {
            case 0:
                BirthdayController.b((BirthdayController) this.f17837c, this.f17836b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.f17838e);
                return;
            case 1:
                ((MessagesController) this.f17837c).lambda$checkChatlistFolderUpdate$477((TLObject) this.d, this.f17836b, (MessagesController.ChatlistUpdatesStat) this.f17838e);
                return;
            case 2:
                ((ContactsController) this.f17837c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.f17838e, this.f17836b);
                return;
            case 3:
                ((ContactsController) this.f17837c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f17836b, (ArrayList) this.f17838e);
                return;
            case 4:
                ((ImageLoader) this.f17837c).lambda$fileDidLoaded$11((String) this.d, this.f17836b, (File) this.f17838e);
                return;
            case 5:
                ((LocaleController) this.f17837c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f17836b, (Runnable) this.f17838e);
                return;
            case 6:
                ((MediaDataController) this.f17837c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.f17838e, this.f17836b);
                return;
            case 7:
                ((MediaDataController) this.f17837c).lambda$loadBotInfo$197((Utilities.Callback) this.d, (TL_bots.BotInfo) this.f17838e, this.f17836b);
                return;
            case 8:
                ((MediaDataController) this.f17837c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.f17838e, this.f17836b);
                return;
            case 9:
                ((MessagesController) this.f17837c).lambda$processLoadedDeleteTask$88((a0.i) this.d, (a0.i) this.f17838e, this.f17836b);
                return;
            case 10:
                ((MessagesController) this.f17837c).lambda$loadFullUser$70((TLRPC.UserFull) this.d, (TLRPC.User) this.f17838e, this.f17836b);
                return;
            case 11:
                ((MessagesController) this.f17837c).lambda$loadMessagesInternal$184(this.f17836b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.f17838e);
                return;
            case 12:
                ((MessagesController) this.f17837c).lambda$loadMessagesInternal$182(this.f17836b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.f17838e);
                return;
            case 13:
                ((MessagesController) this.f17837c).lambda$loadMessagesInternal$177(this.f17836b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.f17838e);
                return;
            case 14:
                ((MessagesController) this.f17837c).lambda$loadMessagesInternal$179(this.f17836b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.f17838e);
                return;
            case 15:
                ((MessagesStorage) this.f17837c).lambda$hasAuthMessage$176(this.f17836b, (boolean[]) this.d, (CountDownLatch) this.f17838e);
                return;
            case 16:
                ((MessagesStorage) this.f17837c).lambda$getBotCache$127(this.f17836b, (String) this.d, (RequestDelegate) this.f17838e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f17837c, this.f17836b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.f17838e);
                return;
            default:
                ((SecretChatHelper) this.f17837c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.f17838e, this.f17836b);
                return;
        }
    }

    public h0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f17835a = i11;
        this.f17837c = obj;
        this.d = obj2;
        this.f17836b = i10;
        this.f17838e = obj3;
    }

    public h0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f17835a = i11;
        this.f17837c = baseController;
        this.d = obj;
        this.f17838e = obj2;
        this.f17836b = i10;
    }
}
