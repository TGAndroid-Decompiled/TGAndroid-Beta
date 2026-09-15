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
    public final int f15921a;
    public final BaseController f15922b;
    public final Object f15923c;
    public final Object d;
    public final long e;
    public final Object f15924f;

    public cl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f15921a = i10;
        this.f15922b = baseController;
        this.f15924f = obj;
        this.e = j3;
        this.f15923c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f15921a) {
            case 0:
                ((TranslateController) this.f15922b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f15924f, (TLObject) this.f15923c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f15922b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f15924f, (TLObject) this.f15923c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f15922b).lambda$getSponsoredMessages$439((ArrayList) this.f15924f, this.e, (MessagesController.SponsoredMessagesInfo) this.f15923c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f15922b).lambda$getSavedReactionTags$485((TLObject) this.f15923c, this.e, (TLRPC.messages_SavedReactionTags) this.f15924f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f15922b).lambda$addUserToChat$306((TLRPC.Updates) this.f15924f, (Utilities.Callback) this.f15923c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f15922b).lambda$prepareImportHistory$109((HashMap) this.f15924f, this.e, (SendMessagesHelper.ImportingHistory) this.f15923c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f15922b).lambda$prepareImportHistory$110((ArrayList) this.f15924f, this.e, (Uri) this.f15923c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public cl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f15921a = i10;
        this.f15922b = baseController;
        this.f15924f = obj;
        this.f15923c = obj2;
        this.d = tLObject;
        this.e = j3;
    }

    public cl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f15921a = 3;
        this.f15922b = messagesController;
        this.f15923c = tLObject;
        this.e = j3;
        this.f15924f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
