package gi;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class e1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f11174a;
    public final NotificationCenter.NotificationCenterDelegate[] f11175b;
    public final int f11176c;
    public final c1 d;

    public e1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, c1 c1Var) {
        this.f11174a = j10;
        this.f11175b = notificationCenterDelegateArr;
        this.f11176c = i10;
        this.d = c1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f11174a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f11175b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f11176c).addObserver(notificationCenterDelegateArr[0], i12);
                    notificationCenterDelegateArr[0] = null;
                }
                if (!(webPage instanceof TLRPC.TL_webPage)) {
                    webPage = null;
                }
                this.d.run(webPage);
            }
        }
    }
}
