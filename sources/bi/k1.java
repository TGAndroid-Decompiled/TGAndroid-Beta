package bi;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.de0;
public final class k1 implements Runnable {
    public final int f3211a;
    public final t1 f3212b;

    public k1(t1 t1Var, int i10) {
        this.f3211a = i10;
        this.f3212b = t1Var;
    }

    @Override
    public final void run() {
        switch (this.f3211a) {
            case 0:
                this.f3212b.p();
                return;
            case 1:
                this.f3212b.q();
                return;
            case 2:
                this.f3212b.t(true);
                return;
            case 3:
                t1 t1Var = this.f3212b;
                NotificationCenter.getInstance(t1Var.f3745e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(t1Var.v.f19906id));
                t1Var.u(true);
                return;
            case 4:
                this.f3212b.w();
                return;
            case 5:
                this.f3212b.t(true);
                return;
            case 6:
                t1 t1Var2 = this.f3212b;
                if (t1Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = t1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                    t1Var2.M.clear();
                    t1Var2.E = null;
                }
                t1Var2.k();
                return;
            case 7:
                this.f3212b.t(true);
                return;
            case 8:
                this.f3212b.t(true);
                return;
            case 9:
                t1 t1Var3 = this.f3212b;
                if (t1Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = t1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 3));
                    t1Var3.M.clear();
                    t1Var3.E = null;
                }
                t1Var3.k();
                return;
            case 10:
                this.f3212b.p();
                return;
            case 11:
                this.f3212b.q();
                return;
            default:
                t1 t1Var4 = this.f3212b;
                if (!t1Var4.f3747n) {
                    de0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new o1(t1Var4, 0));
                    return;
                }
                return;
        }
    }
}
