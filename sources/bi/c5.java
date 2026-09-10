package bi;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.me0;
public final class c5 implements Runnable {
    public final int f2410a;
    public final zh.t0 f2411b;

    public c5(zh.t0 t0Var, int i10) {
        this.f2410a = i10;
        this.f2411b = t0Var;
    }

    @Override
    public final void run() {
        switch (this.f2410a) {
            case 0:
                zh.t0 t0Var = this.f2411b;
                if (!t0Var.f48882n) {
                    me0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new org.telegram.ui.web.y1(t0Var, 23));
                    return;
                }
                return;
            case 1:
                this.f2411b.p();
                return;
            case 2:
                this.f2411b.q();
                return;
            case 3:
                this.f2411b.t(true);
                return;
            case 4:
                zh.t0 t0Var2 = this.f2411b;
                NotificationCenter.getInstance(t0Var2.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t0Var2.v.f17205id));
                t0Var2.u(true);
                return;
            case 5:
                this.f2411b.w();
                return;
            case 6:
                this.f2411b.t(true);
                return;
            case 7:
                zh.t0 t0Var3 = this.f2411b;
                if (t0Var3.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = t0Var3.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance, 3));
                    t0Var3.M.clear();
                    t0Var3.E = null;
                }
                t0Var3.k();
                return;
            case 8:
                this.f2411b.t(true);
                return;
            case 9:
                this.f2411b.t(true);
                return;
            case 10:
                zh.t0 t0Var4 = this.f2411b;
                if (t0Var4.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = t0Var4.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.u0(nativeInstance2, 3));
                    t0Var4.M.clear();
                    t0Var4.E = null;
                }
                t0Var4.k();
                return;
            case 11:
                this.f2411b.p();
                return;
            default:
                this.f2411b.q();
                return;
        }
    }
}
