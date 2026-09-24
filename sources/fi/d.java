package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9074a;
    public final a2 f9075b;
    public final long f9076c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j3, boolean z10, int i10) {
        this.f9074a = i10;
        this.e = notificationCenterDelegate;
        this.f9075b = a2Var;
        this.f9076c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9074a) {
            case 0:
                f fVar = (f) this.e;
                fVar.getClass();
                this.f9075b.dismiss();
                if (j3 != 0) {
                    fVar.f9080a = -j3;
                    fVar.f9081b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9076c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.e, this.f9075b, this.f9076c, this.d, j3);
                return;
        }
    }
}
