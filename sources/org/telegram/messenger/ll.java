package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f16947a;
    public final BaseController f16948b;
    public final Object f16949c;
    public final Object d;
    public final Object e;
    public final Object f16950f;
    public final Object f16951g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f16947a = i10;
        this.f16948b = baseController;
        this.f16949c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16950f = obj4;
        this.f16951g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16947a) {
            case 0:
                ((TranslateController) this.f16948b).lambda$translateStory$38((TL_stories.StoryItem) this.f16949c, (String) this.d, (TranslateController.StoryKey) this.e, (Runnable) this.f16950f, (TLRPC.TL_textWithEntities) this.f16951g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16948b).lambda$convertToGigaGroup$270((Context) this.f16949c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.e, (org.telegram.ui.ActionBar.m2) this.f16950f, (TLRPC.TL_channels_convertToGigagroup) this.f16951g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f16948b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f16949c, (TLRPC.EncryptedChat) this.e, (TLRPC.Message) this.f16950f, (MessageObject) this.f16951g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f16947a = 2;
        this.f16948b = secretChatHelper;
        this.f16949c = decryptedMessage;
        this.e = encryptedChat;
        this.f16950f = message;
        this.f16951g = messageObject;
        this.d = str;
    }
}
