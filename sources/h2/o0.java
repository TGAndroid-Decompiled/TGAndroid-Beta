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
import org.telegram.ui.Components.i2;
import org.telegram.ui.Wallet.g3;
public final class o0 implements Runnable {
    public final int f14129a;
    public final boolean f14130b;
    public final boolean f14131c;
    public final Object d;
    public final Object f14132e;

    public o0(Object obj, Object obj2, boolean z9, boolean z10, int i7) {
        this.f14129a = i7;
        this.d = obj;
        this.f14132e = obj2;
        this.f14130b = z9;
        this.f14131c = z10;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o4;
        switch (this.f14129a) {
            case 0:
                p0 p0Var = (p0) this.d;
                boolean z9 = this.f14130b;
                boolean z10 = this.f14131c;
                p0Var.getClass();
                ((AtomicBoolean) this.f14132e).set(false);
                wf.b.w((wf.b) p0Var.d, z9, z10);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z11 = this.f14130b;
                String str = (String) this.f14132e;
                boolean z12 = this.f14131c;
                if (z11) {
                    t7Var.d.f26272n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                qb qbVar = t7Var.d.E;
                if (qbVar != null) {
                    Utilities.d.c(new nb(qbVar, qbVar.f24690a, str, z11));
                }
                if (z12) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.f26274s - 1;
                    w7Var.f26274s = i7;
                    if (i7 < 1 && (y8Var2 = (y8) w7Var.f26271f.poll()) != null) {
                        t7Var.d.f26274s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f26273r - 1;
                w7Var2.f26273r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f26270e.poll()) != null) {
                    t7Var.d.f26273r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f14132e, this.f14130b, this.f14131c);
                return;
            case 3:
                String str2 = (String) this.f14132e;
                boolean z13 = this.f14130b;
                boolean z14 = this.f14131c;
                h2 h2Var = ((e2) this.d).f29065b;
                h2Var.f29254e0 = false;
                h2Var.f29256f0 = str2;
                if (str2 == null) {
                    h2Var.f29256f0 = "";
                }
                h2Var.f29257g0 = z13;
                h2Var.f(z14, true);
                return;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                c20 c20Var = (c20) this.f14132e;
                boolean z15 = this.f14130b;
                boolean z16 = this.f14131c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.f42752e;
                org.telegram.ui.Wallet.p0 p0Var2 = l0Var.f42751c;
                if (p0Var2 != null && TextUtils.equals(p0Var2.f42957c, tL_walletState.address) && l0Var.f42751c.f(tL_walletState.public_key)) {
                    c20Var.a(null);
                    return;
                } else {
                    l0Var.z(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) c20Var, (Object) tL_walletState, 6), z15, z16);
                    return;
                }
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                v10 v10Var = (v10) this.f14132e;
                boolean z17 = this.f14130b;
                boolean z18 = this.f14131c;
                org.telegram.ui.Wallet.l0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.f42752e;
                if (l0Var2.f42751c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.p0 p0Var3 = l0Var2.f42751c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(v10Var, 1);
                    if (bArr == null) {
                        o4 = "";
                    } else {
                        p0Var3.getClass();
                        o4 = org.telegram.ui.Wallet.p0.o(bArr);
                    }
                    org.telegram.ui.Wallet.p0.h.execute(new i2(p0Var3, p0Var3.l(), o4, true, (c20) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: no server backup!");
                    v10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: exportSecretPhrase through password request");
                    g3.a(l0Var2.f42749a, new ai.c0(9), null, null, null, new di.b0(4, l0Var2, v10Var), z17, z18, new v0((Object) null, 2));
                    return;
                }
        }
    }

    public o0(t7 t7Var, boolean z9, String str, boolean z10) {
        this.f14129a = 1;
        this.d = t7Var;
        this.f14130b = z9;
        this.f14132e = str;
        this.f14131c = z10;
    }

    public o0(e2 e2Var, String str, File file, boolean z9, boolean z10) {
        this.f14129a = 3;
        this.d = e2Var;
        this.f14132e = str;
        this.f14130b = z9;
        this.f14131c = z10;
    }
}
