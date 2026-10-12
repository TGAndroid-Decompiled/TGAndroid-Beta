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
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.nb0;
public final class o0 implements Runnable {
    public final int f8386a;
    public final boolean f8387b;
    public final boolean f8388c;
    public final Object d;
    public final Object e;

    public o0(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f8386a = i10;
        this.d = obj;
        this.e = obj2;
        this.f8387b = z10;
        this.f8388c = z11;
    }

    @Override
    public final void run() {
        String o10;
        switch (this.f8386a) {
            case 0:
                ac.a aVar = (ac.a) this.d;
                aVar.getClass();
                ((AtomicBoolean) this.e).set(false);
                qf.b.s((qf.b) aVar.f479c, this.f8387b, this.f8388c);
                return;
            case 1:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f8387b, this.f8388c);
                return;
            case 2:
                String str = (String) this.e;
                f2 f2Var = ((c2) this.d).f21011b;
                f2Var.f21155d0 = false;
                f2Var.f21156e0 = str;
                if (str == null) {
                    f2Var.f21156e0 = "";
                }
                f2Var.f21158f0 = this.f8387b;
                f2Var.f(this.f8388c, true);
                return;
            case 3:
                org.telegram.ui.Wallet.j0 j0Var = (org.telegram.ui.Wallet.j0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) j0Var.e;
                org.telegram.ui.Wallet.o0 o0Var = j0Var.f33321c;
                if (o0Var != null && TextUtils.equals(o0Var.f33534c, tL_walletState.address) && j0Var.f33321c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    j0Var.x(new org.telegram.ui.Wallet.i((Object) j0Var, (Object) callback, (Object) tL_walletState, 4), this.f8387b, this.f8388c);
                    return;
                }
            default:
                org.telegram.ui.Wallet.j0 j0Var2 = (org.telegram.ui.Wallet.j0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.e;
                org.telegram.ui.Wallet.j0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) j0Var2.e;
                if (j0Var2.f33321c.f(tL_walletState2.public_key)) {
                    org.telegram.ui.Wallet.j0.E("getSecretPhrase: device has secured phrase, requesting");
                    org.telegram.ui.Wallet.o0 o0Var2 = j0Var2.f33321c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.j jVar = new org.telegram.ui.Wallet.j(callback2, 1);
                    if (bArr == null) {
                        o10 = "";
                    } else {
                        o0Var2.getClass();
                        o10 = org.telegram.ui.Wallet.o0.o(bArr);
                    }
                    String str2 = o10;
                    org.telegram.ui.Wallet.o0.h.execute(new r2(o0Var2, o0Var2.l(), str2, true, (Utilities.Callback) jVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    org.telegram.ui.Wallet.j0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    org.telegram.ui.Wallet.j0.E("getSecretPhrase: exportSecretPhrase through password request");
                    q2.a(j0Var2.f33319a, new fi.c(7), null, null, null, new bi.j0(4, j0Var2, callback2), this.f8387b, this.f8388c, new nb0((Object) null, 1));
                    return;
                }
        }
    }

    public o0(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f8386a = 2;
        this.d = c2Var;
        this.e = str;
        this.f8387b = z10;
        this.f8388c = z11;
    }
}
