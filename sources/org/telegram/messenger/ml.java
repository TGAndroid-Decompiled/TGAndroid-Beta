package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18438a;
    public final BaseController f18439b;
    public final Object f18440c;
    public final Object d;
    public final Object f18441e;
    public final Object f18442f;
    public final Object h;
    public final Object f18443n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18438a = i10;
        this.f18439b = baseController;
        this.f18440c = obj;
        this.d = obj2;
        this.f18441e = obj3;
        this.f18442f = obj4;
        this.h = obj5;
        this.f18443n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18438a) {
            case 0:
                ((TranslateController) this.f18439b).lambda$translateStory$36((TL_stories.StoryItem) this.f18440c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18441e, (TLRPC.TL_textWithEntities) this.f18442f, (TranslateController.StoryKey) this.h, (Runnable) this.f18443n);
                return;
            case 1:
                ((MediaDataController) this.f18439b).lambda$loadHints$144((ArrayList) this.f18440c, (ArrayList) this.d, (ArrayList) this.f18441e, (ArrayList) this.f18442f, (ArrayList) this.h, (ArrayList) this.f18443n);
                return;
            case 2:
                ((MessagesController) this.f18439b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18440c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18441e, (TLRPC.TL_error) this.f18442f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18443n);
                return;
            case 3:
                ((MessagesController) this.f18439b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18440c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18441e, (TLRPC.TL_error) this.f18442f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18443n);
                return;
            default:
                ((SecretChatHelper) this.f18439b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18440c, (TLRPC.DecryptedMessage) this.f18441e, (TLRPC.Message) this.f18442f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18443n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18438a = 4;
        this.f18439b = secretChatHelper;
        this.f18440c = encryptedChat;
        this.f18441e = decryptedMessage;
        this.f18442f = message;
        this.h = inputEncryptedFile;
        this.f18443n = messageObject;
        this.d = str;
    }
}
