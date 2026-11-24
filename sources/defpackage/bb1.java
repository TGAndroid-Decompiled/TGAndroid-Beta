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
public final class bb1 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public bb1(jx2 jx2Var, String str, File file, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.d = jx2Var;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        qd4 qd4Var;
        qd4 qd4Var2;
        NativeInstance nativeInstance;
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                return;
            case 1:
                String str = (String) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                lx2 lx2Var = ((jx2) this.d).b;
                lx2Var.f0 = false;
                lx2Var.g0 = str;
                if (str == null) {
                    lx2Var.g0 = "";
                }
                lx2Var.h0 = z;
                lx2Var.f(z2, true);
                return;
            case 2:
                yb4 yb4Var = (yb4) this.d;
                boolean z3 = this.b;
                String str2 = (String) this.e;
                boolean z4 = this.c;
                bc4 bc4Var = yb4Var.d;
                if (z3) {
                    bc4Var.n.remove(str2);
                } else {
                    bc4Var.h.remove(str2);
                }
                pm5 pm5Var = yb4Var.d.F;
                if (pm5Var != null) {
                    Utilities.d.c(new ot1(pm5Var, pm5Var.a, str2, z3, (byte) 5));
                }
                bc4 bc4Var2 = yb4Var.d;
                if (z4) {
                    int i = bc4Var2.s - 1;
                    bc4Var2.s = i;
                    if (i < 1 && (qd4Var2 = (qd4) bc4Var2.f.poll()) != null) {
                        yb4Var.d.s++;
                        qd4Var2.c();
                        return;
                    }
                    return;
                }
                int i2 = bc4Var2.r - 1;
                bc4Var2.r = i2;
                if (i2 < 1 && (qd4Var = (qd4) bc4Var2.e.poll()) != null) {
                    yb4Var.d.r++;
                    qd4Var.c();
                    return;
                }
                return;
            case 3:
                c cVar = (c) this.d;
                qac qacVar = (qac) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                g35 g35Var = cVar.c;
                if (g35Var != null && TextUtils.equals(g35Var.c, tL_walletState.address) && cVar.c.f(tL_walletState.public_key)) {
                    qacVar.a(null);
                    return;
                } else {
                    cVar.E(z5, z6, false, new p(cVar, qacVar, tL_walletState, (byte) 14));
                    return;
                }
            case 4:
                oo9 oo9Var = (oo9) this.d;
                NativeInstance nativeInstance2 = (NativeInstance) this.e;
                boolean z7 = this.b;
                boolean z8 = this.c;
                boolean z9 = oo9Var.w;
                if (!z9 && (nativeInstance = oo9Var.P) == nativeInstance2 && !z7 && !oo9Var.h) {
                    if (z8) {
                        if (!z9 && nativeInstance != null && oo9Var.Y == null) {
                            f11 f11Var = new f11(oo9Var.e, oo9Var.f, oo9Var.k(), oo9Var.P, new jo9(oo9Var, nativeInstance));
                            oo9Var.Y = f11Var;
                            f11Var.b.post(new y8c((byte) 6, f11Var, a.o()));
                            oo9Var.N();
                            f11 f11Var2 = oo9Var.Y;
                            Handler handler = f11Var2.b;
                            w01 w01Var = f11Var2.d;
                            Objects.requireNonNull(w01Var);
                            handler.post(new f01(w01Var, (byte) 6));
                            return;
                        }
                        return;
                    }
                    f11 f11Var3 = oo9Var.Y;
                    if (f11Var3 != null) {
                        f11Var3.k();
                        oo9Var.Y = null;
                    }
                    oo9Var.Z = false;
                    return;
                }
                return;
            default:
                boolean z10 = this.b;
                boolean z11 = this.c;
                ((AtomicBoolean) this.e).set(false);
                ((rhb) ((dmc) this.d).c).l(z10, z11);
                return;
        }
    }

    public bb1(yb4 yb4Var, boolean z, String str, boolean z2) {
        this.a = (byte) 2;
        this.d = yb4Var;
        this.b = z;
        this.e = str;
        this.c = z2;
    }

    public bb1(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }
}
