package di;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.an;
public final class e9 implements Runnable {
    public final int f8505a;
    public final org.telegram.ui.ActionBar.u2[] f8506b;
    public final TL_stars.StarsTransaction f8507c;
    public final long d;

    public e9(org.telegram.ui.ActionBar.u2[] u2VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f8505a = 3;
        this.f8506b = u2VarArr;
        this.d = j3;
        this.f8507c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f8505a) {
            case 0:
                this.f8506b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f8507c;
                    int i7 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i7 != 0) {
                        T.presentFragment(an.ta(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        T.presentFragment(an.ua(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f8506b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f8507c;
                    int i10 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        T2.presentFragment(an.ta(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        T2.presentFragment(an.ua(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f8506b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f8507c;
                    int i11 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        T3.presentFragment(an.ta(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        T3.presentFragment(an.ua(j11));
                        return;
                    }
                }
                return;
            case 3:
                this.f8506b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f8507c.msg_id);
                    T4.presentFragment(new an(bundle));
                    return;
                }
                return;
            default:
                this.f8506b[0].dismiss();
                org.telegram.ui.ActionBar.e2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f8507c;
                    int i12 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        T5.presentFragment(an.ta(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        T5.presentFragment(an.ua(j12));
                        return;
                    }
                }
                return;
        }
    }

    public e9(org.telegram.ui.ActionBar.u2[] u2VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i7) {
        this.f8505a = i7;
        this.f8506b = u2VarArr;
        this.f8507c = starsTransaction;
        this.d = j3;
    }
}
