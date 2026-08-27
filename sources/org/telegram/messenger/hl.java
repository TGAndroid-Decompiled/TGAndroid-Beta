package org.telegram.messenger;

import android.content.Context;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class hl implements RequestDelegate {

    public final int f20528a;

    public final BaseController f20529b;

    public final Object f20530c;
    public final Object d;

    public final Object f20531e;

    public final Object f20532f;

    public final Object f20533g;

    public hl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f20528a = i10;
        this.f20529b = baseController;
        this.f20530c = obj;
        this.d = obj2;
        this.f20531e = obj3;
        this.f20532f = obj4;
        this.f20533g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20528a) {
            case 0:
                ((TranslateController) this.f20529b).lambda$translateStory$38((TL_stories.StoryItem) this.f20530c, (String) this.d, (TranslateController.StoryKey) this.f20531e, (Runnable) this.f20532f, (TLRPC.TL_textWithEntities) this.f20533g, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f20529b).lambda$convertToGigaGroup$270((Context) this.f20530c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.f20531e, (org.telegram.ui.ActionBar.n2) this.f20532f, (TLRPC.TL_channels_convertToGigagroup) this.f20533g, tLObject, tL_error);
                break;
            default:
                ((SecretChatHelper) this.f20529b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f20530c, (TLRPC.EncryptedChat) this.f20531e, (TLRPC.Message) this.f20532f, (MessageObject) this.f20533g, (String) this.d, tLObject, tL_error);
                break;
        }
    }

    public hl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f20528a = 2;
        this.f20529b = secretChatHelper;
        this.f20530c = decryptedMessage;
        this.f20531e = encryptedChat;
        this.f20532f = message;
        this.f20533g = messageObject;
        this.d = str;
    }
}
