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
    public final int f17969a;
    public final Object f17970b;
    public final long f17971c;
    public final Object d;
    public final Object f17972e;

    public ia(Object obj, Object obj2, long j3, Object obj3, int i10) {
        this.f17969a = i10;
        this.f17970b = obj;
        this.d = obj2;
        this.f17971c = j3;
        this.f17972e = obj3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17969a) {
            case 0:
                ((MessagesController) this.f17970b).lambda$deleteSavedDialog$143(this.f17971c, (int[]) this.d, (TLRPC.InputPeer) this.f17972e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17970b).lambda$getSavedReactionTags$486(this.f17971c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f17972e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17970b).lambda$addUsersToChannel$274((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f17972e, this.f17971c, tLObject, tL_error);
                return;
            case 3:
                ((TopicsController) this.f17970b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f17971c, (ArrayList) this.f17972e, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((org.telegram.ui.ActionBar.b2) this.f17970b, tLObject, this.f17971c, (AccountInstance) this.d, (MessagesStorage.BooleanCallback) this.f17972e, 5));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new bi.n9((org.telegram.ui.ActionBar.n2) this.f17970b, tLObject, (MessagesController.DialogFilter) this.d, tL_error, (Runnable) this.f17972e, this.f17971c, 3));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.o) this.f17970b, (org.telegram.ui.ActionBar.b2) this.d, tLObject, this.f17971c, (Utilities.Callback) this.f17972e));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new bi.n9((zh.w3) this.f17970b, tLObject, (String) this.d, (TL_stars.InputSavedStarGift) this.f17972e, tL_error, this.f17971c, 4));
                return;
            default:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.f((zh.s5) this.f17970b, tLObject, (MessageObject) this.d, this.f17971c, (Runnable) this.f17972e, 10));
                return;
        }
    }

    public ia(Object obj, Object obj2, Object obj3, long j3, int i10) {
        this.f17969a = i10;
        this.f17970b = obj;
        this.d = obj2;
        this.f17972e = obj3;
        this.f17971c = j3;
    }

    public ia(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, long j3, Object obj, Object obj2, int i10) {
        this.f17969a = i10;
        this.f17970b = notificationCenterDelegate;
        this.f17971c = j3;
        this.d = obj;
        this.f17972e = obj2;
    }
}
