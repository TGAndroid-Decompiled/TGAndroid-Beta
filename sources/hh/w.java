package hh;

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

    public final int f10257a;

    public final long f10258b;

    public final Object f10259c;
    public final Object d;

    public final Object f10260e;

    public w(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f10257a = i10;
        this.f10259c = obj;
        this.d = obj2;
        this.f10258b = j10;
        this.f10260e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10257a) {
            case 0:
                AndroidUtilities.runOnUIThread(new gh.k1((c0) this.f10259c, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f10258b, (Utilities.Callback) this.f10260e));
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new p2((i5) this.f10259c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f10260e, tL_error, this.f10258b));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gh.k1((u7) this.f10259c, tLObject, (MessageObject) this.d, this.f10258b, (Runnable) this.f10260e, 2));
                break;
            case 3:
                ((MessagesController) this.f10259c).lambda$deleteSavedDialog$143(this.f10258b, (int[]) this.d, (TLRPC.InputPeer) this.f10260e, tLObject, tL_error);
                break;
            case 4:
                ((MessagesController) this.f10259c).lambda$getSavedReactionTags$486(this.f10258b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f10260e, tLObject, tL_error);
                break;
            case 5:
                ((MessagesController) this.f10259c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f10260e, this.f10258b, tLObject, tL_error);
                break;
            case 6:
                ((TopicsController) this.f10259c).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f10258b, (ArrayList) this.f10260e, tLObject, tL_error);
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new gh.k1((org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f10258b, (AccountInstance) this.f10259c, (MessagesStorage.BooleanCallback) this.f10260e, 13));
                break;
            default:
                AndroidUtilities.runOnUIThread(new p2((org.telegram.ui.ActionBar.n2) this.f10259c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f10260e, this.f10258b));
                break;
        }
    }

    public w(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f10257a = i10;
        this.f10259c = obj;
        this.d = obj2;
        this.f10260e = obj3;
        this.f10258b = j10;
    }

    public w(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f10257a = i10;
        this.f10259c = messagesController;
        this.f10258b = j10;
        this.d = obj;
        this.f10260e = tLObject;
    }

    public w(org.telegram.ui.ActionBar.b2 b2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f10257a = 7;
        this.d = b2Var;
        this.f10258b = j10;
        this.f10259c = accountInstance;
        this.f10260e = booleanCallback;
    }
}
