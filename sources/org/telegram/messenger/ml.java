package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f16795a;
    public final BaseController f16796b;
    public final Object f16797c;
    public final Object d;
    public final Object e;
    public final Object f16798f;
    public final Object h;
    public final Object f16799n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16795a = i10;
        this.f16796b = baseController;
        this.f16797c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16798f = obj4;
        this.h = obj5;
        this.f16799n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16795a) {
            case 0:
                ((TranslateController) this.f16796b).lambda$translateStory$36((TL_stories.StoryItem) this.f16797c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f16798f, (TranslateController.StoryKey) this.h, (Runnable) this.f16799n);
                return;
            case 1:
                ((MediaDataController) this.f16796b).lambda$loadHints$144((ArrayList) this.f16797c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16798f, (ArrayList) this.h, (ArrayList) this.f16799n);
                return;
            case 2:
                ((MessagesController) this.f16796b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f16797c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16798f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f16799n);
                return;
            case 3:
                ((MessagesController) this.f16796b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f16797c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f16798f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f16799n);
                return;
            default:
                ((SecretChatHelper) this.f16796b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f16797c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f16798f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f16799n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f16795a = 4;
        this.f16796b = secretChatHelper;
        this.f16797c = encryptedChat;
        this.e = decryptedMessage;
        this.f16798f = message;
        this.h = inputEncryptedFile;
        this.f16799n = messageObject;
        this.d = str;
    }
}
