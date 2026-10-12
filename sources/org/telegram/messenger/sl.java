package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sl implements Runnable {
    public final int f18931a;
    public final BaseController f18932b;
    public final Object f18933c;
    public final Object d;
    public final Object f18934e;
    public final Object f18935f;
    public final Object h;
    public final Object f18936n;

    public sl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18931a = i10;
        this.f18932b = baseController;
        this.f18933c = obj;
        this.d = obj2;
        this.f18934e = obj3;
        this.f18935f = obj4;
        this.h = obj5;
        this.f18936n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18931a) {
            case 0:
                ((TranslateController) this.f18932b).lambda$translateStory$36((TL_stories.StoryItem) this.f18933c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18934e, (TLRPC.TL_textWithEntities) this.f18935f, (TranslateController.StoryKey) this.h, (Runnable) this.f18936n);
                return;
            case 1:
                ((MediaDataController) this.f18932b).lambda$loadHints$144((ArrayList) this.f18933c, (ArrayList) this.d, (ArrayList) this.f18934e, (ArrayList) this.f18935f, (ArrayList) this.h, (ArrayList) this.f18936n);
                return;
            case 2:
                ((MessagesController) this.f18932b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18933c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18934e, (TLRPC.TL_error) this.f18935f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f18936n);
                return;
            case 3:
                ((MessagesController) this.f18932b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18933c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18934e, (TLRPC.TL_error) this.f18935f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18936n);
                return;
            default:
                ((SecretChatHelper) this.f18932b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18933c, (TLRPC.DecryptedMessage) this.f18934e, (TLRPC.Message) this.f18935f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18936n, (String) this.d);
                return;
        }
    }

    public sl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18931a = 4;
        this.f18932b = secretChatHelper;
        this.f18933c = encryptedChat;
        this.f18934e = decryptedMessage;
        this.f18935f = message;
        this.h = inputEncryptedFile;
        this.f18936n = messageObject;
        this.d = str;
    }
}
