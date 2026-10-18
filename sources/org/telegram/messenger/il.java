package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements RequestDelegate {
    public final int f18632a;
    public final BaseController f18633b;
    public final Object f18634c;
    public final Object d;
    public final Object e;
    public final Object f18635f;
    public final Object f18636g;

    public il(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18632a = i10;
        this.f18633b = baseController;
        this.f18634c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18635f = obj4;
        this.f18636g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18632a) {
            case 0:
                ((TranslateController) this.f18633b).lambda$translateStory$38((TL_stories.StoryItem) this.f18634c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18635f, (TLRPC.TL_textWithEntities) this.f18636g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18633b).lambda$convertToGigaGroup$269((Context) this.f18634c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18635f, (TLRPC.TL_channels_convertToGigagroup) this.f18636g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18633b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18634c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18635f, (MessageObject) this.f18636g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public il(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18632a = 2;
        this.f18633b = secretChatHelper;
        this.f18634c = decryptedMessage;
        this.e = encryptedChat;
        this.f18635f = message;
        this.f18636g = messageObject;
        this.d = str;
    }
}
