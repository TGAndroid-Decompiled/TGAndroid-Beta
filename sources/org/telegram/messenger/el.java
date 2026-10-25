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
    public final int f20029a;
    public final BaseController f20030b;
    public final Object f20031c;
    public final Object d;
    public final long e;
    public final Object f20032f;

    public el(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f20029a = i10;
        this.f20030b = baseController;
        this.f20032f = obj;
        this.e = j10;
        this.f20031c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f20029a) {
            case 0:
                ((TranslateController) this.f20030b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f20032f, (TLObject) this.f20031c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f20030b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f20032f, (TLObject) this.f20031c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f20030b).lambda$getSavedReactionTags$490((TLObject) this.f20031c, this.e, (TLRPC.messages_SavedReactionTags) this.f20032f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f20030b).lambda$getSponsoredMessages$444((ArrayList) this.f20032f, this.e, (MessagesController.SponsoredMessagesInfo) this.f20031c, (Integer) this.d);
                return;
            case 4:
                ((MessagesController) this.f20030b).lambda$addUserToChat$305((TLRPC.Updates) this.f20032f, (Utilities.Callback) this.f20031c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f20030b).lambda$prepareImportHistory$113((ArrayList) this.f20032f, this.e, (Uri) this.f20031c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f20030b).lambda$prepareImportHistory$112((HashMap) this.f20032f, this.e, (SendMessagesHelper.ImportingHistory) this.f20031c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public el(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f20029a = i10;
        this.f20030b = baseController;
        this.f20032f = obj;
        this.f20031c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public el(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f20029a = 2;
        this.f20030b = messagesController;
        this.f20031c = tLObject;
        this.e = j10;
        this.f20032f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
