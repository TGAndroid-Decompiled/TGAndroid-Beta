package mh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
public final class e1 implements NotificationCenter.NotificationCenterDelegate {
    public final long f17814a;
    public final NotificationCenter.NotificationCenterDelegate[] f17815b;
    public final int f17816c;
    public final c1 d;

    public e1(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i9, c1 c1Var) {
        this.f17814a = j10;
        this.f17815b = notificationCenterDelegateArr;
        this.f17816c = i9;
        this.d = c1Var;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        a0.h hVar;
        int i11 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i9 == i11 && (hVar = (a0.h) objArr[0]) != null) {
            long j10 = this.f17814a;
            if (hVar.d(j10)) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
                NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.f17815b;
                if (notificationCenterDelegateArr[0] != null) {
                    NotificationCenter.getInstance(this.f17816c).addObserver(notificationCenterDelegateArr[0], i11);
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
