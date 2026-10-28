package ii;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g5;
import org.telegram.ui.wn;
public final class l implements Runnable {
    public final int f14375a;
    public final boolean f14376b;
    public final boolean f14377c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f14375a = i10;
        this.e = notificationCenterDelegate;
        this.f14376b = z10;
        this.f14377c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f14375a) {
            case 0:
                o oVar = (o) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f14376b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f14377c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                g5.u0(oVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                return;
            case 1:
                j0.q((j0) this.e, this.f14376b, this.f14377c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$54(this.f14376b, this.f14377c, this.d);
                return;
            default:
                wn.i1((wn) this.e, this.d, this.f14376b, this.f14377c);
                return;
        }
    }

    public l(wn wnVar, long j10, boolean z10, boolean z11) {
        this.f14375a = 3;
        this.e = wnVar;
        this.d = j10;
        this.f14376b = z10;
        this.f14377c = z11;
    }
}
