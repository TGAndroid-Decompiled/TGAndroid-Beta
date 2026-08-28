package nh;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.ui.Components.y4;
import org.telegram.ui.qn;
public final class l implements Runnable {
    public final int f18669a;
    public final boolean f18670b;
    public final boolean f18671c;
    public final long d;
    public final NotificationCenter.NotificationCenterDelegate f18672e;

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, boolean z10, boolean z11, long j10, int i9) {
        this.f18669a = i9;
        this.f18672e = notificationCenterDelegate;
        this.f18670b = z10;
        this.f18671c = z11;
        this.d = j10;
    }

    @Override
    public final void run() {
        int i9;
        switch (this.f18669a) {
            case 0:
                o oVar = (o) this.f18672e;
                String string = LocaleController.getString(R.string.CommunityMenuRemoveFromCommunity);
                if (this.f18670b) {
                    i9 = R.string.CommunityMenuRemoveBotFromCommunityConfirm;
                } else if (this.f18671c) {
                    i9 = R.string.CommunityMenuRemoveChannelFromCommunityConfirm;
                } else {
                    i9 = R.string.CommunityMenuRemoveGroupFromCommunityConfirm;
                }
                y4.v0(oVar, string, LocaleController.getString(i9), LocaleController.getString(R.string.Remove), true, new g(oVar, this.d, 0));
                return;
            case 1:
                j0.q((j0) this.f18672e, this.f18670b, this.f18671c, this.d);
                return;
            case 2:
                ((MessagesController) this.f18672e).lambda$setLastCreatedDialogId$55(this.f18670b, this.f18671c, this.d);
                return;
            default:
                qn.c1((qn) this.f18672e, this.d, this.f18670b, this.f18671c);
                return;
        }
    }

    public l(qn qnVar, long j10, boolean z10, boolean z11) {
        this.f18669a = 3;
        this.f18672e = qnVar;
        this.d = j10;
        this.f18670b = z10;
        this.f18671c = z11;
    }
}
