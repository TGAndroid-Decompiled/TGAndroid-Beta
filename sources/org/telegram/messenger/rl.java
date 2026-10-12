package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class rl implements RequestDelegate {
    public final int f18818a;
    public final BaseController f18819b;
    public final Object f18820c;
    public final Object d;
    public final Object f18821e;
    public final Object f18822f;
    public final Object f18823g;

    public rl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18818a = i10;
        this.f18819b = baseController;
        this.f18820c = obj;
        this.d = obj2;
        this.f18821e = obj3;
        this.f18822f = obj4;
        this.f18823g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18818a) {
            case 0:
                ((TranslateController) this.f18819b).lambda$translateStory$38((TL_stories.StoryItem) this.f18820c, (String) this.d, (TranslateController.StoryKey) this.f18821e, (Runnable) this.f18822f, (TLRPC.TL_textWithEntities) this.f18823g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18819b).lambda$convertToGigaGroup$269((Context) this.f18820c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.f18821e, (org.telegram.ui.ActionBar.m2) this.f18822f, (TLRPC.TL_channels_convertToGigagroup) this.f18823g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18819b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18820c, (TLRPC.EncryptedChat) this.f18821e, (TLRPC.Message) this.f18822f, (MessageObject) this.f18823g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public rl(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18818a = 2;
        this.f18819b = secretChatHelper;
        this.f18820c = decryptedMessage;
        this.f18821e = encryptedChat;
        this.f18822f = message;
        this.f18823g = messageObject;
        this.d = str;
    }
}
