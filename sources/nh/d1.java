package nh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

public final class d1 implements NotificationCenter.NotificationCenterDelegate {

    public final long f18631a;

    public final NotificationCenter.NotificationCenterDelegate[] f18632b;

    public final int f18633c;
    public final b1 d;

    public d1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, b1 b1Var) {
        this.f18631a = j10;
        this.f18632b = notificationCenterDelegateArr;
        this.f18633c = i10;
        this.d = b1Var;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 != i12 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.f18631a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f18632b;
            if (notificationCenterDelegateArr[0] != null) {
                NotificationCenter.getInstance(this.f18633c).addObserver(notificationCenterDelegateArr[0], i12);
                notificationCenterDelegateArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.run(webPage);
        }
    }
}
