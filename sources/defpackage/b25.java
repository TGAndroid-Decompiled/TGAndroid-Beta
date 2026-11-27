package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class b25 implements icc {
    public final byte a;
    public final c b;

    public b25(c cVar, byte b) {
        this.a = b;
        this.b = cVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = "NULL_ERROR";
        c cVar = this.b;
        switch (b) {
            case 0:
                TL_wallet.existingBalance existingbalance = (TL_wallet.existingBalance) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                cVar.E = -1;
                if (existingbalance != null) {
                    cVar.i = Boolean.valueOf(existingbalance.has_balance);
                    cVar.j = existingbalance.url;
                }
                Boolean bool = cVar.i;
                if (bool != null && bool.booleanValue() && !TextUtils.isEmpty(cVar.j)) {
                    cVar.T();
                    return;
                }
                return;
            case 1:
                TL_wallet.WalletState walletState = (TL_wallet.WalletState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                cVar.C = -1;
                if (walletState == null) {
                    StringBuilder sb = new StringBuilder("requesting gasless info: ");
                    if (tL_error2 != null) {
                        str = tL_error2.text;
                    }
                    sb.append(str);
                    c.m(sb.toString());
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (walletState instanceof TL_wallet.TL_walletState) {
                    TL_wallet.WalletState walletState2 = cVar.e;
                    if ((walletState2 instanceof TL_wallet.TL_walletState) && cVar.l) {
                        TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) walletState2;
                        TL_wallet.TL_walletState tL_walletState2 = (TL_wallet.TL_walletState) walletState;
                        if (currentTimeMillis - cVar.k < 30000) {
                            tL_walletState2.balance = tL_walletState.balance;
                        } else {
                            cVar.l = false;
                        }
                        cVar.e = walletState;
                        cVar.V();
                        cVar.T();
                        return;
                    }
                }
                cVar.l = false;
                cVar.e = walletState;
                cVar.V();
                cVar.T();
                return;
            default:
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                cVar.D = -1;
                if (updates == null) {
                    StringBuilder sb2 = new StringBuilder("requesting gasless info: ");
                    if (tL_error3 != null) {
                        str = tL_error3.text;
                    }
                    sb2.append(str);
                    c.m(sb2.toString());
                    return;
                }
                Utilities.d.c(new se4(cVar, updates, (byte) 15));
                return;
        }
    }
}
