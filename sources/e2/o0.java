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
import org.telegram.ui.Wallet.q0;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.na0;
public final class o0 implements Runnable {
    public final int f8266a;
    public final boolean f8267b;
    public final boolean f8268c;
    public final Object d;
    public final Object e;

    public o0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f8266a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8267b = z10;
        this.f8268c = z11;
    }

    @Override
    public final void run() {
        String o10;
        switch (this.f8266a) {
            case 0:
                ac.a aVar = (ac.a) this.d;
                aVar.getClass();
                ((AtomicBoolean) this.e).set(false);
                qf.b.y((qf.b) aVar.f481c, this.f8267b, this.f8268c);
                return;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f8267b, this.f8268c);
                return;
            case 2:
                String str = (String) this.e;
                f2 f2Var = ((c2) this.d).f22080b;
                f2Var.f22213d0 = false;
                f2Var.f22214e0 = str;
                if (str == null) {
                    f2Var.f22214e0 = "";
                }
                f2Var.f22216f0 = this.f8267b;
                f2Var.f(this.f8268c, true);
                return;
            case 3:
                org.telegram.ui.Wallet.m0 m0Var = (org.telegram.ui.Wallet.m0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) m0Var.e;
                q0 q0Var = m0Var.f34472c;
                if (q0Var != null && TextUtils.equals(q0Var.f34751c, tL_walletState.address) && m0Var.f34472c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    m0Var.y(new org.telegram.ui.Wallet.k((Object) m0Var, (Object) callback, (Object) tL_walletState, 4), this.f8267b, this.f8268c);
                    return;
                }
            default:
                org.telegram.ui.Wallet.m0 m0Var2 = (org.telegram.ui.Wallet.m0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.m0.F("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) m0Var2.e;
                if (m0Var2.f34472c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.m0.F("getSecretPhrase: device has secured phrase, requesting");
                    q0 q0Var2 = m0Var2.f34472c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.l lVar = new org.telegram.ui.Wallet.l(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        q0Var2.getClass();
                        o10 = q0.o(bArr);
                    }
                    String str2 = o10;
                    q0.h.execute(new r2(q0Var2, q0Var2.l(), str2, true, (Utilities.Callback) lVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.m0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.m0.F("getSecretPhrase: exportSecretPhrase through password request");
                    s2.a(m0Var2.f34470a, new gi.c(8), null, null, null, new ci.c0(4, m0Var2, callback2), this.f8267b, this.f8268c, new na0((Object) null, 1));
                    return;
                }
        }
    }

    public o0(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f8266a = 2;
        this.d = c2Var;
        this.e = str;
        this.f8267b = z10;
        this.f8268c = z11;
    }
}
