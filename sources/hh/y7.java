package hh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rn;

public final class y7 implements Runnable {

    public final int f10387a;

    public final org.telegram.ui.ActionBar.e3[] f10388b;

    public final TL_stars.StarsTransaction f10389c;
    public final long d;

    public y7(org.telegram.ui.ActionBar.e3[] e3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f10387a = 2;
        this.f10388b = e3VarArr;
        this.d = j10;
        this.f10389c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f10387a) {
            case 0:
                this.f10388b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                if (n2VarU != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f10389c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 == 0) {
                        n2VarU.presentFragment(rn.R9(j10));
                    } else {
                        n2VarU.presentFragment(rn.Q9(starsTransaction.giveaway_post_id, j10));
                    }
                }
                break;
            case 1:
                this.f10388b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                if (n2VarU2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f10389c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 == 0) {
                        n2VarU2.presentFragment(rn.R9(j11));
                    } else {
                        n2VarU2.presentFragment(rn.Q9(starsTransaction2.giveaway_post_id, j11));
                    }
                }
                break;
            case 2:
                this.f10388b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                if (n2VarU3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f10389c.msg_id);
                    n2VarU3.presentFragment(new rn(bundle));
                }
                break;
            case 3:
                this.f10388b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU4 = LaunchActivity.U();
                if (n2VarU4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f10389c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 == 0) {
                        n2VarU4.presentFragment(rn.R9(j12));
                    } else {
                        n2VarU4.presentFragment(rn.Q9(starsTransaction3.giveaway_post_id, j12));
                    }
                }
                break;
            default:
                this.f10388b[0].dismiss();
                org.telegram.ui.ActionBar.n2 n2VarU5 = LaunchActivity.U();
                if (n2VarU5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f10389c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 == 0) {
                        n2VarU5.presentFragment(rn.R9(j13));
                    } else {
                        n2VarU5.presentFragment(rn.Q9(starsTransaction4.giveaway_post_id, j13));
                    }
                }
                break;
        }
    }

    public y7(org.telegram.ui.ActionBar.e3[] e3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f10387a = i10;
        this.f10388b = e3VarArr;
        this.f10389c = starsTransaction;
        this.d = j10;
    }
}
