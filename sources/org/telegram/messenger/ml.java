package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f17044a;
    public final BaseController f17045b;
    public final Object f17046c;
    public final Object d;
    public final Object e;
    public final Object f17047f;
    public final Object f17048g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f17044a = i10;
        this.f17045b = baseController;
        this.f17046c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17047f = obj4;
        this.f17048g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17044a) {
            case 0:
                ((TranslateController) this.f17045b).lambda$translateStory$38((TL_stories.StoryItem) this.f17046c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f17047f, (TLRPC.TL_textWithEntities) this.f17048g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17045b).lambda$convertToGigaGroup$270((Context) this.f17046c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f17047f, (TLRPC.TL_channels_convertToGigagroup) this.f17048g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f17045b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f17046c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f17047f, (MessageObject) this.f17048g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f17044a = 2;
        this.f17045b = secretChatHelper;
        this.f17046c = decryptedMessage;
        this.e = encryptedChat;
        this.f17047f = message;
        this.f17048g = messageObject;
        this.d = str;
    }
}
