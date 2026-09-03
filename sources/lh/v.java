package lh;

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
    public final int f13215a;
    public final long f13216b;
    public final Object f13217c;
    public final Object d;
    public final Object e;

    public v(Object obj, Object obj2, long j10, Object obj3, int i10) {
        this.f13215a = i10;
        this.f13217c = obj;
        this.d = obj2;
        this.f13216b = j10;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f13215a) {
            case 0:
                AndroidUtilities.runOnUIThread(new kh.g1((b0) this.f13217c, (org.telegram.ui.ActionBar.d2) this.d, tLObject, this.f13216b, (Utilities.Callback) this.e));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new o2((g5) this.f13217c, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f13216b));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new kh.g1((t7) this.f13217c, tLObject, (MessageObject) this.d, this.f13216b, (Runnable) this.e, 2));
                return;
            case 3:
                ((MessagesController) this.f13217c).lambda$deleteSavedDialog$143(this.f13216b, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 4:
                ((MessagesController) this.f13217c).lambda$getSavedReactionTags$486(this.f13216b, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 5:
                ((MessagesController) this.f13217c).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f13216b, tLObject, tL_error);
                return;
            case 6:
                ((TopicsController) this.f13217c).lambda$pinTopic$20((org.telegram.ui.ActionBar.p2) this.d, this.f13216b, (ArrayList) this.e, tLObject, tL_error);
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new kh.g1((org.telegram.ui.ActionBar.d2) this.d, tLObject, this.f13216b, (AccountInstance) this.f13217c, (MessagesStorage.BooleanCallback) this.e, 13));
                return;
            default:
                AndroidUtilities.runOnUIThread(new o2((org.telegram.ui.ActionBar.p2) this.f13217c, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f13216b));
                return;
        }
    }

    public v(Object obj, Object obj2, Object obj3, long j10, int i10) {
        this.f13215a = i10;
        this.f13217c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f13216b = j10;
    }

    public v(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f13215a = i10;
        this.f13217c = messagesController;
        this.f13216b = j10;
        this.d = obj;
        this.e = tLObject;
    }

    public v(org.telegram.ui.ActionBar.d2 d2Var, long j10, AccountInstance accountInstance, MessagesStorage.BooleanCallback booleanCallback) {
        this.f13215a = 7;
        this.d = d2Var;
        this.f13216b = j10;
        this.f13217c = accountInstance;
        this.e = booleanCallback;
    }
}
