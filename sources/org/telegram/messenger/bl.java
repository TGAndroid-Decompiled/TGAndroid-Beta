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
    public final int f18046a;
    public final BaseController f18047b;
    public final Object f18048c;
    public final Object d;
    public final long e;
    public final Object f18049f;

    public bl(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f18046a = i10;
        this.f18047b = baseController;
        this.f18049f = obj;
        this.e = j10;
        this.f18048c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f18046a) {
            case 0:
                ((TranslateController) this.f18047b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f18049f, (TLObject) this.f18048c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f18047b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f18049f, (TLObject) this.f18048c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f18047b).lambda$getSavedReactionTags$488((TLObject) this.f18048c, this.e, (TLRPC.messages_SavedReactionTags) this.f18049f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f18047b).lambda$addUserToChat$305((TLRPC.Updates) this.f18049f, (Utilities.Callback) this.f18048c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f18047b).lambda$getSponsoredMessages$442((ArrayList) this.f18049f, this.e, (MessagesController.SponsoredMessagesInfo) this.f18048c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f18047b).lambda$prepareImportHistory$113((ArrayList) this.f18049f, this.e, (Uri) this.f18048c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f18047b).lambda$prepareImportHistory$112((HashMap) this.f18049f, this.e, (SendMessagesHelper.ImportingHistory) this.f18048c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f18046a = i10;
        this.f18047b = baseController;
        this.f18049f = obj;
        this.f18048c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f18046a = 2;
        this.f18047b = messagesController;
        this.f18048c = tLObject;
        this.e = j10;
        this.f18049f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
