package defpackage;

import android.os.Bundle;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class qxa implements Runnable {
    public final byte a;
    public final nx0[] b;
    public final TL_stars.StarsTransaction c;
    public final long d;

    public qxa(nx0[] nx0VarArr, long j, TL_stars.StarsTransaction starsTransaction) {
        this.a = (byte) 3;
        this.b = nx0VarArr;
        this.d = j;
        this.c = starsTransaction;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.d;
        TL_stars.StarsTransaction starsTransaction = this.c;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].dismiss();
                e S = LaunchActivity.S();
                if (S != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S.presentFragment(zu1.ga(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S.presentFragment(zu1.ha(j));
                        return;
                    }
                }
                return;
            case 1:
                nx0VarArr[0].dismiss();
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S2.presentFragment(zu1.ga(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S2.presentFragment(zu1.ha(j));
                        return;
                    }
                }
                return;
            case 2:
                nx0VarArr[0].dismiss();
                e S3 = LaunchActivity.S();
                if (S3 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S3.presentFragment(zu1.ga(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S3.presentFragment(zu1.ha(j));
                        return;
                    }
                }
                return;
            case 3:
                nx0VarArr[0].dismiss();
                e S4 = LaunchActivity.S();
                if (S4 != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", -j);
                    bundle.putInt("message_id", starsTransaction.msg_id);
                    S4.presentFragment(new zu1(bundle));
                    return;
                }
                return;
            default:
                nx0VarArr[0].dismiss();
                e S5 = LaunchActivity.S();
                if (S5 != null) {
                    if ((starsTransaction.flags & 8192) != 0) {
                        S5.presentFragment(zu1.ga(starsTransaction.giveaway_post_id, j));
                        return;
                    } else {
                        S5.presentFragment(zu1.ha(j));
                        return;
                    }
                }
                return;
        }
    }

    public qxa(nx0[] nx0VarArr, TL_stars.StarsTransaction starsTransaction, long j, byte b) {
        this.a = b;
        this.b = nx0VarArr;
        this.c = starsTransaction;
        this.d = j;
    }
}
