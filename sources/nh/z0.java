package nh;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ge0;
public final class z0 implements Runnable {
    public final int f16105a;
    public final e1 f16106b;

    public z0(e1 e1Var, int i10) {
        this.f16105a = i10;
        this.f16106b = e1Var;
    }

    @Override
    public final void run() {
        switch (this.f16105a) {
            case 0:
                this.f16106b.p();
                return;
            case 1:
                this.f16106b.q();
                return;
            case 2:
                this.f16106b.t(true);
                return;
            case 3:
                e1 e1Var = this.f16106b;
                NotificationCenter.getInstance(e1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(e1Var.v.f19194id));
                e1Var.u(true);
                return;
            case 4:
                this.f16106b.w();
                return;
            case 5:
                this.f16106b.t(true);
                return;
            case 6:
                e1 e1Var2 = this.f16106b;
                if (e1Var2.B != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = e1Var2.B;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance, 4));
                    e1Var2.J.clear();
                    e1Var2.B = null;
                }
                e1Var2.k();
                return;
            case 7:
                this.f16106b.t(true);
                return;
            case 8:
                this.f16106b.t(true);
                return;
            case 9:
                e1 e1Var3 = this.f16106b;
                if (e1Var3.B != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = e1Var3.B;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.s0(nativeInstance2, 4));
                    e1Var3.J.clear();
                    e1Var3.B = null;
                }
                e1Var3.k();
                return;
            case 10:
                this.f16106b.p();
                return;
            case 11:
                this.f16106b.q();
                return;
            default:
                e1 e1Var4 = this.f16106b;
                if (!e1Var4.f15296n) {
                    ge0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new cg.h0(e1Var4, 24));
                    return;
                }
                return;
        }
    }
}
