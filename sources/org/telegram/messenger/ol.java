package org.telegram.messenger;

import android.content.Context;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements RequestDelegate {
    public final int f19609a;
    public final BaseController f19610b;
    public final Object f19611c;
    public final Object d;
    public final Object f19612e;
    public final Object f19613f;
    public final Object f19614g;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, TLObject tLObject, int i10) {
        this.f19609a = i10;
        this.f19610b = baseController;
        this.f19611c = obj;
        this.d = obj2;
        this.f19612e = obj3;
        this.f19613f = obj4;
        this.f19614g = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19609a) {
            case 0:
                ((TranslateController) this.f19610b).lambda$translateStory$38((TL_stories.StoryItem) this.f19611c, (String) this.d, (TranslateController.StoryKey) this.f19612e, (Runnable) this.f19613f, (TLRPC.TL_textWithEntities) this.f19614g, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19610b).lambda$convertToGigaGroup$270((Context) this.f19611c, (org.telegram.ui.ActionBar.d2) this.d, (MessagesStorage.BooleanCallback) this.f19612e, (org.telegram.ui.ActionBar.p2) this.f19613f, (TLRPC.TL_channels_convertToGigagroup) this.f19614g, tLObject, tL_error);
                return;
            default:
                ((SecretChatHelper) this.f19610b).lambda$performSendEncryptedRequest$7((TLRPC.DecryptedMessage) this.f19611c, (TLRPC.EncryptedChat) this.f19612e, (TLRPC.Message) this.f19613f, (MessageObject) this.f19614g, (String) this.d, tLObject, tL_error);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str) {
        this.f19609a = 2;
        this.f19610b = secretChatHelper;
        this.f19611c = decryptedMessage;
        this.f19612e = encryptedChat;
        this.f19613f = message;
        this.f19614g = messageObject;
        this.d = str;
    }
}
