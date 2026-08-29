package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements RequestDelegate {
    public final int f20799a;
    public final BaseController f20800b;
    public final Object f20801c;
    public final Object d;
    public final Object f20802e;
    public final Object f20803f;
    public final Object f20804g;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f20799a = i10;
        this.f20800b = baseController;
        this.f20801c = obj;
        this.d = obj2;
        this.f20802e = obj3;
        this.f20803f = obj4;
        this.f20804g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20799a) {
            case 0:
                ((TranslateController) this.f20800b).lambda$translateStory$38((TL_stories.StoryItem) this.f20801c, (String) this.d, (TranslateController.StoryKey) this.f20802e, (Runnable) this.f20803f, (TLRPC.TL_textWithEntities) this.f20804g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20800b).lambda$convertToGigaGroup$270((Context) this.f20801c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.f20802e, (org.telegram.ui.ActionBar.o2) this.f20803f, (TLRPC.TL_channels_convertToGigagroup) this.f20804g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f20800b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f20801c, (TLRPC.EncryptedChat) this.f20802e, (TLRPC.Message) this.f20803f, (MessageObject) this.f20804g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f20799a = 2;
        this.f20800b = secretChatHelper;
        this.f20801c = decryptedMessage;
        this.f20802e = encryptedChat;
        this.f20803f = message;
        this.f20804g = messageObject;
        this.d = str;
    }
}
