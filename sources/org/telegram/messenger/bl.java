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
    public final int f16034a;
    public final BaseController f16035b;
    public final Object f16036c;
    public final Object d;
    public final long e;
    public final Object f16037f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f16034a = i10;
        this.f16035b = baseController;
        this.f16037f = obj;
        this.e = j3;
        this.f16036c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f16034a) {
            case 0:
                ((TranslateController) this.f16035b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f16037f, (TLObject) this.f16036c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f16035b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f16037f, (TLObject) this.f16036c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f16035b).lambda$getSponsoredMessages$439((ArrayList) this.f16037f, this.e, (MessagesController.SponsoredMessagesInfo) this.f16036c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f16035b).lambda$getSavedReactionTags$485((TLObject) this.f16036c, this.e, (TLRPC.messages_SavedReactionTags) this.f16037f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f16035b).lambda$addUserToChat$306((TLRPC.Updates) this.f16037f, (Utilities.Callback) this.f16036c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f16035b).lambda$prepareImportHistory$109((HashMap) this.f16037f, this.e, (SendMessagesHelper.ImportingHistory) this.f16036c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f16035b).lambda$prepareImportHistory$110((ArrayList) this.f16037f, this.e, (Uri) this.f16036c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f16034a = i10;
        this.f16035b = baseController;
        this.f16037f = obj;
        this.f16036c = obj2;
        this.d = tLObject;
        this.e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f16034a = 3;
        this.f16035b = messagesController;
        this.f16036c = tLObject;
        this.e = j3;
        this.f16037f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
