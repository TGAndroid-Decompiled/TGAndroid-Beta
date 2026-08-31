package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.xn;
public final class ed implements Runnable {
    public final int f18578a;
    public final long f18579b;
    public final boolean f18580c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f18581e;

    public ed(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z4, boolean z10, long j10, int i10) {
        this.f18578a = i10;
        this.f18581e = notificationCenterDelegate;
        this.f18580c = z4;
        this.d = z10;
        this.f18579b = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f18578a) {
            case 0:
                ((MessagesController) this.f18581e).lambda$setLastCreatedDialogId$55(this.f18580c, this.d, this.f18579b);
                return;
            case 1:
                xn.c1((xn) this.f18581e, this.f18579b, this.f18580c, this.d);
                return;
            case 2:
                th.n nVar = (th.n) this.f18581e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f18580c) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.d) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                org.telegram.ui.Components.z4.v0(nVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new th.h(nVar, this.f18579b, 0));
                return;
            default:
                th.i0.q((th.i0) this.f18581e, this.f18580c, this.d, this.f18579b);
                return;
        }
    }

    public ed(xn xnVar, long j10, boolean z4, boolean z10) {
        this.f18578a = 1;
        this.f18581e = xnVar;
        this.f18579b = j10;
        this.f18580c = z4;
        this.d = z10;
    }
}
