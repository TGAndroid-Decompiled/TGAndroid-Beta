package jh;

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
public final class v implements RequestDelegate {
    public final int f12936a;
    public final long f12937b;
    public final Object f12938c;
    public final Object d;
    public final Object f12939e;

    public v(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f12936a = i10;
        this.f12938c = obj;
        this.d = obj2;
        this.f12937b = j10;
        this.f12939e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12936a) {
            case 0:
                AndroidUtilities.runOnUIThread(new ih.h1((b0) this.f12938c, (org.telegram.ui.ActionBar.c2) this.d, tLObject, this.f12937b, (Utilities.Callback) this.f12939e));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new n2((h5) this.f12938c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f12939e, tL_error, this.f12937b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ih.h1((s7) this.f12938c, tLObject, (MessageObject) this.d, this.f12937b, (Runnable) this.f12939e, 2));
                return;
            case 3:
                ((MessagesController) this.f12938c).lambda$deleteSavedDialog$143(this.f12937b, (int[]) this.d, (TLRPC.InputPeer) this.f12939e, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f12938c).lambda$getSavedReactionTags$486(this.f12937b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f12939e, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f12938c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f12939e, this.f12937b, tLObject, tL_error);
                return;
            case 6:
                ((TopicsController) this.f12938c).lambda$pinTopic$20((org.telegram.ui.ActionBar.o2) this.d, this.f12937b, (ArrayList) this.f12939e, tLObject, tL_error);
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ih.h1((org.telegram.ui.ActionBar.c2) this.d, tLObject, this.f12937b, (AccountInstance) this.f12938c, (MessagesStorage.BooleanCallback) this.f12939e, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new n2((org.telegram.ui.ActionBar.o2) this.f12938c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f12939e, this.f12937b));
                return;
        }
    }

    public v(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f12936a = i10;
        this.f12938c = obj;
        this.d = obj2;
        this.f12939e = obj3;
        this.f12937b = j10;
    }

    public v(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f12936a = i10;
        this.f12938c = messagesController;
        this.f12937b = j10;
        this.d = obj;
        this.f12939e = tLObject;
    }

    public v(org.telegram.ui.ActionBar.c2 c2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f12936a = 7;
        this.d = c2Var;
        this.f12937b = j10;
        this.f12938c = accountInstance;
        this.f12939e = booleanCallback;
    }
}
