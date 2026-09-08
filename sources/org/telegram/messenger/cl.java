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
    public final int f17456a;
    public final BaseController f17457b;
    public final Object f17458c;
    public final Object d;
    public final long f17459e;
    public final Object f17460f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17456a = i10;
        this.f17457b = baseController;
        this.f17460f = obj;
        this.f17459e = j3;
        this.f17458c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17456a) {
            case 0:
                ((TranslateController) this.f17457b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17460f, (TLObject) this.f17458c, (TLRPC.TL_error) this.d, this.f17459e);
                return;
            case 1:
                ((TranslateController) this.f17457b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17460f, (TLObject) this.f17458c, (TLRPC.TL_error) this.d, this.f17459e);
                return;
            case 2:
                ((MessagesController) this.f17457b).lambda$getSponsoredMessages$439((ArrayList) this.f17460f, this.f17459e, (MessagesController.SponsoredMessagesInfo) this.f17458c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17457b).lambda$getSavedReactionTags$485((TLObject) this.f17458c, this.f17459e, (TLRPC.messages_SavedReactionTags) this.f17460f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17457b).lambda$addUserToChat$306((TLRPC.Updates) this.f17460f, (Utilities.Callback) this.f17458c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17459e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17457b).lambda$prepareImportHistory$109((HashMap) this.f17460f, this.f17459e, (SendMessagesHelper.ImportingHistory) this.f17458c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17457b).lambda$prepareImportHistory$110((ArrayList) this.f17460f, this.f17459e, (Uri) this.f17458c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17456a = i10;
        this.f17457b = baseController;
        this.f17460f = obj;
        this.f17458c = obj2;
        this.d = tLObject;
        this.f17459e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17456a = 3;
        this.f17457b = messagesController;
        this.f17458c = tLObject;
        this.f17459e = j3;
        this.f17460f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
