package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16966a;
    public final BaseController f16967b;
    public final Object f16968c;
    public final Object d;
    public final Object e;
    public final Object f16969f;
    public final Object f16970g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16966a = i10;
        this.f16967b = baseController;
        this.f16968c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16969f = obj4;
        this.f16970g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16966a) {
            case 0:
                ((TranslateController) this.f16967b).lambda$translateStory$38((TL_stories.StoryItem) this.f16968c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16969f, (TLRPC.TL_textWithEntities) this.f16970g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16967b).lambda$convertToGigaGroup$270((Context) this.f16968c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f16969f, (TLRPC.TL_channels_convertToGigagroup) this.f16970g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16967b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16968c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16969f, (MessageObject) this.f16970g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16966a = 2;
        this.f16967b = secretChatHelper;
        this.f16968c = decryptedMessage;
        this.e = encryptedChat;
        this.f16969f = message;
        this.f16970g = messageObject;
        this.d = str;
    }
}
