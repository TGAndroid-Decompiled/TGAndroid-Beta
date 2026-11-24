package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class nta implements Runnable {
    public final byte a;
    public final fx0[] b;
    public final TL_stars.StarsTransaction c;
    public final long d;

    public nta(fx0[] fx0VarArr, long j, TL_stars.StarsTransaction starsTransaction) {
        this.a = (byte) 3;
        this.b = fx0VarArr;
        this.d = j;
        this.c = starsTransaction;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_stars.StarsTransaction starsTransaction = this.c;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S.presentFragment(mu1.U9(j));
                        return;
                    }
                }
                return;
            case 1:
                fx0VarArr[0].dismiss();
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S2.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S2.presentFragment(mu1.U9(j));
                        return;
                    }
                }
                return;
            case 2:
                fx0VarArr[0].dismiss();
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S3.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S3.presentFragment(mu1.U9(j));
                        return;
                    }
                }
                return;
            case 3:
                fx0VarArr[0].dismiss();
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    bundle.putInt("message_id", starsTransaction.msg_id);
                    S4.presentFragment(new mu1(bundle));
                    return;
                }
                return;
            default:
                fx0VarArr[0].dismiss();
                d S5 = LaunchActivity.S();
                if (S5 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S5.presentFragment(mu1.T9(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S5.presentFragment(mu1.U9(j));
                        return;
                    }
                }
                return;
        }
    }

    public nta(fx0[] fx0VarArr, TL_stars.StarsTransaction starsTransaction, long j, byte b) {
        this.a = b;
        this.b = fx0VarArr;
        this.c = starsTransaction;
        this.d = j;
    }
}
