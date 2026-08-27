package oh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.y4;
import org.telegram.ui.rn;

public final class l implements Runnable {

    public final int f19518a;

    public final boolean f19519b;

    public final boolean f19520c;
    public final long d;

    public final NotificationCenter.NotificationCenterDelegate f19521e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i10) {
        this.f19518a = i10;
        this.f19521e = notificationCenterDelegate;
        this.f19519b = z10;
        this.f19520c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f19518a) {
            case 0:
                o oVar = (o) this.f19521e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f19519b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else {
                    i10 = this.f19520c ? R.string.CommunityMenuRemoveChannelFromCommunityConfirm : R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                y4.v0(oVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                break;
            case 1:
                j0.r((j0) this.f19521e, this.f19519b, this.f19520c, this.d);
                break;
            case 2:
                ((MessagesController) this.f19521e).lambda$setLastCreatedDialogId$55(this.f19519b, this.f19520c, this.d);
                break;
            default:
                rn.c1((rn) this.f19521e, this.d, this.f19519b, this.f19520c);
                break;
        }
    }

    public l(rn rnVar, long j10, boolean z10, boolean z11) {
        this.f19518a = 3;
        this.f19521e = rnVar;
        this.d = j10;
        this.f19519b = z10;
        this.f19520c = z11;
    }
}
