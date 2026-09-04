package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class ja implements RequestDelegate {
    public final int f18046a;
    public final Object f18047b;
    public final long f18048c;
    public final Object d;
    public final Object f18049e;

    public ja(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f18046a = i10;
        this.f18047b = obj;
        this.d = obj2;
        this.f18048c = j3;
        this.f18049e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18046a) {
            case 0:
                ((MessagesController) this.f18047b).lambda$deleteSavedDialog$143(this.f18048c, (int[]) this.d, (TLRPC.InputPeer) this.f18049e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18047b).lambda$getSavedReactionTags$486(this.f18048c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f18049e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18047b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f18049e, this.f18048c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18047b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f18048c, (ArrayList) this.f18049e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.f18047b, tLObject, this.f18048c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f18049e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.n9((org.telegram.ui.ActionBar.n2) this.f18047b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f18049e, this.f18048c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.o) this.f18047b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f18048c, (Utilities.Callback) this.f18049e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.n9((zh.w3) this.f18047b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f18049e, tL_error, this.f18048c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.s5) this.f18047b, tLObject, (MessageObject) this.d, this.f18048c, (Runnable) this.f18049e, 10));
                return;
        }
    }

    public ja(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f18046a = i10;
        this.f18047b = obj;
        this.d = obj2;
        this.f18049e = obj3;
        this.f18048c = j3;
    }

    public ja(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f18046a = i10;
        this.f18047b = notificationCenterDelegate;
        this.f18048c = j3;
        this.d = obj;
        this.f18049e = obj2;
    }
}
