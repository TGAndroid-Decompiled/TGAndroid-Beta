package ii;

import ai.r1;
import bi.o1;
import bi.x3;
import bi.z4;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements q1 {
    public final int f16286a = 0;
    public final int f16287b;
    public final long f16288c;
    public final long d;
    public final Object f16289e;
    public final Object f16290f;

    public h(long j3, r1 r1Var, int i7, long j10, z4 z4Var) {
        this.f16288c = j3;
        this.f16289e = r1Var;
        this.f16287b = i7;
        this.d = j10;
        this.f16290f = z4Var;
    }

    @Override
    public final void h(t1 t1Var, int i7) {
        switch (this.f16286a) {
            case 0:
                r1 r1Var = (r1) this.f16289e;
                z4 z4Var = (z4) this.f16290f;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.f16288c, twoStepVerificationActivity, r1Var, this.f16287b, this.d, z4Var);
                    twoStepVerificationActivity.f43882a0 = 1;
                    twoStepVerificationActivity.f43886c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f16289e;
                x3 x3Var = (x3) this.f16290f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.f16287b;
                    setcustomverification.bot = np.u1(i10).q1(this.f16288c);
                    setcustomverification.peer = np.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new o1(24, zArr, x3Var));
                    return;
                }
                return;
        }
    }

    public h(boolean[] zArr, int i7, long j3, long j10, x3 x3Var) {
        this.f16289e = zArr;
        this.f16287b = i7;
        this.f16288c = j3;
        this.d = j10;
        this.f16290f = x3Var;
    }
}
