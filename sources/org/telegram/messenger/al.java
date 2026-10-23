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
public final class al implements Runnable {
    public final int f17974a;
    public final BaseController f17975b;
    public final Object f17976c;
    public final Object d;
    public final long e;
    public final Object f17977f;

    public al(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17974a = i10;
        this.f17975b = baseController;
        this.f17977f = obj;
        this.e = j10;
        this.f17976c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17974a) {
            case 0:
                ((TranslateController) this.f17975b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17977f, (TLObject) this.f17976c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f17975b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17977f, (TLObject) this.f17976c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f17975b).lambda$getSavedReactionTags$488((TLObject) this.f17976c, this.e, (TLRPC.messages_SavedReactionTags) this.f17977f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17975b).lambda$addUserToChat$305((TLRPC.Updates) this.f17977f, (Utilities.Callback) this.f17976c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f17975b).lambda$getSponsoredMessages$442((ArrayList) this.f17977f, this.e, (MessagesController.SponsoredMessagesInfo) this.f17976c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17975b).lambda$prepareImportHistory$113((ArrayList) this.f17977f, this.e, (Uri) this.f17976c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17975b).lambda$prepareImportHistory$112((HashMap) this.f17977f, this.e, (SendMessagesHelper.ImportingHistory) this.f17976c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public al(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f17974a = i10;
        this.f17975b = baseController;
        this.f17977f = obj;
        this.f17976c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public al(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17974a = 2;
        this.f17975b = messagesController;
        this.f17976c = tLObject;
        this.e = j10;
        this.f17977f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
