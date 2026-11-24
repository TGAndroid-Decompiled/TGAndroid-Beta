package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class tu0 implements ee {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final long d;
    public final Object e;
    public final Object f;

    public tu0(long j, ts9 ts9Var, int i, long j2, u06 u06Var) {
        this.b = j;
        this.e = ts9Var;
        this.c = i;
        this.d = j2;
        this.f = u06Var;
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                qu0 qu0Var = (qu0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i2 = this.c;
                    setcustomverification.bot = oc7.r1(i2).n1(this.b);
                    setcustomverification.peer = oc7.r1(i2).i1(this.d);
                    ConnectionsManager.getInstance(i2).sendRequest(setcustomverification, new pm(zArr, qu0Var, (byte) 7));
                    return;
                }
                return;
            default:
                final ts9 ts9Var = (ts9) obj2;
                final u06 u06Var = (u06) obj;
                final d S = LaunchActivity.S();
                if (S != null) {
                    final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    final long j = this.b;
                    final int i3 = this.c;
                    final long j2 = this.d;
                    c5c c5cVar = new c5c() {
                        @Override
                        public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                            ts9 ts9Var2 = ts9Var;
                            int i4 = i3;
                            long j3 = j2;
                            d dVar = d.this;
                            wz wzVar = new wz(ts9Var2, i4, j3, dVar, u06Var, (byte) 4);
                            int currentAccount = dVar.getCurrentAccount();
                            boolean[] zArr2 = u15.a;
                            if (zArr2[currentAccount]) {
                                return;
                            }
                            zArr2[currentAccount] = true;
                            u15.b(dVar, j, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, wzVar);
                        }
                    };
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = c5cVar;
                    twoStepVerificationActivity.x0(new k15(S, twoStepVerificationActivity, (byte) 1));
                    return;
                }
                return;
        }
    }

    public tu0(boolean[] zArr, int i, long j, long j2, qu0 qu0Var) {
        this.e = zArr;
        this.c = i;
        this.b = j;
        this.d = j2;
        this.f = qu0Var;
    }
}
