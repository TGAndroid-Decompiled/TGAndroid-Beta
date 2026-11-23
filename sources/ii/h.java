package ii;

import ai.y1;
import bi.o1;
import bi.v3;
import bi.w4;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements q1 {
    public final int f16320a = 0;
    public final int f16321b;
    public final long f16322c;
    public final long d;
    public final Object f16323e;
    public final Object f16324f;

    public h(long j3, y1 y1Var, int i7, long j10, w4 w4Var) {
        this.f16322c = j3;
        this.f16323e = y1Var;
        this.f16321b = i7;
        this.d = j10;
        this.f16324f = w4Var;
    }

    @Override
    public final void h(t1 t1Var, int i7) {
        switch (this.f16320a) {
            case 0:
                y1 y1Var = (y1) this.f16323e;
                w4 w4Var = (w4) this.f16324f;
                g2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.f16322c, twoStepVerificationActivity, y1Var, this.f16321b, this.d, w4Var);
                    twoStepVerificationActivity.f43917a0 = 1;
                    twoStepVerificationActivity.f43921c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f16323e;
                v3 v3Var = (v3) this.f16324f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.f16321b;
                    setcustomverification.bot = np.u1(i10).q1(this.f16322c);
                    setcustomverification.peer = np.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new o1(24, zArr, v3Var));
                    return;
                }
                return;
        }
    }

    public h(boolean[] zArr, int i7, long j3, long j10, v3 v3Var) {
        this.f16323e = zArr;
        this.f16321b = i7;
        this.f16322c = j3;
        this.d = j10;
        this.f16324f = v3Var;
    }
}
