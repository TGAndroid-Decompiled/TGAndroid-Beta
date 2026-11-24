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
public final class s91 implements Runnable {
    public final byte a;
    public final boolean b;
    public final boolean c;
    public final Object d;
    public final Object e;

    public s91(zv2 zv2Var, String str, File file, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.d = zv2Var;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void run() {
        qb4 qb4Var;
        qb4 qb4Var2;
        NativeInstance nativeInstance;
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                return;
            case 1:
                String str = (String) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                bw2 bw2Var = ((zv2) this.d).b;
                bw2Var.f0 = false;
                bw2Var.g0 = str;
                if (str == null) {
                    bw2Var.g0 = "";
                }
                bw2Var.h0 = z;
                bw2Var.f(z2, true);
                return;
            case 2:
                y94 y94Var = (y94) this.d;
                boolean z3 = this.b;
                String str2 = (String) this.e;
                boolean z4 = this.c;
                ba4 ba4Var = y94Var.d;
                if (z3) {
                    ba4Var.n.remove(str2);
                } else {
                    ba4Var.h.remove(str2);
                }
                pk5 pk5Var = y94Var.d.F;
                if (pk5Var != null) {
                    Utilities.d.c(new bs1(pk5Var, pk5Var.a, str2, z3, (byte) 5));
                }
                ba4 ba4Var2 = y94Var.d;
                if (z4) {
                    int i = ba4Var2.s - 1;
                    ba4Var2.s = i;
                    if (i < 1 && (qb4Var2 = (qb4) ba4Var2.f.poll()) != null) {
                        y94Var.d.s++;
                        qb4Var2.c();
                        return;
                    }
                    return;
                }
                int i2 = ba4Var2.r - 1;
                ba4Var2.r = i2;
                if (i2 < 1 && (qb4Var = (qb4) ba4Var2.e.poll()) != null) {
                    y94Var.d.r++;
                    qb4Var.c();
                    return;
                }
                return;
            case 3:
                c cVar = (c) this.d;
                p8c p8cVar = (p8c) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                g15 g15Var = cVar.c;
                if (g15Var != null && TextUtils.equals(g15Var.c, tL_walletState.address) && cVar.c.f(tL_walletState.public_key)) {
                    p8cVar.a(null);
                    return;
                } else {
                    cVar.E(z5, z6, false, new p(cVar, p8cVar, tL_walletState, (byte) 14));
                    return;
                }
            case 4:
                nm9 nm9Var = (nm9) this.d;
                NativeInstance nativeInstance2 = (NativeInstance) this.e;
                boolean z7 = this.b;
                boolean z8 = this.c;
                boolean z9 = nm9Var.w;
                if (!z9 && (nativeInstance = nm9Var.P) == nativeInstance2 && !z7 && !nm9Var.h) {
                    if (z8) {
                        if (!z9 && nativeInstance != null && nm9Var.Y == null) {
                            yz0 yz0Var = new yz0(nm9Var.e, nm9Var.f, nm9Var.k(), nm9Var.P, new im9(nm9Var, nativeInstance));
                            nm9Var.Y = yz0Var;
                            yz0Var.b.post(new x6c((byte) 6, yz0Var, a.o()));
                            nm9Var.N();
                            yz0 yz0Var2 = nm9Var.Y;
                            Handler handler = yz0Var2.b;
                            pz0 pz0Var = yz0Var2.d;
                            Objects.requireNonNull(pz0Var);
                            handler.post(new yy0(pz0Var, (byte) 6));
                            return;
                        }
                        return;
                    }
                    yz0 yz0Var3 = nm9Var.Y;
                    if (yz0Var3 != null) {
                        yz0Var3.k();
                        nm9Var.Y = null;
                    }
                    nm9Var.Z = false;
                    return;
                }
                return;
            default:
                boolean z10 = this.b;
                boolean z11 = this.c;
                ((AtomicBoolean) this.e).set(false);
                ((aec) ((ekc) this.d).c).d(z10, z11);
                return;
        }
    }

    public s91(y94 y94Var, boolean z, String str, boolean z2) {
        this.a = (byte) 2;
        this.d = y94Var;
        this.b = z;
        this.e = str;
        this.c = z2;
    }

    public s91(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }
}
