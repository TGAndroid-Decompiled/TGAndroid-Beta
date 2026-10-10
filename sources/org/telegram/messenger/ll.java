package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18467a;
    public final BaseController f18468b;
    public final Object f18469c;
    public final Object d;
    public final Object f18470e;
    public final Object f18471f;
    public final Object f18472g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18467a = i10;
        this.f18468b = baseController;
        this.f18469c = obj;
        this.d = obj2;
        this.f18470e = obj3;
        this.f18471f = obj4;
        this.f18472g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18467a) {
            case 0:
                ((TranslateController) this.f18468b).lambda$translateStory$38((TL_stories.StoryItem) this.f18469c, (String) this.d, (TranslateController.StoryKey) this.f18470e, (Runnable) this.f18471f, (TLRPC.TL_textWithEntities) this.f18472g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18468b).lambda$convertToGigaGroup$269((Context) this.f18469c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f18470e, (org.telegram.ui.ActionBar.n2) this.f18471f, (TLRPC.TL_channels_convertToGigagroup) this.f18472g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18468b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18469c, (TLRPC.EncryptedChat) this.f18470e, (TLRPC.Message) this.f18471f, (MessageObject) this.f18472g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18467a = 2;
        this.f18468b = secretChatHelper;
        this.f18469c = decryptedMessage;
        this.f18470e = encryptedChat;
        this.f18471f = message;
        this.f18472g = messageObject;
        this.d = str;
    }
}
