package fi;

import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.b2;
public final class d implements MessagesStorage.LongCallback {
    public final int f9953a;
    public final b2 f9954b;
    public final long f9955c;
    public final boolean d;
    public final NotificationCenter.NotificationCenterDelegate f9956e;

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, b2 b2Var, long j3, boolean z10, int i10) {
        this.f9953a = i10;
        this.f9956e = notificationCenterDelegate;
        this.f9954b = b2Var;
        this.f9955c = j3;
        this.d = z10;
    }

    @Override
    public final void run(long j3) {
        switch (this.f9953a) {
            case 0:
                f fVar = (f) this.f9956e;
                fVar.getClass();
                this.f9954b.dismiss();
                if (j3 != 0) {
                    fVar.f9960a = -j3;
                    fVar.f9961b = fVar.getMessagesController().getChat(Long.valueOf(j3));
                    fVar.W(this.f9955c, this.d);
                    return;
                }
                return;
            default:
                k0.r((k0) this.f9956e, this.f9954b, this.f9955c, this.d, j3);
                return;
        }
    }
}
