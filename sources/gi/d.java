package gi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f10672a;
    public final b2 f10673b;
    public final long f10674c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f10675e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f10672a = i10;
        this.f10675e = notificationCenterDelegate;
        this.f10673b = b2Var;
        this.f10674c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f10672a) {
            case 0:
                f fVar = (f) this.f10675e;
                fVar.getClass();
                this.f10673b.dismiss();
                if (j3 != 0) {
                    fVar.f10679a = -j3;
                    fVar.f10680b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f10674c, this.d);
                    return;
                }
                return;
            default:
                k0.p((k0) this.f10675e, this.f10673b, this.f10674c, this.d, j3);
                return;
        }
    }
}
