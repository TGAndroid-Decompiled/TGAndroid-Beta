package nh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c2;
public final class d implements MessagesStorage.LongCallback {
    public final int f18619a;
    public final c2 f18620b;
    public final long f18621c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f18622e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, c2 c2Var, long j10, boolean z10, int i9) {
        this.f18619a = i9;
        this.f18622e = notificationCenterDelegate;
        this.f18620b = c2Var;
        this.f18621c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f18619a) {
            case 0:
                f fVar = (f) this.f18622e;
                fVar.getClass();
                this.f18620b.dismiss();
                if (j10 != 0) {
                    fVar.f18628a = -j10;
                    fVar.f18629b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.V(this.f18621c, this.d);
                    return;
                }
                return;
            default:
                j0.p((j0) this.f18622e, this.f18620b, this.f18621c, this.d, j10);
                return;
        }
    }
}
