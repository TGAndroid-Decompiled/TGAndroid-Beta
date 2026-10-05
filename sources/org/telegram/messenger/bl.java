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
    public final int f17479a;
    public final BaseController f17480b;
    public final Object f17481c;
    public final Object d;
    public final long f17482e;
    public final Object f17483f;

    public bl(BaseController baseController, Object obj, long j3, Object obj2, Object obj3, int i10) {
        this.f17479a = i10;
        this.f17480b = baseController;
        this.f17483f = obj;
        this.f17482e = j3;
        this.f17481c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run() {
        switch (this.f17479a) {
            case 0:
                ((TranslateController) this.f17480b).lambda$pushPollToTranslate$25((TranslateController.PendingPollTranslation) this.f17483f, (TLObject) this.f17481c, (TLRPC.TL_error) this.d, this.f17482e);
                return;
            case 1:
                ((TranslateController) this.f17480b).lambda$pushRichMessageToTranslate$28((TranslateController.PendingRichTranslation) this.f17483f, (TLObject) this.f17481c, (TLRPC.TL_error) this.d, this.f17482e);
                return;
            case 2:
                ((MessagesController) this.f17480b).lambda$getSponsoredMessages$439((ArrayList) this.f17483f, this.f17482e, (MessagesController.SponsoredMessagesInfo) this.f17481c, (Integer) this.d);
                return;
            case 3:
                ((MessagesController) this.f17480b).lambda$getSavedReactionTags$485((TLObject) this.f17481c, this.f17482e, (TLRPC.messages_SavedReactionTags) this.f17483f, (TLRPC.TL_messages_getSavedReactionTags) this.d);
                return;
            case 4:
                ((MessagesController) this.f17480b).lambda$addUserToChat$306((TLRPC.Updates) this.f17483f, (Utilities.Callback) this.f17481c, (TLRPC.TL_messages_invitedUsers) this.d, this.f17482e);
                return;
            case 5:
                ((SendMessagesHelper) this.f17480b).lambda$prepareImportHistory$109((HashMap) this.f17483f, this.f17482e, (SendMessagesHelper.ImportingHistory) this.f17481c, (MessagesStorage.LongCallback) this.d);
                return;
            default:
                ((SendMessagesHelper) this.f17480b).lambda$prepareImportHistory$110((ArrayList) this.f17483f, this.f17482e, (Uri) this.f17481c, (MessagesStorage.LongCallback) this.d);
                return;
        }
    }

    public bl(BaseController baseController, Object obj, Object obj2, TLObject tLObject, long j3, int i10) {
        this.f17479a = i10;
        this.f17480b = baseController;
        this.f17483f = obj;
        this.f17481c = obj2;
        this.d = tLObject;
        this.f17482e = j3;
    }

    public bl(MessagesController messagesController, TLObject tLObject, long j3, TLRPC.messages_SavedReactionTags messages_savedreactiontags, TLRPC.TL_messages_getSavedReactionTags tL_messages_getSavedReactionTags) {
        this.f17479a = 3;
        this.f17480b = messagesController;
        this.f17481c = tLObject;
        this.f17482e = j3;
        this.f17483f = messages_savedreactiontags;
        this.d = tL_messages_getSavedReactionTags;
    }
}
