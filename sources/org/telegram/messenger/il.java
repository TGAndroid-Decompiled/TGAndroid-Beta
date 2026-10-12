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
public final class il implements Runnable {
    public final int f17904a;
    public final BaseController f17905b;
    public final Object f17906c;
    public final Object d;
    public final long f17907e;
    public final Object f17908f;

    public il(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17904a = i10;
        this.f17905b = baseController;
        this.f17908f = obj;
        this.f17907e = j3;
        this.f17906c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17904a) {
            case 0:
                ((TranslateController) this.f17905b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17908f, (TLObject) this.f17906c, (TLRPC.TL_error) this.d, this.f17907e);
                return;
            case 1:
                ((TranslateController) this.f17905b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17908f, (TLObject) this.f17906c, (TLRPC.TL_error) this.d, this.f17907e);
                return;
            case 2:
                ((MessagesController) this.f17905b).lambda$getSavedReactionTags$488((TLObject) this.f17906c, this.f17907e, (TLRPC.messages_SavedReactionTags) this.f17908f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17905b).lambda$addUserToChat$305((TLRPC.Updates) this.f17908f, (Utilities.Callback) this.f17906c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17907e);
                return;
            case 4:
                ((MessagesController) this.f17905b).lambda$getSponsoredMessages$442((ArrayList) this.f17908f, this.f17907e, (MessagesController.SponsoredMessagesInfo) this.f17906c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17905b).lambda$prepareImportHistory$113((ArrayList) this.f17908f, this.f17907e, (Uri) this.f17906c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17905b).lambda$prepareImportHistory$112((HashMap) this.f17908f, this.f17907e, (SendMessagesHelper.ImportingHistory) this.f17906c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public il(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17904a = i10;
        this.f17905b = baseController;
        this.f17908f = obj;
        this.f17906c = obj2;
        this.d = tLObject;
        this.f17907e = j3;
    }

    public il(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17904a = 2;
        this.f17905b = messagesController;
        this.f17906c = tLObject;
        this.f17907e = j3;
        this.f17908f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
