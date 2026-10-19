package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements RequestDelegate {
    public final int f18635a;
    public final BaseController f18636b;
    public final Object f18637c;
    public final Object d;
    public final Object e;
    public final Object f18638f;
    public final Object f18639g;

    public il(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18635a = i10;
        this.f18636b = baseController;
        this.f18637c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18638f = obj4;
        this.f18639g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18635a) {
            case 0:
                ((TranslateController) this.f18636b).lambda$translateStory$38((TL_stories.StoryItem) this.f18637c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18638f, (TLRPC.TL_textWithEntities) this.f18639g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18636b).lambda$convertToGigaGroup$269((Context) this.f18637c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18638f, (TLRPC.TL_channels_convertToGigagroup) this.f18639g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18636b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18637c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18638f, (MessageObject) this.f18639g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public il(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18635a = 2;
        this.f18636b = secretChatHelper;
        this.f18637c = decryptedMessage;
        this.e = encryptedChat;
        this.f18638f = message;
        this.f18639g = messageObject;
        this.d = str;
    }
}
