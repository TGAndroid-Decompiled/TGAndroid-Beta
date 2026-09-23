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
    public final int f15775a;
    public final BaseController f15776b;
    public final Object f15777c;
    public final Object d;
    public final long e;
    public final Object f15778f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f15775a = i10;
        this.f15776b = baseController;
        this.f15778f = obj;
        this.e = j3;
        this.f15777c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f15775a) {
            case 0:
                ((TranslateController) this.f15776b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f15778f, (TLObject) this.f15777c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 1:
                ((TranslateController) this.f15776b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f15778f, (TLObject) this.f15777c, (TLRPC.TL_error) this.d, this.e);
                return;
            case 2:
                ((MessagesController) this.f15776b).lambda$getSponsoredMessages$439((ArrayList) this.f15778f, this.e, (MessagesController.SponsoredMessagesInfo) this.f15777c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f15776b).lambda$getSavedReactionTags$485((TLObject) this.f15777c, this.e, (TLRPC.messages_SavedReactionTags) this.f15778f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f15776b).lambda$addUserToChat$306((TLRPC.Updates) this.f15778f, (Utilities.Callback) this.f15777c, (TLRPC.TL_messages_invitedUsers) this.d, this.e);
                return;
            case 5:
                ((SendMessagesHelper) this.f15776b).lambda$prepareImportHistory$109((HashMap) this.f15778f, this.e, (SendMessagesHelper.ImportingHistory) this.f15777c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f15776b).lambda$prepareImportHistory$110((ArrayList) this.f15778f, this.e, (Uri) this.f15777c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f15775a = i10;
        this.f15776b = baseController;
        this.f15778f = obj;
        this.f15777c = obj2;
        this.d = tLObject;
        this.e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f15775a = 3;
        this.f15776b = messagesController;
        this.f15777c = tLObject;
        this.e = j3;
        this.f15778f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
