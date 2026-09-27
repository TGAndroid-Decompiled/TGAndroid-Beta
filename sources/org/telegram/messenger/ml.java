package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f17049a;
    public final BaseController f17050b;
    public final Object f17051c;
    public final Object d;
    public final Object e;
    public final Object f17052f;
    public final Object h;
    public final Object f17053n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17049a = i10;
        this.f17050b = baseController;
        this.f17051c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17052f = obj4;
        this.h = obj5;
        this.f17053n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17049a) {
            case 0:
                ((TranslateController) this.f17050b).lambda$translateStory$36((TL_stories.StoryItem) this.f17051c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f17052f, (TranslateController.StoryKey) this.h, (Runnable) this.f17053n);
                return;
            case 1:
                ((MediaDataController) this.f17050b).lambda$loadHints$144((ArrayList) this.f17051c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17052f, (ArrayList) this.h, (ArrayList) this.f17053n);
                return;
            case 2:
                ((MessagesController) this.f17050b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f17051c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f17052f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f17053n);
                return;
            case 3:
                ((MessagesController) this.f17050b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f17051c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f17052f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f17053n);
                return;
            default:
                ((SecretChatHelper) this.f17050b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f17051c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f17052f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f17053n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f17049a = 4;
        this.f17050b = secretChatHelper;
        this.f17051c = encryptedChat;
        this.e = decryptedMessage;
        this.f17052f = message;
        this.h = inputEncryptedFile;
        this.f17053n = messageObject;
        this.d = str;
    }
}
