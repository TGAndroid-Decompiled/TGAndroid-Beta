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
    public final int f17598a;
    public final BaseController f17599b;
    public final Object f17600c;
    public final Object d;
    public final long f17601e;
    public final Object f17602f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17598a = i10;
        this.f17599b = baseController;
        this.f17602f = obj;
        this.f17601e = j3;
        this.f17600c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                ((TranslateController) this.f17599b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17602f, (TLObject) this.f17600c, (TLRPC.TL_error) this.d, this.f17601e);
                return;
            case 1:
                ((TranslateController) this.f17599b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17602f, (TLObject) this.f17600c, (TLRPC.TL_error) this.d, this.f17601e);
                return;
            case 2:
                ((MessagesController) this.f17599b).lambda$getSavedReactionTags$488((TLObject) this.f17600c, this.f17601e, (TLRPC.messages_SavedReactionTags) this.f17602f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17599b).lambda$addUserToChat$305((TLRPC.Updates) this.f17602f, (Utilities.Callback) this.f17600c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17601e);
                return;
            case 4:
                ((MessagesController) this.f17599b).lambda$getSponsoredMessages$442((ArrayList) this.f17602f, this.f17601e, (MessagesController.SponsoredMessagesInfo) this.f17600c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17599b).lambda$prepareImportHistory$113((ArrayList) this.f17602f, this.f17601e, (Uri) this.f17600c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17599b).lambda$prepareImportHistory$112((HashMap) this.f17602f, this.f17601e, (SendMessagesHelper.ImportingHistory) this.f17600c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17598a = i10;
        this.f17599b = baseController;
        this.f17602f = obj;
        this.f17600c = obj2;
        this.d = tLObject;
        this.f17601e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17598a = 2;
        this.f17599b = messagesController;
        this.f17600c = tLObject;
        this.f17601e = j3;
        this.f17602f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
