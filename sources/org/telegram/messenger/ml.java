package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18996a;
    public final BaseController f18997b;
    public final Object f18998c;
    public final Object d;
    public final Object e;
    public final Object f18999f;
    public final Object h;
    public final Object f19000n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18996a = i10;
        this.f18997b = baseController;
        this.f18998c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18999f = obj4;
        this.h = obj5;
        this.f19000n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18996a) {
            case 0:
                ((TranslateController) this.f18997b).lambda$translateStory$36((TL_stories.StoryItem) this.f18998c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18999f, (TranslateController.StoryKey) this.h, (Runnable) this.f19000n);
                return;
            case 1:
                ((MediaDataController) this.f18997b).lambda$loadHints$144((ArrayList) this.f18998c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18999f, (ArrayList) this.h, (ArrayList) this.f19000n);
                return;
            case 2:
                ((MessagesController) this.f18997b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18998c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18999f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f19000n);
                return;
            case 3:
                ((MessagesController) this.f18997b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18998c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18999f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f19000n);
                return;
            default:
                ((SecretChatHelper) this.f18997b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18998c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18999f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f19000n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18996a = 4;
        this.f18997b = secretChatHelper;
        this.f18998c = encryptedChat;
        this.e = decryptedMessage;
        this.f18999f = message;
        this.h = inputEncryptedFile;
        this.f19000n = messageObject;
        this.d = str;
    }
}
