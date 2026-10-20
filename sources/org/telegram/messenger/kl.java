package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class kl implements Runnable {
    public final int f18832a;
    public final BaseController f18833b;
    public final Object f18834c;
    public final Object d;
    public final Object e;
    public final Object f18835f;
    public final Object h;
    public final Object f18836n;

    public kl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18832a = i10;
        this.f18833b = baseController;
        this.f18834c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18835f = obj4;
        this.h = obj5;
        this.f18836n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18832a) {
            case 0:
                ((TranslateController) this.f18833b).lambda$translateStory$36((TL_stories.StoryItem) this.f18834c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18835f, (TranslateController.StoryKey) this.h, (Runnable) this.f18836n);
                return;
            case 1:
                ((MediaDataController) this.f18833b).lambda$loadHints$144((ArrayList) this.f18834c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18835f, (ArrayList) this.h, (ArrayList) this.f18836n);
                return;
            case 2:
                ((MessagesController) this.f18833b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18834c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18835f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18836n);
                return;
            case 3:
                ((MessagesController) this.f18833b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18834c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18835f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18836n);
                return;
            default:
                ((SecretChatHelper) this.f18833b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18834c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18835f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18836n, (String) this.d);
                return;
        }
    }

    public kl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18832a = 4;
        this.f18833b = secretChatHelper;
        this.f18834c = encryptedChat;
        this.e = decryptedMessage;
        this.f18835f = message;
        this.h = inputEncryptedFile;
        this.f18836n = messageObject;
        this.d = str;
    }
}
