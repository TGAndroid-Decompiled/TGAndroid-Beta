package di;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bn;
public final class h9 implements Runnable {
    public final int f9006a;
    public final org.telegram.ui.ActionBar.w2[] f9007b;
    public final TL_stars.StarsTransaction f9008c;
    public final long d;

    public h9(org.telegram.ui.ActionBar.w2[] w2VarArr, long j3, TL_stars.StarsTransaction starsTransaction) {
        this.f9006a = 3;
        this.f9007b = w2VarArr;
        this.d = j3;
        this.f9008c = starsTransaction;
    }

    @Override
    public final void run() {
        switch (this.f9006a) {
            case 0:
                this.f9007b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    TL_stars.StarsTransaction starsTransaction = this.f9008c;
                    int i7 = starsTransaction.flags & 8192;
                    long j3 = this.d;
                    if (i7 != 0) {
                        T.presentFragment(bn.ta(starsTransaction.giveaway_post_id, j3));
                        return;
                    } else {
                        T.presentFragment(bn.ua(j3));
                        return;
                    }
                }
                return;
            case 1:
                this.f9007b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    TL_stars.StarsTransaction starsTransaction2 = this.f9008c;
                    int i10 = starsTransaction2.flags & 8192;
                    long j10 = this.d;
                    if (i10 != 0) {
                        T2.presentFragment(bn.ta(starsTransaction2.giveaway_post_id, j10));
                        return;
                    } else {
                        T2.presentFragment(bn.ua(j10));
                        return;
                    }
                }
                return;
            case 2:
                this.f9007b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T3 = LaunchActivity.T();
                if (T3 != null) {
                    TL_stars.StarsTransaction starsTransaction3 = this.f9008c;
                    int i11 = starsTransaction3.flags & 8192;
                    long j11 = this.d;
                    if (i11 != 0) {
                        T3.presentFragment(bn.ta(starsTransaction3.giveaway_post_id, j11));
                        return;
                    } else {
                        T3.presentFragment(bn.ua(j11));
                        return;
                    }
                }
                return;
            case 3:
                this.f9007b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T4 = LaunchActivity.T();
                if (T4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -this.d);
                    bundle.putInt("message_id", this.f9008c.msg_id);
                    T4.presentFragment(new bn(bundle));
                    return;
                }
                return;
            default:
                this.f9007b[0].dismiss();
                org.telegram.ui.ActionBar.g2 T5 = LaunchActivity.T();
                if (T5 != null) {
                    TL_stars.StarsTransaction starsTransaction4 = this.f9008c;
                    int i12 = starsTransaction4.flags & 8192;
                    long j12 = this.d;
                    if (i12 != 0) {
                        T5.presentFragment(bn.ta(starsTransaction4.giveaway_post_id, j12));
                        return;
                    } else {
                        T5.presentFragment(bn.ua(j12));
                        return;
                    }
                }
                return;
        }
    }

    public h9(org.telegram.ui.ActionBar.w2[] w2VarArr, TL_stars.StarsTransaction starsTransaction, long j3, int i7) {
        this.f9006a = i7;
        this.f9007b = w2VarArr;
        this.f9008c = starsTransaction;
        this.d = j3;
    }
}
