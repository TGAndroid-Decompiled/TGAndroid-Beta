package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f16898a;
    public final BaseController f16899b;
    public final Object f16900c;
    public final Object d;
    public final Object e;
    public final Object f16901f;
    public final Object h;
    public final Object f16902n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16898a = i10;
        this.f16899b = baseController;
        this.f16900c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16901f = obj4;
        this.h = obj5;
        this.f16902n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16898a) {
            case 0:
                ((TranslateController) this.f16899b).lambda$translateStory$36((TL_stories.StoryItem) this.f16900c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f16901f, (TranslateController.StoryKey) this.h, (Runnable) this.f16902n);
                return;
            case 1:
                ((MediaDataController) this.f16899b).lambda$loadHints$144((ArrayList) this.f16900c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16901f, (ArrayList) this.h, (ArrayList) this.f16902n);
                return;
            case 2:
                ((MessagesController) this.f16899b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f16900c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f16901f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f16902n);
                return;
            case 3:
                ((MessagesController) this.f16899b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f16900c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f16901f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f16902n);
                return;
            default:
                ((SecretChatHelper) this.f16899b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f16900c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f16901f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f16902n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f16898a = 4;
        this.f16899b = secretChatHelper;
        this.f16900c = encryptedChat;
        this.e = decryptedMessage;
        this.f16901f = message;
        this.h = inputEncryptedFile;
        this.f16902n = messageObject;
        this.d = str;
    }
}
