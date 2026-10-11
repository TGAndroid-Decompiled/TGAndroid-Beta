package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18501a;
    public final BaseController f18502b;
    public final Object f18503c;
    public final Object d;
    public final Object f18504e;
    public final Object f18505f;
    public final Object f18506g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18501a = i10;
        this.f18502b = baseController;
        this.f18503c = obj;
        this.d = obj2;
        this.f18504e = obj3;
        this.f18505f = obj4;
        this.f18506g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18501a) {
            case 0:
                ((TranslateController) this.f18502b).lambda$translateStory$38((TL_stories.StoryItem) this.f18503c, (String) this.d, (TranslateController.StoryKey) this.f18504e, (Runnable) this.f18505f, (TLRPC.TL_textWithEntities) this.f18506g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18502b).lambda$convertToGigaGroup$269((Context) this.f18503c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.f18504e, (org.telegram.ui.ActionBar.m2) this.f18505f, (TLRPC.TL_channels_convertToGigagroup) this.f18506g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18502b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18503c, (TLRPC.EncryptedChat) this.f18504e, (TLRPC.Message) this.f18505f, (MessageObject) this.f18506g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18501a = 2;
        this.f18502b = secretChatHelper;
        this.f18503c = decryptedMessage;
        this.f18504e = encryptedChat;
        this.f18505f = message;
        this.f18506g = messageObject;
        this.d = str;
    }
}
