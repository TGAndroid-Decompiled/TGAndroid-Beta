package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class cl implements RequestDelegate {
    public final int f20030a;
    public final BaseController f20031b;
    public final Object f20032c;
    public final Object d;
    public final Object f20033e;
    public final Object f20034f;
    public final Object f20035g;

    public cl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i9) {
        this.f20030a = i9;
        this.f20031b = baseController;
        this.f20032c = obj;
        this.d = obj2;
        this.f20033e = obj3;
        this.f20034f = obj4;
        this.f20035g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20030a) {
            case 0:
                ((TranslateController) this.f20031b).lambda$translateStory$38((TL_stories.StoryItem) this.f20032c, (String) this.d, (TranslateController.StoryKey) this.f20033e, (Runnable) this.f20034f, (TLRPC.TL_textWithEntities) this.f20035g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20031b).lambda$convertToGigaGroup$270((Context) this.f20032c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.f20033e, (org.telegram.ui.ActionBar.o2) this.f20034f, (TLRPC.TL_channels_convertToGigagroup) this.f20035g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f20031b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f20032c, (TLRPC.EncryptedChat) this.f20033e, (TLRPC.Message) this.f20034f, (MessageObject) this.f20035g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public cl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f20030a = 2;
        this.f20031b = secretChatHelper;
        this.f20032c = decryptedMessage;
        this.f20033e = encryptedChat;
        this.f20034f = message;
        this.f20035g = messageObject;
        this.d = str;
    }
}
