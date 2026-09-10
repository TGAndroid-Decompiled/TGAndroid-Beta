package ei;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d5;
import org.telegram.ui.eo;
public final class l implements Runnable {
    public final int f7578a;
    public final boolean f7579b;
    public final boolean f7580c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f7578a = i10;
        this.e = notificationCenterDelegate;
        this.f7579b = z10;
        this.f7580c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f7578a) {
            case 0:
                p pVar = (p) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f7579b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f7580c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                d5.v0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.q((k0) this.e, this.f7579b, this.f7580c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f7579b, this.f7580c, this.d);
                return;
            default:
                eo.c1((eo) this.e, this.d, this.f7579b, this.f7580c);
                return;
        }
    }

    public l(eo eoVar, long j3, boolean z10, boolean z11) {
        this.f7578a = 3;
        this.e = eoVar;
        this.d = j3;
        this.f7579b = z10;
        this.f7580c = z11;
    }
}
