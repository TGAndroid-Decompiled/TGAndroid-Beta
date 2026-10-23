package ai;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;
public final class ma implements Runnable {
    public final int f1832a;
    public final org.telegram.ui.ActionBar.h3[] f1833b;
    public final TL_stars.StarsTransaction f1834c;
    public final long d;

    public ma(org.telegram.ui.ActionBar.h3[] h3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f1832a = 2;
        this.f1833b = h3VarArr;
        this.d = j10;
        this.f1834c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f1832a) {
            case 0:
                this.f1833b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f1834c;
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
                this.f1833b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f1834c;
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
                this.f1833b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f1834c.msg_id);
                    U3.presentFragment(new sn(bundle));
                    return;
                }
                return;
            case 3:
                this.f1833b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f1834c;
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
                this.f1833b[0].dismiss();
                org.telegram.ui.ActionBar.o2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f1834c;
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

    public ma(org.telegram.ui.ActionBar.h3[] h3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f1832a = i10;
        this.f1833b = h3VarArr;
        this.f1834c = starsTransaction;
        this.d = j10;
    }
}
