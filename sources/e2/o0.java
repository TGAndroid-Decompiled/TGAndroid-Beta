package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.mb0;
public final class o0 implements Runnable {
    public final int f8389a;
    public final boolean f8390b;
    public final boolean f8391c;
    public final Object d;
    public final Object e;

    public o0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f8389a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8390b = z10;
        this.f8391c = z11;
    }

    @Override
    public final void run() {
        String o10;
        switch (this.f8389a) {
            case 0:
                ac.a aVar = (ac.a) this.d;
                aVar.getClass();
                ((AtomicBoolean) this.e).set(false);
                qf.b.q((qf.b) aVar.f483c, this.f8390b, this.f8391c);
                return;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f8390b, this.f8391c);
                return;
            case 2:
                String str = (String) this.e;
                f2 f2Var = ((c2) this.d).f20705b;
                f2Var.f20851d0 = false;
                f2Var.f20852e0 = str;
                if (str == null) {
                    f2Var.f20852e0 = "";
                }
                f2Var.f20854f0 = this.f8390b;
                f2Var.f(this.f8391c, true);
                return;
            case 3:
                org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.e;
                p0 p0Var = k0Var.f33094c;
                if (p0Var != null && TextUtils.equals(p0Var.f33308c, tL_walletState.address) && k0Var.f33094c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    k0Var.x(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) callback, (Object) tL_walletState, 4), this.f8390b, this.f8391c);
                    return;
                }
            default:
                org.telegram.ui.Wallet.k0 k0Var2 = (org.telegram.ui.Wallet.k0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.k0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.e;
                if (k0Var2.f33094c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.k0.E("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.f33094c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    String str2 = o10;
                    p0.h.execute(new r2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.k0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.k0.E("getSecretPhrase: exportSecretPhrase through password request");
                    org.telegram.ui.Wallet.r2.a(k0Var2.f33092a, new fi.c(7), null, null, null, new bi.j0(4, k0Var2, callback2), this.f8390b, this.f8391c, new mb0((Object) null, 1));
                    return;
                }
        }
    }

    public o0(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f8389a = 2;
        this.d = c2Var;
        this.e = str;
        this.f8390b = z10;
        this.f8391c = z11;
    }
}
