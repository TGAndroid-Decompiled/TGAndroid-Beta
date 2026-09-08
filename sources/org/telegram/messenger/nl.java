package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f18541a;
    public final BaseController f18542b;
    public final Object f18543c;
    public final Object d;
    public final Object f18544e;
    public final Object f18545f;
    public final Object h;
    public final Object f18546n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18541a = i10;
        this.f18542b = baseController;
        this.f18543c = obj;
        this.d = obj2;
        this.f18544e = obj3;
        this.f18545f = obj4;
        this.h = obj5;
        this.f18546n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18541a) {
            case 0:
                ((TranslateController) this.f18542b).lambda$translateStory$36((TL_stories.StoryItem) this.f18543c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18544e, (TLRPC.TL_textWithEntities) this.f18545f, (TranslateController.StoryKey) this.h, (Runnable) this.f18546n);
                return;
            case 1:
                ((MediaDataController) this.f18542b).lambda$loadHints$144((ArrayList) this.f18543c, (ArrayList) this.d, (ArrayList) this.f18544e, (ArrayList) this.f18545f, (ArrayList) this.h, (ArrayList) this.f18546n);
                return;
            case 2:
                ((MessagesController) this.f18542b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18543c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18544e, (TLRPC.TL_error) this.f18545f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18546n);
                return;
            case 3:
                ((MessagesController) this.f18542b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18543c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18544e, (TLRPC.TL_error) this.f18545f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18546n);
                return;
            default:
                ((SecretChatHelper) this.f18542b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18543c, (TLRPC.DecryptedMessage) this.f18544e, (TLRPC.Message) this.f18545f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18546n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18541a = 4;
        this.f18542b = secretChatHelper;
        this.f18543c = encryptedChat;
        this.f18544e = decryptedMessage;
        this.f18545f = message;
        this.h = inputEncryptedFile;
        this.f18546n = messageObject;
        this.d = str;
    }
}
