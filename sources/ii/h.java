package ii;

import ai.s1;
import bi.o1;
import bi.x3;
import bi.z4;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements q1 {
    public final int f16383a = 0;
    public final int f16384b;
    public final long f16385c;
    public final long d;
    public final Object f16386e;
    public final Object f16387f;

    public h(long j3, s1 s1Var, int i7, long j10, z4 z4Var) {
        this.f16385c = j3;
        this.f16386e = s1Var;
        this.f16384b = i7;
        this.d = j10;
        this.f16387f = z4Var;
    }

    @Override
    public final void i(t1 t1Var, int i7) {
        switch (this.f16383a) {
            case 0:
                s1 s1Var = (s1) this.f16386e;
                z4 z4Var = (z4) this.f16387f;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.f16385c, twoStepVerificationActivity, s1Var, this.f16384b, this.d, z4Var);
                    twoStepVerificationActivity.f43998a0 = 1;
                    twoStepVerificationActivity.f44002c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f16386e;
                x3 x3Var = (x3) this.f16387f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.f16384b;
                    setcustomverification.bot = mp.u1(i10).q1(this.f16385c);
                    setcustomverification.peer = mp.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new o1(24, zArr, x3Var));
                    return;
                }
                return;
        }
    }

    public h(boolean[] zArr, int i7, long j3, long j10, x3 x3Var) {
        this.f16386e = zArr;
        this.f16384b = i7;
        this.f16385c = j3;
        this.d = j10;
        this.f16387f = x3Var;
    }
}
