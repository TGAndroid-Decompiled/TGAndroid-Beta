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
    public final int f16033a;
    public final BaseController f16034b;
    public final Object f16035c;
    public final Object d;
    public final long e;
    public final Object f16036f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f16033a = i10;
        this.f16034b = baseController;
        this.f16036f = obj;
        this.e = j3;
        this.f16035c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16033a) {
            case 0:
                ((TranslateController) this.f16034b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f16036f, (TLObject) this.f16035c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f16034b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f16036f, (TLObject) this.f16035c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f16034b).lambda$getSponsoredMessages$439((ArrayList) this.f16036f, this.e, (MessagesController.SponsoredMessagesInfo) this.f16035c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f16034b).lambda$getSavedReactionTags$485((TLObject) this.f16035c, this.e, (TLRPC.messages_SavedReactionTags) this.f16036f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f16034b).lambda$addUserToChat$306((TLRPC.Updates) this.f16036f, (Utilities.Callback) this.f16035c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f16034b).lambda$prepareImportHistory$109((HashMap) this.f16036f, this.e, (SendMessagesHelper.ImportingHistory) this.f16035c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f16034b).lambda$prepareImportHistory$110((ArrayList) this.f16036f, this.e, (Uri) this.f16035c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f16033a = i10;
        this.f16034b = baseController;
        this.f16036f = obj;
        this.f16035c = obj2;
        this.d = tLObject;
        this.e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f16033a = 3;
        this.f16034b = messagesController;
        this.f16035c = tLObject;
        this.e = j3;
        this.f16036f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
