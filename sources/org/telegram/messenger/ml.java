package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18609a;
    public final BaseController f18610b;
    public final Object f18611c;
    public final Object d;
    public final Object f18612e;
    public final Object f18613f;
    public final Object h;
    public final Object f18614n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18609a = i10;
        this.f18610b = baseController;
        this.f18611c = obj;
        this.d = obj2;
        this.f18612e = obj3;
        this.f18613f = obj4;
        this.h = obj5;
        this.f18614n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18609a) {
            case 0:
                ((TranslateController) this.f18610b).lambda$translateStory$36((TL_stories.StoryItem) this.f18611c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18612e, (TLRPC.TL_textWithEntities) this.f18613f, (TranslateController.StoryKey) this.h, (Runnable) this.f18614n);
                return;
            case 1:
                ((MediaDataController) this.f18610b).lambda$loadHints$144((ArrayList) this.f18611c, (ArrayList) this.d, (ArrayList) this.f18612e, (ArrayList) this.f18613f, (ArrayList) this.h, (ArrayList) this.f18614n);
                return;
            case 2:
                ((MessagesController) this.f18610b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18611c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18612e, (TLRPC.TL_error) this.f18613f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f18614n);
                return;
            case 3:
                ((MessagesController) this.f18610b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18611c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18612e, (TLRPC.TL_error) this.f18613f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18614n);
                return;
            default:
                ((SecretChatHelper) this.f18610b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18611c, (TLRPC.DecryptedMessage) this.f18612e, (TLRPC.Message) this.f18613f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18614n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18609a = 4;
        this.f18610b = secretChatHelper;
        this.f18611c = encryptedChat;
        this.f18612e = decryptedMessage;
        this.f18613f = message;
        this.h = inputEncryptedFile;
        this.f18614n = messageObject;
        this.d = str;
    }
}
