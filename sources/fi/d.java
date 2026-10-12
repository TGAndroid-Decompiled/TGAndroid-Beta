package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9951a;
    public final a2 f9952b;
    public final long f9953c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f9954e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j3, boolean z10, int i10) {
        this.f9951a = i10;
        this.f9954e = notificationCenterDelegate;
        this.f9952b = a2Var;
        this.f9953c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9951a) {
            case 0:
                f fVar = (f) this.f9954e;
                fVar.getClass();
                this.f9952b.dismiss();
                if (j3 != 0) {
                    fVar.f9958a = -j3;
                    fVar.f9959b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9953c, this.d);
                    return;
                }
                return;
            default:
                k0.r((k0) this.f9954e, this.f9952b, this.f9953c, this.d, j3);
                return;
        }
    }
}
