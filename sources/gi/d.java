package gi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;
public final class d implements MessagesStorage.LongCallback {
    public final int f10171a;
    public final a2 f10172b;
    public final long f10173c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j10, boolean z10, int i10) {
        this.f10171a = i10;
        this.e = notificationCenterDelegate;
        this.f10172b = a2Var;
        this.f10173c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f10171a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f10172b.dismiss();
                if (j10 != 0) {
                    fVar.f10177a = -j10;
                    fVar.f10178b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.f10173c, this.d);
                    return;
                }
                return;
            default:
                k0.r((k0) this.e, this.f10172b, this.f10173c, this.d, j10);
                return;
        }
    }
}
