package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pl implements Runnable {
    public final int f19725a;
    public final BaseController f19726b;
    public final Object f19727c;
    public final Object d;
    public final Object f19728e;
    public final Object f19729f;
    public final Object h;
    public final Object f19730n;

    public pl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f19725a = i10;
        this.f19726b = baseController;
        this.f19727c = obj;
        this.d = obj2;
        this.f19728e = obj3;
        this.f19729f = obj4;
        this.h = obj5;
        this.f19730n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f19725a) {
            case 0:
                ((TranslateController) this.f19726b).lambda$translateStory$36((TL_stories.StoryItem) this.f19727c, (String) this.d, (TLRPC.TL_textWithEntities) this.f19728e, (TLRPC.TL_textWithEntities) this.f19729f, (TranslateController.StoryKey) this.h, (Runnable) this.f19730n);
                return;
            case 1:
                ((MediaDataController) this.f19726b).lambda$loadHints$144((ArrayList) this.f19727c, (ArrayList) this.d, (ArrayList) this.f19728e, (ArrayList) this.f19729f, (ArrayList) this.h, (ArrayList) this.f19730n);
                return;
            case 2:
                ((MessagesController) this.f19726b).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.f19727c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.f19728e, (TLRPC.TL_error) this.f19729f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f19730n);
                return;
            case 3:
                ((MessagesController) this.f19726b).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.f19727c, (Context) this.d, (org.telegram.ui.ActionBar.d2) this.f19728e, (TLRPC.TL_error) this.f19729f, (org.telegram.ui.ActionBar.p2) this.h, (TLRPC.TL_messages_migrateChat) this.f19730n);
                return;
            default:
                ((SecretChatHelper) this.f19726b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f19727c, (TLRPC.DecryptedMessage) this.f19728e, (TLRPC.Message) this.f19729f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f19730n, (String) this.d);
                return;
        }
    }

    public pl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f19725a = 4;
        this.f19726b = secretChatHelper;
        this.f19727c = encryptedChat;
        this.f19728e = decryptedMessage;
        this.f19729f = message;
        this.h = inputEncryptedFile;
        this.f19730n = messageObject;
        this.d = str;
    }
}
