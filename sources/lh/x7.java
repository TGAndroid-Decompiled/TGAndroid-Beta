package lh;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.xn;
public final class x7 implements Runnable {
    public final int f13354a;
    public final org.telegram.ui.ActionBar.g3[] f13355b;
    public final TL_stars.StarsTransaction f13356c;
    public final long d;

    public x7(org.telegram.ui.ActionBar.g3[] g3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f13354a = 2;
        this.f13355b = g3VarArr;
        this.d = j10;
        this.f13356c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f13354a) {
            case 0:
                this.f13355b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f13356c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(xn.Q9(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        U.presentFragment(xn.R9(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f13355b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f13356c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(xn.Q9(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        U2.presentFragment(xn.R9(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f13355b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f13356c.msg_id);
                    U3.presentFragment(new xn(bundle));
                    return;
                }
                return;
            case 3:
                this.f13355b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f13356c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(xn.Q9(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        U4.presentFragment(xn.R9(j12));
                        return;
                    }
                }
                return;
            default:
                this.f13355b[0].dismiss();
                org.telegram.ui.ActionBar.p2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f13356c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(xn.Q9(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        U5.presentFragment(xn.R9(j13));
                        return;
                    }
                }
                return;
        }
    }

    public x7(org.telegram.ui.ActionBar.g3[] g3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f13354a = i10;
        this.f13355b = g3VarArr;
        this.f13356c = starsTransaction;
        this.d = j10;
    }
}
