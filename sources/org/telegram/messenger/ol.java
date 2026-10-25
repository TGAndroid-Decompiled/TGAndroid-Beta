package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ol implements Runnable {
    public final int f20905a;
    public final BaseController f20906b;
    public final Object f20907c;
    public final Object d;
    public final Object e;
    public final Object f20908f;
    public final Object h;
    public final Object f20909n;

    public ol(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f20905a = i10;
        this.f20906b = baseController;
        this.f20907c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20908f = obj4;
        this.h = obj5;
        this.f20909n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f20905a) {
            case 0:
                ((TranslateController) this.f20906b).lambda$translateStory$36((TL_stories.StoryItem) this.f20907c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f20908f, (TranslateController.StoryKey) this.h, (Runnable) this.f20909n);
                return;
            case 1:
                ((MediaDataController) this.f20906b).lambda$loadHints$144((ArrayList) this.f20907c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f20908f, (ArrayList) this.h, (ArrayList) this.f20909n);
                return;
            case 2:
                ((MessagesController) this.f20906b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f20907c, (Context) this.d, (org.telegram.ui.ActionBar.e2) this.e, (TLRPC.TL_error) this.f20908f, (org.telegram.ui.ActionBar.r2) this.h, (TLRPC.TL_messages_migrateChat) this.f20909n);
                return;
            case 3:
                ((MessagesController) this.f20906b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f20907c, (Context) this.d, (org.telegram.ui.ActionBar.e2) this.e, (TLRPC.TL_error) this.f20908f, (org.telegram.ui.ActionBar.r2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f20909n);
                return;
            default:
                ((SecretChatHelper) this.f20906b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f20907c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f20908f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f20909n, (String) this.d);
                return;
        }
    }

    public ol(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f20905a = 4;
        this.f20906b = secretChatHelper;
        this.f20907c = encryptedChat;
        this.e = decryptedMessage;
        this.f20908f = message;
        this.h = inputEncryptedFile;
        this.f20909n = messageObject;
        this.d = str;
    }
}
