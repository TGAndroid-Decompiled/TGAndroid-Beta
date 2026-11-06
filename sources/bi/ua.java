package bi;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ez;
import org.telegram.messenger.gz;
import org.telegram.messenger.qp;
import org.telegram.messenger.yr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an;
import org.telegram.ui.gs0;
import org.telegram.ui.oq;
public final class ua implements Runnable {
    public final int f4835a;
    public final int f4836b;
    public final long f4837c;

    public ua(int i7, long j3, int i10) {
        this.f4835a = i10;
        this.f4836b = i7;
        this.f4837c = j3;
    }

    @Override
    public final void run() {
        switch (this.f4835a) {
            case 0:
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f4837c;
                    if (j3 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i7 = this.f4836b;
                    long j10 = -j3;
                    if (org.telegram.messenger.t3.V(qp.s1(i7).M0(Long.valueOf(j10)))) {
                        T.presentFragment(new gs0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    oq oqVar = new oq(bundle);
                    oqVar.C0(qp.s1(i7).N0(j10));
                    T.presentFragment(oqVar);
                    return;
                }
                return;
            case 1:
                gz.C(this.f4836b).r0(ez.b("/privacy", this.f4837c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                int i10 = this.f4836b;
                long j11 = this.f4837c;
                try {
                    SQLitePreparedStatement executeFast = yr.a0(i10).f26690b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
                    T2.presentFragment(an.qa(this.f4836b, this.f4837c));
                    return;
                }
                return;
        }
    }

    public ua(long j3, int i7, int i10) {
        this.f4835a = i10;
        this.f4837c = j3;
        this.f4836b = i7;
    }
}
