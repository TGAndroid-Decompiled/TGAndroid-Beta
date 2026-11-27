package defpackage;

import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.Wallet.c;
public final class i25 implements Runnable {
    public final byte a;
    public final c b;
    public final boolean[] c;
    public final icc d;
    public final z45 e;

    public i25(c cVar, boolean[] zArr, icc iccVar, z45 z45Var, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = zArr;
        this.d = iccVar;
        this.e = z45Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        z45 z45Var = this.e;
        final icc iccVar = this.d;
        final boolean[] zArr = this.c;
        c cVar = this.b;
        switch (b) {
            case 0:
                if (!zArr[0]) {
                    WalletEngine2 walletEngine2 = cVar.b;
                    if (walletEngine2 == null) {
                        iccVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine2.previewTonConnect(z45Var, new icc() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                icc iccVar2 = iccVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
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
                        iccVar.a(null, "NULL_ENGINE");
                        return;
                    } else {
                        walletEngine22.previewTonConnect(z45Var, new icc() {
                            @Override
                            public final void a(Object obj, Object obj2) {
                                byte b2 = r1;
                                icc iccVar2 = iccVar;
                                boolean[] zArr2 = zArr;
                                TL_wallet.walletTransaction wallettransaction = (TL_wallet.walletTransaction) obj;
                                String str = (String) obj2;
                                switch (b2) {
                                    case 0:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
                                            return;
                                        }
                                        return;
                                    default:
                                        if (!zArr2[0]) {
                                            iccVar2.a(wallettransaction, str);
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
