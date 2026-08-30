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
public final class el implements Runnable {
    public final int f17167a;
    public final BaseController f17168b;
    public final Object f17169c;
    public final Object d;
    public final long e;
    public final Object f17170f;

    public el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17167a = i10;
        this.f17168b = baseController;
        this.f17170f = obj;
        this.e = j10;
        this.f17169c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17167a) {
            case 0:
                ((TranslateController) this.f17168b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17170f, (TLObject) this.f17169c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f17168b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17170f, (TLObject) this.f17169c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f17168b).lambda$getSponsoredMessages$439((ArrayList) this.f17170f, this.e, (MessagesController.SponsoredMessagesInfo) this.f17169c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17168b).lambda$getSavedReactionTags$485((TLObject) this.f17169c, this.e, (TLRPC.messages_SavedReactionTags) this.f17170f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17168b).lambda$addUserToChat$306((TLRPC.Updates) this.f17170f, (Utilities.Callback) this.f17169c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17168b).lambda$prepareImportHistory$109((HashMap) this.f17170f, this.e, (SendMessagesHelper.ImportingHistory) this.f17169c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17168b).lambda$prepareImportHistory$110((ArrayList) this.f17170f, this.e, (Uri) this.f17169c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f17167a = i10;
        this.f17168b = baseController;
        this.f17170f = obj;
        this.f17169c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17167a = 3;
        this.f17168b = messagesController;
        this.f17169c = tLObject;
        this.e = j10;
        this.f17170f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
