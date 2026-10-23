package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements RequestDelegate {
    public final int f18794a;
    public final BaseController f18795b;
    public final Object f18796c;
    public final Object d;
    public final Object e;
    public final Object f18797f;
    public final Object f18798g;

    public jl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18794a = i10;
        this.f18795b = baseController;
        this.f18796c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18797f = obj4;
        this.f18798g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18794a) {
            case 0:
                ((TranslateController) this.f18795b).lambda$translateStory$38((TL_stories.StoryItem) this.f18796c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f18797f, (TLRPC.TL_textWithEntities) this.f18798g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18795b).lambda$convertToGigaGroup$269((Context) this.f18796c, (org.telegram.ui.ActionBar.c2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.o2) this.f18797f, (TLRPC.TL_channels_convertToGigagroup) this.f18798g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18795b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18796c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f18797f, (MessageObject) this.f18798g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public jl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18794a = 2;
        this.f18795b = secretChatHelper;
        this.f18796c = decryptedMessage;
        this.e = encryptedChat;
        this.f18797f = message;
        this.f18798g = messageObject;
        this.d = str;
    }
}
