package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9878a;
    public final b2 f9879b;
    public final long f9880c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f9881e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f9878a = i10;
        this.f9881e = notificationCenterDelegate;
        this.f9879b = b2Var;
        this.f9880c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9878a) {
            case 0:
                f fVar = (f) this.f9881e;
                fVar.getClass();
                this.f9879b.dismiss();
                if (j3 != 0) {
                    fVar.f9885a = -j3;
                    fVar.f9886b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.U(this.f9880c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.f9881e, this.f9879b, this.f9880c, this.d, j3);
                return;
        }
    }
}
