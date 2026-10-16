package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ql implements Runnable {
    public final int f17953a;
    public final BaseController f17954b;
    public final Object f17955c;
    public final Object d;
    public final Object e;
    public final Object f17956f;
    public final Object h;
    public final Object f17957n;

    public ql(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f17953a = i10;
        this.f17954b = baseController;
        this.f17955c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17956f = obj4;
        this.h = obj5;
        this.f17957n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f17953a) {
            case 0:
                ((TranslateController) this.f17954b).lambda$translateStory$36((TL_stories.StoryItem) this.f17955c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f17956f, (TranslateController.StoryKey) this.h, (Runnable) this.f17957n);
                return;
            case 1:
                ((MediaDataController) this.f17954b).lambda$loadHints$144((ArrayList) this.f17955c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f17956f, (ArrayList) this.h, (ArrayList) this.f17957n);
                return;
            case 2:
                ((MessagesController) this.f17954b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f17955c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17956f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_messages_migrateChat) this.f17957n);
                return;
            case 3:
                ((MessagesController) this.f17954b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f17955c, (Context) this.d, (org.telegram.ui.ActionBar.a2) this.e, (TLRPC.TL_error) this.f17956f, (org.telegram.ui.ActionBar.m2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f17957n);
                return;
            default:
                ((SecretChatHelper) this.f17954b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f17955c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f17956f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f17957n, (String) this.d);
                return;
        }
    }

    public ql(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f17953a = 4;
        this.f17954b = secretChatHelper;
        this.f17955c = encryptedChat;
        this.e = decryptedMessage;
        this.f17956f = message;
        this.h = inputEncryptedFile;
        this.f17957n = messageObject;
        this.d = str;
    }
}
