package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public final class il implements Runnable {

    public final int f20612a;

    public final Object f20613b;

    public final Object f20614c;
    public final Object d;

    public final Object f20615e;

    public final Object f20616f;
    public final Object h;

    public final Object f20617n;

    public il(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f20612a = i10;
        this.f20614c = obj;
        this.d = obj2;
        this.f20613b = obj3;
        this.f20615e = obj4;
        this.f20616f = obj5;
        this.h = obj6;
        this.f20617n = obj7;
    }

    @Override
    public final void run() {
        switch (this.f20612a) {
            case 0:
                ((TranslateController) this.f20614c).lambda$translateStory$36((TL_stories.StoryItem) this.d, (String) this.f20613b, (TLRPC.TL_textWithEntities) this.f20615e, (TLRPC.TL_textWithEntities) this.f20616f, (TranslateController.StoryKey) this.h, (Runnable) this.f20617n);
                break;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f20614c, (org.telegram.ui.Components.oc[]) this.d, (String) this.f20613b, (String) this.f20615e, (String) this.f20616f, (String) this.h, (String) this.f20617n);
                break;
            case 2:
                ((MediaDataController) this.f20614c).lambda$loadHints$144((ArrayList) this.d, (ArrayList) this.f20613b, (ArrayList) this.f20615e, (ArrayList) this.f20616f, (ArrayList) this.h, (ArrayList) this.f20617n);
                break;
            case 3:
                ((MessagesController) this.f20614c).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.d, (Context) this.f20613b, (org.telegram.ui.ActionBar.b2) this.f20615e, (TLRPC.TL_error) this.f20616f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f20617n);
                break;
            case 4:
                ((MessagesController) this.f20614c).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.d, (Context) this.f20613b, (org.telegram.ui.ActionBar.b2) this.f20615e, (TLRPC.TL_error) this.f20616f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f20617n);
                break;
            default:
                ((SecretChatHelper) this.f20614c).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.d, (TLRPC.DecryptedMessage) this.f20615e, (TLRPC.Message) this.f20616f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f20617n, (String) this.f20613b);
                break;
        }
    }

    public il(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f20612a = 5;
        this.f20614c = secretChatHelper;
        this.d = encryptedChat;
        this.f20615e = decryptedMessage;
        this.f20616f = message;
        this.h = inputEncryptedFile;
        this.f20617n = messageObject;
        this.f20613b = str;
    }
}
