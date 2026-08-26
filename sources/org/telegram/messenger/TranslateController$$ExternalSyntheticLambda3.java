package org.telegram.messenger;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class TranslateController$$ExternalSyntheticLambda3 implements Runnable {
    public final int $r8$classId;
    public final BaseController f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;

    public TranslateController$$ExternalSyntheticLambda3(BaseController baseController, Object obj, long j, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$4 = j;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((TranslateController) this.f$0).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f$1, (TLObject) this.f$2, (TLRPC.TL_error) this.f$3, this.f$4);
                break;
            case 1:
                ((TranslateController) this.f$0).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f$1, (TLObject) this.f$2, (TLRPC.TL_error) this.f$3, this.f$4);
                break;
            case 2:
                ((MessagesController) this.f$0).lambda$getSponsoredMessages$439((ArrayList) this.f$1, this.f$4, (MessagesController.SponsoredMessagesInfo) this.f$2, (Integer) this.f$3);
                break;
            case 3:
                ((MessagesController) this.f$0).lambda$getSavedReactionTags$485((TLObject) this.f$2, this.f$4, (TLRPC.messages_SavedReactionTags) this.f$1, (TLRPC.TL_messages_getSavedReactionTags) this.f$3);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$addUserToChat$306((TLRPC.Updates) this.f$1, (Utilities.Callback) this.f$2, (TLRPC.TL_messages_invitedUsers) this.f$3, this.f$4);
                break;
            case 5:
                ((SendMessagesHelper) this.f$0).lambda$prepareImportHistory$109((HashMap) this.f$1, this.f$4, (SendMessagesHelper.ImportingHistory) this.f$2, (MessagesStorage.LongCallback) this.f$3);
                break;
            default:
                ((SendMessagesHelper) this.f$0).lambda$prepareImportHistory$110((ArrayList) this.f$1, this.f$4, (Uri) this.f$2, (MessagesStorage.LongCallback) this.f$3);
                break;
        }
    }

    public TranslateController$$ExternalSyntheticLambda3(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = baseController;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = tLObject;
        this.f$4 = j;
    }

    public TranslateController$$ExternalSyntheticLambda3(MessagesController messagesController, TLObject tLObject, long j, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.$r8$classId = 3;
        this.f$0 = messagesController;
        this.f$2 = tLObject;
        this.f$4 = j;
        this.f$1 = messages_savedreactiontags;
        this.f$3 = tL_messages_getSavedReactionTags;
    }
}
