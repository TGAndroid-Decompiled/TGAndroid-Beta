package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f20992a;
    public final BaseController f20993b;
    public final Object f20994c;
    public final Object d;
    public final Object e;
    public final Object f20995f;
    public final Object h;
    public final Object f20996n;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f20992a = i10;
        this.f20993b = baseController;
        this.f20994c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20995f = obj4;
        this.h = obj5;
        this.f20996n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f20992a) {
            case 0:
                ((TranslateController) this.f20993b).lambda$translateStory$36((TL_stories.StoryItem) this.f20994c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f20995f, (TranslateController.StoryKey) this.h, (Runnable) this.f20996n);
                return;
            case 1:
                ((MediaDataController) this.f20993b).lambda$loadHints$144((ArrayList) this.f20994c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f20995f, (ArrayList) this.h, (ArrayList) this.f20996n);
                return;
            case 2:
                ((MessagesController) this.f20993b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f20994c, (Context) this.d, (org.telegram.ui.ActionBar.e2) this.e, (TLRPC.TL_error) this.f20995f, (org.telegram.ui.ActionBar.r2) this.h, (TLRPC.TL_messages_migrateChat) this.f20996n);
                return;
            case 3:
                ((MessagesController) this.f20993b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f20994c, (Context) this.d, (org.telegram.ui.ActionBar.e2) this.e, (TLRPC.TL_error) this.f20995f, (org.telegram.ui.ActionBar.r2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f20996n);
                return;
            default:
                ((SecretChatHelper) this.f20993b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f20994c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f20995f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f20996n, (String) this.d);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f20992a = 4;
        this.f20993b = secretChatHelper;
        this.f20994c = encryptedChat;
        this.e = decryptedMessage;
        this.f20995f = message;
        this.h = inputEncryptedFile;
        this.f20996n = messageObject;
        this.d = str;
    }
}
