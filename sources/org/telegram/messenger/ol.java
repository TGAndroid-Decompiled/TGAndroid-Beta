package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f19611a;
    public final BaseController f19612b;
    public final Object f19613c;
    public final Object d;
    public final Object f19614e;
    public final Object f19615f;
    public final Object f19616g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f19611a = i10;
        this.f19612b = baseController;
        this.f19613c = obj;
        this.d = obj2;
        this.f19614e = obj3;
        this.f19615f = obj4;
        this.f19616g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19611a) {
            case 0:
                ((TranslateController) this.f19612b).lambda$translateStory$38((TL_stories.StoryItem) this.f19613c, (String) this.d, (TranslateController.StoryKey) this.f19614e, (Runnable) this.f19615f, (TLRPC.TL_textWithEntities) this.f19616g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19612b).lambda$convertToGigaGroup$270((Context) this.f19613c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.f19614e, (org.telegram.ui.ActionBar.p2) this.f19615f, (TLRPC.TL_channels_convertToGigagroup) this.f19616g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f19612b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f19613c, (TLRPC.EncryptedChat) this.f19614e, (TLRPC.Message) this.f19615f, (MessageObject) this.f19616g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f19611a = 2;
        this.f19612b = secretChatHelper;
        this.f19613c = decryptedMessage;
        this.f19614e = encryptedChat;
        this.f19615f = message;
        this.f19616g = messageObject;
        this.d = str;
    }
}
