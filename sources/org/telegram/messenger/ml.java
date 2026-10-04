package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18619a;
    public final BaseController f18620b;
    public final Object f18621c;
    public final Object d;
    public final Object f18622e;
    public final Object f18623f;
    public final Object h;
    public final Object f18624n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18619a = i10;
        this.f18620b = baseController;
        this.f18621c = obj;
        this.d = obj2;
        this.f18622e = obj3;
        this.f18623f = obj4;
        this.h = obj5;
        this.f18624n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18619a) {
            case 0:
                ((TranslateController) this.f18620b).lambda$translateStory$36((TL_stories.StoryItem) this.f18621c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18622e, (TLRPC.TL_textWithEntities) this.f18623f, (TranslateController.StoryKey) this.h, (Runnable) this.f18624n);
                return;
            case 1:
                ((MediaDataController) this.f18620b).lambda$loadHints$144((ArrayList) this.f18621c, (ArrayList) this.d, (ArrayList) this.f18622e, (ArrayList) this.f18623f, (ArrayList) this.h, (ArrayList) this.f18624n);
                return;
            case 2:
                ((MessagesController) this.f18620b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18621c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18622e, (TLRPC.TL_error) this.f18623f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18624n);
                return;
            case 3:
                ((MessagesController) this.f18620b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18621c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18622e, (TLRPC.TL_error) this.f18623f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18624n);
                return;
            default:
                ((SecretChatHelper) this.f18620b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18621c, (TLRPC.DecryptedMessage) this.f18622e, (TLRPC.Message) this.f18623f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18624n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18619a = 4;
        this.f18620b = secretChatHelper;
        this.f18621c = encryptedChat;
        this.f18622e = decryptedMessage;
        this.f18623f = message;
        this.h = inputEncryptedFile;
        this.f18624n = messageObject;
        this.d = str;
    }
}
