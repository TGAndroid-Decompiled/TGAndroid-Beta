package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements Runnable {
    public final int f18984a;
    public final BaseController f18985b;
    public final Object f18986c;
    public final Object d;
    public final Object e;
    public final Object f18987f;
    public final Object h;
    public final Object f18988n;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18984a = i10;
        this.f18985b = baseController;
        this.f18986c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18987f = obj4;
        this.h = obj5;
        this.f18988n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18984a) {
            case 0:
                ((TranslateController) this.f18985b).lambda$translateStory$36((TL_stories.StoryItem) this.f18986c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18987f, (TranslateController.StoryKey) this.h, (Runnable) this.f18988n);
                return;
            case 1:
                ((MediaDataController) this.f18985b).lambda$loadHints$144((ArrayList) this.f18986c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18987f, (ArrayList) this.h, (ArrayList) this.f18988n);
                return;
            case 2:
                ((MessagesController) this.f18985b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18986c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f18987f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f18988n);
                return;
            case 3:
                ((MessagesController) this.f18985b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18986c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f18987f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18988n);
                return;
            default:
                ((SecretChatHelper) this.f18985b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18986c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18987f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18988n, (String) this.d);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18984a = 4;
        this.f18985b = secretChatHelper;
        this.f18986c = encryptedChat;
        this.e = decryptedMessage;
        this.f18987f = message;
        this.h = inputEncryptedFile;
        this.f18988n = messageObject;
        this.d = str;
    }
}
