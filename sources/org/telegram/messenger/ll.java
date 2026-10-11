package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements RequestDelegate {
    public final int f18465a;
    public final BaseController f18466b;
    public final Object f18467c;
    public final Object d;
    public final Object f18468e;
    public final Object f18469f;
    public final Object f18470g;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f18465a = i10;
        this.f18466b = baseController;
        this.f18467c = obj;
        this.d = obj2;
        this.f18468e = obj3;
        this.f18469f = obj4;
        this.f18470g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18465a) {
            case 0:
                ((TranslateController) this.f18466b).lambda$translateStory$38((TL_stories.StoryItem) this.f18467c, (String) this.d, (TranslateController.StoryKey) this.f18468e, (Runnable) this.f18469f, (TLRPC.TL_textWithEntities) this.f18470g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18466b).lambda$convertToGigaGroup$269((Context) this.f18467c, (org.telegram.ui.ActionBar.a2) this.d, (MessagesStorage.BooleanCallback) this.f18468e, (org.telegram.ui.ActionBar.m2) this.f18469f, (TLRPC.TL_channels_convertToGigagroup) this.f18470g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f18466b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f18467c, (TLRPC.EncryptedChat) this.f18468e, (TLRPC.Message) this.f18469f, (MessageObject) this.f18470g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f18465a = 2;
        this.f18466b = secretChatHelper;
        this.f18467c = decryptedMessage;
        this.f18468e = encryptedChat;
        this.f18469f = message;
        this.f18470g = messageObject;
        this.d = str;
    }
}
