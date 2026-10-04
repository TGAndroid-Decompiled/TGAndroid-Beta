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
    public final int f17474a;
    public final BaseController f17475b;
    public final Object f17476c;
    public final Object d;
    public final long f17477e;
    public final Object f17478f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17474a = i10;
        this.f17475b = baseController;
        this.f17478f = obj;
        this.f17477e = j3;
        this.f17476c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17474a) {
            case 0:
                ((TranslateController) this.f17475b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17478f, (TLObject) this.f17476c, (TLRPC.TL_error) this.d, this.f17477e);
                return;
            case 1:
                ((TranslateController) this.f17475b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17478f, (TLObject) this.f17476c, (TLRPC.TL_error) this.d, this.f17477e);
                return;
            case 2:
                ((MessagesController) this.f17475b).lambda$getSponsoredMessages$439((ArrayList) this.f17478f, this.f17477e, (MessagesController.SponsoredMessagesInfo) this.f17476c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17475b).lambda$getSavedReactionTags$485((TLObject) this.f17476c, this.f17477e, (TLRPC.messages_SavedReactionTags) this.f17478f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17475b).lambda$addUserToChat$306((TLRPC.Updates) this.f17478f, (Utilities.Callback) this.f17476c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17477e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17475b).lambda$prepareImportHistory$109((HashMap) this.f17478f, this.f17477e, (SendMessagesHelper.ImportingHistory) this.f17476c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17475b).lambda$prepareImportHistory$110((ArrayList) this.f17478f, this.f17477e, (Uri) this.f17476c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17474a = i10;
        this.f17475b = baseController;
        this.f17478f = obj;
        this.f17476c = obj2;
        this.d = tLObject;
        this.f17477e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17474a = 3;
        this.f17475b = messagesController;
        this.f17476c = tLObject;
        this.f17477e = j3;
        this.f17478f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
