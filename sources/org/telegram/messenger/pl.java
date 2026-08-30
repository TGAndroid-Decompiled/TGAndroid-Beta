package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f18168a;
    public final Object f18169b;
    public final Object f18170c;
    public final Object d;
    public final Object e;
    public final Object f18171f;
    public final Object h;
    public final Object f18172n;

    public pl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f18168a = i10;
        this.f18170c = obj;
        this.d = obj2;
        this.f18169b = obj3;
        this.e = obj4;
        this.f18171f = obj5;
        this.h = obj6;
        this.f18172n = obj7;
    }

    @Override
    public final void run() {
        switch (this.f18168a) {
            case 0:
                ((TranslateController) this.f18170c).lambda$translateStory$36((TL_stories.StoryItem) this.d, (String) this.f18169b, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18171f, (TranslateController.StoryKey) this.h, (Runnable) this.f18172n);
                return;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f18170c, (org.telegram.ui.Components.sc[]) this.d, (String) this.f18169b, (String) this.e, (String) this.f18171f, (String) this.h, (String) this.f18172n);
                return;
            case 2:
                ((MediaDataController) this.f18170c).lambda$loadHints$144((ArrayList) this.d, (ArrayList) this.f18169b, (ArrayList) this.e, (ArrayList) this.f18171f, (ArrayList) this.h, (ArrayList) this.f18172n);
                return;
            case 3:
                ((MessagesController) this.f18170c).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.d, (Context) this.f18169b, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f18171f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18172n);
                return;
            case 4:
                ((MessagesController) this.f18170c).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.d, (Context) this.f18169b, (org.telegram.ui.ActionBar.d2) this.e, (TLRPC.TL_error) this.f18171f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.f18172n);
                return;
            default:
                ((SecretChatHelper) this.f18170c).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.d, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18171f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18172n, (String) this.f18169b);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18168a = 5;
        this.f18170c = secretChatHelper;
        this.d = encryptedChat;
        this.e = decryptedMessage;
        this.f18171f = message;
        this.h = inputEncryptedFile;
        this.f18172n = messageObject;
        this.f18169b = str;
    }
}
