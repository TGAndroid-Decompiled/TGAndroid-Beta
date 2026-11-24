package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class qva implements Runnable {
    public final byte a;
    public final my0[] b;
    public final TL_stars.StarsTransaction c;
    public final long d;

    public qva(my0[] my0VarArr, long j, TL_stars.StarsTransaction starsTransaction) {
        this.a = (byte) 3;
        this.b = my0VarArr;
        this.d = j;
        this.c = starsTransaction;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_stars.StarsTransaction starsTransaction = this.c;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].dismiss();
                d S = LaunchActivity.S();
                if (S != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S.presentFragment(yv1.fa(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S.presentFragment(yv1.ga(j));
                        return;
                    }
                }
                return;
            case 1:
                my0VarArr[0].dismiss();
                d S2 = LaunchActivity.S();
                if (S2 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S2.presentFragment(yv1.fa(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S2.presentFragment(yv1.ga(j));
                        return;
                    }
                }
                return;
            case 2:
                my0VarArr[0].dismiss();
                d S3 = LaunchActivity.S();
                if (S3 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S3.presentFragment(yv1.fa(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S3.presentFragment(yv1.ga(j));
                        return;
                    }
                }
                return;
            case 3:
                my0VarArr[0].dismiss();
                d S4 = LaunchActivity.S();
                if (S4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    bundle.putInt("message_id", starsTransaction.msg_id);
                    S4.presentFragment(new yv1(bundle));
                    return;
                }
                return;
            default:
                my0VarArr[0].dismiss();
                d S5 = LaunchActivity.S();
                if (S5 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S5.presentFragment(yv1.fa(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S5.presentFragment(yv1.ga(j));
                        return;
                    }
                }
                return;
        }
    }

    public qva(my0[] my0VarArr, TL_stars.StarsTransaction starsTransaction, long j, byte b) {
        this.a = b;
        this.b = my0VarArr;
        this.c = starsTransaction;
        this.d = j;
    }
}
