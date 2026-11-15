package bi;

import android.text.TextUtils;
import org.telegram.messenger.s10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.Wallet.h8;
import org.telegram.ui.x21;
public final class e4 implements s10 {
    public final int f3478a;
    public final Object f3479b;
    public final Object f3480c;

    public e4(int i7, Object obj, Object obj2) {
        this.f3478a = i7;
        this.f3479b = obj;
        this.f3480c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        String str;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f3479b;
        g8 g8Var = (g8) this.f3480c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
        String str2 = (String) obj2;
        String str3 = "NULL_ERROR";
        if (i0Var == null) {
            if (str2 == null) {
                str = "NULL_ERROR";
            } else {
                str = str2;
            }
            org.telegram.ui.Wallet.l0.j("enable backup: didnt get secret phrase: ".concat(str));
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            g8Var.a(str2);
            return;
        }
        org.telegram.ui.Wallet.i0 b10 = i0Var.b();
        x21 x21Var = new x21(5, b10, g8Var);
        org.telegram.ui.Wallet.l0.H("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(l0Var.f44078a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new d3.b(1), new org.telegram.ui.Wallet.q(l0Var, x21Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.l0.k("failed to get public key from secret phrase", e10);
            if (e10.getMessage() != null) {
                str3 = e10.getMessage();
            }
            x21Var.a(str3);
        }
    }

    private final void c(Object obj, Object obj2) {
        String str;
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f3479b;
        h8 h8Var = (h8) this.f3480c;
        org.telegram.ui.Wallet.i0 i0Var = (org.telegram.ui.Wallet.i0) obj;
        String str2 = (String) obj2;
        if (i0Var == null) {
            if (str2 == null) {
                str = "NULL_ERROR";
            } else {
                str = str2;
            }
            org.telegram.ui.Wallet.l0.j("prepare disable backup, cant get secret phrase: ".concat(str));
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            h8Var.a(null, str2);
            return;
        }
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = l0Var.f44082f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
            TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
        }
        org.telegram.ui.Wallet.l0.H("prepare disable backup: preparing transfer");
        l0Var.f44079b.prepareRotateKey(i0Var, null, new fi.y1(2, l0Var, h8Var));
    }

    private final void d(Object obj, Object obj2) {
        org.telegram.ui.Wallet.l0 l0Var = (org.telegram.ui.Wallet.l0) this.f3479b;
        x21 x21Var = (x21) this.f3480c;
        TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (tL_error != null) {
            org.telegram.ui.Wallet.l0.j("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
            String str = tL_error.text;
            if (str == null) {
                str = "NULL_ERROR";
            }
            x21Var.a(str);
            return;
        }
        org.telegram.ui.Wallet.l0.H("enable backup: server accepted request");
        l0Var.l0(walletState);
        x21Var.a(null);
    }

    private final void e(Object obj, Object obj2) {
        s10 s10Var = (s10) this.f3480c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (!((org.telegram.ui.Wallet.z) this.f3479b).f44768a) {
            s10Var.a(wallettransaction, str);
        }
    }

    @Override
    public final void a(java.lang.Object r35, java.lang.Object r36) {
        throw new UnsupportedOperationException("Method not decompiled: bi.e4.a(java.lang.Object, java.lang.Object):void");
    }

    public e4(org.telegram.ui.Wallet.l0 l0Var, String str, z10 z10Var) {
        this.f3478a = 23;
        this.f3479b = str;
        this.f3480c = z10Var;
    }
}
