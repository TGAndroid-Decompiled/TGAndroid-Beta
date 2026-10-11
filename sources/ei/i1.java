package ei;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class i1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9114a;
    public final NotificationCenter.NotificationCenterDelegate[] f9115b;
    public final int f9116c;
    public final f1 d;

    public i1(long j3, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, f1 f1Var) {
        this.f9114a = j3;
        this.f9115b = notificationCenterDelegateArr;
        this.f9116c = i10;
        this.d = f1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.i iVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (iVar = (a0.i) objArr[0]) != null) {
            long j3 = this.f9114a;
            if (iVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.f(j3);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f9115b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f9116c).addObserver(notificationCenterDelegateArr[0], i12);
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
