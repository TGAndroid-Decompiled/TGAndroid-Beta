package ai;

import android.text.TextUtils;
import org.telegram.messenger.n10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.f8;
import org.telegram.ui.Wallet.g8;
import org.telegram.ui.e51;
public final class q4 implements n10 {
    public final int f925a;
    public final Object f926b;
    public final Object f927c;

    public q4(int i3, Object obj, Object obj2) {
        this.f925a = i3;
        this.f926b = obj;
        this.f927c = obj2;
    }

    private final void b(Object obj, Object obj2) {
        String str;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f926b;
        f8 f8Var = (f8) this.f927c;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
        String str2 = (String) obj2;
        String str3 = "NULL_ERROR";
        if (h0Var == null) {
            if (str2 == null) {
                str = "NULL_ERROR";
            } else {
                str = str2;
            }
            org.telegram.ui.Wallet.k0.j("enable backup: didnt get secret phrase: ".concat(str));
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            f8Var.a(str2);
            return;
        }
        org.telegram.ui.Wallet.h0 b10 = h0Var.b();
        e51 e51Var = new e51(3, b10, f8Var);
        org.telegram.ui.Wallet.k0.H("enable backup: got secret phrase");
        try {
            ConnectionsManager.getInstance(k0Var.f42718a).sendRequestTyped(new TL_wallet.getBackupHolderDcs(), new c3.b(1), new org.telegram.ui.Wallet.q(k0Var, e51Var, b10, WalletEngine2.secretPhraseToPublicKey(b10), 1));
        } catch (Exception e10) {
            org.telegram.ui.Wallet.k0.k("failed to get public key from secret phrase", e10);
            if (e10.getMessage() != null) {
                str3 = e10.getMessage();
            }
            e51Var.a(str3);
        }
    }

    private final void c(Object obj, Object obj2) {
        String str;
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f926b;
        g8 g8Var = (g8) this.f927c;
        org.telegram.ui.Wallet.h0 h0Var = (org.telegram.ui.Wallet.h0) obj;
        String str2 = (String) obj2;
        if (h0Var == null) {
            if (str2 == null) {
                str = "NULL_ERROR";
            } else {
                str = str2;
            }
            org.telegram.ui.Wallet.k0.j("prepare disable backup, cant get secret phrase: ".concat(str));
            if (str2 == null) {
                str2 = "NULL_ERROR";
            }
            g8Var.a(null, str2);
            return;
        }
        TL_update.TL_updateWalletGaslessInfo tL_updateWalletGaslessInfo = k0Var.f42722f;
        if (tL_updateWalletGaslessInfo != null && tL_updateWalletGaslessInfo.available) {
            TextUtils.isEmpty(tL_updateWalletGaslessInfo.relayer_address);
        }
        org.telegram.ui.Wallet.k0.H("prepare disable backup: preparing transfer");
        k0Var.f42719b.prepareRotateKey(h0Var, null, new ei.f2(2, k0Var, g8Var));
    }

    private final void d(Object obj, Object obj2) {
        org.telegram.ui.Wallet.k0 k0Var = (org.telegram.ui.Wallet.k0) this.f926b;
        e51 e51Var = (e51) this.f927c;
        TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
        if (tL_error != null) {
            org.telegram.ui.Wallet.k0.j("enable backup: server rejected request code=" + tL_error.code + " error=" + tL_error.text);
            String str = tL_error.text;
            if (str == null) {
                str = "NULL_ERROR";
            }
            e51Var.a(str);
            return;
        }
        org.telegram.ui.Wallet.k0.H("enable backup: server accepted request");
        k0Var.l0(walletState);
        e51Var.a(null);
    }

    private final void e(Object obj, Object obj2) {
        n10 n10Var = (n10) this.f927c;
        TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
        String str = (String) obj2;
        if (!((org.telegram.ui.Wallet.y) this.f926b).f43448a) {
            n10Var.a(wallettransaction, str);
        }
    }

    @Override
    public final void a(java.lang.Object r35, java.lang.Object r36) {
        throw new UnsupportedOperationException("Method not decompiled: ai.q4.a(java.lang.Object, java.lang.Object):void");
    }

    public q4(org.telegram.ui.Wallet.k0 k0Var, String str, u10 u10Var) {
        this.f925a = 23;
        this.f926b = str;
        this.f927c = u10Var;
    }
}
