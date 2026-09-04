package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class nl implements Runnable {
    public final int f18514a;
    public final BaseController f18515b;
    public final Object f18516c;
    public final Object d;
    public final Object f18517e;
    public final Object f18518f;
    public final Object h;
    public final Object f18519n;

    public nl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18514a = i10;
        this.f18515b = baseController;
        this.f18516c = obj;
        this.d = obj2;
        this.f18517e = obj3;
        this.f18518f = obj4;
        this.h = obj5;
        this.f18519n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18514a) {
            case 0:
                ((TranslateController) this.f18515b).lambda$translateStory$36((TL_stories.StoryItem) this.f18516c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18517e, (TLRPC.TL_textWithEntities) this.f18518f, (TranslateController.StoryKey) this.h, (Runnable) this.f18519n);
                return;
            case 1:
                ((MediaDataController) this.f18515b).lambda$loadHints$144((ArrayList) this.f18516c, (ArrayList) this.d, (ArrayList) this.f18517e, (ArrayList) this.f18518f, (ArrayList) this.h, (ArrayList) this.f18519n);
                return;
            case 2:
                ((MessagesController) this.f18515b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18516c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18517e, (TLRPC.TL_error) this.f18518f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18519n);
                return;
            case 3:
                ((MessagesController) this.f18515b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18516c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18517e, (TLRPC.TL_error) this.f18518f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18519n);
                return;
            default:
                ((SecretChatHelper) this.f18515b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18516c, (TLRPC.DecryptedMessage) this.f18517e, (TLRPC.Message) this.f18518f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18519n, (String) this.d);
                return;
        }
    }

    public nl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18514a = 4;
        this.f18515b = secretChatHelper;
        this.f18516c = encryptedChat;
        this.f18517e = decryptedMessage;
        this.f18518f = message;
        this.h = inputEncryptedFile;
        this.f18519n = messageObject;
        this.d = str;
    }
}
