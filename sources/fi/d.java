package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9079a;
    public final c2 f9080b;
    public final long f9081c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j3, boolean z10, int i10) {
        this.f9079a = i10;
        this.e = notificationCenterDelegate;
        this.f9080b = c2Var;
        this.f9081c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9079a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f9080b.dismiss();
                if (j3 != 0) {
                    fVar.f9085a = -j3;
                    fVar.f9086b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9081c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.e, this.f9080b, this.f9081c, this.d, j3);
                return;
        }
    }
}
