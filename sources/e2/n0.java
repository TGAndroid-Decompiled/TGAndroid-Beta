package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.d9;
import org.telegram.messenger.k20;
import org.telegram.messenger.ob;
import org.telegram.messenger.r20;
import org.telegram.messenger.sb;
import org.telegram.messenger.y7;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Components.k2;
import org.telegram.ui.Wallet.i3;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.jo;
import org.telegram.ui.z90;
import org.telegram.ui.zh;
public final class n0 implements Runnable {
    public final int f6179a;
    public final boolean f6180b;
    public final boolean f6181c;
    public final Object d;
    public final Object e;

    public n0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f6179a = i10;
        this.d = obj;
        this.e = obj2;
        this.f6180b = z10;
        this.f6181c = z11;
    }

    @Override
    public final void run() {
        d9 d9Var;
        d9 d9Var2;
        String o10;
        switch (this.f6179a) {
            case 0:
                o0 o0Var = (o0) this.d;
                boolean z10 = this.f6180b;
                boolean z11 = this.f6181c;
                o0Var.getClass();
                ((AtomicBoolean) this.e).set(false);
                hf.b.J((hf.b) o0Var.f6184c, z10, z11);
                return;
            case 1:
                y7 y7Var = (y7) this.d;
                boolean z12 = this.f6180b;
                String str = (String) this.e;
                boolean z13 = this.f6181c;
                if (z12) {
                    y7Var.d.f14943n.remove(str);
                } else {
                    y7Var.d.h.remove(str);
                }
                sb sbVar = y7Var.d.E;
                if (sbVar != null) {
                    Utilities.d.c(new ob(sbVar, sbVar.f18076a, str, z12));
                }
                if (z13) {
                    b8 b8Var = y7Var.d;
                    int i10 = b8Var.f14945s - 1;
                    b8Var.f14945s = i10;
                    if (i10 < 1 && (d9Var2 = (d9) b8Var.f14942f.poll()) != null) {
                        y7Var.d.f14945s++;
                        d9Var2.c();
                        return;
                    }
                    return;
                }
                b8 b8Var2 = y7Var.d;
                int i11 = b8Var2.f14944r - 1;
                b8Var2.f14944r = i11;
                if (i11 < 1 && (d9Var = (d9) b8Var2.e.poll()) != null) {
                    y7Var.d.f14944r++;
                    d9Var.c();
                    return;
                }
                return;
            case 2:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f6180b, this.f6181c);
                return;
            case 3:
                String str2 = (String) this.e;
                boolean z14 = this.f6180b;
                boolean z15 = this.f6181c;
                h2 h2Var = ((e2) this.d).f21846b;
                h2Var.f21960e0 = false;
                h2Var.f21962f0 = str2;
                if (str2 == null) {
                    h2Var.f21962f0 = "";
                }
                h2Var.f21963g0 = z14;
                h2Var.f(z15, true);
                return;
            case 4:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                r20 r20Var = (r20) this.e;
                boolean z16 = this.f6180b;
                boolean z17 = this.f6181c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.e;
                p0 p0Var = k0Var.f34783c;
                if (p0Var != null && TextUtils.equals(p0Var.f35008c, tL_walletState.address) && k0Var.f34783c.f(tL_walletState.public_key)) {
                    r20Var.a(null);
                    return;
                } else {
                    k0Var.z(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) r20Var, (Object) tL_walletState, 6), z16, z17);
                    return;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                k20 k20Var = (k20) this.e;
                boolean z18 = this.f6180b;
                boolean z19 = this.f6181c;
                org.telegram.ui.Wallet.k0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.e;
                if (k0Var2.f34783c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.f34783c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(k20Var, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    p0.h.execute(new k2(p0Var2, p0Var2.l(), o10, true, (r20) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.k0.j("getSecretPhrase: no server backup!");
                    k20Var.a(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.k0.H("getSecretPhrase: exportSecretPhrase through password request");
                    i3.a(k0Var2.f34781a, new zh(6), null, null, null, new jo(1, k0Var2, k20Var), z18, z19, new z90((Object) null, 1));
                    return;
                }
        }
    }

    public n0(y7 y7Var, boolean z10, String str, boolean z11) {
        this.f6179a = 1;
        this.d = y7Var;
        this.f6180b = z10;
        this.e = str;
        this.f6181c = z11;
    }

    public n0(e2 e2Var, String str, File file, boolean z10, boolean z11) {
        this.f6179a = 3;
        this.d = e2Var;
        this.e = str;
        this.f6180b = z10;
        this.f6181c = z11;
    }
}
