package gi;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e5;
import org.telegram.ui.co;
public final class l implements Runnable {
    public final int f10719a;
    public final boolean f10720b;
    public final boolean f10721c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate f10722e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j3, int i10) {
        this.f10719a = i10;
        this.f10722e = notificationCenterDelegate;
        this.f10720b = z10;
        this.f10721c = z11;
        this.d = j3;
    }

    @Override
    public final void run() {
        int i10;
        switch (this.f10719a) {
            case 0:
                p pVar = (p) this.f10722e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f10720b) {
                    i10 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f10721c) {
                    i10 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i10 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                e5.v0(pVar, string, LocaleController.getString(i10), LocaleController.getString(R.string.Remove), true, new g(pVar, this.d, 0));
                return;
            case 1:
                k0.q((k0) this.f10722e, this.f10720b, this.f10721c, this.d);
                return;
            case 2:
                ((MessagesController) this.f10722e).lambda$setLastCreatedDialogId$55(this.f10720b, this.f10721c, this.d);
                return;
            default:
                co.c1((co) this.f10722e, this.d, this.f10720b, this.f10721c);
                return;
        }
    }

    public l(co coVar, long j3, boolean z10, boolean z11) {
        this.f10719a = 3;
        this.f10722e = coVar;
        this.d = j3;
        this.f10720b = z10;
        this.f10721c = z11;
    }
}
