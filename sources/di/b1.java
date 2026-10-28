package di;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.ye0;
public final class b1 implements Runnable {
    public final int f8414a;
    public final h1 f8415b;

    public b1(h1 h1Var, int i10) {
        this.f8414a = i10;
        this.f8415b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f8414a) {
            case 0:
                this.f8415b.p();
                return;
            case 1:
                this.f8415b.q();
                return;
            case 2:
                this.f8415b.t(true);
                return;
            case 3:
                h1 h1Var = this.f8415b;
                NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.v.f22038id));
                h1Var.u(true);
                return;
            case 4:
                this.f8415b.w();
                return;
            case 5:
                this.f8415b.t(true);
                return;
            case 6:
                h1 h1Var2 = this.f8415b;
                if (h1Var2.E != null) {
                    DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance = h1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    h1Var2.M.clear();
                    h1Var2.E = null;
                }
                h1Var2.k();
                return;
            case 7:
                this.f8415b.t(true);
                return;
            case 8:
                this.f8415b.t(true);
                return;
            case 9:
                h1 h1Var3 = this.f8415b;
                if (h1Var3.E != null) {
                    DispatchQueue2 dispatchQueue22 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = h1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue22.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    h1Var3.M.clear();
                    h1Var3.E = null;
                }
                h1Var3.k();
                return;
            case 10:
                this.f8415b.p();
                return;
            case 11:
                this.f8415b.q();
                return;
            default:
                h1 h1Var4 = this.f8415b;
                if (!h1Var4.f8607n) {
                    ye0.b(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.i(h1Var4, 10));
                    return;
                }
                return;
        }
    }
}
