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
    public final int f17634a;
    public final BaseController f17635b;
    public final Object f17636c;
    public final Object d;
    public final long f17637e;
    public final Object f17638f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17634a = i10;
        this.f17635b = baseController;
        this.f17638f = obj;
        this.f17637e = j3;
        this.f17636c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17634a) {
            case 0:
                ((TranslateController) this.f17635b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17638f, (TLObject) this.f17636c, (TLRPC.TL_error) this.d, this.f17637e);
                return;
            case 1:
                ((TranslateController) this.f17635b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17638f, (TLObject) this.f17636c, (TLRPC.TL_error) this.d, this.f17637e);
                return;
            case 2:
                ((MessagesController) this.f17635b).lambda$getSavedReactionTags$488((TLObject) this.f17636c, this.f17637e, (TLRPC.messages_SavedReactionTags) this.f17638f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 3:
                ((MessagesController) this.f17635b).lambda$addUserToChat$305((TLRPC.Updates) this.f17638f, (Utilities.Callback) this.f17636c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17637e);
                return;
            case 4:
                ((MessagesController) this.f17635b).lambda$getSponsoredMessages$442((ArrayList) this.f17638f, this.f17637e, (MessagesController.SponsoredMessagesInfo) this.f17636c, (Integer) this.d);
                return;
            case 5:
                ((SendMessagesHelper) this.f17635b).lambda$prepareImportHistory$113((ArrayList) this.f17638f, this.f17637e, (Uri) this.f17636c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17635b).lambda$prepareImportHistory$112((HashMap) this.f17638f, this.f17637e, (SendMessagesHelper.ImportingHistory) this.f17636c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17634a = i10;
        this.f17635b = baseController;
        this.f17638f = obj;
        this.f17636c = obj2;
        this.d = tLObject;
        this.f17637e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17634a = 2;
        this.f17635b = messagesController;
        this.f17636c = tLObject;
        this.f17637e = j3;
        this.f17638f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
