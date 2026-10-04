package ei;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class j1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9115a;
    public final NotificationCenter.NotificationCenterDelegate[] f9116b;
    public final int f9117c;
    public final g1 d;

    public j1(long j3, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, g1 g1Var) {
        this.f9115a = j3;
        this.f9116b = notificationCenterDelegateArr;
        this.f9117c = i10;
        this.d = g1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.i iVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (iVar = (a0.i) objArr[0]) != null) {
            long j3 = this.f9115a;
            if (iVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.f(j3);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f9116b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f9117c).addObserver(notificationCenterDelegateArr[0], i12);
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
