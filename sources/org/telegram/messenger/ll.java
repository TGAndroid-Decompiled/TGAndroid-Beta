package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18463a;
    public final BaseController f18464b;
    public final Object f18465c;
    public final Object d;
    public final Object f18466e;
    public final Object f18467f;
    public final Object f18468g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18463a = i10;
        this.f18464b = baseController;
        this.f18465c = obj;
        this.d = obj2;
        this.f18466e = obj3;
        this.f18467f = obj4;
        this.f18468g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18463a) {
            case 0:
                ((TranslateController) this.f18464b).lambda$translateStory$38((TL_stories.StoryItem) this.f18465c, (String) this.d, (TranslateController.StoryKey) this.f18466e, (Runnable) this.f18467f, (TLRPC.TL_textWithEntities) this.f18468g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18464b).lambda$convertToGigaGroup$269((Context) this.f18465c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18466e, (org.telegram.ui.ActionBar.n2) this.f18467f, (TLRPC.TL_channels_convertToGigagroup) this.f18468g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18464b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18465c, (TLRPC.EncryptedChat) this.f18466e, (TLRPC.Message) this.f18467f, (MessageObject) this.f18468g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18463a = 2;
        this.f18464b = secretChatHelper;
        this.f18465c = decryptedMessage;
        this.f18466e = encryptedChat;
        this.f18467f = message;
        this.f18468g = messageObject;
        this.d = str;
    }
}
