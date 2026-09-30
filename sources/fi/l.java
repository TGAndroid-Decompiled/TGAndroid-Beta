package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.wn;
public final class l implements Runnable {
    public final int f9128a;
    public final boolean f9129b;
    public final boolean f9130c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f9128a = i10;
        this.e = notificationCenterDelegate;
        this.f9129b = z10;
        this.f9130c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9128a) {
            case 0:
                p pVar = (p) this.e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f9129b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f9130c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                e5.v0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.q((k0) this.e, this.f9129b, this.f9130c, this.d);
                return;
            case 2:
                ((MessagesController) this.e).lambda$setLastCreatedDialogId$55(this.f9129b, this.f9130c, this.d);
                return;
            default:
                wn.P0((wn) this.e, this.d, this.f9129b, this.f9130c);
                return;
        }
    }

    public l(wn wnVar, long j3, boolean z10, boolean z11) {
        this.f9128a = 3;
        this.e = wnVar;
        this.d = j3;
        this.f9129b = z10;
        this.f9130c = z11;
    }
}
