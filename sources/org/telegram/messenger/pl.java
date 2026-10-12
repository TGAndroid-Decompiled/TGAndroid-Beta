package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f18145a;
    public final BaseController f18146b;
    public final Object f18147c;
    public final Object d;
    public final Object e;
    public final Object f18148f;
    public final Object h;
    public final Object f18149n;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18145a = i10;
        this.f18146b = baseController;
        this.f18147c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18148f = obj4;
        this.h = obj5;
        this.f18149n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18145a) {
            case 0:
                ((TranslateController) this.f18146b).lambda$translateStory$36((TL_stories.StoryItem) this.f18147c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18148f, (TranslateController.StoryKey) this.h, (Runnable) this.f18149n);
                return;
            case 1:
                ((MediaDataController) this.f18146b).lambda$loadHints$144((ArrayList) this.f18147c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18148f, (ArrayList) this.h, (ArrayList) this.f18149n);
                return;
            case 2:
                ((MessagesController) this.f18146b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18147c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f18148f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f18149n);
                return;
            case 3:
                ((MessagesController) this.f18146b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18147c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f18148f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18149n);
                return;
            default:
                ((SecretChatHelper) this.f18146b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18147c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18148f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18149n, (String) this.d);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18145a = 4;
        this.f18146b = secretChatHelper;
        this.f18147c = encryptedChat;
        this.e = decryptedMessage;
        this.f18148f = message;
        this.h = inputEncryptedFile;
        this.f18149n = messageObject;
        this.d = str;
    }
}
