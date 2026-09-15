package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9087a;
    public final b2 f9088b;
    public final long f9089c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f9087a = i10;
        this.e = notificationCenterDelegate;
        this.f9088b = b2Var;
        this.f9089c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9087a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f9088b.dismiss();
                if (j3 != 0) {
                    fVar.f9093a = -j3;
                    fVar.f9094b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9089c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.e, this.f9088b, this.f9089c, this.d, j3);
                return;
        }
    }
}
