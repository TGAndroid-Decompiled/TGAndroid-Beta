package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements Runnable {
    public final int f18920a;
    public final BaseController f18921b;
    public final Object f18922c;
    public final Object d;
    public final Object e;
    public final Object f18923f;
    public final Object h;
    public final Object f18924n;

    public ll(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18920a = i10;
        this.f18921b = baseController;
        this.f18922c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18923f = obj4;
        this.h = obj5;
        this.f18924n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18920a) {
            case 0:
                ((TranslateController) this.f18921b).lambda$translateStory$36((TL_stories.StoryItem) this.f18922c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18923f, (TranslateController.StoryKey) this.h, (Runnable) this.f18924n);
                return;
            case 1:
                ((MediaDataController) this.f18921b).lambda$loadHints$144((ArrayList) this.f18922c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18923f, (ArrayList) this.h, (ArrayList) this.f18924n);
                return;
            case 2:
                ((MessagesController) this.f18921b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18922c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18923f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18924n);
                return;
            case 3:
                ((MessagesController) this.f18921b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18922c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18923f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18924n);
                return;
            default:
                ((SecretChatHelper) this.f18921b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18922c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18923f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18924n, (String) this.d);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18920a = 4;
        this.f18921b = secretChatHelper;
        this.f18922c = encryptedChat;
        this.e = decryptedMessage;
        this.f18923f = message;
        this.h = inputEncryptedFile;
        this.f18924n = messageObject;
        this.d = str;
    }
}
