package ci;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wm;
public final class n9 implements Runnable {
    public final int f5650a;
    public final org.telegram.ui.ActionBar.t2[] f5651b;
    public final TL_stars.StarsTransaction f5652c;
    public final long d;

    public n9(org.telegram.ui.ActionBar.t2[] t2VarArr, long j10, TL_stars.StarsTransaction starsTransaction) {
        this.f5650a = 3;
        this.f5651b = t2VarArr;
        this.d = j10;
        this.f5652c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f5650a) {
            case 0:
                this.f5651b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f5652c;
                    int i3 = starsTransaction.flags & 8192;
                    long j10 = this.d;
                    if (i3 != 0) {
                        T.presentFragment(wm.qa(starsTransaction.giveaway_post_id, j10));
                        return;
                    } else {
                        T.presentFragment(wm.ra(j10));
                        return;
                    }
                }
                return;
            case 1:
                this.f5651b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f5652c;
                    int i10 = starsTransaction2.flags & 8192;
                    long j11 = this.d;
                    if (i10 != 0) {
                        T2.presentFragment(wm.qa(starsTransaction2.giveaway_post_id, j11));
                        return;
                    } else {
                        T2.presentFragment(wm.ra(j11));
                        return;
                    }
                }
                return;
            case 2:
                this.f5651b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f5652c;
                    int i11 = starsTransaction3.flags & 8192;
                    long j12 = this.d;
                    if (i11 != 0) {
                        T3.presentFragment(wm.qa(starsTransaction3.giveaway_post_id, j12));
                        return;
                    } else {
                        T3.presentFragment(wm.ra(j12));
                        return;
                    }
                }
                return;
            case 3:
                this.f5651b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f5652c.msg_id);
                    T4.presentFragment(new wm(bundle));
                    return;
                }
                return;
            default:
                this.f5651b[0].dismiss();
                org.telegram.ui.ActionBar.d2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f5652c;
                    int i12 = starsTransaction4.flags & 8192;
                    long j13 = this.d;
                    if (i12 != 0) {
                        T5.presentFragment(wm.qa(starsTransaction4.giveaway_post_id, j13));
                        return;
                    } else {
                        T5.presentFragment(wm.ra(j13));
                        return;
                    }
                }
                return;
        }
    }

    public n9(org.telegram.ui.ActionBar.t2[] t2VarArr, TL_stars.StarsTransaction starsTransaction, long j10, int i3) {
        this.f5650a = i3;
        this.f5651b = t2VarArr;
        this.f5652c = starsTransaction;
        this.d = j10;
    }
}
