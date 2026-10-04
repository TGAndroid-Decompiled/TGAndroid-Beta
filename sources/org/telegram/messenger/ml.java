package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18620a;
    public final BaseController f18621b;
    public final Object f18622c;
    public final Object d;
    public final Object f18623e;
    public final Object f18624f;
    public final Object h;
    public final Object f18625n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18620a = i10;
        this.f18621b = baseController;
        this.f18622c = obj;
        this.d = obj2;
        this.f18623e = obj3;
        this.f18624f = obj4;
        this.h = obj5;
        this.f18625n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18620a) {
            case 0:
                ((TranslateController) this.f18621b).lambda$translateStory$36((TL_stories.StoryItem) this.f18622c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18623e, (TLRPC.TL_textWithEntities) this.f18624f, (TranslateController.StoryKey) this.h, (Runnable) this.f18625n);
                return;
            case 1:
                ((MediaDataController) this.f18621b).lambda$loadHints$144((ArrayList) this.f18622c, (ArrayList) this.d, (ArrayList) this.f18623e, (ArrayList) this.f18624f, (ArrayList) this.h, (ArrayList) this.f18625n);
                return;
            case 2:
                ((MessagesController) this.f18621b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18622c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18623e, (TLRPC.TL_error) this.f18624f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18625n);
                return;
            case 3:
                ((MessagesController) this.f18621b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18622c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18623e, (TLRPC.TL_error) this.f18624f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18625n);
                return;
            default:
                ((SecretChatHelper) this.f18621b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18622c, (TLRPC.DecryptedMessage) this.f18623e, (TLRPC.Message) this.f18624f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18625n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18620a = 4;
        this.f18621b = secretChatHelper;
        this.f18622c = encryptedChat;
        this.f18623e = decryptedMessage;
        this.f18624f = message;
        this.h = inputEncryptedFile;
        this.f18625n = messageObject;
        this.d = str;
    }
}
