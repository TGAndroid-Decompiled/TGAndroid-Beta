package oh;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;

public final class d implements MessagesStorage.LongCallback {

    public final int f19468a;

    public final b2 f19469b;

    public final long f19470c;
    public final boolean d;

    public final NotificationCenter.NotificationCenterDelegate f19471e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j10, boolean z10, int i10) {
        this.f19468a = i10;
        this.f19471e = notificationCenterDelegate;
        this.f19469b = b2Var;
        this.f19470c = j10;
        this.d = z10;
    }

    @Override
    public final void run(long j10) {
        switch (this.f19468a) {
            case 0:
                f fVar = (f) this.f19471e;
                fVar.getClass();
                this.f19469b.dismiss();
                if (j10 != 0) {
                    fVar.f19477a = -j10;
                    fVar.f19478b = fVar.getMessagesController().getChat(Long.valueOf(j10));
                    fVar.W(this.f19470c, this.d);
                    break;
                }
                break;
            default:
                j0.q((j0) this.f19471e, this.f19469b, this.f19470c, this.d, j10);
                break;
        }
    }
}
