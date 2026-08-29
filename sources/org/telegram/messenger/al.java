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
public final class al implements Runnable {
    public final int f19751a;
    public final BaseController f19752b;
    public final Object f19753c;
    public final Object d;
    public final long f19754e;
    public final Object f19755f;

    public al(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f19751a = i10;
        this.f19752b = baseController;
        this.f19755f = obj;
        this.f19754e = j10;
        this.f19753c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f19751a) {
            case 0:
                ((TranslateController) this.f19752b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f19755f, (TLObject) this.f19753c, (TLRPC.TL_error) this.d, this.f19754e);
                return;
            case 1:
                ((TranslateController) this.f19752b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f19755f, (TLObject) this.f19753c, (TLRPC.TL_error) this.d, this.f19754e);
                return;
            case 2:
                ((MessagesController) this.f19752b).lambda$getSponsoredMessages$439((ArrayList) this.f19755f, this.f19754e, (MessagesController.SponsoredMessagesInfo) this.f19753c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f19752b).lambda$getSavedReactionTags$485((TLObject) this.f19753c, this.f19754e, (TLRPC.messages_SavedReactionTags) this.f19755f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f19752b).lambda$addUserToChat$306((TLRPC.Updates) this.f19755f, (Utilities.Callback) this.f19753c, (TLRPC.TL_messages_invitedUsers) this.d, this.f19754e);
                return;
            case 5:
                ((SendMessagesHelper) this.f19752b).lambda$prepareImportHistory$109((HashMap) this.f19755f, this.f19754e, (SendMessagesHelper.ImportingHistory) this.f19753c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f19752b).lambda$prepareImportHistory$110((ArrayList) this.f19755f, this.f19754e, (Uri) this.f19753c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public al(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f19751a = i10;
        this.f19752b = baseController;
        this.f19755f = obj;
        this.f19753c = obj2;
        this.d = tLObject;
        this.f19754e = j10;
    }

    public al(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f19751a = 3;
        this.f19752b = messagesController;
        this.f19753c = tLObject;
        this.f19754e = j10;
        this.f19755f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
