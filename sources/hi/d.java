package hi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f12136a;
    public final b2 f12137b;
    public final long f12138c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j10, boolean z10, int i10) {
        this.f12136a = i10;
        this.e = notificationCenterDelegate;
        this.f12137b = b2Var;
        this.f12138c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f12136a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f12137b.dismiss();
                if (j10 != 0) {
                    fVar.f12142a = -j10;
                    fVar.f12143b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.f12138c, this.d);
                    return;
                }
                return;
            default:
                k0.q((k0) this.e, this.f12137b, this.f12138c, this.d, j10);
                return;
        }
    }
}
