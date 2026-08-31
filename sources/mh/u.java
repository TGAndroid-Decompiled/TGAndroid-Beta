package mh;

import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class u implements RequestDelegate {
    public final int f14856a;
    public final long f14857b;
    public final Object f14858c;
    public final Object d;
    public final Object f14859e;

    public u(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f14856a = i10;
        this.f14858c = obj;
        this.d = obj2;
        this.f14857b = j10;
        this.f14859e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14856a) {
            case 0:
                AndroidUtilities.runOnUIThread(new lh.g1((a0) this.f14858c, (org.telegram.ui.ActionBar.d2) this.d, tLObject, this.f14857b, (Utilities.Callback) this.f14859e));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n2((g5) this.f14858c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f14859e, tL_error, this.f14857b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new lh.g1((t7) this.f14858c, tLObject, (MessageObject) this.d, this.f14857b, (Runnable) this.f14859e, 2));
                return;
            case 3:
                ((MessagesController) this.f14858c).lambda$deleteSavedDialog$143(this.f14857b, (int[]) this.d, (TLRPC.InputPeer) this.f14859e, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f14858c).lambda$getSavedReactionTags$486(this.f14857b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f14859e, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f14858c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f14859e, this.f14857b, tLObject, tL_error);
                return;
            case 6:
                ((TopicsController) this.f14858c).lambda$pinTopic$20((org.telegram.ui.ActionBar.p2) this.d, this.f14857b, (ArrayList) this.f14859e, tLObject, tL_error);
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new lh.g1((org.telegram.ui.ActionBar.d2) this.d, tLObject, this.f14857b, (AccountInstance) this.f14858c, (MessagesStorage.BooleanCallback) this.f14859e, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n2((org.telegram.ui.ActionBar.p2) this.f14858c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f14859e, this.f14857b));
                return;
        }
    }

    public u(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f14856a = i10;
        this.f14858c = obj;
        this.d = obj2;
        this.f14859e = obj3;
        this.f14857b = j10;
    }

    public u(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f14856a = i10;
        this.f14858c = messagesController;
        this.f14857b = j10;
        this.d = obj;
        this.f14859e = tLObject;
    }

    public u(org.telegram.ui.ActionBar.d2 d2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f14856a = 7;
        this.d = d2Var;
        this.f14857b = j10;
        this.f14858c = accountInstance;
        this.f14859e = booleanCallback;
    }
}
