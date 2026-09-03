package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f18142a;
    public final BaseController f18143b;
    public final Object f18144c;
    public final Object d;
    public final Object e;
    public final Object f18145f;
    public final Object h;
    public final Object f18146n;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18142a = i10;
        this.f18143b = baseController;
        this.f18144c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18145f = obj4;
        this.h = obj5;
        this.f18146n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18142a) {
            case 0:
                ((TranslateController) this.f18143b).lambda$translateStory$36((TL_stories.StoryItem) this.f18144c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18145f, (TranslateController.StoryKey) this.h, (Runnable) this.f18146n);
                return;
            case 1:
                ((MediaDataController) this.f18143b).lambda$loadHints$144((ArrayList) this.f18144c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18145f, (ArrayList) this.h, (ArrayList) this.f18146n);
                return;
            case 2:
                ((MessagesController) this.f18143b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18144c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f18145f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18146n);
                return;
            case 3:
                ((MessagesController) this.f18143b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18144c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f18145f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.f18146n);
                return;
            default:
                ((SecretChatHelper) this.f18143b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18144c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18145f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18146n, (String) this.d);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18142a = 4;
        this.f18143b = secretChatHelper;
        this.f18144c = encryptedChat;
        this.e = decryptedMessage;
        this.f18145f = message;
        this.h = inputEncryptedFile;
        this.f18146n = messageObject;
        this.d = str;
    }
}
