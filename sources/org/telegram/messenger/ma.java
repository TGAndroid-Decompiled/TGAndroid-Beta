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
public final class ma implements RequestDelegate {
    public final int f18548a;
    public final Object f18549b;
    public final long f18550c;
    public final Object d;
    public final Object f18551e;

    public ma(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f18548a = i10;
        this.f18549b = obj;
        this.d = obj2;
        this.f18550c = j3;
        this.f18551e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18548a) {
            case 0:
                ((MessagesController) this.f18549b).lambda$getSavedReactionTags$489(this.f18550c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f18551e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18549b).lambda$deleteSavedDialog$142(this.f18550c, (int[]) this.d, (TLRPC.InputPeer) this.f18551e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18549b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f18551e, this.f18550c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18549b).lambda$pinTopic$20((org.telegram.ui.ActionBar.m2) this.d, this.f18550c, (ArrayList) this.f18551e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.a2) this.f18549b, tLObject, this.f18550c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f18551e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.ha((org.telegram.ui.ActionBar.m2) this.f18549b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f18551e, this.f18550c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.o) this.f18549b, (org.telegram.ui.ActionBar.a2) this.d, tLObject, this.f18550c, (Utilities.Callback) this.f18551e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.ha((yh.s3) this.f18549b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f18551e, tL_error, this.f18550c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.n5) this.f18549b, tLObject, (MessageObject) this.d, this.f18550c, (Runnable) this.f18551e, 10));
                return;
        }
    }

    public ma(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f18548a = i10;
        this.f18549b = obj;
        this.d = obj2;
        this.f18551e = obj3;
        this.f18550c = j3;
    }

    public ma(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f18548a = i10;
        this.f18549b = notificationCenterDelegate;
        this.f18550c = j3;
        this.d = obj;
        this.f18551e = obj2;
    }
}
