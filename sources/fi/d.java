package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9877a;
    public final b2 f9878b;
    public final long f9879c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f9880e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f9877a = i10;
        this.f9880e = notificationCenterDelegate;
        this.f9878b = b2Var;
        this.f9879c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9877a) {
            case 0:
                f fVar = (f) this.f9880e;
                fVar.getClass();
                this.f9878b.dismiss();
                if (j3 != 0) {
                    fVar.f9884a = -j3;
                    fVar.f9885b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.U(this.f9879c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.f9880e, this.f9878b, this.f9879c, this.d, j3);
                return;
        }
    }
}
