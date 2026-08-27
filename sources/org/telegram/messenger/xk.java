package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class xk implements Runnable {

    public final int f22179a;

    public final BaseController f22180b;

    public final Object f22181c;
    public final Object d;

    public final long f22182e;

    public final Object f22183f;

    public xk(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f22179a = i10;
        this.f22180b = baseController;
        this.f22183f = obj;
        this.f22182e = j10;
        this.f22181c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f22179a) {
            case 0:
                ((TranslateController) this.f22180b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f22183f, (TLObject) this.f22181c, (TLRPC.TL_error) this.d, this.f22182e);
                break;
            case 1:
                ((TranslateController) this.f22180b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f22183f, (TLObject) this.f22181c, (TLRPC.TL_error) this.d, this.f22182e);
                break;
            case 2:
                ((MessagesController) this.f22180b).lambda$getSponsoredMessages$439((ArrayList) this.f22183f, this.f22182e, (MessagesController.SponsoredMessagesInfo) this.f22181c, (Integer) this.d);
                break;
            case 3:
                ((MessagesController) this.f22180b).lambda$getSavedReactionTags$485((TLObject) this.f22181c, this.f22182e, (TLRPC.messages_SavedReactionTags) this.f22183f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                break;
            case 4:
                ((MessagesController) this.f22180b).lambda$addUserToChat$306((TLRPC.Updates) this.f22183f, (Utilities.Callback) this.f22181c, (TLRPC.TL_messages_invitedUsers) this.d, this.f22182e);
                break;
            case 5:
                ((SendMessagesHelper) this.f22180b).lambda$prepareImportHistory$109((HashMap) this.f22183f, this.f22182e, (SendMessagesHelper.ImportingHistory) this.f22181c, (MessagesStorage.LongCallback) this.d);
                break;
            default:
                ((SendMessagesHelper) this.f22180b).lambda$prepareImportHistory$110((ArrayList) this.f22183f, this.f22182e, (Uri) this.f22181c, (MessagesStorage.LongCallback) this.d);
                break;
        }
    }

    public xk(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f22179a = i10;
        this.f22180b = baseController;
        this.f22183f = obj;
        this.f22181c = obj2;
        this.d = tLObject;
        this.f22182e = j10;
    }

    public xk(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f22179a = 3;
        this.f22180b = messagesController;
        this.f22181c = tLObject;
        this.f22182e = j10;
        this.f22183f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
