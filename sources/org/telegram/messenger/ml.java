package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f17029a;
    public final BaseController f17030b;
    public final Object f17031c;
    public final Object d;
    public final Object e;
    public final Object f17032f;
    public final Object f17033g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f17029a = i10;
        this.f17030b = baseController;
        this.f17031c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17032f = obj4;
        this.f17033g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17029a) {
            case 0:
                ((TranslateController) this.f17030b).lambda$translateStory$38((TL_stories.StoryItem) this.f17031c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f17032f, (TLRPC.TL_textWithEntities) this.f17033g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17030b).lambda$convertToGigaGroup$270((Context) this.f17031c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f17032f, (TLRPC.TL_channels_convertToGigagroup) this.f17033g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f17030b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f17031c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f17032f, (MessageObject) this.f17033g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f17029a = 2;
        this.f17030b = secretChatHelper;
        this.f17031c = decryptedMessage;
        this.e = encryptedChat;
        this.f17032f = message;
        this.f17033g = messageObject;
        this.d = str;
    }
}
