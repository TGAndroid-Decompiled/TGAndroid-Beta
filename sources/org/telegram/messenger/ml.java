package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f17071a;
    public final BaseController f17072b;
    public final Object f17073c;
    public final Object d;
    public final Object e;
    public final Object f17074f;
    public final Object h;
    public final Object f17075n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17071a = i10;
        this.f17072b = baseController;
        this.f17073c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17074f = obj4;
        this.h = obj5;
        this.f17075n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17071a) {
            case 0:
                ((TranslateController) this.f17072b).lambda$translateStory$36((TL_stories.StoryItem) this.f17073c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f17074f, (TranslateController.StoryKey) this.h, (Runnable) this.f17075n);
                return;
            case 1:
                ((MediaDataController) this.f17072b).lambda$loadHints$144((ArrayList) this.f17073c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17074f, (ArrayList) this.h, (ArrayList) this.f17075n);
                return;
            case 2:
                ((MessagesController) this.f17072b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f17073c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17074f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f17075n);
                return;
            case 3:
                ((MessagesController) this.f17072b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f17073c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17074f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f17075n);
                return;
            default:
                ((SecretChatHelper) this.f17072b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f17073c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f17074f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f17075n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f17071a = 4;
        this.f17072b = secretChatHelper;
        this.f17073c = encryptedChat;
        this.e = decryptedMessage;
        this.f17074f = message;
        this.h = inputEncryptedFile;
        this.f17075n = messageObject;
        this.d = str;
    }
}
