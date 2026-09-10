package ei;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.d2;
public final class d implements MessagesStorage.LongCallback {
    public final int f7536a;
    public final d2 f7537b;
    public final long f7538c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, d2 d2Var, long j3, boolean z10, int i10) {
        this.f7536a = i10;
        this.e = notificationCenterDelegate;
        this.f7537b = d2Var;
        this.f7538c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f7536a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f7537b.dismiss();
                if (j3 != 0) {
                    fVar.f7542a = -j3;
                    fVar.f7543b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f7538c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.e, this.f7537b, this.f7538c, this.d, j3);
                return;
        }
    }
}
