package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ml implements Runnable {
    public final int f18565a;
    public final BaseController f18566b;
    public final Object f18567c;
    public final Object d;
    public final Object f18568e;
    public final Object f18569f;
    public final Object h;
    public final Object f18570n;

    public ml(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18565a = i10;
        this.f18566b = baseController;
        this.f18567c = obj;
        this.d = obj2;
        this.f18568e = obj3;
        this.f18569f = obj4;
        this.h = obj5;
        this.f18570n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18565a) {
            case 0:
                ((TranslateController) this.f18566b).lambda$translateStory$36((TL_stories.StoryItem) this.f18567c, (String) this.d, (TLRPC.TL_textWithEntities) this.f18568e, (TLRPC.TL_textWithEntities) this.f18569f, (TranslateController.StoryKey) this.h, (Runnable) this.f18570n);
                return;
            case 1:
                ((MediaDataController) this.f18566b).lambda$loadHints$144((ArrayList) this.f18567c, (ArrayList) this.d, (ArrayList) this.f18568e, (ArrayList) this.f18569f, (ArrayList) this.h, (ArrayList) this.f18570n);
                return;
            case 2:
                ((MessagesController) this.f18566b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18567c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18568e, (TLRPC.TL_error) this.f18569f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18570n);
                return;
            case 3:
                ((MessagesController) this.f18566b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18567c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18568e, (TLRPC.TL_error) this.f18569f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18570n);
                return;
            default:
                ((SecretChatHelper) this.f18566b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18567c, (TLRPC.DecryptedMessage) this.f18568e, (TLRPC.Message) this.f18569f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18570n, (String) this.d);
                return;
        }
    }

    public ml(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18565a = 4;
        this.f18566b = secretChatHelper;
        this.f18567c = encryptedChat;
        this.f18568e = decryptedMessage;
        this.f18569f = message;
        this.h = inputEncryptedFile;
        this.f18570n = messageObject;
        this.d = str;
    }
}
