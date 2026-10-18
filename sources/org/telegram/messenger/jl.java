package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class jl implements Runnable {
    public final int f18735a;
    public final BaseController f18736b;
    public final Object f18737c;
    public final Object d;
    public final Object e;
    public final Object f18738f;
    public final Object h;
    public final Object f18739n;

    public jl(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f18735a = i10;
        this.f18736b = baseController;
        this.f18737c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18738f = obj4;
        this.h = obj5;
        this.f18739n = obj6;
    }

    @Override
    public final void run() {
        switch (this.f18735a) {
            case 0:
                ((TranslateController) this.f18736b).lambda$translateStory$36((TL_stories.StoryItem) this.f18737c, (String) this.d, (TLRPC.TL_textWithEntities) this.e, (TLRPC.TL_textWithEntities) this.f18738f, (TranslateController.StoryKey) this.h, (Runnable) this.f18739n);
                return;
            case 1:
                ((MediaDataController) this.f18736b).lambda$loadHints$144((ArrayList) this.f18737c, (ArrayList) this.d, (ArrayList) this.e, (ArrayList) this.f18738f, (ArrayList) this.h, (ArrayList) this.f18739n);
                return;
            case 2:
                ((MessagesController) this.f18736b).lambda$convertToMegaGroup$263((MessagesStorage.LongCallback) this.f18737c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18738f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_messages_migrateChat) this.f18739n);
                return;
            case 3:
                ((MessagesController) this.f18736b).lambda$convertToGigaGroup$268((MessagesStorage.BooleanCallback) this.f18737c, (Context) this.d, (org.telegram.ui.ActionBar.b2) this.e, (TLRPC.TL_error) this.f18738f, (org.telegram.ui.ActionBar.n2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f18739n);
                return;
            default:
                ((SecretChatHelper) this.f18736b).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.f18737c, (TLRPC.DecryptedMessage) this.e, (TLRPC.Message) this.f18738f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f18739n, (String) this.d);
                return;
        }
    }

    public jl(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f18735a = 4;
        this.f18736b = secretChatHelper;
        this.f18737c = encryptedChat;
        this.e = decryptedMessage;
        this.f18738f = message;
        this.h = inputEncryptedFile;
        this.f18739n = messageObject;
        this.d = str;
    }
}
