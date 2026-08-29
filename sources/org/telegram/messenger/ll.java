package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TranslateController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ll implements Runnable {
    public final int f20892a;
    public final Object f20893b;
    public final Object f20894c;
    public final Object d;
    public final Object f20895e;
    public final Object f20896f;
    public final Object h;
    public final Object f20897n;

    public ll(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f20892a = i10;
        this.f20894c = obj;
        this.d = obj2;
        this.f20893b = obj3;
        this.f20895e = obj4;
        this.f20896f = obj5;
        this.h = obj6;
        this.f20897n = obj7;
    }

    @Override
    public final void run() {
        switch (this.f20892a) {
            case 0:
                ((TranslateController) this.f20894c).lambda$translateStory$36((TL_stories.StoryItem) this.d, (String) this.f20893b, (TLRPC.TL_textWithEntities) this.f20895e, (TLRPC.TL_textWithEntities) this.f20896f, (TranslateController.StoryKey) this.h, (Runnable) this.f20897n);
                return;
            case 1:
                AndroidUtilities.lambda$showProxyAlert$19((boolean[]) this.f20894c, (org.telegram.ui.Components.vc[]) this.d, (String) this.f20893b, (String) this.f20895e, (String) this.f20896f, (String) this.h, (String) this.f20897n);
                return;
            case 2:
                ((MediaDataController) this.f20894c).lambda$loadHints$144((ArrayList) this.d, (ArrayList) this.f20893b, (ArrayList) this.f20895e, (ArrayList) this.f20896f, (ArrayList) this.h, (ArrayList) this.f20897n);
                return;
            case 3:
                ((MessagesController) this.f20894c).lambda$convertToGigaGroup$269((MessagesStorage.BooleanCallback) this.d, (Context) this.f20893b, (org.telegram.ui.ActionBar.c2) this.f20895e, (TLRPC.TL_error) this.f20896f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_channels_convertToGigagroup) this.f20897n);
                return;
            case 4:
                ((MessagesController) this.f20894c).lambda$convertToMegaGroup$264((MessagesStorage.LongCallback) this.d, (Context) this.f20893b, (org.telegram.ui.ActionBar.c2) this.f20895e, (TLRPC.TL_error) this.f20896f, (org.telegram.ui.ActionBar.o2) this.h, (TLRPC.TL_messages_migrateChat) this.f20897n);
                return;
            default:
                ((SecretChatHelper) this.f20894c).lambda$performSendEncryptedRequest$8((TLRPC.EncryptedChat) this.d, (TLRPC.DecryptedMessage) this.f20895e, (TLRPC.Message) this.f20896f, (TLRPC.InputEncryptedFile) this.h, (MessageObject) this.f20897n, (String) this.f20893b);
                return;
        }
    }

    public ll(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        this.f20892a = 5;
        this.f20894c = secretChatHelper;
        this.d = encryptedChat;
        this.f20895e = decryptedMessage;
        this.f20896f = message;
        this.h = inputEncryptedFile;
        this.f20897n = messageObject;
        this.f20893b = str;
    }
}
