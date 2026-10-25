package ii;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.e2;
public final class d implements MessagesStorage.LongCallback {
    public final int f14330a;
    public final e2 f14331b;
    public final long f14332c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, e2 e2Var, long j10, boolean z10, int i10) {
        this.f14330a = i10;
        this.e = notificationCenterDelegate;
        this.f14331b = e2Var;
        this.f14332c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f14330a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f14331b.dismiss();
                if (j10 != 0) {
                    fVar.f14339b = -j10;
                    fVar.f14340c = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.X(this.f14332c, this.d);
                    return;
                }
                return;
            default:
                j0.p((j0) this.e, this.f14331b, this.f14332c, this.d, j10);
                return;
        }
    }
}
