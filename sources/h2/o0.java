package h2;

import android.text.TextUtils;
import bg.v0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.c20;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.nb;
import org.telegram.messenger.qb;
import org.telegram.messenger.t7;
import org.telegram.messenger.v10;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.j2;
import org.telegram.ui.Wallet.i3;
import org.telegram.ui.Wallet.r0;
public final class o0 implements Runnable {
    public final int f14127a;
    public final boolean f14128b;
    public final boolean f14129c;
    public final Object d;
    public final Object f14130e;

    public o0(Object obj, Object obj2, boolean z9, boolean z10, int i7) {
        this.f14127a = i7;
        this.d = obj;
        this.f14130e = obj2;
        this.f14128b = z9;
        this.f14129c = z10;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o4;
        switch (this.f14127a) {
            case 0:
                p0 p0Var = (p0) this.d;
                boolean z9 = this.f14128b;
                boolean z10 = this.f14129c;
                p0Var.getClass();
                ((AtomicBoolean) this.f14130e).set(false);
                wf.b.w((wf.b) p0Var.d, z9, z10);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z11 = this.f14128b;
                String str = (String) this.f14130e;
                boolean z12 = this.f14129c;
                if (z11) {
                    t7Var.d.f26257n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new nb(qbVar, qbVar.f24675a, str, z11));
                }
                if (z12) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.f26259s - 1;
                    w7Var.f26259s = i7;
                    if (i7 < 1 && (y8Var2 = (y8) w7Var.f26256f.poll()) != null) {
                        t7Var.d.f26259s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f26258r - 1;
                w7Var2.f26258r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f26255e.poll()) != null) {
                    t7Var.d.f26258r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f14130e, this.f14128b, this.f14129c);
                return;
            case 3:
                String str2 = (String) this.f14130e;
                boolean z13 = this.f14128b;
                boolean z14 = this.f14129c;
                h2 h2Var = ((e2) this.d).f29046b;
                h2Var.f29235e0 = false;
                h2Var.f29237f0 = str2;
                if (str2 == null) {
                    h2Var.f29237f0 = "";
                }
                h2Var.f29238g0 = z13;
                h2Var.f(z14, true);
                return;
            case 4:
                org.telegram.ui.Wallet.n0 n0Var = (org.telegram.ui.Wallet.n0) this.d;
                c20 c20Var = (c20) this.f14130e;
                boolean z15 = this.f14128b;
                boolean z16 = this.f14129c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) n0Var.f42796e;
                r0 r0Var = n0Var.f42795c;
                if (r0Var != null && TextUtils.equals(r0Var.f43084c, tL_walletState.address) && n0Var.f42795c.f(tL_walletState.public_key)) {
                    c20Var.a(null);
                    return;
                } else {
                    n0Var.z(new org.telegram.ui.Wallet.j((Object) n0Var, (Object) c20Var, (Object) tL_walletState, 6), z15, z16);
                    return;
                }
            default:
                org.telegram.ui.Wallet.n0 n0Var2 = (org.telegram.ui.Wallet.n0) this.d;
                v10 v10Var = (v10) this.f14130e;
                boolean z17 = this.f14128b;
                boolean z18 = this.f14129c;
                org.telegram.ui.Wallet.n0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) n0Var2.f42796e;
                if (n0Var2.f42795c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.n0.H("getSecretPhrase: device has secured phrase, requesting");
                    r0 r0Var2 = n0Var2.f42795c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(v10Var, 1);
                    if (bArr == null) {
                        o4 = "";
                    } else {
                        r0Var2.getClass();
                        o4 = r0.o(bArr);
                    }
                    r0.h.execute(new j2(r0Var2, r0Var2.l(), o4, true, (c20) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.n0.j("getSecretPhrase: no server backup!");
                    v10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.n0.H("getSecretPhrase: exportSecretPhrase through password request");
                    i3.a(n0Var2.f42793a, new ai.c0(9), null, null, null, new di.b0(4, n0Var2, v10Var), z17, z18, new v0((Object) null, 2));
                    return;
                }
        }
    }

    public o0(t7 t7Var, boolean z9, String str, boolean z10) {
        this.f14127a = 1;
        this.d = t7Var;
        this.f14128b = z9;
        this.f14130e = str;
        this.f14129c = z10;
    }

    public o0(e2 e2Var, String str, File file, boolean z9, boolean z10) {
        this.f14127a = 3;
        this.d = e2Var;
        this.f14130e = str;
        this.f14128b = z9;
        this.f14129c = z10;
    }
}
