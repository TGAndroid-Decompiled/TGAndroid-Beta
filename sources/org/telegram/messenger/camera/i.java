package org.telegram.messenger.camera;

import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Wallet.l0;
import org.telegram.ui.Wallet.q0;
import org.telegram.ui.Wallet.s2;
import org.telegram.ui.hb0;
public final class i implements Runnable {
    public final int f17570a;
    public final boolean f17571b;
    public final boolean f17572c;
    public final Object d;
    public final Object f17573e;

    public i(Object obj, Object obj2, boolean z10, boolean z11, int i10) {
        this.f17570a = i10;
        this.d = obj;
        this.f17573e = obj2;
        this.f17571b = z10;
        this.f17572c = z11;
    }

    @Override
    public final void run() {
        String o9;
        switch (this.f17570a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17573e, this.f17571b, this.f17572c);
                return;
            case 1:
                String str = (String) this.f17573e;
                f2 f2Var = ((c2) this.d).f21933b;
                f2Var.f22090d0 = false;
                f2Var.f22092e0 = str;
                if (str == null) {
                    f2Var.f22092e0 = "";
                }
                f2Var.f22094f0 = this.f17571b;
                f2Var.f(this.f17572c, true);
                return;
            case 2:
                l0 l0Var = (l0) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f17573e;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) l0Var.f35222e;
                q0 q0Var = l0Var.f35221c;
                if (q0Var != null && TextUtils.equals(q0Var.f35475c, tL_walletState.address) && l0Var.f35221c.f(tL_walletState.public_key)) {
                    callback.run(null);
                    return;
                } else {
                    l0Var.x(new org.telegram.ui.Wallet.k((Object) l0Var, (Object) callback, (Object) tL_walletState, 4), this.f17571b, this.f17572c);
                    return;
                }
            default:
                l0 l0Var2 = (l0) this.d;
                Utilities.Callback2 callback2 = (Utilities.Callback2) this.f17573e;
                l0.E("getSecretPhrase: ready!");
                TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) l0Var2.f35222e;
                if (l0Var2.f35221c.f(tL_walletState2.public_key)) {
                    l0.E("getSecretPhrase: device has secured phrase, requesting");
                    q0 q0Var2 = l0Var2.f35221c;
                    byte[] bArr = tL_walletState2.public_key;
                    org.telegram.ui.Wallet.l lVar = new org.telegram.ui.Wallet.l(callback2, 1);
                    if (bArr == null) {
                        o9 = "";
                    } else {
                        q0Var2.getClass();
                        o9 = q0.o(bArr);
                    }
                    String str2 = o9;
                    q0.h.execute(new r2(q0Var2, q0Var2.l(), str2, true, (Utilities.Callback) lVar));
                    return;
                } else if (!tL_walletState2.backup_enabled) {
                    l0.i("getSecretPhrase: no server backup!");
                    callback2.run(null, "NO_LOCAL_BACKUP");
                    return;
                } else {
                    l0.E("getSecretPhrase: exportSecretPhrase through password request");
                    s2.a(l0Var2.f35219a, new ei.c(7), null, null, null, new ai.q0(4, l0Var2, callback2), this.f17571b, this.f17572c, new hb0((Object) null, 1));
                    return;
                }
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.f17570a = 1;
        this.d = c2Var;
        this.f17573e = str;
        this.f17571b = z10;
        this.f17572c = z11;
    }
}
