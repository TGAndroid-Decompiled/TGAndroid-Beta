package e2;

import ag.b1;
import android.text.TextUtils;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Components.s2;
import org.telegram.ui.Wallet.r2;
public final class p0 implements Runnable {
    public final int f9703a;
    public final boolean f9704b;
    public final boolean f9705c;
    public final Object d;
    public final Object e;

    public p0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f9703a = i10;
        this.d = obj;
        this.e = obj2;
        this.f9704b = z10;
        this.f9705c = z11;
    }

    @Override
    public final void run() {
        String o10;
        switch (this.f9703a) {
            case 0:
                bc.a aVar = (bc.a) this.d;
                aVar.getClass();
                ((AtomicBoolean) this.e).set(false);
                n4.s.c((n4.s) aVar.f3837c, this.f9704b, this.f9705c);
                return;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f9704b, this.f9705c);
                return;
            case 2:
                String str = (String) this.e;
                d2 d2Var = ((a2) this.d).f23844b;
                d2Var.f23990e0 = false;
                d2Var.f23992f0 = str;
                if (str == null) {
                    d2Var.f23992f0 = "";
                }
                d2Var.f23993g0 = this.f9704b;
                d2Var.f(this.f9705c, true);
                return;
            case 3:
                org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.e;
                org.telegram.ui.Wallet.p0 p0Var = l0Var.f36836c;
                if (p0Var != null && TextUtils.equals(p0Var.f37102c, tL_walletState.address) && l0Var.f36836c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    l0Var.z(new org.telegram.ui.Wallet.j((Object) l0Var, (Object) callback, (Object) tL_walletState, 4), this.f9704b, this.f9705c);
                    return;
                }
            default:
                org.telegram.ui.Wallet.l0 l0Var2 = (org.telegram.ui.Wallet.l0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.l0.H("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.e;
                if (l0Var2.f36836c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.p0 p0Var2 = l0Var2.f36836c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        p0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.p0.o(bArr);
                    }
                    String str2 = o10;
                    org.telegram.ui.Wallet.p0.h.execute(new s2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.l0.j("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.l0.H("getSecretPhrase: exportSecretPhrase through password request");
                    r2.a(l0Var2.f36834a, new ai.d0(12), null, null, null, new di.c0(4, l0Var2, callback2), this.f9704b, this.f9705c, new b1((Object) null, 2));
                    return;
                }
        }
    }

    public p0(a2 a2Var, String str, File file, boolean z10, boolean z11) {
        this.f9703a = 2;
        this.d = a2Var;
        this.e = str;
        this.f9704b = z10;
        this.f9705c = z11;
    }
}
