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
    public final int f16723a;
    public final Object f16724b;
    public final long f16725c;
    public final Object d;
    public final Object e;

    public ja(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f16723a = i10;
        this.f16724b = obj;
        this.d = obj2;
        this.f16725c = j3;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16723a) {
            case 0:
                ((MessagesController) this.f16724b).lambda$deleteSavedDialog$143(this.f16725c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16724b).lambda$getSavedReactionTags$486(this.f16725c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16724b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f16725c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f16724b).lambda$pinTopic$20((org.telegram.ui.ActionBar.m2) this.d, this.f16725c, (ArrayList) this.e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.a2) this.f16724b, tLObject, this.f16725c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.ga((org.telegram.ui.ActionBar.m2) this.f16724b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f16725c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.o) this.f16724b, (org.telegram.ui.ActionBar.a2) this.d, tLObject, this.f16725c, (Utilities.Callback) this.e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.ga((yh.x3) this.f16724b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f16725c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.t5) this.f16724b, tLObject, (MessageObject) this.d, this.f16725c, (Runnable) this.e, 10));
                return;
        }
    }

    public ja(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f16723a = i10;
        this.f16724b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16725c = j3;
    }

    public ja(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f16723a = i10;
        this.f16724b = notificationCenterDelegate;
        this.f16725c = j3;
        this.d = obj;
        this.e = obj2;
    }
}
