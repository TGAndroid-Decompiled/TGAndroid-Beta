package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class e05 implements Runnable {
    public final byte a;
    public final c b;
    public final boolean[] c;
    public final i8c d;
    public final v25 e;

    public e05(c cVar, boolean[] zArr, i8c i8cVar, v25 v25Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = i8cVar;
        this.e = v25Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v25 v25Var = this.e;
        final i8c i8cVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 == null) {
                        i8cVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(v25Var, new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                i8c i8cVar2 = i8cVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
                return;
            default:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine22 = cVar.b;
                    if (walletEngine22 == null) {
                        i8cVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine22.previewTonConnect(v25Var, new i8c() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                i8c i8cVar2 = i8cVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            i8cVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                }
                            }
                        });
                        return;
                    }
                }
                return;
        }
    }
}
