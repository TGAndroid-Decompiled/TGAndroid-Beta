package defpackage;

import android.os.Bundle;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PrivacyControlActivity;
public final class am0 implements Runnable {
    public final byte a;
    public final int b;
    public final long c;

    public am0(int i, long j, byte b) {
        this.a = b;
        this.b = i;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        int i = this.b;
        switch (b) {
            case 0:
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(zu1.ga(i, j));
                    return;
                }
                return;
            case 1:
                r7a.B(i).q0(p7a.b("/privacy", this.c, null, null, null, false, null, null, null, true, 0, 0, null, false));
                return;
            case 2:
                try {
                    SQLitePreparedStatement executeFast = jf7.Y(i).b.executeFast("REPLACE INTO search_recent VALUES(?, ?)");
                    executeFast.requery();
                    executeFast.bindLong(1, j);
                    executeFast.bindInteger(2, (int) (System.currentTimeMillis() / 1000));
                    executeFast.step();
                    executeFast.dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                e S2 = LaunchActivity.S();
                if (S2 != null) {
                    if (j >= 0) {
                        S2.presentFragment(new PrivacyControlActivity(10, false));
                        return;
                    }
                    long j2 = -j;
                    if (xc2.V(uc7.s1(i).M0(Long.valueOf(j2)))) {
                        S2.presentFragment(new ij8(j2));
                        return;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", j2);
                    bundle.putInt("type", 3);
                    bg2 bg2Var = new bg2(bundle);
                    bg2Var.B0(uc7.s1(i).N0(j2));
                    S2.presentFragment(bg2Var);
                    return;
                }
                return;
        }
    }

    public am0(long j, int i, byte b) {
        this.a = b;
        this.c = j;
        this.b = i;
    }
}
