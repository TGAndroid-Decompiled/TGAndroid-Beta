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
public final class ia implements RequestDelegate {
    public final int f17996a;
    public final Object f17997b;
    public final long f17998c;
    public final Object d;
    public final Object f17999e;

    public ia(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f17996a = i10;
        this.f17997b = obj;
        this.d = obj2;
        this.f17998c = j3;
        this.f17999e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17996a) {
            case 0:
                ((MessagesController) this.f17997b).lambda$deleteSavedDialog$143(this.f17998c, (int[]) this.d, (TLRPC.InputPeer) this.f17999e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17997b).lambda$getSavedReactionTags$486(this.f17998c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f17999e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17997b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f17999e, this.f17998c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17997b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f17998c, (ArrayList) this.f17999e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.f17997b, tLObject, this.f17998c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f17999e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.n9((org.telegram.ui.ActionBar.n2) this.f17997b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f17999e, this.f17998c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.o) this.f17997b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f17998c, (Utilities.Callback) this.f17999e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.n9((zh.w3) this.f17997b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f17999e, tL_error, this.f17998c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.s5) this.f17997b, tLObject, (MessageObject) this.d, this.f17998c, (Runnable) this.f17999e, 10));
                return;
        }
    }

    public ia(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f17996a = i10;
        this.f17997b = obj;
        this.d = obj2;
        this.f17999e = obj3;
        this.f17998c = j3;
    }

    public ia(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f17996a = i10;
        this.f17997b = notificationCenterDelegate;
        this.f17998c = j3;
        this.d = obj;
        this.f17999e = obj2;
    }
}
