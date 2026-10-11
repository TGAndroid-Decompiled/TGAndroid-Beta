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
    public final int f18101a;
    public final int f18102b;
    public final Object f18103c;
    public final Object d;
    public final Object f18104e;

    public i0(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f18101a = i11;
        this.f18103c = obj;
        this.f18102b = i10;
        this.d = obj2;
        this.f18104e = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18101a) {
            case 0:
                BirthdayController.b((BirthdayController) this.f18103c, this.f18102b, (ArrayList) this.d, (BirthdayController.TL_birthdays) this.f18104e);
                return;
            case 1:
                ((MessagesController) this.f18103c).lambda$checkChatlistFolderUpdate$480((TLObject) this.d, this.f18102b, (MessagesController.ChatlistUpdatesStat) this.f18104e);
                return;
            case 2:
                ((ContactsController) this.f18103c).lambda$loadPrivacySettings$64((TLRPC.TL_error) this.d, (TLObject) this.f18104e, this.f18102b);
                return;
            case 3:
                ((ContactsController) this.f18103c).lambda$processLoadedContacts$37((ArrayList) this.d, this.f18102b, (ArrayList) this.f18104e);
                return;
            case 4:
                ((ImageLoader) this.f18103c).lambda$fileDidLoaded$11((String) this.d, this.f18102b, (File) this.f18104e);
                return;
            case 5:
                ((LocaleController) this.f18103c).lambda$applyLanguage$7((LocaleController.LocaleInfo) this.d, this.f18102b, (Runnable) this.f18104e);
                return;
            case 6:
                ((MediaDataController) this.f18103c).lambda$loadArchivedStickersCount$71((TLRPC.TL_error) this.d, (TLObject) this.f18104e, this.f18102b);
                return;
            case 7:
                ((MediaDataController) this.f18103c).lambda$loadBotInfo$198((Utilities.Callback) this.d, (TL_bots.BotInfo) this.f18104e, this.f18102b);
                return;
            case 8:
                ((MediaDataController) this.f18103c).lambda$putDiceStickersToCache$90((TLRPC.TL_messages_stickerSet) this.d, (String) this.f18104e, this.f18102b);
                return;
            case 9:
                ((MessagesController) this.f18103c).lambda$loadMessagesInternal$176(this.f18102b, (TLRPC.TL_messages_getSavedHistory) this.d, (TLRPC.TL_error) this.f18104e);
                return;
            case 10:
                ((MessagesController) this.f18103c).lambda$processLoadedDeleteTask$87((a0.i) this.d, (a0.i) this.f18104e, this.f18102b);
                return;
            case 11:
                ((MessagesController) this.f18103c).lambda$loadFullUser$69((TLRPC.UserFull) this.d, (TLRPC.User) this.f18104e, this.f18102b);
                return;
            case 12:
                ((MessagesController) this.f18103c).lambda$loadMessagesInternal$181(this.f18102b, (TLRPC.TL_messages_getPeerDialogs) this.d, (TLRPC.TL_error) this.f18104e);
                return;
            case 13:
                ((MessagesController) this.f18103c).lambda$loadMessagesInternal$178(this.f18102b, (TLRPC.TL_messages_getReplies) this.d, (TLRPC.TL_error) this.f18104e);
                return;
            case 14:
                ((MessagesController) this.f18103c).lambda$loadMessagesInternal$183(this.f18102b, (TLRPC.TL_messages_getHistory) this.d, (TLRPC.TL_error) this.f18104e);
                return;
            case 15:
                ((MessagesStorage) this.f18103c).lambda$hasAuthMessage$176(this.f18102b, (boolean[]) this.d, (CountDownLatch) this.f18104e);
                return;
            case 16:
                ((MessagesStorage) this.f18103c).lambda$getBotCache$127(this.f18102b, (String) this.d, (RequestDelegate) this.f18104e);
                return;
            case 17:
                PasskeysController.lambda$create$6((Context) this.f18103c, this.f18102b, (TL_account.registerPasskey) this.d, (Utilities.Callback2) this.f18104e);
                return;
            default:
                ((SecretChatHelper) this.f18103c).lambda$performSendEncryptedRequest$5((TLRPC.Message) this.d, (TLRPC.messages_SentEncryptedMessage) this.f18104e, this.f18102b);
                return;
        }
    }

    public i0(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f18101a = i11;
        this.f18103c = obj;
        this.d = obj2;
        this.f18102b = i10;
        this.f18104e = obj3;
    }

    public i0(BaseController baseController, Object obj, Object obj2, int i10, int i11) {
        this.f18101a = i11;
        this.f18103c = baseController;
        this.d = obj;
        this.f18104e = obj2;
        this.f18102b = i10;
    }
}
