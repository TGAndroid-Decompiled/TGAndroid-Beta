package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f17067a;
    public final BaseController f17068b;
    public final Object f17069c;
    public final Object d;
    public final Object e;
    public final Object f17070f;
    public final Object h;
    public final Object f17071n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17067a = i10;
        this.f17068b = baseController;
        this.f17069c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17070f = obj4;
        this.h = obj5;
        this.f17071n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17067a) {
            case 0:
                ((TranslateController) this.f17068b).lambda$translateStory$36((TL_stories.StoryItem) this.f17069c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f17070f, (TranslateController.StoryKey) this.h, (Runnable) this.f17071n);
                return;
            case 1:
                ((MediaDataController) this.f17068b).lambda$loadHints$144((ArrayList) this.f17069c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17070f, (ArrayList) this.h, (ArrayList) this.f17071n);
                return;
            case 2:
                ((MessagesController) this.f17068b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f17069c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f17070f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f17071n);
                return;
            case 3:
                ((MessagesController) this.f17068b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f17069c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f17070f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f17071n);
                return;
            default:
                ((SecretChatHelper) this.f17068b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f17069c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f17070f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f17071n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f17067a = 4;
        this.f17068b = secretChatHelper;
        this.f17069c = encryptedChat;
        this.e = decryptedMessage;
        this.f17070f = message;
        this.h = inputEncryptedFile;
        this.f17071n = messageObject;
        this.d = str;
    }
}
