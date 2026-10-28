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
    public final int f20120a;
    public final BaseController f20121b;
    public final Object f20122c;
    public final Object d;
    public final long e;
    public final Object f20123f;

    public fl(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f20120a = i10;
        this.f20121b = baseController;
        this.f20123f = obj;
        this.e = j10;
        this.f20122c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20120a) {
            case 0:
                ((TranslateController) this.f20121b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f20123f, (TLObject) this.f20122c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f20121b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f20123f, (TLObject) this.f20122c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f20121b).lambda$getSavedReactionTags$491((TLObject) this.f20122c, this.e, (TLRPC.messages_SavedReactionTags) this.f20123f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f20121b).lambda$addUserToChat$305((TLRPC.Updates) this.f20123f, (Utilities.Callback) this.f20122c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f20121b).lambda$getSponsoredMessages$445((ArrayList) this.f20123f, this.e, (MessagesController.SponsoredMessagesInfo) this.f20122c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f20121b).lambda$prepareImportHistory$113((ArrayList) this.f20123f, this.e, (Uri) this.f20122c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f20121b).lambda$prepareImportHistory$112((HashMap) this.f20123f, this.e, (SendMessagesHelper.ImportingHistory) this.f20122c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public fl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f20120a = i10;
        this.f20121b = baseController;
        this.f20123f = obj;
        this.f20122c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public fl(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f20120a = 2;
        this.f20121b = messagesController;
        this.f20122c = tLObject;
        this.e = j10;
        this.f20123f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
