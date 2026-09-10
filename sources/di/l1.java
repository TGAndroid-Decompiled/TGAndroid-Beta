package di;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class l1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f6745a;
    public final NotificationCenter.NotificationCenterDelegate[] f6746b;
    public final int f6747c;
    public final i1 d;

    public l1(long j3, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, i1 i1Var) {
        this.f6745a = j3;
        this.f6746b = notificationCenterDelegateArr;
        this.f6747c = i10;
        this.d = i1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.i iVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (iVar = (a0.i) objArr[0]) != null) {
            long j3 = this.f6745a;
            if (iVar.d(j3)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.f(j3);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f6746b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f6747c).addObserver(notificationCenterDelegateArr[0], i12);
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
