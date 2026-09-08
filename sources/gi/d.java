package gi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f10700a;
    public final b2 f10701b;
    public final long f10702c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f10703e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f10700a = i10;
        this.f10703e = notificationCenterDelegate;
        this.f10701b = b2Var;
        this.f10702c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f10700a) {
            case 0:
                f fVar = (f) this.f10703e;
                fVar.getClass();
                this.f10701b.dismiss();
                if (j3 != 0) {
                    fVar.f10707a = -j3;
                    fVar.f10708b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f10702c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.f10703e, this.f10701b, this.f10702c, this.d, j3);
                return;
        }
    }
}
