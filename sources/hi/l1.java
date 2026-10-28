package hi;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class l1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f13077a;
    public final NotificationCenter.NotificationCenterDelegate[] f13078b;
    public final int f13079c;
    public final j1 d;

    public l1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, j1 j1Var) {
        this.f13077a = j10;
        this.f13078b = notificationCenterDelegateArr;
        this.f13079c = i10;
        this.d = j1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f13077a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f13078b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f13079c).removeObserver(notificationCenterDelegateArr[0], i12);
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
