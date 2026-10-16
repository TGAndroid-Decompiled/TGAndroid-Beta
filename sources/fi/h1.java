package fi;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class h1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f9307a;
    public final NotificationCenter.NotificationCenterDelegate[] f9308b;
    public final int f9309c;
    public final e1 d;

    public h1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, e1 e1Var) {
        this.f9307a = j10;
        this.f9308b = notificationCenterDelegateArr;
        this.f9309c = i10;
        this.d = e1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 == i12 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f9307a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f9308b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f9309c).addObserver(notificationCenterDelegateArr[0], i12);
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
