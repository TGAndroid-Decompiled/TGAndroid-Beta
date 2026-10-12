package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rl implements RequestDelegate {
    public final int f18819a;
    public final BaseController f18820b;
    public final Object f18821c;
    public final Object d;
    public final Object f18822e;
    public final Object f18823f;
    public final Object f18824g;

    public rl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18819a = i10;
        this.f18820b = baseController;
        this.f18821c = obj;
        this.d = obj2;
        this.f18822e = obj3;
        this.f18823f = obj4;
        this.f18824g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18819a) {
            case 0:
                ((TranslateController) this.f18820b).lambda$translateStory$38((TL_stories.StoryItem) this.f18821c, (String) this.d, (TranslateController.StoryKey) this.f18822e, (Runnable) this.f18823f, (TLRPC.TL_textWithEntities) this.f18824g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18820b).lambda$convertToGigaGroup$269((Context) this.f18821c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.f18822e, (org.telegram.ui.ActionBar.m2) this.f18823f, (TLRPC.TL_channels_convertToGigagroup) this.f18824g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18820b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18821c, (TLRPC.EncryptedChat) this.f18822e, (TLRPC.Message) this.f18823f, (MessageObject) this.f18824g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public rl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18819a = 2;
        this.f18820b = secretChatHelper;
        this.f18821c = decryptedMessage;
        this.f18822e = encryptedChat;
        this.f18823f = message;
        this.f18824g = messageObject;
        this.d = str;
    }
}
