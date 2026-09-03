package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.zn;
public final class ed implements Runnable {
    public final int f17122a;
    public final long f17123b;
    public final boolean f17124c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ed(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z4, boolean z10, long j10, int i10) {
        this.f17122a = i10;
        this.e = notificationCenterDelegate;
        this.f17124c = z4;
        this.d = z10;
        this.f17123b = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17122a) {
            case 0:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f17124c, this.d, this.f17123b);
                return;
            case 1:
                zn.c1((zn) this.e, this.f17123b, this.f17124c, this.d);
                return;
            case 2:
                sh.n nVar = (sh.n) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f17124c) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.d) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                org.telegram.ui.Components.z4.v0(nVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new sh.h(nVar, this.f17123b, 0));
                return;
            default:
                sh.i0.q((sh.i0) this.e, this.f17124c, this.d, this.f17123b);
                return;
        }
    }

    public ed(zn znVar, long j10, boolean z4, boolean z10) {
        this.f17122a = 1;
        this.e = znVar;
        this.f17123b = j10;
        this.f17124c = z4;
        this.d = z10;
    }
}
