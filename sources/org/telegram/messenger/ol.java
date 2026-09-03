package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f18039a;
    public final BaseController f18040b;
    public final Object f18041c;
    public final Object d;
    public final Object e;
    public final Object f18042f;
    public final Object f18043g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18039a = i10;
        this.f18040b = baseController;
        this.f18041c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18042f = obj4;
        this.f18043g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18039a) {
            case 0:
                ((TranslateController) this.f18040b).lambda$translateStory$38((TL_stories.StoryItem) this.f18041c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18042f, (TLRPC.TL_textWithEntities) this.f18043g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18040b).lambda$convertToGigaGroup$270((Context) this.f18041c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.p2) this.f18042f, (TLRPC.TL_channels_convertToGigagroup) this.f18043g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18040b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18041c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18042f, (MessageObject) this.f18043g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18039a = 2;
        this.f18040b = secretChatHelper;
        this.f18041c = decryptedMessage;
        this.e = encryptedChat;
        this.f18042f = message;
        this.f18043g = messageObject;
        this.d = str;
    }
}
