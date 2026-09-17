package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18465a;
    public final BaseController f18466b;
    public final Object f18467c;
    public final Object d;
    public final Object f18468e;
    public final Object f18469f;
    public final Object h;
    public final Object f18470n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18465a = i10;
        this.f18466b = baseController;
        this.f18467c = obj;
        this.d = obj2;
        this.f18468e = obj3;
        this.f18469f = obj4;
        this.h = obj5;
        this.f18470n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18465a) {
            case 0:
                ((TranslateController) this.f18466b).lambda$translateStory$36((TL_stories.StoryItem) this.f18467c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18468e, (TLRPC.TL_textWithEntities) this.f18469f, (TranslateController.StoryKey) this.h, (Runnable) this.f18470n);
                return;
            case 1:
                ((MediaDataController) this.f18466b).lambda$loadHints$144((ArrayList) this.f18467c, (ArrayList) this.d, (ArrayList) this.f18468e, (ArrayList) this.f18469f, (ArrayList) this.h, (ArrayList) this.f18470n);
                return;
            case 2:
                ((MessagesController) this.f18466b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f18467c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18468e, (TLRPC.TL_error) this.f18469f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18470n);
                return;
            case 3:
                ((MessagesController) this.f18466b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f18467c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18468e, (TLRPC.TL_error) this.f18469f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18470n);
                return;
            default:
                ((SecretChatHelper) this.f18466b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18467c, (TLRPC.DecryptedMessage) this.f18468e, (TLRPC.Message) this.f18469f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18470n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18465a = 4;
        this.f18466b = secretChatHelper;
        this.f18467c = encryptedChat;
        this.f18468e = decryptedMessage;
        this.f18469f = message;
        this.h = inputEncryptedFile;
        this.f18470n = messageObject;
        this.d = str;
    }
}
