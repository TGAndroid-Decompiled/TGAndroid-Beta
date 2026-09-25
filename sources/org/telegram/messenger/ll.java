package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16962a;
    public final BaseController f16963b;
    public final Object f16964c;
    public final Object d;
    public final Object e;
    public final Object f16965f;
    public final Object f16966g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16962a = i10;
        this.f16963b = baseController;
        this.f16964c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16965f = obj4;
        this.f16966g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16962a) {
            case 0:
                ((TranslateController) this.f16963b).lambda$translateStory$38((TL_stories.StoryItem) this.f16964c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16965f, (TLRPC.TL_textWithEntities) this.f16966g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16963b).lambda$convertToGigaGroup$270((Context) this.f16964c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f16965f, (TLRPC.TL_channels_convertToGigagroup) this.f16966g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16963b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16964c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16965f, (MessageObject) this.f16966g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16962a = 2;
        this.f16963b = secretChatHelper;
        this.f16964c = decryptedMessage;
        this.e = encryptedChat;
        this.f16965f = message;
        this.f16966g = messageObject;
        this.d = str;
    }
}
