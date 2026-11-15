package di;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.cz;
import org.telegram.messenger.ez;
import org.telegram.messenger.np;
import org.telegram.messenger.vr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.an;
import org.telegram.ui.es0;
import org.telegram.ui.qq;
public final class j9 implements Runnable {
    public final int f8863a;
    public final int f8864b;
    public final long f8865c;

    public j9(int i7, long j3, int i10) {
        this.f8863a = i10;
        this.f8864b = i7;
        this.f8865c = j3;
    }

    @Override
    public final void run() {
        switch (this.f8863a) {
            case 0:
                org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                if (T != null) {
                    long j3 = this.f8865c;
                    if (j3 >= 0) {
                        T.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    int i7 = this.f8864b;
                    long j10 = -j3;
                    if (org.telegram.messenger.t3.V(np.s1(i7).M0(Long.valueOf(j10)))) {
                        T.presentFragment(new es0(j10));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j10);
                    bundle.putInt("type", 3);
                    qq qqVar = new qq(bundle);
                    qqVar.C0(np.s1(i7).N0(j10));
                    T.presentFragment(qqVar);
                    return;
                }
                return;
            case 1:
                int i10 = this.f8864b;
                long j11 = this.f8865c;
                try {
                    SQLitePreparedStatement executeFast = vr.a0(i10).f27222b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
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
                ez.C(this.f8864b).r0(cz.b("/privacy", this.f8865c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            default:
                org.telegram.ui.ActionBar.e2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(an.ta(this.f8864b, this.f8865c));
                    return;
                }
                return;
        }
    }

    public j9(long j3, int i7, int i10) {
        this.f8863a = i10;
        this.f8865c = j3;
        this.f8864b = i7;
    }
}
