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
public final class qa implements RequestDelegate {
    public final int f16127a;
    public final Object f16128b;
    public final long f16129c;
    public final Object d;
    public final Object e;

    public qa(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f16127a = i10;
        this.f16128b = obj;
        this.d = obj2;
        this.f16129c = j3;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16127a) {
            case 0:
                ((MessagesController) this.f16128b).lambda$deleteSavedDialog$143(this.f16129c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16128b).lambda$getSavedReactionTags$486(this.f16129c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16128b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.p2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f16129c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f16128b).lambda$pinTopic$20((org.telegram.ui.ActionBar.p2) this.d, this.f16129c, (ArrayList) this.e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g((org.telegram.ui.ActionBar.d2) this.f16128b, tLObject, this.f16129c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.c((org.telegram.ui.ActionBar.p2) this.f16128b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f16129c));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g((xh.p) this.f16128b, (org.telegram.ui.ActionBar.d2) this.d, tLObject, this.f16129c, (Utilities.Callback) this.e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.tgnet.c((xh.x3) this.f16128b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f16129c));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.g((xh.v5) this.f16128b, tLObject, (MessageObject) this.d, this.f16129c, (Runnable) this.e, 10));
                return;
        }
    }

    public qa(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f16127a = i10;
        this.f16128b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16129c = j3;
    }

    public qa(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f16127a = i10;
        this.f16128b = notificationCenterDelegate;
        this.f16129c = j3;
        this.d = obj;
        this.e = obj2;
    }
}
