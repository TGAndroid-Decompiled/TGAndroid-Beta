package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class lt0 implements ed {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final long d;
    public final Object e;
    public final Object f;

    public lt0(long j, nu9 nu9Var, int i, long j2, uy5 uy5Var) {
        this.b = j;
        this.e = nu9Var;
        this.c = i;
        this.d = j2;
        this.f = uy5Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                it0 it0Var = (it0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i2 = this.c;
                    setcustomverification.bot = na7.q1(i2).m1(this.b);
                    setcustomverification.peer = na7.q1(i2).h1(this.d);
                    ConnectionsManager.getInstance(i2).sendRequest(setcustomverification, new pl(zArr, it0Var, (byte) 7));
                    return;
                }
                return;
            default:
                final nu9 nu9Var = (nu9) obj2;
                final uy5 uy5Var = (uy5) obj;
                final d S = LaunchActivity.S();
                if (S != null) {
                    final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    final long j = this.b;
                    final int i3 = this.c;
                    final long j2 = this.d;
                    b3c b3cVar = new b3c() {
                        @Override
                        public final void g(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                            nu9 nu9Var2 = nu9Var;
                            int i4 = i3;
                            long j3 = j2;
                            d dVar = d.this;
                            wy wyVar = new wy(nu9Var2, i4, j3, dVar, uy5Var, (byte) 4);
                            int currentAccount = dVar.getCurrentAccount();
                            boolean[] zArr2 = uz4.a;
                            if (zArr2[currentAccount]) {
                                return;
                            }
                            zArr2[currentAccount] = true;
                            uz4.b(dVar, j, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, wyVar);
                        }
                    };
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = b3cVar;
                    twoStepVerificationActivity.w0(new lz4(S, twoStepVerificationActivity, (byte) 1));
                    return;
                }
                return;
        }
    }

    public lt0(boolean[] zArr, int i, long j, long j2, it0 it0Var) {
        this.e = zArr;
        this.c = i;
        this.b = j;
        this.d = j2;
        this.f = it0Var;
    }
}
