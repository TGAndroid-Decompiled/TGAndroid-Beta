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
    public final int f17147a;
    public final BaseController f17148b;
    public final Object f17149c;
    public final Object d;
    public final long e;
    public final Object f17150f;

    public el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17147a = i10;
        this.f17148b = baseController;
        this.f17150f = obj;
        this.e = j10;
        this.f17149c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17147a) {
            case 0:
                ((TranslateController) this.f17148b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17150f, (TLObject) this.f17149c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f17148b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17150f, (TLObject) this.f17149c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f17148b).lambda$getSponsoredMessages$439((ArrayList) this.f17150f, this.e, (MessagesController.SponsoredMessagesInfo) this.f17149c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17148b).lambda$getSavedReactionTags$485((TLObject) this.f17149c, this.e, (TLRPC.messages_SavedReactionTags) this.f17150f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17148b).lambda$addUserToChat$306((TLRPC.Updates) this.f17150f, (Utilities.Callback) this.f17149c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17148b).lambda$prepareImportHistory$109((HashMap) this.f17150f, this.e, (SendMessagesHelper.ImportingHistory) this.f17149c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17148b).lambda$prepareImportHistory$110((ArrayList) this.f17150f, this.e, (Uri) this.f17149c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f17147a = i10;
        this.f17148b = baseController;
        this.f17150f = obj;
        this.f17149c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17147a = 3;
        this.f17148b = messagesController;
        this.f17149c = tLObject;
        this.e = j10;
        this.f17150f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
