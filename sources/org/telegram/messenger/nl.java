package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements RequestDelegate {
    public final int f20811a;
    public final BaseController f20812b;
    public final Object f20813c;
    public final Object d;
    public final Object e;
    public final Object f20814f;
    public final Object f20815g;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f20811a = i10;
        this.f20812b = baseController;
        this.f20813c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20814f = obj4;
        this.f20815g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20811a) {
            case 0:
                ((TranslateController) this.f20812b).lambda$translateStory$38((TL_stories.StoryItem) this.f20813c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f20814f, (TLRPC.TL_textWithEntities) this.f20815g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20812b).lambda$convertToGigaGroup$269((Context) this.f20813c, (org.telegram.ui.ActionBar.e2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.r2) this.f20814f, (TLRPC.TL_channels_convertToGigagroup) this.f20815g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f20812b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f20813c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f20814f, (MessageObject) this.f20815g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f20811a = 2;
        this.f20812b = secretChatHelper;
        this.f20813c = decryptedMessage;
        this.e = encryptedChat;
        this.f20814f = message;
        this.f20815g = messageObject;
        this.d = str;
    }
}
