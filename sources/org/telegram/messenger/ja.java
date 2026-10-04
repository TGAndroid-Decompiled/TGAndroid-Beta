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
    public final int f18238a;
    public final Object f18239b;
    public final long f18240c;
    public final Object d;
    public final Object f18241e;

    public ja(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f18238a = i10;
        this.f18239b = obj;
        this.d = obj2;
        this.f18240c = j3;
        this.f18241e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18238a) {
            case 0:
                ((MessagesController) this.f18239b).lambda$deleteSavedDialog$143(this.f18240c, (int[]) this.d, (TLRPC.InputPeer) this.f18241e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18239b).lambda$getSavedReactionTags$486(this.f18240c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f18241e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18239b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f18241e, this.f18240c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f18239b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f18240c, (ArrayList) this.f18241e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.f18239b, tLObject, this.f18240c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f18241e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.ga((org.telegram.ui.ActionBar.n2) this.f18239b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f18241e, this.f18240c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.o) this.f18239b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f18240c, (Utilities.Callback) this.f18241e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.ga((yh.x3) this.f18239b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f18241e, tL_error, this.f18240c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.t5) this.f18239b, tLObject, (MessageObject) this.d, this.f18240c, (Runnable) this.f18241e, 10));
                return;
        }
    }

    public ja(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f18238a = i10;
        this.f18239b = obj;
        this.d = obj2;
        this.f18241e = obj3;
        this.f18240c = j3;
    }

    public ja(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f18238a = i10;
        this.f18239b = notificationCenterDelegate;
        this.f18240c = j3;
        this.d = obj;
        this.f18241e = obj2;
    }
}
