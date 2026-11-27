package defpackage;

import android.os.Handler;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class ba1 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public ba1(tw2 tw2Var, String str, File file, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.d = tw2Var;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        nd4 nd4Var;
        nd4 nd4Var2;
        NativeInstance nativeInstance;
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                return;
            case 1:
                String str = (String) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                vw2 vw2Var = ((tw2) this.d).b;
                vw2Var.f0 = false;
                vw2Var.g0 = str;
                if (str == null) {
                    vw2Var.g0 = "";
                }
                vw2Var.h0 = z;
                vw2Var.f(z2, true);
                return;
            case 2:
                ub4 ub4Var = (ub4) this.d;
                boolean z3 = this.b;
                String str2 = (String) this.e;
                boolean z4 = this.c;
                xb4 xb4Var = ub4Var.d;
                if (z3) {
                    xb4Var.n.remove(str2);
                } else {
                    xb4Var.h.remove(str2);
                }
                sm5 sm5Var = ub4Var.d.F;
                if (sm5Var != null) {
                    Utilities.d.c(new ps1(sm5Var, sm5Var.a, str2, z3, (byte) 5));
                }
                xb4 xb4Var2 = ub4Var.d;
                if (z4) {
                    int i = xb4Var2.s - 1;
                    xb4Var2.s = i;
                    if (i < 1 && (nd4Var2 = (nd4) xb4Var2.f.poll()) != null) {
                        ub4Var.d.s++;
                        nd4Var2.c();
                        return;
                    }
                    return;
                }
                int i2 = xb4Var2.r - 1;
                xb4Var2.r = i2;
                if (i2 < 1 && (nd4Var = (nd4) xb4Var2.e.poll()) != null) {
                    ub4Var.d.r++;
                    nd4Var.c();
                    return;
                }
                return;
            case 3:
                c cVar = (c) this.d;
                pcc pccVar = (pcc) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                k35 k35Var = cVar.c;
                if (k35Var != null && TextUtils.equals(k35Var.c, tL_walletState.address) && cVar.c.f(tL_walletState.public_key)) {
                    pccVar.a(null);
                    return;
                } else {
                    cVar.E(z5, z6, false, new p(cVar, pccVar, tL_walletState, (byte) 14));
                    return;
                }
            case 4:
                dq9 dq9Var = (dq9) this.d;
                NativeInstance nativeInstance2 = (NativeInstance) this.e;
                boolean z7 = this.b;
                boolean z8 = this.c;
                boolean z9 = dq9Var.w;
                if (!z9 && (nativeInstance = dq9Var.P) == nativeInstance2 && !z7 && !dq9Var.h) {
                    if (z8) {
                        if (!z9 && nativeInstance != null && dq9Var.Y == null) {
                            g01 g01Var = new g01(dq9Var.e, dq9Var.f, dq9Var.k(), dq9Var.P, new wp9(dq9Var, nativeInstance));
                            dq9Var.Y = g01Var;
                            g01Var.b.post(new xac((byte) 6, g01Var, a.o()));
                            dq9Var.N();
                            g01 g01Var2 = dq9Var.Y;
                            Handler handler = g01Var2.b;
                            xz0 xz0Var = g01Var2.d;
                            Objects.requireNonNull(xz0Var);
                            handler.post(new gz0(xz0Var, (byte) 6));
                            return;
                        }
                        return;
                    }
                    g01 g01Var3 = dq9Var.Y;
                    if (g01Var3 != null) {
                        g01Var3.k();
                        dq9Var.Y = null;
                    }
                    dq9Var.Z = false;
                    return;
                }
                return;
            default:
                boolean z10 = this.b;
                boolean z11 = this.c;
                ((AtomicBoolean) this.e).set(false);
                ((zhc) ((qoc) this.d).c).d(z10, z11);
                return;
        }
    }

    public ba1(ub4 ub4Var, boolean z, String str, boolean z2) {
        this.a = (byte) 2;
        this.d = ub4Var;
        this.b = z;
        this.e = str;
        this.c = z2;
    }

    public ba1(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }
}
