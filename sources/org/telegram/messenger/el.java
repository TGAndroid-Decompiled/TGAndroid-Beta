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
    public final int f18608a;
    public final BaseController f18609b;
    public final Object f18610c;
    public final Object d;
    public final long f18611e;
    public final Object f18612f;

    public el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18608a = i10;
        this.f18609b = baseController;
        this.f18612f = obj;
        this.f18611e = j10;
        this.f18610c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18608a) {
            case 0:
                ((TranslateController) this.f18609b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f18612f, (TLObject) this.f18610c, (TLRPC.TL_error) this.d, this.f18611e);
                return;
            case 1:
                ((TranslateController) this.f18609b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f18612f, (TLObject) this.f18610c, (TLRPC.TL_error) this.d, this.f18611e);
                return;
            case 2:
                ((MessagesController) this.f18609b).lambda$getSponsoredMessages$439((ArrayList) this.f18612f, this.f18611e, (MessagesController.SponsoredMessagesInfo) this.f18610c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f18609b).lambda$getSavedReactionTags$485((TLObject) this.f18610c, this.f18611e, (TLRPC.messages_SavedReactionTags) this.f18612f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f18609b).lambda$addUserToChat$306((TLRPC.Updates) this.f18612f, (Utilities.Callback) this.f18610c, (TLRPC.TL_messages_invitedUsers) this.d, this.f18611e);
                return;
            case 5:
                ((SendMessagesHelper) this.f18609b).lambda$prepareImportHistory$109((HashMap) this.f18612f, this.f18611e, (SendMessagesHelper.ImportingHistory) this.f18610c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f18609b).lambda$prepareImportHistory$110((ArrayList) this.f18612f, this.f18611e, (Uri) this.f18610c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f18608a = i10;
        this.f18609b = baseController;
        this.f18612f = obj;
        this.f18610c = obj2;
        this.d = tLObject;
        this.f18611e = j10;
    }

    public el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f18608a = 3;
        this.f18609b = messagesController;
        this.f18610c = tLObject;
        this.f18611e = j10;
        this.f18612f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
