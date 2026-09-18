package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f16988a;
    public final BaseController f16989b;
    public final Object f16990c;
    public final Object d;
    public final Object e;
    public final Object f16991f;
    public final Object f16992g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16988a = i10;
        this.f16989b = baseController;
        this.f16990c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16991f = obj4;
        this.f16992g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16988a) {
            case 0:
                ((TranslateController) this.f16989b).lambda$translateStory$38((TL_stories.StoryItem) this.f16990c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16991f, (TLRPC.TL_textWithEntities) this.f16992g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16989b).lambda$convertToGigaGroup$270((Context) this.f16990c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f16991f, (TLRPC.TL_channels_convertToGigagroup) this.f16992g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16989b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16990c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16991f, (MessageObject) this.f16992g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16988a = 2;
        this.f16989b = secretChatHelper;
        this.f16990c = decryptedMessage;
        this.e = encryptedChat;
        this.f16991f = message;
        this.f16992g = messageObject;
        this.d = str;
    }
}
