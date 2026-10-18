package hi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f12138a;
    public final b2 f12139b;
    public final long f12140c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j10, boolean z10, int i10) {
        this.f12138a = i10;
        this.e = notificationCenterDelegate;
        this.f12139b = b2Var;
        this.f12140c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f12138a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f12139b.dismiss();
                if (j10 != 0) {
                    fVar.f12144a = -j10;
                    fVar.f12145b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.f12140c, this.d);
                    return;
                }
                return;
            default:
                k0.q((k0) this.e, this.f12139b, this.f12140c, this.d, j10);
                return;
        }
    }
}
