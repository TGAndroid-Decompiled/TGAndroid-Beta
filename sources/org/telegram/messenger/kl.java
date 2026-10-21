package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements Runnable {
    public final int f18825a;
    public final BaseController f18826b;
    public final Object f18827c;
    public final Object d;
    public final Object e;
    public final Object f18828f;
    public final Object h;
    public final Object f18829n;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18825a = i10;
        this.f18826b = baseController;
        this.f18827c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18828f = obj4;
        this.h = obj5;
        this.f18829n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18825a) {
            case 0:
                ((TranslateController) this.f18826b).lambda$translateStory$36((TL_stories.StoryItem) this.f18827c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18828f, (TranslateController.StoryKey) this.h, (Runnable) this.f18829n);
                return;
            case 1:
                ((MediaDataController) this.f18826b).lambda$loadHints$144((ArrayList) this.f18827c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18828f, (ArrayList) this.h, (ArrayList) this.f18829n);
                return;
            case 2:
                ((MessagesController) this.f18826b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18827c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18828f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18829n);
                return;
            case 3:
                ((MessagesController) this.f18826b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18827c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18828f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18829n);
                return;
            default:
                ((SecretChatHelper) this.f18826b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18827c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18828f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18829n, (String) this.d);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18825a = 4;
        this.f18826b = secretChatHelper;
        this.f18827c = encryptedChat;
        this.e = decryptedMessage;
        this.f18828f = message;
        this.h = inputEncryptedFile;
        this.f18829n = messageObject;
        this.d = str;
    }
}
