package bi;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.cn;
import org.telegram.ui.ks0;
import org.telegram.ui.rq;
public final class ua implements Runnable {
    public final int f4834a;
    public final int f4835b;
    public final long f4836c;

    public ua(int i7, long j3, int i10) {
        this.f4834a = i10;
        this.f4835b = i7;
        this.f4836c = j3;
    }

    @Override
    public final void run() {
        switch (this.f4834a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f4836c;
                    if (j3 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i7 = this.f4835b;
                    long j10 = -j3;
                    if (org.telegram.messenger.t3.V(qp.s1(i7).M0(Long.valueOf(j10)))) {
                        T.presentFragment(new ks0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    rq rqVar = new rq(bundle);
                    rqVar.C0(qp.s1(i7).N0(j10));
                    T.presentFragment(rqVar);
                    return;
                }
                return;
            case 1:
                gz.C(this.f4835b).r0(ez.b("/privacy", this.f4836c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                int i10 = this.f4835b;
                long j11 = this.f4836c;
                try {
                    SQLitePreparedStatement executeFast = yr.a0(i10).f26725b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j11);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(cn.sa(this.f4835b, this.f4836c));
                    return;
                }
                return;
        }
    }

    public ua(long j3, int i7, int i10) {
        this.f4834a = i10;
        this.f4836c = j3;
        this.f4835b = i7;
    }
}
