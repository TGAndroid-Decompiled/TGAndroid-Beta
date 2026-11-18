package h2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.lb;
import org.telegram.messenger.ob;
import org.telegram.messenger.t7;
import org.telegram.messenger.w7;
import org.telegram.messenger.x10;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.i2;
import org.telegram.ui.Wallet.u0;
import org.telegram.ui.Wallet.z0;
public final class n0 implements Runnable {
    public final int f13798a;
    public final boolean f13799b;
    public final boolean f13800c;
    public final Object d;
    public final Object f13801e;

    public n0(Object obj, Object obj2, boolean z10, boolean z11, int i7) {
        this.f13798a = i7;
        this.d = obj;
        this.f13801e = obj2;
        this.f13799b = z10;
        this.f13800c = z11;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        switch (this.f13798a) {
            case 0:
                o0 o0Var = (o0) this.d;
                boolean z10 = this.f13799b;
                boolean z11 = this.f13800c;
                o0Var.getClass();
                ((AtomicBoolean) this.f13801e).set(false);
                wf.b.p((wf.b) o0Var.d, z10, z11);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z12 = this.f13799b;
                String str = (String) this.f13801e;
                boolean z13 = this.f13800c;
                if (z12) {
                    t7Var.d.f27652n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                ob obVar = t7Var.d.F;
                if (obVar != null) {
                    Utilities.d.c(new lb(obVar, obVar.f26048a, str, z12));
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.f27654s - 1;
                    w7Var.f27654s = i7;
                    if (i7 < 1 && (y8Var2 = (y8) w7Var.f27651f.poll()) != null) {
                        t7Var.d.f27654s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f27653r - 1;
                w7Var2.f27653r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f27650e.poll()) != null) {
                    t7Var.d.f27653r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f13801e, this.f13799b, this.f13800c);
                return;
            case 3:
                String str2 = (String) this.f13801e;
                boolean z14 = this.f13799b;
                boolean z15 = this.f13800c;
                i2 i2Var = ((f2) this.d).f30601b;
                i2Var.f30788f0 = false;
                i2Var.f30789g0 = str2;
                if (str2 == null) {
                    i2Var.f30789g0 = "";
                }
                i2Var.f30790h0 = z14;
                i2Var.f(z15, true);
                return;
            default:
                u0 u0Var = (u0) this.d;
                x10 x10Var = (x10) this.f13801e;
                boolean z16 = this.f13799b;
                boolean z17 = this.f13800c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) u0Var.f45086e;
                z0 z0Var = u0Var.f45085c;
                if (z0Var != null && TextUtils.equals(z0Var.f45337c, tL_walletState.address) && u0Var.f45085c.f(tL_walletState.public_key)) {
                    x10Var.a(null);
                    return;
                } else {
                    u0Var.F(z16, z17, false, new org.telegram.ui.Wallet.j((Object) u0Var, (Object) x10Var, (Object) tL_walletState, 2));
                    return;
                }
        }
    }

    public n0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.f13798a = 1;
        this.d = t7Var;
        this.f13799b = z10;
        this.f13801e = str;
        this.f13800c = z11;
    }

    public n0(f2 f2Var, String str, File file, boolean z10, boolean z11) {
        this.f13798a = 3;
        this.d = f2Var;
        this.f13801e = str;
        this.f13799b = z10;
        this.f13800c = z11;
    }
}
