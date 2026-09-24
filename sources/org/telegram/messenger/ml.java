package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f17040a;
    public final BaseController f17041b;
    public final Object f17042c;
    public final Object d;
    public final Object e;
    public final Object f17043f;
    public final Object h;
    public final Object f17044n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17040a = i10;
        this.f17041b = baseController;
        this.f17042c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17043f = obj4;
        this.h = obj5;
        this.f17044n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17040a) {
            case 0:
                ((TranslateController) this.f17041b).lambda$translateStory$36((TL_stories.StoryItem) this.f17042c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f17043f, (TranslateController.StoryKey) this.h, (Runnable) this.f17044n);
                return;
            case 1:
                ((MediaDataController) this.f17041b).lambda$loadHints$144((ArrayList) this.f17042c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17043f, (ArrayList) this.h, (ArrayList) this.f17044n);
                return;
            case 2:
                ((MessagesController) this.f17041b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f17042c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17043f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f17044n);
                return;
            case 3:
                ((MessagesController) this.f17041b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f17042c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17043f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f17044n);
                return;
            default:
                ((SecretChatHelper) this.f17041b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f17042c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f17043f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f17044n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f17040a = 4;
        this.f17041b = secretChatHelper;
        this.f17042c = encryptedChat;
        this.e = decryptedMessage;
        this.f17043f = message;
        this.h = inputEncryptedFile;
        this.f17044n = messageObject;
        this.d = str;
    }
}
