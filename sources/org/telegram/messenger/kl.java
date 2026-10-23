package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements Runnable {
    public final int f18898a;
    public final BaseController f18899b;
    public final Object f18900c;
    public final Object d;
    public final Object e;
    public final Object f18901f;
    public final Object h;
    public final Object f18902n;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18898a = i10;
        this.f18899b = baseController;
        this.f18900c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18901f = obj4;
        this.h = obj5;
        this.f18902n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18898a) {
            case 0:
                ((TranslateController) this.f18899b).lambda$translateStory$36((TL_stories.StoryItem) this.f18900c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18901f, (TranslateController.StoryKey) this.h, (Runnable) this.f18902n);
                return;
            case 1:
                ((MediaDataController) this.f18899b).lambda$loadHints$144((ArrayList) this.f18900c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18901f, (ArrayList) this.h, (ArrayList) this.f18902n);
                return;
            case 2:
                ((MessagesController) this.f18899b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18900c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f18901f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f18902n);
                return;
            case 3:
                ((MessagesController) this.f18899b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18900c, (Context) this.d, (org.telegram.ui.ActionBar.c2) this.e, (TLRPC.TL_error) this.f18901f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18902n);
                return;
            default:
                ((SecretChatHelper) this.f18899b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18900c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18901f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18902n, (String) this.d);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18898a = 4;
        this.f18899b = secretChatHelper;
        this.f18900c = encryptedChat;
        this.e = decryptedMessage;
        this.f18901f = message;
        this.h = inputEncryptedFile;
        this.f18902n = messageObject;
        this.d = str;
    }
}
