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
public final class i0 implements Runnable {
    public final int f17434a;
    public final int f17435b;
    public final Object f17436c;
    public final Object d;
    public final Object e;

    public i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f17434a = i11;
        this.f17436c = obj;
        this.f17435b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17434a) {
            case 0:
                BirthdayController.b((BirthdayController) this.f17436c, this.f17435b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.e);
                return;
            case 1:
                ((MessagesController) this.f17436c).lambda$checkChatlistFolderUpdate$477((TLObject) this.d, this.f17435b, (MessagesController.ChatlistUpdatesStat) this.e);
                return;
            case 2:
                ((ContactsController) this.f17436c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.e, this.f17435b);
                return;
            case 3:
                ((ContactsController) this.f17436c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f17435b, (ArrayList) this.e);
                return;
            case 4:
                ((ImageLoader) this.f17436c).lambda$fileDidLoaded$11((String) this.d, this.f17435b, (File) this.e);
                return;
            case 5:
                ((LocaleController) this.f17436c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f17435b, (Runnable) this.e);
                return;
            case 6:
                ((MediaDataController) this.f17436c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.e, this.f17435b);
                return;
            case 7:
                ((MediaDataController) this.f17436c).lambda$loadBotInfo$197((Utilities.Callback) this.d, (TL_bots.BotInfo) this.e, this.f17435b);
                return;
            case 8:
                ((MediaDataController) this.f17436c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.e, this.f17435b);
                return;
            case 9:
                ((MessagesController) this.f17436c).lambda$processLoadedDeleteTask$88((a0.h) this.d, (a0.h) this.e, this.f17435b);
                return;
            case 10:
                ((MessagesController) this.f17436c).lambda$loadFullUser$70((TLRPC.UserFull) this.d, (TLRPC.User) this.e, this.f17435b);
                return;
            case 11:
                ((MessagesController) this.f17436c).lambda$loadMessagesInternal$184(this.f17435b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 12:
                ((MessagesController) this.f17436c).lambda$loadMessagesInternal$182(this.f17435b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.e);
                return;
            case 13:
                ((MessagesController) this.f17436c).lambda$loadMessagesInternal$177(this.f17435b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.e);
                return;
            case 14:
                ((MessagesController) this.f17436c).lambda$loadMessagesInternal$179(this.f17435b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.e);
                return;
            case 15:
                ((MessagesStorage) this.f17436c).lambda$hasAuthMessage$176(this.f17435b, (boolean[]) this.d, (CountDownLatch) this.e);
                return;
            case 16:
                ((MessagesStorage) this.f17436c).lambda$getBotCache$127(this.f17435b, (String) this.d, (RequestDelegate) this.e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f17436c, this.f17435b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.e);
                return;
            default:
                ((SecretChatHelper) this.f17436c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.e, this.f17435b);
                return;
        }
    }

    public i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f17434a = i11;
        this.f17436c = obj;
        this.d = obj2;
        this.f17435b = i10;
        this.e = obj3;
    }

    public i0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f17434a = i11;
        this.f17436c = baseController;
        this.d = obj;
        this.e = obj2;
        this.f17435b = i10;
    }
}
