package di;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.az;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.messenger.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.bn;
import org.telegram.ui.is0;
import org.telegram.ui.rq;
public final class m9 implements Runnable {
    public final int f9355a;
    public final int f9356b;
    public final long f9357c;

    public m9(int i7, long j3, int i10) {
        this.f9355a = i10;
        this.f9356b = i7;
        this.f9357c = j3;
    }

    @Override
    public final void run() {
        switch (this.f9355a) {
            case 0:
                org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f9357c;
                    if (j3 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i7 = this.f9356b;
                    long j10 = -j3;
                    if (org.telegram.messenger.v3.V(np.u1(i7).O0(Long.valueOf(j10)))) {
                        T.presentFragment(new is0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    rq rqVar = new rq(bundle);
                    rqVar.C0(np.u1(i7).P0(j10));
                    T.presentFragment(rqVar);
                    return;
                }
                return;
            case 1:
                int i10 = this.f9356b;
                long j11 = this.f9357c;
                try {
                    SQLitePreparedStatement executeFast = ur.a0(i10).f27252b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
                az.C(this.f9356b).r0(yy.b("/privacy", this.f9357c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            default:
                org.telegram.ui.ActionBar.g2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(bn.ta(this.f9356b, this.f9357c));
                    return;
                }
                return;
        }
    }

    public m9(long j3, int i7, int i10) {
        this.f9355a = i10;
        this.f9357c = j3;
        this.f9356b = i7;
    }
}
