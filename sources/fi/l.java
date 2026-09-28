package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.wn;
public final class l implements Runnable {
    public final int f9116a;
    public final boolean f9117b;
    public final boolean f9118c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f9116a = i10;
        this.e = notificationCenterDelegate;
        this.f9117b = z10;
        this.f9118c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9116a) {
            case 0:
                p pVar = (p) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f9117b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f9118c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                e5.v0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.q((k0) this.e, this.f9117b, this.f9118c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f9117b, this.f9118c, this.d);
                return;
            default:
                wn.P0((wn) this.e, this.d, this.f9117b, this.f9118c);
                return;
        }
    }

    public l(wn wnVar, long j3, boolean z10, boolean z11) {
        this.f9116a = 3;
        this.e = wnVar;
        this.d = j3;
        this.f9117b = z10;
        this.f9118c = z11;
    }
}
