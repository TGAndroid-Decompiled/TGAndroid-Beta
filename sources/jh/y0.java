package jh;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.pd0;

public final class y0 implements Runnable {

    public final int f14145a;

    public final d1 f14146b;

    public y0(d1 d1Var, int i10) {
        this.f14145a = i10;
        this.f14146b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f14145a) {
            case 0:
                this.f14146b.p();
                break;
            case 1:
                this.f14146b.q();
                break;
            case 2:
                this.f14146b.t(true);
                break;
            case 3:
                d1 d1Var = this.f14146b;
                NotificationCenter.getInstance(d1Var.f13177e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.v.f22390id));
                d1Var.u(true);
                break;
            case 4:
                this.f14146b.w();
                break;
            case 5:
                this.f14146b.t(true);
                break;
            case 6:
                d1 d1Var2 = this.f14146b;
                if (d1Var2.A != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = d1Var2.A;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                    d1Var2.I.clear();
                    d1Var2.A = null;
                }
                d1Var2.k();
                break;
            case 7:
                this.f14146b.t(true);
                break;
            case 8:
                this.f14146b.t(true);
                break;
            case 9:
                d1 d1Var3 = this.f14146b;
                if (d1Var3.A != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = d1Var3.A;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                    d1Var3.I.clear();
                    d1Var3.A = null;
                }
                d1Var3.k();
                break;
            case 10:
                this.f14146b.p();
                break;
            case 11:
                this.f14146b.q();
                break;
            default:
                d1 d1Var4 = this.f14146b;
                if (!d1Var4.f13179n) {
                    pd0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ag.n0(d1Var4, 19));
                    break;
                }
                break;
        }
    }
}
