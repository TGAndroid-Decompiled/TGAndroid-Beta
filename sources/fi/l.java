package fi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g5;
import org.telegram.ui.zn;
public final class l implements Runnable {
    public final int f10000a;
    public final boolean f10001b;
    public final boolean f10002c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate f10003e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f10000a = i10;
        this.f10003e = notificationCenterDelegate;
        this.f10001b = z10;
        this.f10002c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f10000a) {
            case 0:
                p pVar = (p) this.f10003e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f10001b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f10002c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                g5.u0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.s((k0) this.f10003e, this.f10001b, this.f10002c, this.d);
                return;
            case 2:
                ((MessagesController) this.f10003e).lambda$setLastCreatedDialogId$54(this.f10001b, this.f10002c, this.d);
                return;
            default:
                zn.F0((zn) this.f10003e, this.d, this.f10001b, this.f10002c);
                return;
        }
    }

    public l(zn znVar, long j3, boolean z10, boolean z11) {
        this.f10000a = 3;
        this.f10003e = znVar;
        this.d = j3;
        this.f10001b = z10;
        this.f10002c = z11;
    }
}
