package ci;

import j$.util.Objects;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.ui.Components.xe0;
public final class b1 implements Runnable {
    public final int f5237a;
    public final h1 f5238b;

    public b1(h1 h1Var, int i10) {
        this.f5237a = i10;
        this.f5238b = h1Var;
    }

    @Override
    public final void run() {
        switch (this.f5237a) {
            case 0:
                this.f5238b.p();
                return;
            case 1:
                this.f5238b.q();
                return;
            case 2:
                this.f5238b.t(true);
                return;
            case 3:
                h1 h1Var = this.f5238b;
                NotificationCenter.getInstance(h1Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(h1Var.v.f20290id));
                h1Var.u(true);
                return;
            case 4:
                this.f5238b.w();
                return;
            case 5:
                this.f5238b.t(true);
                return;
            case 6:
                h1 h1Var2 = this.f5238b;
                if (h1Var2.E != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = h1Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                    h1Var2.M.clear();
                    h1Var2.E = null;
                }
                h1Var2.k();
                return;
            case 7:
                this.f5238b.t(true);
                return;
            case 8:
                this.f5238b.t(true);
                return;
            case 9:
                h1 h1Var3 = this.f5238b;
                if (h1Var3.E != null) {
                    DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                    NativeInstance nativeInstance2 = h1Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    dispatchQueue2.postRunnable(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                    h1Var3.M.clear();
                    h1Var3.E = null;
                }
                h1Var3.k();
                return;
            case 10:
                this.f5238b.p();
                return;
            case 11:
                this.f5238b.q();
                return;
            default:
                h1 h1Var4 = this.f5238b;
                if (!h1Var4.f5444n) {
                    xe0.b(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ai.r0(h1Var4, 6));
                    return;
                }
                return;
        }
    }
}
