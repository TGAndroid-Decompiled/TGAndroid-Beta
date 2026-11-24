package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;
public final class olc implements gk7 {
    public final int a;
    public final TL_wallet.walletTransaction[] b;
    public final be5 c;

    public olc(int i, TL_wallet.walletTransaction[] wallettransactionArr, be5 be5Var) {
        this.a = i;
        this.b = wallettransactionArr;
        this.c = be5Var;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        TL_wallet.walletTransaction[] wallettransactionArr;
        TL_wallet.walletTransaction wallettransaction;
        if (i == kk7.c4 || i == kk7.d4) {
            ArrayList arrayList = c.C(this.a).G().c;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                wallettransactionArr = this.b;
                if (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    wallettransaction = (TL_wallet.walletTransaction) obj;
                    TL_wallet.walletTransaction wallettransaction2 = wallettransactionArr[0];
                    if (wallettransaction != wallettransaction2) {
                        if (c.t0(wallettransaction2, wallettransaction)) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    wallettransaction = null;
                    break;
                }
            }
            if (wallettransaction != null) {
                wallettransactionArr[0] = wallettransaction;
                this.c.a(wallettransaction);
            }
        }
    }
}
