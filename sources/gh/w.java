package gh;

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
public final class w implements RequestDelegate {
    public final int f9078a;
    public final long f9079b;
    public final Object f9080c;
    public final Object d;
    public final Object f9081e;

    public w(Object obj, Object obj2, long j10, Object obj3, int i9) {
        this.f9078a = i9;
        this.f9080c = obj;
        this.d = obj2;
        this.f9079b = j10;
        this.f9081e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9078a) {
            case 0:
                AndroidUtilities.runOnUIThread(new fh.m1((c0) this.f9080c, (org.telegram.ui.ActionBar.c2) this.d, tLObject, this.f9079b, (Utilities.Callback) this.f9081e));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new p2((k5) this.f9080c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f9081e, tL_error, this.f9079b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new fh.m1((v7) this.f9080c, tLObject, (MessageObject) this.d, this.f9079b, (Runnable) this.f9081e, 2));
                return;
            case 3:
                ((MessagesController) this.f9080c).lambda$deleteSavedDialog$143(this.f9079b, (int[]) this.d, (TLRPC.InputPeer) this.f9081e, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f9080c).lambda$getSavedReactionTags$486(this.f9079b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f9081e, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f9080c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f9081e, this.f9079b, tLObject, tL_error);
                return;
            case 6:
                ((TopicsController) this.f9080c).lambda$pinTopic$20((org.telegram.ui.ActionBar.o2) this.d, this.f9079b, (ArrayList) this.f9081e, tLObject, tL_error);
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new fh.m1((org.telegram.ui.ActionBar.c2) this.d, tLObject, this.f9079b, (AccountInstance) this.f9080c, (MessagesStorage.BooleanCallback) this.f9081e, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new p2((org.telegram.ui.ActionBar.o2) this.f9080c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f9081e, this.f9079b));
                return;
        }
    }

    public w(Object obj, Object obj2, Object obj3, long j10, int i9) {
        this.f9078a = i9;
        this.f9080c = obj;
        this.d = obj2;
        this.f9081e = obj3;
        this.f9079b = j10;
    }

    public w(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i9) {
        this.f9078a = i9;
        this.f9080c = messagesController;
        this.f9079b = j10;
        this.d = obj;
        this.f9081e = tLObject;
    }

    public w(org.telegram.ui.ActionBar.c2 c2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f9078a = 7;
        this.d = c2Var;
        this.f9079b = j10;
        this.f9080c = accountInstance;
        this.f9081e = booleanCallback;
    }
}
