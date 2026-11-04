package g2;

import android.text.TextUtils;
import cg.u0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.gb;
import org.telegram.messenger.jb;
import org.telegram.messenger.n10;
import org.telegram.messenger.t7;
import org.telegram.messenger.u10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Wallet.g3;
public final class p0 implements Runnable {
    public final int f11888a;
    public final boolean f11889b;
    public final boolean f11890c;
    public final Object d;
    public final Object f11891e;

    public p0(Object obj, Object obj2, boolean z10, boolean z11, int i3) {
        this.f11888a = i3;
        this.d = obj;
        this.f11891e = obj2;
        this.f11889b = z10;
        this.f11890c = z11;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o10;
        switch (this.f11888a) {
            case 0:
                q0 q0Var = (q0) this.d;
                boolean z10 = this.f11889b;
                boolean z11 = this.f11890c;
                q0Var.getClass();
                ((AtomicBoolean) this.f11891e).set(false);
                p4.q.c((p4.q) q0Var.d, z10, z11);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z12 = this.f11889b;
                String str = (String) this.f11891e;
                boolean z13 = this.f11890c;
                if (z12) {
                    t7Var.d.f26171n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                jb jbVar = t7Var.d.F;
                if (jbVar != null) {
                    Utilities.d.c(new gb(jbVar, jbVar.f23658a, str, z12));
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i3 = w7Var.f26173s - 1;
                    w7Var.f26173s = i3;
                    if (i3 < 1 && (y8Var2 = (y8) w7Var.f26170f.poll()) != null) {
                        t7Var.d.f26173s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f26172r - 1;
                w7Var2.f26172r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f26169e.poll()) != null) {
                    t7Var.d.f26172r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f11891e, this.f11889b, this.f11890c);
                return;
            case 3:
                String str2 = (String) this.f11891e;
                boolean z14 = this.f11889b;
                boolean z15 = this.f11890c;
                h2 h2Var = ((e2) this.d).f29108b;
                h2Var.f29304f0 = false;
                h2Var.f29305g0 = str2;
                if (str2 == null) {
                    h2Var.f29305g0 = "";
                }
                h2Var.f29306h0 = z14;
                h2Var.f(z15, true);
                return;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                u10 u10Var = (u10) this.f11891e;
                boolean z16 = this.f11889b;
                boolean z17 = this.f11890c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.f42721e;
                org.telegram.ui.Wallet.o0 o0Var = k0Var.f42720c;
                if (o0Var != null && TextUtils.equals(o0Var.f42987c, tL_walletState.address) && k0Var.f42720c.f(tL_walletState.public_key)) {
                    u10Var.a(null);
                    return;
                } else {
                    k0Var.z(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) u10Var, (Object) tL_walletState, 6), z16, z17);
                    return;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                n10 n10Var = (n10) this.f11891e;
                boolean z18 = this.f11889b;
                boolean z19 = this.f11890c;
                org.telegram.ui.Wallet.k0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.f42721e;
                if (k0Var2.f42720c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.o0 o0Var2 = k0Var2.f42720c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(n10Var, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        o0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.o0.o(bArr);
                    }
                    org.telegram.ui.Wallet.o0.h.execute(new org.telegram.ui.Components.h2(o0Var2, o0Var2.l(), o10, true, (u10) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no server backup!");
                    n10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: exportSecretPhrase through password request");
                    g3.a(k0Var2.f42718a, new bi.x(9), null, null, null, new ei.d0(4, k0Var2, n10Var), z18, z19, new u0((Object) null, 2));
                    return;
                }
        }
    }

    public p0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.f11888a = 1;
        this.d = t7Var;
        this.f11889b = z10;
        this.f11891e = str;
        this.f11890c = z11;
    }

    public p0(e2 e2Var, String str, File file, boolean z10, boolean z11) {
        this.f11888a = 3;
        this.d = e2Var;
        this.f11891e = str;
        this.f11889b = z10;
        this.f11890c = z11;
    }
}
