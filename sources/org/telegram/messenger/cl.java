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
    public final int f17599a;
    public final BaseController f17600b;
    public final Object f17601c;
    public final Object d;
    public final long f17602e;
    public final Object f17603f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17599a = i10;
        this.f17600b = baseController;
        this.f17603f = obj;
        this.f17602e = j3;
        this.f17601c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17599a) {
            case 0:
                ((TranslateController) this.f17600b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17603f, (TLObject) this.f17601c, (TLRPC.TL_error) this.d, this.f17602e);
                return;
            case 1:
                ((TranslateController) this.f17600b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17603f, (TLObject) this.f17601c, (TLRPC.TL_error) this.d, this.f17602e);
                return;
            case 2:
                ((MessagesController) this.f17600b).lambda$getSavedReactionTags$488((TLObject) this.f17601c, this.f17602e, (TLRPC.messages_SavedReactionTags) this.f17603f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17600b).lambda$addUserToChat$305((TLRPC.Updates) this.f17603f, (Utilities.Callback) this.f17601c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17602e);
                return;
            case 4:
                ((MessagesController) this.f17600b).lambda$getSponsoredMessages$442((ArrayList) this.f17603f, this.f17602e, (MessagesController.SponsoredMessagesInfo) this.f17601c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17600b).lambda$prepareImportHistory$113((ArrayList) this.f17603f, this.f17602e, (Uri) this.f17601c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17600b).lambda$prepareImportHistory$112((HashMap) this.f17603f, this.f17602e, (SendMessagesHelper.ImportingHistory) this.f17601c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17599a = i10;
        this.f17600b = baseController;
        this.f17603f = obj;
        this.f17601c = obj2;
        this.d = tLObject;
        this.f17602e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17599a = 2;
        this.f17600b = messagesController;
        this.f17601c = tLObject;
        this.f17602e = j3;
        this.f17603f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
