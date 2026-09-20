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
    public final int f16145a;
    public final BaseController f16146b;
    public final Object f16147c;
    public final Object d;
    public final long e;
    public final Object f16148f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f16145a = i10;
        this.f16146b = baseController;
        this.f16148f = obj;
        this.e = j3;
        this.f16147c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16145a) {
            case 0:
                ((TranslateController) this.f16146b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f16148f, (TLObject) this.f16147c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f16146b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f16148f, (TLObject) this.f16147c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f16146b).lambda$getSponsoredMessages$439((ArrayList) this.f16148f, this.e, (MessagesController.SponsoredMessagesInfo) this.f16147c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f16146b).lambda$getSavedReactionTags$485((TLObject) this.f16147c, this.e, (TLRPC.messages_SavedReactionTags) this.f16148f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f16146b).lambda$addUserToChat$306((TLRPC.Updates) this.f16148f, (Utilities.Callback) this.f16147c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f16146b).lambda$prepareImportHistory$109((HashMap) this.f16148f, this.e, (SendMessagesHelper.ImportingHistory) this.f16147c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f16146b).lambda$prepareImportHistory$110((ArrayList) this.f16148f, this.e, (Uri) this.f16147c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f16145a = i10;
        this.f16146b = baseController;
        this.f16148f = obj;
        this.f16147c = obj2;
        this.d = tLObject;
        this.e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f16145a = 3;
        this.f16146b = messagesController;
        this.f16147c = tLObject;
        this.e = j3;
        this.f16148f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
