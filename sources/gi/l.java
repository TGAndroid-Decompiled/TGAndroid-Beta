package gi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g5;
import org.telegram.ui.fo;
public final class l implements Runnable {
    public final int f10209a;
    public final boolean f10210b;
    public final boolean f10211c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f10209a = i10;
        this.e = notificationCenterDelegate;
        this.f10210b = z10;
        this.f10211c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f10209a) {
            case 0:
                p pVar = (p) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f10210b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f10211c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                g5.u0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.s((k0) this.e, this.f10210b, this.f10211c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$54(this.f10210b, this.f10211c, this.d);
                return;
            default:
                fo.F0((fo) this.e, this.d, this.f10210b, this.f10211c);
                return;
        }
    }

    public l(fo foVar, long j10, boolean z10, boolean z11) {
        this.f10209a = 3;
        this.e = foVar;
        this.d = j10;
        this.f10210b = z10;
        this.f10211c = z11;
    }
}
