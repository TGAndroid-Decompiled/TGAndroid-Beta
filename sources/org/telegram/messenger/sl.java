package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class sl implements Runnable {
    public final int f18930a;
    public final BaseController f18931b;
    public final Object f18932c;
    public final Object d;
    public final Object f18933e;
    public final Object f18934f;
    public final Object h;
    public final Object f18935n;

    public sl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18930a = i10;
        this.f18931b = baseController;
        this.f18932c = obj;
        this.d = obj2;
        this.f18933e = obj3;
        this.f18934f = obj4;
        this.h = obj5;
        this.f18935n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18930a) {
            case 0:
                ((TranslateController) this.f18931b).lambda$translateStory$36((TL_stories.StoryItem) this.f18932c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18933e, (TLRPC.TL_textWithEntities) this.f18934f, (TranslateController.StoryKey) this.h, (Runnable) this.f18935n);
                return;
            case 1:
                ((MediaDataController) this.f18931b).lambda$loadHints$144((ArrayList) this.f18932c, (ArrayList) this.d, (ArrayList) this.f18933e, (ArrayList) this.f18934f, (ArrayList) this.h, (ArrayList) this.f18935n);
                return;
            case 2:
                ((MessagesController) this.f18931b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18932c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18933e, (TLRPC.TL_error) this.f18934f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f18935n);
                return;
            case 3:
                ((MessagesController) this.f18931b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18932c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18933e, (TLRPC.TL_error) this.f18934f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18935n);
                return;
            default:
                ((SecretChatHelper) this.f18931b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18932c, (TLRPC.DecryptedMessage) this.f18933e, (TLRPC.Message) this.f18934f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18935n, (String) this.d);
                return;
        }
    }

    public sl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18930a = 4;
        this.f18931b = secretChatHelper;
        this.f18932c = encryptedChat;
        this.f18933e = decryptedMessage;
        this.f18934f = message;
        this.h = inputEncryptedFile;
        this.f18935n = messageObject;
        this.d = str;
    }
}
