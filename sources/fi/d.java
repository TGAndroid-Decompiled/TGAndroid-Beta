package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.a2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9952a;
    public final a2 f9953b;
    public final long f9954c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f9955e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, a2 a2Var, long j3, boolean z10, int i10) {
        this.f9952a = i10;
        this.f9955e = notificationCenterDelegate;
        this.f9953b = a2Var;
        this.f9954c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9952a) {
            case 0:
                f fVar = (f) this.f9955e;
                fVar.getClass();
                this.f9953b.dismiss();
                if (j3 != 0) {
                    fVar.f9959a = -j3;
                    fVar.f9960b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9954c, this.d);
                    return;
                }
                return;
            default:
                k0.r((k0) this.f9955e, this.f9953b, this.f9954c, this.d, j3);
                return;
        }
    }
}
