package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f19727a;
    public final BaseController f19728b;
    public final Object f19729c;
    public final Object d;
    public final Object f19730e;
    public final Object f19731f;
    public final Object h;
    public final Object f19732n;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19727a = i10;
        this.f19728b = baseController;
        this.f19729c = obj;
        this.d = obj2;
        this.f19730e = obj3;
        this.f19731f = obj4;
        this.h = obj5;
        this.f19732n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19727a) {
            case 0:
                ((TranslateController) this.f19728b).lambda$translateStory$36((TL_stories.StoryItem) this.f19729c, (String) this.d, (TLRPC.TL_textWithEntities) this.f19730e, (TLRPC.TL_textWithEntities) this.f19731f, (TranslateController.StoryKey) this.h, (Runnable) this.f19732n);
                return;
            case 1:
                ((MediaDataController) this.f19728b).lambda$loadHints$144((ArrayList) this.f19729c, (ArrayList) this.d, (ArrayList) this.f19730e, (ArrayList) this.f19731f, (ArrayList) this.h, (ArrayList) this.f19732n);
                return;
            case 2:
                ((MessagesController) this.f19728b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f19729c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.f19730e, (TLRPC.TL_error) this.f19731f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f19732n);
                return;
            case 3:
                ((MessagesController) this.f19728b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f19729c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.f19730e, (TLRPC.TL_error) this.f19731f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.f19732n);
                return;
            default:
                ((SecretChatHelper) this.f19728b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f19729c, (TLRPC.DecryptedMessage) this.f19730e, (TLRPC.Message) this.f19731f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f19732n, (String) this.d);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f19727a = 4;
        this.f19728b = secretChatHelper;
        this.f19729c = encryptedChat;
        this.f19730e = decryptedMessage;
        this.f19731f = message;
        this.h = inputEncryptedFile;
        this.f19732n = messageObject;
        this.d = str;
    }
}
