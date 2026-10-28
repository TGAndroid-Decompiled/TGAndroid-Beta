package bi;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wn;
public final class ma implements Runnable {
    public final int f5103a;
    public final org.telegram.ui.ActionBar.k3[] f5104b;
    public final TL_stars.StarsTransaction f5105c;
    public final long d;

    public ma(org.telegram.ui.ActionBar.k3[] k3VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f5103a = 2;
        this.f5104b = k3VarArr;
        this.d = j10;
        this.f5105c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f5103a) {
            case 0:
                this.f5104b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                if (U != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f5105c;
                    int i10 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        U.presentFragment(wn.da(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        U.presentFragment(wn.ea(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f5104b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f5105c;
                    int i11 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        U2.presentFragment(wn.da(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        U2.presentFragment(wn.ea(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f5104b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U3 = LaunchActivity.U();
                if (U3 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f5105c.msg_id);
                    U3.presentFragment(new wn(bundle));
                    return;
                }
                return;
            case 3:
                this.f5104b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U4 = LaunchActivity.U();
                if (U4 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f5105c;
                    int i12 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        U4.presentFragment(wn.da(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        U4.presentFragment(wn.ea(j12));
                        return;
                    }
                }
                return;
            default:
                this.f5104b[0].dismiss();
                org.telegram.ui.ActionBar.r2 U5 = LaunchActivity.U();
                if (U5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f5105c;
                    int i13 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i13 != 0) {
                        U5.presentFragment(wn.da(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        U5.presentFragment(wn.ea(j13));
                        return;
                    }
                }
                return;
        }
    }

    public ma(org.telegram.ui.ActionBar.k3[] k3VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i10) {
        this.f5103a = i10;
        this.f5104b = k3VarArr;
        this.f5105c = starsTransaction;
        this.d = j10;
    }
}
