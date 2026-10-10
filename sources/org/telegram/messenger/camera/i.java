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
import org.telegram.ui.ib0;
public final class i implements Runnable {
    public final int f17536a;
    public final boolean f17537b;
    public final boolean f17538c;
    public final Object d;
    public final Object f17539e;

    public i(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f17536a = i10;
        this.d = obj;
        this.f17539e = obj2;
        this.f17537b = z10;
        this.f17538c = z11;
    }

    @Override
    public final void run() {
        String o9;
        switch (this.f17536a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17539e, this.f17537b, this.f17538c);
                return;
            case 1:
                String str = (String) this.f17539e;
                f2 f2Var = ((c2) this.d).f21909b;
                f2Var.f22066d0 = false;
                f2Var.f22068e0 = str;
                if (str == null) {
                    f2Var.f22068e0 = "";
                }
                f2Var.f22070f0 = this.f17537b;
                f2Var.f(this.f17538c, true);
                return;
            case 2:
                k0 k0Var = (k0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f17539e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) k0Var.f35158e;
                p0 p0Var = k0Var.f35157c;
                if (p0Var != null && TextUtils.equals(p0Var.f35411c, tL_walletState.address) && k0Var.f35157c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    k0Var.x(new org.telegram.ui.Wallet.j((Object) k0Var, (Object) callback, (Object) tL_walletState, 4), this.f17537b, this.f17538c);
                    return;
                }
            default:
                k0 k0Var2 = (k0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f17539e;
                k0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) k0Var2.f35158e;
                if (k0Var2.f35157c.f(tL_walletState2.public_key)) {
                    k0.E("getSecretPhrase: device has secured phrase, requesting");
                    p0 p0Var2 = k0Var2.f35157c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.k kVar = new org.telegram.ui.Wallet.k(callback2, 1);
                    if (bArr == null) {
                        o9 = "";
                    } else {
                        p0Var2.getClass();
                        o9 = p0.o(bArr);
                    }
                    String str2 = o9;
                    p0.h.execute(new r2(p0Var2, p0Var2.l(), str2, true, (Utilities.Callback) kVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    k0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    k0.E("getSecretPhrase: exportSecretPhrase through password request");
                    org.telegram.ui.Wallet.r2.a(k0Var2.f35155a, new ei.c(7), null, null, null, new q0(4, k0Var2, callback2), this.f17537b, this.f17538c, new ib0((Object) null, 1));
                    return;
                }
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f17536a = 1;
        this.d = c2Var;
        this.f17539e = str;
        this.f17537b = z10;
        this.f17538c = z11;
    }
}
