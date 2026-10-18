package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class il implements Runnable {
    public final int f18654a;
    public final BaseController f18655b;
    public final Object f18656c;
    public final Object d;
    public final Object e;
    public final Object f18657f;
    public final Object h;
    public final Object f18658n;

    public il(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18654a = i10;
        this.f18655b = baseController;
        this.f18656c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18657f = obj4;
        this.h = obj5;
        this.f18658n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18654a) {
            case 0:
                ((TranslateController) this.f18655b).lambda$translateStory$36((TL_stories.StoryItem) this.f18656c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18657f, (TranslateController.StoryKey) this.h, (Runnable) this.f18658n);
                return;
            case 1:
                ((MediaDataController) this.f18655b).lambda$loadHints$144((ArrayList) this.f18656c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18657f, (ArrayList) this.h, (ArrayList) this.f18658n);
                return;
            case 2:
                ((MessagesController) this.f18655b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18656c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18657f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18658n);
                return;
            case 3:
                ((MessagesController) this.f18655b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18656c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18657f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18658n);
                return;
            default:
                ((SecretChatHelper) this.f18655b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18656c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18657f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18658n, (String) this.d);
                return;
        }
    }

    public il(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18654a = 4;
        this.f18655b = secretChatHelper;
        this.f18656c = encryptedChat;
        this.e = decryptedMessage;
        this.f18657f = message;
        this.h = inputEncryptedFile;
        this.f18658n = messageObject;
        this.d = str;
    }
}
