package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18610a;
    public final BaseController f18611b;
    public final Object f18612c;
    public final Object d;
    public final Object f18613e;
    public final Object f18614f;
    public final Object h;
    public final Object f18615n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18610a = i10;
        this.f18611b = baseController;
        this.f18612c = obj;
        this.d = obj2;
        this.f18613e = obj3;
        this.f18614f = obj4;
        this.h = obj5;
        this.f18615n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18610a) {
            case 0:
                ((TranslateController) this.f18611b).lambda$translateStory$36((TL_stories.StoryItem) this.f18612c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18613e, (TLRPC.TL_textWithEntities) this.f18614f, (TranslateController.StoryKey) this.h, (Runnable) this.f18615n);
                return;
            case 1:
                ((MediaDataController) this.f18611b).lambda$loadHints$144((ArrayList) this.f18612c, (ArrayList) this.d, (ArrayList) this.f18613e, (ArrayList) this.f18614f, (ArrayList) this.h, (ArrayList) this.f18615n);
                return;
            case 2:
                ((MessagesController) this.f18611b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18612c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18613e, (TLRPC.TL_error) this.f18614f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18615n);
                return;
            case 3:
                ((MessagesController) this.f18611b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18612c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18613e, (TLRPC.TL_error) this.f18614f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18615n);
                return;
            default:
                ((SecretChatHelper) this.f18611b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18612c, (TLRPC.DecryptedMessage) this.f18613e, (TLRPC.Message) this.f18614f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18615n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18610a = 4;
        this.f18611b = secretChatHelper;
        this.f18612c = encryptedChat;
        this.f18613e = decryptedMessage;
        this.f18614f = message;
        this.h = inputEncryptedFile;
        this.f18615n = messageObject;
        this.d = str;
    }
}
