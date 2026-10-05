package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18615a;
    public final BaseController f18616b;
    public final Object f18617c;
    public final Object d;
    public final Object f18618e;
    public final Object f18619f;
    public final Object h;
    public final Object f18620n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18615a = i10;
        this.f18616b = baseController;
        this.f18617c = obj;
        this.d = obj2;
        this.f18618e = obj3;
        this.f18619f = obj4;
        this.h = obj5;
        this.f18620n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18615a) {
            case 0:
                ((TranslateController) this.f18616b).lambda$translateStory$36((TL_stories.StoryItem) this.f18617c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18618e, (TLRPC.TL_textWithEntities) this.f18619f, (TranslateController.StoryKey) this.h, (Runnable) this.f18620n);
                return;
            case 1:
                ((MediaDataController) this.f18616b).lambda$loadHints$144((ArrayList) this.f18617c, (ArrayList) this.d, (ArrayList) this.f18618e, (ArrayList) this.f18619f, (ArrayList) this.h, (ArrayList) this.f18620n);
                return;
            case 2:
                ((MessagesController) this.f18616b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18617c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18618e, (TLRPC.TL_error) this.f18619f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18620n);
                return;
            case 3:
                ((MessagesController) this.f18616b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18617c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18618e, (TLRPC.TL_error) this.f18619f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18620n);
                return;
            default:
                ((SecretChatHelper) this.f18616b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18617c, (TLRPC.DecryptedMessage) this.f18618e, (TLRPC.Message) this.f18619f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18620n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18615a = 4;
        this.f18616b = secretChatHelper;
        this.f18617c = encryptedChat;
        this.f18618e = decryptedMessage;
        this.f18619f = message;
        this.h = inputEncryptedFile;
        this.f18620n = messageObject;
        this.d = str;
    }
}
