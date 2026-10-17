package ai;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ka implements Runnable {
    public final int f1729a;
    public final org.telegram.ui.ActionBar.f3[] f1730b;
    public final TL_stars.StarsTransaction f1731c;
    public final long d;

    public ka(org.telegram.ui.ActionBar.f3[] f3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f1729a = 2;
        this.f1730b = f3VarArr;
        this.d = j10;
        this.f1731c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f1729a) {
            case 0:
                this.f1730b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f1731c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(sn.V9(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        U.presentFragment(sn.W9(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f1730b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f1731c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(sn.V9(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        U2.presentFragment(sn.W9(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f1730b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f1731c.msg_id);
                    U3.presentFragment(new sn(bundle));
                    return;
                }
                return;
            case 3:
                this.f1730b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f1731c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(sn.V9(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        U4.presentFragment(sn.W9(j12));
                        return;
                    }
                }
                return;
            default:
                this.f1730b[0].dismiss();
                org.telegram.ui.ActionBar.n2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f1731c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(sn.V9(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        U5.presentFragment(sn.W9(j13));
                        return;
                    }
                }
                return;
        }
    }

    public ka(org.telegram.ui.ActionBar.f3[] f3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f1729a = i10;
        this.f1730b = f3VarArr;
        this.f1731c = starsTransaction;
        this.d = j10;
    }
}
