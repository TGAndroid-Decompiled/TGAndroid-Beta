package lh;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.yd0;
public final class y0 implements Runnable {
    public final int f16410a;
    public final d1 f16411b;

    public y0(d1 d1Var, int i10) {
        this.f16410a = i10;
        this.f16411b = d1Var;
    }

    @Override
    public final void run() {
        switch (this.f16410a) {
            case 0:
                this.f16411b.p();
                return;
            case 1:
                this.f16411b.q();
                return;
            case 2:
                this.f16411b.t(true);
                return;
            case 3:
                d1 d1Var = this.f16411b;
                NotificationCenter.getInstance(d1Var.f15456e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d1Var.v.f22402id));
                d1Var.u(true);
                return;
            case 4:
                this.f16411b.w();
                return;
            case 5:
                this.f16411b.t(true);
                return;
            case 6:
                d1 d1Var2 = this.f16411b;
                if (d1Var2.A != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = d1Var2.A;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                    d1Var2.I.clear();
                    d1Var2.A = null;
                }
                d1Var2.k();
                return;
            case 7:
                this.f16411b.t(true);
                return;
            case 8:
                this.f16411b.t(true);
                return;
            case 9:
                d1 d1Var3 = this.f16411b;
                if (d1Var3.A != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = d1Var3.A;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                    d1Var3.I.clear();
                    d1Var3.A = null;
                }
                d1Var3.k();
                return;
            case 10:
                this.f16411b.p();
                return;
            case 11:
                this.f16411b.q();
                return;
            default:
                d1 d1Var4 = this.f16411b;
                if (!d1Var4.f15458n) {
                    yd0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ag.i0(d1Var4, 24));
                    return;
                }
                return;
        }
    }
}
