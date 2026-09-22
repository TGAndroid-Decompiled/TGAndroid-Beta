package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f16885a;
    public final BaseController f16886b;
    public final Object f16887c;
    public final Object d;
    public final Object e;
    public final Object f16888f;
    public final Object h;
    public final Object f16889n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16885a = i10;
        this.f16886b = baseController;
        this.f16887c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16888f = obj4;
        this.h = obj5;
        this.f16889n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16885a) {
            case 0:
                ((TranslateController) this.f16886b).lambda$translateStory$36((TL_stories.StoryItem) this.f16887c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f16888f, (TranslateController.StoryKey) this.h, (Runnable) this.f16889n);
                return;
            case 1:
                ((MediaDataController) this.f16886b).lambda$loadHints$144((ArrayList) this.f16887c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16888f, (ArrayList) this.h, (ArrayList) this.f16889n);
                return;
            case 2:
                ((MessagesController) this.f16886b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f16887c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16888f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f16889n);
                return;
            case 3:
                ((MessagesController) this.f16886b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f16887c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16888f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f16889n);
                return;
            default:
                ((SecretChatHelper) this.f16886b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f16887c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f16888f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f16889n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f16885a = 4;
        this.f16886b = secretChatHelper;
        this.f16887c = encryptedChat;
        this.e = decryptedMessage;
        this.f16888f = message;
        this.h = inputEncryptedFile;
        this.f16889n = messageObject;
        this.d = str;
    }
}
