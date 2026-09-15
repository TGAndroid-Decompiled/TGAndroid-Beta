package ai;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.de0;
public final class t1 implements Runnable {
    public final int f1538a;
    public final d2 f1539b;

    public t1(d2 d2Var, int i10) {
        this.f1538a = i10;
        this.f1539b = d2Var;
    }

    @Override
    public final void run() {
        switch (this.f1538a) {
            case 0:
                this.f1539b.p();
                return;
            case 1:
                this.f1539b.q();
                return;
            case 2:
                this.f1539b.t(true);
                return;
            case 3:
                d2 d2Var = this.f1539b;
                NotificationCenter.getInstance(d2Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(d2Var.v.f18122id));
                d2Var.u(true);
                return;
            case 4:
                this.f1539b.w();
                return;
            case 5:
                this.f1539b.t(true);
                return;
            case 6:
                d2 d2Var2 = this.f1539b;
                if (d2Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = d2Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 3));
                    d2Var2.M.clear();
                    d2Var2.E = null;
                }
                d2Var2.k();
                return;
            case 7:
                this.f1539b.t(true);
                return;
            case 8:
                this.f1539b.t(true);
                return;
            case 9:
                d2 d2Var3 = this.f1539b;
                if (d2Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = d2Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 3));
                    d2Var3.M.clear();
                    d2Var3.E = null;
                }
                d2Var3.k();
                return;
            case 10:
                this.f1539b.p();
                return;
            case 11:
                this.f1539b.q();
                return;
            default:
                d2 d2Var4 = this.f1539b;
                if (!d2Var4.f687n) {
                    de0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new y1(d2Var4, 0));
                    return;
                }
                return;
        }
    }
}
