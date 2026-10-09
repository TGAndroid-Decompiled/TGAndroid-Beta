package org.telegram.messenger.camera;

import ai.q0;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Wallet.k0;
import org.telegram.ui.Wallet.p0;
import org.telegram.ui.Wallet.q2;
import org.telegram.ui.ib0;
public final class i implements Runnable {
    public final int f17532a;
    public final boolean f17533b;
    public final boolean f17534c;
    public final Object d;
    public final Object f17535e;

    public i(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f17532a = i10;
        this.d = obj;
        this.f17535e = obj2;
        this.f17533b = z10;
        this.f17534c = z11;
    }

    @Override
    public final void run() {
        String o9;
        switch (this.f17532a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17535e, this.f17533b, this.f17534c);
                return;
            case 1:
                String str = (String) this.f17535e;
                f2 f2Var = ((c2) this.d).f21905b;
                f2Var.f22062d0 = false;
                f2Var.f22064e0 = str;
                if (str == null) {
                    f2Var.f22064e0 = "";
                }
                f2Var.f22066f0 = this.f17533b;
                f2Var.f(this.f17534c, true);
                return;
            case 2:
                k0 k0Var = (k0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f17535e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.f35096e;
                p0 p0Var = k0Var.f35095c;
                if (p0Var != null && TextUtils.equals(p0Var.f35347c, tL_walletState.address) && k0Var.f35095c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    k0Var.x(new org.telegram.ui.Wallet.i((Object) k0Var, (Object) callback, (Object) tL_walletState, 4), this.f17533b, this.f17534c);
                    return;
                }
            default:
                k0 k0Var2 = (k0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f17535e;
                k0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.f35096e;
                if (k0Var2.f35095c.f(tL_walletState2.public_key)) {
                    k0.E("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.f35095c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.j jVar = new org.telegram.ui.Wallet.j(callback2, 1);
                    if (bArr == null) {
                        o9 = "";
                    } else {
                        p0Var2.getClass();
                        o9 = p0.o(bArr);
                    }
                    String str2 = o9;
                    p0.h.execute(new r2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) jVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    k0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    k0.E("getSecretPhrase: exportSecretPhrase through password request");
                    q2.a(k0Var2.f35093a, new ei.c(7), null, null, null, new q0(4, k0Var2, callback2), this.f17533b, this.f17534c, new ib0((Object) null, 1));
                    return;
                }
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f17532a = 1;
        this.d = c2Var;
        this.f17535e = str;
        this.f17533b = z10;
        this.f17534c = z11;
    }
}
