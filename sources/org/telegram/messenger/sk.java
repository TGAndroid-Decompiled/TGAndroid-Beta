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
public final class sk implements Runnable {
    public final int f21513a;
    public final BaseController f21514b;
    public final Object f21515c;
    public final Object d;
    public final long f21516e;
    public final Object f21517f;

    public sk(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i9) {
        this.f21513a = i9;
        this.f21514b = baseController;
        this.f21517f = obj;
        this.f21516e = j10;
        this.f21515c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f21513a) {
            case 0:
                ((TranslateController) this.f21514b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f21517f, (TLObject) this.f21515c, (TLRPC.TL_error) this.d, this.f21516e);
                return;
            case 1:
                ((TranslateController) this.f21514b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f21517f, (TLObject) this.f21515c, (TLRPC.TL_error) this.d, this.f21516e);
                return;
            case 2:
                ((MessagesController) this.f21514b).lambda$getSponsoredMessages$439((ArrayList) this.f21517f, this.f21516e, (MessagesController.SponsoredMessagesInfo) this.f21515c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f21514b).lambda$getSavedReactionTags$485((TLObject) this.f21515c, this.f21516e, (TLRPC.messages_SavedReactionTags) this.f21517f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f21514b).lambda$addUserToChat$306((TLRPC.Updates) this.f21517f, (Utilities.Callback) this.f21515c, (TLRPC.TL_messages_invitedUsers) this.d, this.f21516e);
                return;
            case 5:
                ((SendMessagesHelper) this.f21514b).lambda$prepareImportHistory$109((HashMap) this.f21517f, this.f21516e, (SendMessagesHelper.ImportingHistory) this.f21515c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f21514b).lambda$prepareImportHistory$110((ArrayList) this.f21517f, this.f21516e, (Uri) this.f21515c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public sk(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i9) {
        this.f21513a = i9;
        this.f21514b = baseController;
        this.f21517f = obj;
        this.f21515c = obj2;
        this.d = tLObject;
        this.f21516e = j10;
    }

    public sk(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f21513a = 3;
        this.f21514b = messagesController;
        this.f21515c = tLObject;
        this.f21516e = j10;
        this.f21517f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
