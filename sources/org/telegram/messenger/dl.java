package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class dl implements Runnable {
    public final int f20131a;
    public final Object f20132b;
    public final Object f20133c;
    public final Object d;
    public final Object f20134e;
    public final Object f20135f;
    public final Object h;
    public final Object f20136n;

    public dl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i9) {
        this.f20131a = i9;
        this.f20133c = obj;
        this.d = obj2;
        this.f20132b = obj3;
        this.f20134e = obj4;
        this.f20135f = obj5;
        this.h = obj6;
        this.f20136n = obj7;
    }

    @Override
    public final void run() {
        switch (this.f20131a) {
            case 0:
                ((TranslateController) this.f20133c).lambda$translateStory$36((TL_stories.StoryItem) this.d, (String) this.f20132b, (TLRPC.TL_textWithEntities) this.f20134e, (TLRPC.TL_textWithEntities) this.f20135f, (TranslateController.StoryKey) this.h, (Runnable) this.f20136n);
                return;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f20133c, (org.telegram.ui.Components.qc[]) this.d, (String) this.f20132b, (String) this.f20134e, (String) this.f20135f, (String) this.h, (String) this.f20136n);
                return;
            case 2:
                ((MediaDataController) this.f20133c).lambda$loadHints$144((ArrayList) this.d, (ArrayList) this.f20132b, (ArrayList) this.f20134e, (ArrayList) this.f20135f, (ArrayList) this.h, (ArrayList) this.f20136n);
                return;
            case 3:
                ((MessagesController) this.f20133c).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.d, (Context) this.f20132b, (org.telegram.ui.ActionBar.c2) this.f20134e, (TLRPC.TL_error) this.f20135f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f20136n);
                return;
            case 4:
                ((MessagesController) this.f20133c).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.d, (Context) this.f20132b, (org.telegram.ui.ActionBar.c2) this.f20134e, (TLRPC.TL_error) this.f20135f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f20136n);
                return;
            default:
                ((SecretChatHelper) this.f20133c).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.d, (TLRPC.DecryptedMessage) this.f20134e, (TLRPC.Message) this.f20135f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f20136n, (String) this.f20132b);
                return;
        }
    }

    public dl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f20131a = 5;
        this.f20133c = secretChatHelper;
        this.d = encryptedChat;
        this.f20134e = decryptedMessage;
        this.f20135f = message;
        this.h = inputEncryptedFile;
        this.f20136n = messageObject;
        this.f20132b = str;
    }
}
