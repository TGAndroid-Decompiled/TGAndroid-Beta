package ci;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.hp;
import org.telegram.messenger.qr;
import org.telegram.messenger.wy;
import org.telegram.messenger.yy;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.nq;
import org.telegram.ui.wm;
import org.telegram.ui.xr0;
public final class s9 implements Runnable {
    public final int f5974a;
    public final int f5975b;
    public final long f5976c;

    public s9(int i3, long j10, int i10) {
        this.f5974a = i10;
        this.f5975b = i3;
        this.f5976c = j10;
    }

    @Override
    public final void run() {
        switch (this.f5974a) {
            case 0:
                org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                if (T != null) {
                    long j10 = this.f5976c;
                    if (j10 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i3 = this.f5975b;
                    long j11 = -j10;
                    if (org.telegram.messenger.t3.V(hp.s1(i3).M0(Long.valueOf(j11)))) {
                        T.presentFragment(new xr0(j11));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j11);
                    bundle.putInt("type", 3);
                    nq nqVar = new nq(bundle);
                    nqVar.C0(hp.s1(i3).N0(j11));
                    T.presentFragment(nqVar);
                    return;
                }
                return;
            case 1:
                yy.C(this.f5975b).r0(wy.b("/privacy", this.f5976c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                int i10 = this.f5975b;
                long j12 = this.f5976c;
                try {
                    SQLitePreparedStatement executeFast = qr.a0(i10).f24936b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j12);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                org.telegram.ui.ActionBar.d2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(wm.qa(this.f5975b, this.f5976c));
                    return;
                }
                return;
        }
    }

    public s9(long j10, int i3, int i10) {
        this.f5974a = i10;
        this.f5976c = j10;
        this.f5975b = i3;
    }
}
