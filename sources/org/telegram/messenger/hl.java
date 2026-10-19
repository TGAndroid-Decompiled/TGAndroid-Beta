package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class hl implements RequestDelegate {
    public final int f18558a;
    public final BaseController f18559b;
    public final Object f18560c;
    public final Object d;
    public final Object e;
    public final Object f18561f;
    public final Object f18562g;

    public hl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18558a = i10;
        this.f18559b = baseController;
        this.f18560c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18561f = obj4;
        this.f18562g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18558a) {
            case 0:
                ((TranslateController) this.f18559b).lambda$translateStory$38((TL_stories.StoryItem) this.f18560c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18561f, (TLRPC.TL_textWithEntities) this.f18562g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18559b).lambda$convertToGigaGroup$269((Context) this.f18560c, (org.telegram.ui.ActionBar.b2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.n2) this.f18561f, (TLRPC.TL_channels_convertToGigagroup) this.f18562g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18559b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18560c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18561f, (MessageObject) this.f18562g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public hl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18558a = 2;
        this.f18559b = secretChatHelper;
        this.f18560c = decryptedMessage;
        this.e = encryptedChat;
        this.f18561f = message;
        this.f18562g = messageObject;
        this.d = str;
    }
}
