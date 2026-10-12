package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f18048a;
    public final BaseController f18049b;
    public final Object f18050c;
    public final Object d;
    public final Object e;
    public final Object f18051f;
    public final Object f18052g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18048a = i10;
        this.f18049b = baseController;
        this.f18050c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18051f = obj4;
        this.f18052g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18048a) {
            case 0:
                ((TranslateController) this.f18049b).lambda$translateStory$38((TL_stories.StoryItem) this.f18050c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18051f, (TLRPC.TL_textWithEntities) this.f18052g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18049b).lambda$convertToGigaGroup$269((Context) this.f18050c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f18051f, (TLRPC.TL_channels_convertToGigagroup) this.f18052g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18049b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18050c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18051f, (MessageObject) this.f18052g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18048a = 2;
        this.f18049b = secretChatHelper;
        this.f18050c = decryptedMessage;
        this.e = encryptedChat;
        this.f18051f = message;
        this.f18052g = messageObject;
        this.d = str;
    }
}
