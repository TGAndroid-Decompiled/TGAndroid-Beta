package hi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f5;
import org.telegram.ui.qn;
public final class l implements Runnable {
    public final int f12177a;
    public final boolean f12178b;
    public final boolean f12179c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f12177a = i10;
        this.e = notificationCenterDelegate;
        this.f12178b = z10;
        this.f12179c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f12177a) {
            case 0:
                o oVar = (o) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f12178b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f12179c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                f5.u0(oVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                return;
            case 1:
                k0.s((k0) this.e, this.f12178b, this.f12179c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$54(this.f12178b, this.f12179c, this.d);
                return;
            default:
                qn.F0((qn) this.e, this.d, this.f12178b, this.f12179c);
                return;
        }
    }

    public l(qn qnVar, long j10, boolean z10, boolean z11) {
        this.f12177a = 3;
        this.e = qnVar;
        this.d = j10;
        this.f12178b = z10;
        this.f12179c = z11;
    }
}
