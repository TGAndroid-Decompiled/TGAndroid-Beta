package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16707a;
    public final BaseController f16708b;
    public final Object f16709c;
    public final Object d;
    public final Object e;
    public final Object f16710f;
    public final Object f16711g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16707a = i10;
        this.f16708b = baseController;
        this.f16709c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16710f = obj4;
        this.f16711g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16707a) {
            case 0:
                ((TranslateController) this.f16708b).lambda$translateStory$38((TL_stories.StoryItem) this.f16709c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16710f, (TLRPC.TL_textWithEntities) this.f16711g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16708b).lambda$convertToGigaGroup$270((Context) this.f16709c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f16710f, (TLRPC.TL_channels_convertToGigagroup) this.f16711g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16708b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16709c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16710f, (MessageObject) this.f16711g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16707a = 2;
        this.f16708b = secretChatHelper;
        this.f16709c = decryptedMessage;
        this.e = encryptedChat;
        this.f16710f = message;
        this.f16711g = messageObject;
        this.d = str;
    }
}
