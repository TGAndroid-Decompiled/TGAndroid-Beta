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
    public final int f17993a;
    public final BaseController f17994b;
    public final Object f17995c;
    public final Object d;
    public final long e;
    public final Object f17996f;

    public bl(BaseController baseController, Object obj, long j10, Object obj2, Object obj3, int i10) {
        this.f17993a = i10;
        this.f17994b = baseController;
        this.f17996f = obj;
        this.e = j10;
        this.f17995c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17993a) {
            case 0:
                ((TranslateController) this.f17994b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17996f, (TLObject) this.f17995c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f17994b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17996f, (TLObject) this.f17995c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f17994b).lambda$getSavedReactionTags$488((TLObject) this.f17995c, this.e, (TLRPC.messages_SavedReactionTags) this.f17996f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17994b).lambda$addUserToChat$305((TLRPC.Updates) this.f17996f, (Utilities.Callback) this.f17995c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 4:
                ((MessagesController) this.f17994b).lambda$getSponsoredMessages$442((ArrayList) this.f17996f, this.e, (MessagesController.SponsoredMessagesInfo) this.f17995c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17994b).lambda$prepareImportHistory$113((ArrayList) this.f17996f, this.e, (Uri) this.f17995c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17994b).lambda$prepareImportHistory$112((HashMap) this.f17996f, this.e, (SendMessagesHelper.ImportingHistory) this.f17995c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j10, int i10) {
        this.f17993a = i10;
        this.f17994b = baseController;
        this.f17996f = obj;
        this.f17995c = obj2;
        this.d = tLObject;
        this.e = j10;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j10, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17993a = 2;
        this.f17994b = messagesController;
        this.f17995c = tLObject;
        this.e = j10;
        this.f17996f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
