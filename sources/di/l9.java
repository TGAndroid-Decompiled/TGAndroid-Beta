package di;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.bn;
import org.telegram.ui.is0;
import org.telegram.ui.rq;
public final class l9 implements Runnable {
    public final int f9268a;
    public final int f9269b;
    public final long f9270c;

    public l9(int i7, long j3, int i10) {
        this.f9268a = i10;
        this.f9269b = i7;
        this.f9270c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9268a) {
            case 0:
                org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f9270c;
                    if (j3 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i7 = this.f9269b;
                    long j10 = -j3;
                    if (org.telegram.messenger.v3.V(mp.u1(i7).O0(Long.valueOf(j10)))) {
                        T.presentFragment(new is0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    rq rqVar = new rq(bundle);
                    rqVar.C0(mp.u1(i7).P0(j10));
                    T.presentFragment(rqVar);
                    return;
                }
                return;
            case 1:
                int i10 = this.f9269b;
                long j11 = this.f9270c;
                try {
                    SQLitePreparedStatement executeFast = tr.a0(i10).f27056b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
            case 2:
                zy.C(this.f9269b).r0(xy.b("/privacy", this.f9270c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            default:
                org.telegram.ui.ActionBar.h2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(bn.ta(this.f9269b, this.f9270c));
                    return;
                }
                return;
        }
    }

    public l9(long j3, int i7, int i10) {
        this.f9268a = i10;
        this.f9270c = j3;
        this.f9269b = i7;
    }
}
