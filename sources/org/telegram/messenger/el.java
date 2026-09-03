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
    public final int f18610a;
    public final BaseController f18611b;
    public final Object f18612c;
    public final Object d;
    public final long f18613e;
    public final Object f18614f;

    public el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18610a = i10;
        this.f18611b = baseController;
        this.f18614f = obj;
        this.f18613e = j10;
        this.f18612c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18610a) {
            case 0:
                ((TranslateController) this.f18611b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f18614f, (TLObject) this.f18612c, (TLRPC.TL_error) this.d, this.f18613e);
                return;
            case 1:
                ((TranslateController) this.f18611b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f18614f, (TLObject) this.f18612c, (TLRPC.TL_error) this.d, this.f18613e);
                return;
            case 2:
                ((MessagesController) this.f18611b).lambda$getSponsoredMessages$439((ArrayList) this.f18614f, this.f18613e, (MessagesController.SponsoredMessagesInfo) this.f18612c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f18611b).lambda$getSavedReactionTags$485((TLObject) this.f18612c, this.f18613e, (TLRPC.messages_SavedReactionTags) this.f18614f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f18611b).lambda$addUserToChat$306((TLRPC.Updates) this.f18614f, (Utilities.Callback) this.f18612c, (TLRPC.TL_messages_invitedUsers) this.d, this.f18613e);
                return;
            case 5:
                ((SendMessagesHelper) this.f18611b).lambda$prepareImportHistory$109((HashMap) this.f18614f, this.f18613e, (SendMessagesHelper.ImportingHistory) this.f18612c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f18611b).lambda$prepareImportHistory$110((ArrayList) this.f18614f, this.f18613e, (Uri) this.f18612c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f18610a = i10;
        this.f18611b = baseController;
        this.f18614f = obj;
        this.f18612c = obj2;
        this.d = tLObject;
        this.f18613e = j10;
    }

    public el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f18610a = 3;
        this.f18611b = messagesController;
        this.f18612c = tLObject;
        this.f18613e = j10;
        this.f18614f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
