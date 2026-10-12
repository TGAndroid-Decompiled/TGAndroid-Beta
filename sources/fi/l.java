package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g5;
import org.telegram.ui.eo;
public final class l implements Runnable {
    public final int f9998a;
    public final boolean f9999b;
    public final boolean f10000c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate f10001e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f9998a = i10;
        this.f10001e = notificationCenterDelegate;
        this.f9999b = z10;
        this.f10000c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f9998a) {
            case 0:
                p pVar = (p) this.f10001e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f9999b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f10000c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                g5.u0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.s((k0) this.f10001e, this.f9999b, this.f10000c, this.d);
                return;
            case 2:
                ((MessagesController) this.f10001e).lambda$setLastCreatedDialogId$54(this.f9999b, this.f10000c, this.d);
                return;
            default:
                eo.F0((eo) this.f10001e, this.d, this.f9999b, this.f10000c);
                return;
        }
    }

    public l(eo eoVar, long j3, boolean z10, boolean z11) {
        this.f9998a = 3;
        this.f10001e = eoVar;
        this.d = j3;
        this.f9999b = z10;
        this.f10000c = z11;
    }
}
