package h2;

import android.text.TextUtils;
import bg.u0;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.mb;
import org.telegram.messenger.pb;
import org.telegram.messenger.s10;
import org.telegram.messenger.t7;
import org.telegram.messenger.w7;
import org.telegram.messenger.y8;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.i2;
import org.telegram.ui.Wallet.f3;
import org.telegram.ui.Wallet.p0;
public final class n0 implements Runnable {
    public final int f13486a;
    public final boolean f13487b;
    public final boolean f13488c;
    public final Object d;
    public final Object f13489e;

    public n0(Object obj, Object obj2, boolean z10, boolean z11, int i7) {
        this.f13486a = i7;
        this.d = obj;
        this.f13489e = obj2;
        this.f13487b = z10;
        this.f13488c = z11;
    }

    @Override
    public final void run() {
        y8 y8Var;
        y8 y8Var2;
        String o4;
        switch (this.f13486a) {
            case 0:
                o0 o0Var = (o0) this.d;
                boolean z10 = this.f13487b;
                boolean z11 = this.f13488c;
                o0Var.getClass();
                ((AtomicBoolean) this.f13489e).set(false);
                wf.b.o((wf.b) o0Var.d, z10, z11);
                return;
            case 1:
                t7 t7Var = (t7) this.d;
                boolean z12 = this.f13487b;
                String str = (String) this.f13489e;
                boolean z13 = this.f13488c;
                if (z12) {
                    t7Var.d.f27311n.remove(str);
                } else {
                    t7Var.d.h.remove(str);
                }
                pb pbVar = t7Var.d.F;
                if (pbVar != null) {
                    Utilities.d.c(new mb(pbVar, pbVar.f25920a, str, z12));
                }
                if (z13) {
                    w7 w7Var = t7Var.d;
                    int i7 = w7Var.f27313s - 1;
                    w7Var.f27313s = i7;
                    if (i7 < 1 && (y8Var2 = (y8) w7Var.f27310f.poll()) != null) {
                        t7Var.d.f27313s++;
                        y8Var2.c();
                        return;
                    }
                    return;
                }
                w7 w7Var2 = t7Var.d;
                int i10 = w7Var2.f27312r - 1;
                w7Var2.f27312r = i10;
                if (i10 < 1 && (y8Var = (y8) w7Var2.f27309e.poll()) != null) {
                    t7Var.d.f27312r++;
                    y8Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f13489e, this.f13487b, this.f13488c);
                return;
            case 3:
                String str2 = (String) this.f13489e;
                boolean z14 = this.f13487b;
                boolean z15 = this.f13488c;
                h2 h2Var = ((e2) this.d).f30164b;
                h2Var.f30363f0 = false;
                h2Var.f30364g0 = str2;
                if (str2 == null) {
                    h2Var.f30364g0 = "";
                }
                h2Var.f30365h0 = z14;
                h2Var.f(z15, true);
                return;
            case 4:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                z10 z10Var = (z10) this.f13489e;
                boolean z16 = this.f13487b;
                boolean z17 = this.f13488c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.f44081e;
                p0 p0Var = l0Var.f44080c;
                if (p0Var != null && TextUtils.equals(p0Var.f44294c, tL_walletState.address) && l0Var.f44080c.f(tL_walletState.public_key)) {
                    z10Var.a(null);
                    return;
                } else {
                    l0Var.z(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) z10Var, (Object) tL_walletState, 6), z16, z17);
                    return;
                }
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                s10 s10Var = (s10) this.f13489e;
                boolean z18 = this.f13487b;
                boolean z19 = this.f13488c;
                org.telegram.ui.Wallet.l0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.f44081e;
                if (l0Var2.f44080c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = l0Var2.f44080c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(s10Var, 1);
                    if (bArr == null) {
                        o4 = "";
                    } else {
                        p0Var2.getClass();
                        o4 = p0.o(bArr);
                    }
                    p0.h.execute(new i2(p0Var2, p0Var2.l(), o4, true, (z10) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: no server backup!");
                    s10Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: exportSecretPhrase through password request");
                    f3.a(l0Var2.f44078a, new ci.x(9), null, null, null, new fi.b0(4, l0Var2, s10Var), z18, z19, new u0((Object) null, 2));
                    return;
                }
        }
    }

    public n0(t7 t7Var, boolean z10, String str, boolean z11) {
        this.f13486a = 1;
        this.d = t7Var;
        this.f13487b = z10;
        this.f13489e = str;
        this.f13488c = z11;
    }

    public n0(e2 e2Var, String str, File file, boolean z10, boolean z11) {
        this.f13486a = 3;
        this.d = e2Var;
        this.f13489e = str;
        this.f13487b = z10;
        this.f13488c = z11;
    }
}
