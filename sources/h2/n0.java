package h2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.mb;
import org.telegram.messenger.pb;
import org.telegram.messenger.t7;
import org.telegram.messenger.w7;
import org.telegram.messenger.y10;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Wallet.u0;
import org.telegram.ui.Wallet.z0;
public final class n0 implements Runnable {
    public final int f13793a;
    public final boolean f13794b;
    public final boolean f13795c;
    public final Object d;
    public final Object f13796e;

    public n0(Object obj, Object obj2, boolean z10, boolean z11, int i7) {
        this.f13793a = i7;
        this.d = obj;
        this.f13796e = obj2;
        this.f13794b = z10;
        this.f13795c = z11;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f13793a) {
            case 0:
                o0 o0Var = (o0) this.d;
                boolean z10 = this.f13794b;
                boolean z11 = this.f13795c;
                o0Var.getClass();
                ((AtomicBoolean) this.f13796e).set(false);
                wf.b.p((wf.b) o0Var.d, z10, z11);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z12 = this.f13794b;
                String str = (String) this.f13796e;
                boolean z13 = this.f13795c;
                if (z12) {
                    t7Var.d.f27662n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new mb(pbVar, pbVar.f26258a, str, z12));
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.f27664s - 1;
                    w7Var.f27664s = i7;
                    if (i7 < 1 && (y8Var2 = (y8) w7Var.f27661f.poll()) != null) {
                        t7Var.d.f27664s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f27663r - 1;
                w7Var2.f27663r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f27660e.poll()) != null) {
                    t7Var.d.f27663r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f13796e, this.f13794b, this.f13795c);
                return;
            case 3:
                String str2 = (String) this.f13796e;
                boolean z14 = this.f13794b;
                boolean z15 = this.f13795c;
                i2 i2Var = ((f2) this.d).f30598b;
                i2Var.f30785f0 = false;
                i2Var.f30786g0 = str2;
                if (str2 == null) {
                    i2Var.f30786g0 = "";
                }
                i2Var.f30787h0 = z14;
                i2Var.f(z15, true);
                return;
            default:
                u0 u0Var = (u0) this.d;
                y10 y10Var = (y10) this.f13796e;
                boolean z16 = this.f13794b;
                boolean z17 = this.f13795c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) u0Var.f45096e;
                z0 z0Var = u0Var.f45095c;
                if (z0Var != null && TextUtils.equals(z0Var.f45347c, tL_walletState.address) && u0Var.f45095c.f(tL_walletState.public_key)) {
                    y10Var.a(null);
                    return;
                } else {
                    u0Var.F(z16, z17, false, new org.telegram.ui.Wallet.j((Object) u0Var, (Object) y10Var, (Object) tL_walletState, 2));
                    return;
                }
        }
    }

    public n0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.f13793a = 1;
        this.d = t7Var;
        this.f13794b = z10;
        this.f13796e = str;
        this.f13795c = z11;
    }

    public n0(f2 f2Var, String str, File file, boolean z10, boolean z11) {
        this.f13793a = 3;
        this.d = f2Var;
        this.f13796e = str;
        this.f13794b = z10;
        this.f13795c = z11;
    }
}
