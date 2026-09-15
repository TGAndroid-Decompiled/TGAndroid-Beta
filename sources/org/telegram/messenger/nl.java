package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f16889a;
    public final BaseController f16890b;
    public final Object f16891c;
    public final Object d;
    public final Object e;
    public final Object f16892f;
    public final Object h;
    public final Object f16893n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16889a = i10;
        this.f16890b = baseController;
        this.f16891c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16892f = obj4;
        this.h = obj5;
        this.f16893n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16889a) {
            case 0:
                ((TranslateController) this.f16890b).lambda$translateStory$36((TL_stories.StoryItem) this.f16891c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f16892f, (TranslateController.StoryKey) this.h, (Runnable) this.f16893n);
                return;
            case 1:
                ((MediaDataController) this.f16890b).lambda$loadHints$144((ArrayList) this.f16891c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16892f, (ArrayList) this.h, (ArrayList) this.f16893n);
                return;
            case 2:
                ((MessagesController) this.f16890b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f16891c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16892f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f16893n);
                return;
            case 3:
                ((MessagesController) this.f16890b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f16891c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16892f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f16893n);
                return;
            default:
                ((SecretChatHelper) this.f16890b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f16891c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f16892f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f16893n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f16889a = 4;
        this.f16890b = secretChatHelper;
        this.f16891c = encryptedChat;
        this.e = decryptedMessage;
        this.f16892f = message;
        this.h = inputEncryptedFile;
        this.f16893n = messageObject;
        this.d = str;
    }
}
