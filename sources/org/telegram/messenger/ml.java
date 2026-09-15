package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements RequestDelegate {
    public final int f16806a;
    public final BaseController f16807b;
    public final Object f16808c;
    public final Object d;
    public final Object e;
    public final Object f16809f;
    public final Object f16810g;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16806a = i10;
        this.f16807b = baseController;
        this.f16808c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16809f = obj4;
        this.f16810g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16806a) {
            case 0:
                ((TranslateController) this.f16807b).lambda$translateStory$38((TL_stories.StoryItem) this.f16808c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16809f, (TLRPC.TL_textWithEntities) this.f16810g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16807b).lambda$convertToGigaGroup$270((Context) this.f16808c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f16809f, (TLRPC.TL_channels_convertToGigagroup) this.f16810g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16807b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16808c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16809f, (MessageObject) this.f16810g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16806a = 2;
        this.f16807b = secretChatHelper;
        this.f16808c = decryptedMessage;
        this.e = encryptedChat;
        this.f16809f = message;
        this.f16810g = messageObject;
        this.d = str;
    }
}
