package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class bl implements Runnable {
    public final int f17329a;
    public final BaseController f17330b;
    public final Object f17331c;
    public final Object d;
    public final long f17332e;
    public final Object f17333f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17329a = i10;
        this.f17330b = baseController;
        this.f17333f = obj;
        this.f17332e = j3;
        this.f17331c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17329a) {
            case 0:
                ((TranslateController) this.f17330b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17333f, (TLObject) this.f17331c, (TLRPC.TL_error) this.d, this.f17332e);
                return;
            case 1:
                ((TranslateController) this.f17330b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17333f, (TLObject) this.f17331c, (TLRPC.TL_error) this.d, this.f17332e);
                return;
            case 2:
                ((MessagesController) this.f17330b).lambda$getSponsoredMessages$439((ArrayList) this.f17333f, this.f17332e, (MessagesController.SponsoredMessagesInfo) this.f17331c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17330b).lambda$getSavedReactionTags$485((TLObject) this.f17331c, this.f17332e, (TLRPC.messages_SavedReactionTags) this.f17333f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17330b).lambda$addUserToChat$306((TLRPC.Updates) this.f17333f, (Utilities.Callback) this.f17331c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17332e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17330b).lambda$prepareImportHistory$109((HashMap) this.f17333f, this.f17332e, (SendMessagesHelper.ImportingHistory) this.f17331c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17330b).lambda$prepareImportHistory$110((ArrayList) this.f17333f, this.f17332e, (Uri) this.f17331c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17329a = i10;
        this.f17330b = baseController;
        this.f17333f = obj;
        this.f17331c = obj2;
        this.d = tLObject;
        this.f17332e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17329a = 3;
        this.f17330b = messagesController;
        this.f17331c = tLObject;
        this.f17332e = j3;
        this.f17333f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
