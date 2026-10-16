package bi;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.df0;
public final class k1 implements Runnable {
    public final int f3228a;
    public final t1 f3229b;

    public k1(t1 t1Var, int i10) {
        this.f3228a = i10;
        this.f3229b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f3228a) {
            case 0:
                this.f3229b.p();
                return;
            case 1:
                this.f3229b.q();
                return;
            case 2:
                this.f3229b.t(true);
                return;
            case 3:
                t1 t1Var = this.f3229b;
                NotificationCenter.getInstance(t1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.v.f18926id));
                t1Var.u(true);
                return;
            case 4:
                this.f3229b.w();
                return;
            case 5:
                this.f3229b.t(true);
                return;
            case 6:
                t1 t1Var2 = this.f3229b;
                if (t1Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = t1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance, 3));
                    t1Var2.M.clear();
                    t1Var2.E = null;
                }
                t1Var2.k();
                return;
            case 7:
                this.f3229b.t(true);
                return;
            case 8:
                this.f3229b.t(true);
                return;
            case 9:
                t1 t1Var3 = this.f3229b;
                if (t1Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = t1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.t0(nativeInstance2, 3));
                    t1Var3.M.clear();
                    t1Var3.E = null;
                }
                t1Var3.k();
                return;
            case 10:
                this.f3229b.p();
                return;
            case 11:
                this.f3229b.q();
                return;
            default:
                t1 t1Var4 = this.f3229b;
                if (!t1Var4.f3728n) {
                    df0.b(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o1(t1Var4, 0));
                    return;
                }
                return;
        }
    }
}
