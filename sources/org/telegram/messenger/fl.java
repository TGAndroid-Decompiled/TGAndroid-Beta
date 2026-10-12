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
public final class fl implements Runnable {
    public final int f17273a;
    public final BaseController f17274b;
    public final Object f17275c;
    public final Object d;
    public final long e;
    public final Object f17276f;

    public fl(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17273a = i10;
        this.f17274b = baseController;
        this.f17276f = obj;
        this.e = j10;
        this.f17275c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17273a) {
            case 0:
                ((TranslateController) this.f17274b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17276f, (TLObject) this.f17275c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f17274b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17276f, (TLObject) this.f17275c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f17274b).lambda$getSavedReactionTags$488((TLObject) this.f17275c, this.e, (TLRPC.messages_SavedReactionTags) this.f17276f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17274b).lambda$addUserToChat$305((TLRPC.Updates) this.f17276f, (Utilities.Callback) this.f17275c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f17274b).lambda$getSponsoredMessages$442((ArrayList) this.f17276f, this.e, (MessagesController.SponsoredMessagesInfo) this.f17275c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17274b).lambda$prepareImportHistory$113((ArrayList) this.f17276f, this.e, (Uri) this.f17275c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17274b).lambda$prepareImportHistory$112((HashMap) this.f17276f, this.e, (SendMessagesHelper.ImportingHistory) this.f17275c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public fl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f17273a = i10;
        this.f17274b = baseController;
        this.f17276f = obj;
        this.f17275c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public fl(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17273a = 2;
        this.f17274b = messagesController;
        this.f17275c = tLObject;
        this.e = j10;
        this.f17276f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
