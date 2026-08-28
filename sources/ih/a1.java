package ih;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.kd0;
public final class a1 implements Runnable {
    public final int f11211a;
    public final f1 f11212b;

    public a1(f1 f1Var, int i9) {
        this.f11211a = i9;
        this.f11212b = f1Var;
    }

    @Override
    public final void run() {
        switch (this.f11211a) {
            case 0:
                this.f11212b.p();
                return;
            case 1:
                this.f11212b.q();
                return;
            case 2:
                this.f11212b.t(true);
                return;
            case 3:
                f1 f1Var = this.f11212b;
                NotificationCenter.getInstance(f1Var.f11401e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(f1Var.v.f22390id));
                f1Var.u(true);
                return;
            case 4:
                this.f11212b.w();
                return;
            case 5:
                this.f11212b.t(true);
                return;
            case 6:
                f1 f1Var2 = this.f11212b;
                if (f1Var2.A != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = f1Var2.A;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance, 4));
                    f1Var2.I.clear();
                    f1Var2.A = null;
                }
                f1Var2.k();
                return;
            case 7:
                this.f11212b.t(true);
                return;
            case 8:
                this.f11212b.t(true);
                return;
            case 9:
                f1 f1Var3 = this.f11212b;
                if (f1Var3.A != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = f1Var3.A;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.r0(nativeInstance2, 4));
                    f1Var3.I.clear();
                    f1Var3.A = null;
                }
                f1Var3.k();
                return;
            case 10:
                this.f11212b.p();
                return;
            case 11:
                this.f11212b.q();
                return;
            default:
                f1 f1Var4 = this.f11212b;
                if (!f1Var4.f11403n) {
                    kd0.d(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new bg.i(f1Var4, 17));
                    return;
                }
                return;
        }
    }
}
