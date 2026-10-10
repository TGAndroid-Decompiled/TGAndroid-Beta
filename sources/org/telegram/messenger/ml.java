package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18569a;
    public final BaseController f18570b;
    public final Object f18571c;
    public final Object d;
    public final Object f18572e;
    public final Object f18573f;
    public final Object h;
    public final Object f18574n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18569a = i10;
        this.f18570b = baseController;
        this.f18571c = obj;
        this.d = obj2;
        this.f18572e = obj3;
        this.f18573f = obj4;
        this.h = obj5;
        this.f18574n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18569a) {
            case 0:
                ((TranslateController) this.f18570b).lambda$translateStory$36((TL_stories.StoryItem) this.f18571c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18572e, (TLRPC.TL_textWithEntities) this.f18573f, (TranslateController.StoryKey) this.h, (Runnable) this.f18574n);
                return;
            case 1:
                ((MediaDataController) this.f18570b).lambda$loadHints$144((ArrayList) this.f18571c, (ArrayList) this.d, (ArrayList) this.f18572e, (ArrayList) this.f18573f, (ArrayList) this.h, (ArrayList) this.f18574n);
                return;
            case 2:
                ((MessagesController) this.f18570b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18571c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18572e, (TLRPC.TL_error) this.f18573f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18574n);
                return;
            case 3:
                ((MessagesController) this.f18570b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18571c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18572e, (TLRPC.TL_error) this.f18573f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18574n);
                return;
            default:
                ((SecretChatHelper) this.f18570b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18571c, (TLRPC.DecryptedMessage) this.f18572e, (TLRPC.Message) this.f18573f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18574n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18569a = 4;
        this.f18570b = secretChatHelper;
        this.f18571c = encryptedChat;
        this.f18572e = decryptedMessage;
        this.f18573f = message;
        this.h = inputEncryptedFile;
        this.f18574n = messageObject;
        this.d = str;
    }
}
