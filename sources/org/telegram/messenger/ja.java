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
    public final int f16473a;
    public final Object f16474b;
    public final long f16475c;
    public final Object d;
    public final Object e;

    public ja(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f16473a = i10;
        this.f16474b = obj;
        this.d = obj2;
        this.f16475c = j3;
        this.e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16473a) {
            case 0:
                ((MessagesController) this.f16474b).lambda$deleteSavedDialog$143(this.f16475c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f16474b).lambda$getSavedReactionTags$486(this.f16475c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16474b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f16475c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f16474b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f16475c, (ArrayList) this.e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.f16474b, tLObject, this.f16475c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.ga((org.telegram.ui.ActionBar.n2) this.f16474b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.e, this.f16475c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.o) this.f16474b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f16475c, (Utilities.Callback) this.e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.ga((yh.a4) this.f16474b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.e, tL_error, this.f16475c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((yh.v5) this.f16474b, tLObject, (MessageObject) this.d, this.f16475c, (Runnable) this.e, 10));
                return;
        }
    }

    public ja(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f16473a = i10;
        this.f16474b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f16475c = j3;
    }

    public ja(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f16473a = i10;
        this.f16474b = notificationCenterDelegate;
        this.f16475c = j3;
        this.d = obj;
        this.e = obj2;
    }
}
