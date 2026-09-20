package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.zn;
public final class l implements Runnable {
    public final int f9134a;
    public final boolean f9135b;
    public final boolean f9136c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f9134a = i10;
        this.e = notificationCenterDelegate;
        this.f9135b = z10;
        this.f9136c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9134a) {
            case 0:
                p pVar = (p) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f9135b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f9136c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                d5.v0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.q((k0) this.e, this.f9135b, this.f9136c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f9135b, this.f9136c, this.d);
                return;
            default:
                zn.Q0((zn) this.e, this.d, this.f9135b, this.f9136c);
                return;
        }
    }

    public l(zn znVar, long j3, boolean z10, boolean z11) {
        this.f9134a = 3;
        this.e = znVar;
        this.d = j3;
        this.f9135b = z10;
        this.f9136c = z11;
    }
}
