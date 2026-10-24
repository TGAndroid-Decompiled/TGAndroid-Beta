package e2;

import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Components.p2;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.Wallet.r2;
import org.telegram.ui.ta0;
public final class o0 implements Runnable {
    public final int f8273a;
    public final boolean f8274b;
    public final boolean f8275c;
    public final Object d;
    public final Object e;

    public o0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f8273a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8274b = z10;
        this.f8275c = z11;
    }

    @Override
    public final void run() {
        String o10;
        switch (this.f8273a) {
            case 0:
                ac.a aVar = (ac.a) this.d;
                aVar.getClass();
                ((AtomicBoolean) this.e).set(false);
                qf.b.o((qf.b) aVar.f481c, this.f8274b, this.f8275c);
                return;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f8274b, this.f8275c);
                return;
            case 2:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f22128b;
                e2Var.f22303d0 = false;
                e2Var.f22304e0 = str;
                if (str == null) {
                    e2Var.f22304e0 = "";
                }
                e2Var.f22306f0 = this.f8274b;
                e2Var.f(this.f8275c, true);
                return;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.e;
                p0 p0Var = l0Var.f34745c;
                if (p0Var != null && TextUtils.equals(p0Var.f34990c, tL_walletState.address) && l0Var.f34745c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    l0Var.y(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) callback, (Object) tL_walletState, 4), this.f8274b, this.f8275c);
                    return;
                }
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.l0.F("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.e;
                if (l0Var2.f34745c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.l0.F("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = l0Var2.f34745c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = p0.o(bArr);
                    }
                    String str2 = o10;
                    p0.h.execute(new p2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.l0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.F("getSecretPhrase: exportSecretPhrase through password request");
                    r2.a(l0Var2.f34743a, new gi.c(8), null, null, null, new ci.c0(4, l0Var2, callback2), this.f8274b, this.f8275c, new ta0((Object) null, 1));
                    return;
                }
        }
    }

    public o0(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.f8273a = 2;
        this.d = b2Var;
        this.e = str;
        this.f8274b = z10;
        this.f8275c = z11;
    }
}
