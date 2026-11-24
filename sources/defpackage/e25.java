package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class e25 implements Runnable {
    public final byte a;
    public final c b;
    public final boolean[] c;
    public final jac d;
    public final v45 e;

    public e25(c cVar, boolean[] zArr, jac jacVar, v45 v45Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = jacVar;
        this.e = v45Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v45 v45Var = this.e;
        final jac jacVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 == null) {
                        jacVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(v45Var, new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                jac jacVar2 = jacVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
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
                        jacVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine22.previewTonConnect(v45Var, new jac() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                jac jacVar2 = jacVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            jacVar2.a(wallettransaction, str);
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
