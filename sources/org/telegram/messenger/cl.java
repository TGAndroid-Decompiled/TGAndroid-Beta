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
public final class cl implements Runnable {
    public final int f18114a;
    public final BaseController f18115b;
    public final Object f18116c;
    public final Object d;
    public final long e;
    public final Object f18117f;

    public cl(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18114a = i10;
        this.f18115b = baseController;
        this.f18117f = obj;
        this.e = j10;
        this.f18116c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18114a) {
            case 0:
                ((TranslateController) this.f18115b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f18117f, (TLObject) this.f18116c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f18115b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f18117f, (TLObject) this.f18116c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f18115b).lambda$getSavedReactionTags$488((TLObject) this.f18116c, this.e, (TLRPC.messages_SavedReactionTags) this.f18117f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f18115b).lambda$addUserToChat$305((TLRPC.Updates) this.f18117f, (Utilities.Callback) this.f18116c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f18115b).lambda$getSponsoredMessages$442((ArrayList) this.f18117f, this.e, (MessagesController.SponsoredMessagesInfo) this.f18116c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f18115b).lambda$prepareImportHistory$113((ArrayList) this.f18117f, this.e, (Uri) this.f18116c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f18115b).lambda$prepareImportHistory$112((HashMap) this.f18117f, this.e, (SendMessagesHelper.ImportingHistory) this.f18116c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f18114a = i10;
        this.f18115b = baseController;
        this.f18117f = obj;
        this.f18116c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f18114a = 2;
        this.f18115b = messagesController;
        this.f18116c = tLObject;
        this.e = j10;
        this.f18117f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
