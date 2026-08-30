package org.telegram.messenger;

import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.xn;
public final class ed implements Runnable {
    public final int f17137a;
    public final long f17138b;
    public final boolean f17139c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public ed(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z4, boolean z10, long j10, int i10) {
        this.f17137a = i10;
        this.e = notificationCenterDelegate;
        this.f17139c = z4;
        this.d = z10;
        this.f17138b = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f17137a) {
            case 0:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f17139c, this.d, this.f17138b);
                return;
            case 1:
                xn.c1((xn) this.e, this.f17138b, this.f17139c, this.d);
                return;
            case 2:
                sh.n nVar = (sh.n) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f17139c) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.d) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                org.telegram.ui.Components.z4.v0(nVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new sh.h(nVar, this.f17138b, 0));
                return;
            default:
                sh.i0.q((sh.i0) this.e, this.f17139c, this.d, this.f17138b);
                return;
        }
    }

    public ed(xn xnVar, long j10, boolean z4, boolean z10) {
        this.f17137a = 1;
        this.e = xnVar;
        this.f17138b = j10;
        this.f17139c = z4;
        this.d = z10;
    }
}
