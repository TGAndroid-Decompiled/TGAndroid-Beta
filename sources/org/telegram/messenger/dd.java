package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.tn;
public final class dd implements Runnable {
    public final int f20036a;
    public final long f20037b;
    public final boolean f20038c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f20039e;

    public dd(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f20036a = i10;
        this.f20039e = notificationCenterDelegate;
        this.f20038c = z10;
        this.d = z11;
        this.f20037b = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f20036a) {
            case 0:
                ((MessagesController) this.f20039e).lambda$setLastCreatedDialogId$55(this.f20038c, this.d, this.f20037b);
                return;
            case 1:
                tn.c1((tn) this.f20039e, this.f20037b, this.f20038c, this.d);
                return;
            case 2:
                qh.n nVar = (qh.n) this.f20039e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f20038c) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.d) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                org.telegram.ui.Components.c5.v0(nVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new qh.h(nVar, this.f20037b, 0));
                return;
            default:
                qh.i0.q((qh.i0) this.f20039e, this.f20038c, this.d, this.f20037b);
                return;
        }
    }

    public dd(tn tnVar, long j10, boolean z10, boolean z11) {
        this.f20036a = 1;
        this.f20039e = tnVar;
        this.f20037b = j10;
        this.f20038c = z10;
        this.d = z11;
    }
}
