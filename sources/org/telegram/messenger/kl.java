package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements RequestDelegate {
    public final int f18870a;
    public final BaseController f18871b;
    public final Object f18872c;
    public final Object d;
    public final Object e;
    public final Object f18873f;
    public final Object f18874g;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18870a = i10;
        this.f18871b = baseController;
        this.f18872c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18873f = obj4;
        this.f18874g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18870a) {
            case 0:
                ((TranslateController) this.f18871b).lambda$translateStory$38((TL_stories.StoryItem) this.f18872c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18873f, (TLRPC.TL_textWithEntities) this.f18874g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18871b).lambda$convertToGigaGroup$269((Context) this.f18872c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.o2) this.f18873f, (TLRPC.TL_channels_convertToGigagroup) this.f18874g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18871b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18872c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18873f, (MessageObject) this.f18874g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18870a = 2;
        this.f18871b = secretChatHelper;
        this.f18872c = decryptedMessage;
        this.e = encryptedChat;
        this.f18873f = message;
        this.f18874g = messageObject;
        this.d = str;
    }
}
