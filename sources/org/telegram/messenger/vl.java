package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class vl implements Runnable {
    public final int f16678a;
    public final BaseController f16679b;
    public final Object f16680c;
    public final Object d;
    public final Object e;
    public final Object f16681f;
    public final Object h;
    public final Object f16682n;

    public vl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f16678a = i10;
        this.f16679b = baseController;
        this.f16680c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16681f = obj4;
        this.h = obj5;
        this.f16682n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f16678a) {
            case 0:
                ((TranslateController) this.f16679b).lambda$translateStory$36((TL_stories.StoryItem) this.f16680c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f16681f, (TranslateController.StoryKey) this.h, (Runnable) this.f16682n);
                return;
            case 1:
                ((MediaDataController) this.f16679b).lambda$loadHints$144((ArrayList) this.f16680c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f16681f, (ArrayList) this.h, (ArrayList) this.f16682n);
                return;
            case 2:
                ((MessagesController) this.f16679b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f16680c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f16681f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f16682n);
                return;
            case 3:
                ((MessagesController) this.f16679b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f16680c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f16681f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.f16682n);
                return;
            default:
                ((SecretChatHelper) this.f16679b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f16680c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f16681f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f16682n, (String) this.d);
                return;
        }
    }

    public vl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f16678a = 4;
        this.f16679b = secretChatHelper;
        this.f16680c = encryptedChat;
        this.e = decryptedMessage;
        this.f16681f = message;
        this.h = inputEncryptedFile;
        this.f16682n = messageObject;
        this.d = str;
    }
}
