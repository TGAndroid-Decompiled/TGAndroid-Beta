package hi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.sn;
public final class l implements Runnable {
    public final int f12208a;
    public final boolean f12209b;
    public final boolean f12210c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f12208a = i10;
        this.e = notificationCenterDelegate;
        this.f12209b = z10;
        this.f12210c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12208a) {
            case 0:
                o oVar = (o) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f12209b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f12210c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                f5.v0(oVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                return;
            case 1:
                k0.r((k0) this.e, this.f12209b, this.f12210c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$54(this.f12209b, this.f12210c, this.d);
                return;
            default:
                sn.H0((sn) this.e, this.d, this.f12209b, this.f12210c);
                return;
        }
    }

    public l(sn snVar, long j10, boolean z10, boolean z11) {
        this.f12208a = 3;
        this.e = snVar;
        this.d = j10;
        this.f12209b = z10;
        this.f12210c = z11;
    }
}
