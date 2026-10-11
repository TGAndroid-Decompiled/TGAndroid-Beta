package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18573a;
    public final BaseController f18574b;
    public final Object f18575c;
    public final Object d;
    public final Object f18576e;
    public final Object f18577f;
    public final Object h;
    public final Object f18578n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18573a = i10;
        this.f18574b = baseController;
        this.f18575c = obj;
        this.d = obj2;
        this.f18576e = obj3;
        this.f18577f = obj4;
        this.h = obj5;
        this.f18578n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18573a) {
            case 0:
                ((TranslateController) this.f18574b).lambda$translateStory$36((TL_stories.StoryItem) this.f18575c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18576e, (TLRPC.TL_textWithEntities) this.f18577f, (TranslateController.StoryKey) this.h, (Runnable) this.f18578n);
                return;
            case 1:
                ((MediaDataController) this.f18574b).lambda$loadHints$144((ArrayList) this.f18575c, (ArrayList) this.d, (ArrayList) this.f18576e, (ArrayList) this.f18577f, (ArrayList) this.h, (ArrayList) this.f18578n);
                return;
            case 2:
                ((MessagesController) this.f18574b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18575c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18576e, (TLRPC.TL_error) this.f18577f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f18578n);
                return;
            case 3:
                ((MessagesController) this.f18574b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18575c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18576e, (TLRPC.TL_error) this.f18577f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18578n);
                return;
            default:
                ((SecretChatHelper) this.f18574b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18575c, (TLRPC.DecryptedMessage) this.f18576e, (TLRPC.Message) this.f18577f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18578n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18573a = 4;
        this.f18574b = secretChatHelper;
        this.f18575c = encryptedChat;
        this.f18576e = decryptedMessage;
        this.f18577f = message;
        this.h = inputEncryptedFile;
        this.f18578n = messageObject;
        this.d = str;
    }
}
