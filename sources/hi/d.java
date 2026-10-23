package hi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;
public final class d implements MessagesStorage.LongCallback {
    public final int f12165a;
    public final c2 f12166b;
    public final long f12167c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i10) {
        this.f12165a = i10;
        this.e = notificationCenterDelegate;
        this.f12166b = c2Var;
        this.f12167c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f12165a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f12166b.dismiss();
                if (j10 != 0) {
                    fVar.f12172b = -j10;
                    fVar.f12173c = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.f12167c, this.d);
                    return;
                }
                return;
            default:
                k0.q((k0) this.e, this.f12166b, this.f12167c, this.d, j10);
                return;
        }
    }
}
