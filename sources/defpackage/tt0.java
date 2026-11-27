package defpackage;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class tt0 implements fd {
    public final byte a = 1;
    public final long b;
    public final int c;
    public final long d;
    public final Object e;
    public final Object f;

    public tt0(long j, vra vraVar, int i, long j2, v06 v06Var) {
        this.b = j;
        this.e = vraVar;
        this.c = i;
        this.d = j2;
        this.f = v06Var;
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                boolean[] zArr = (boolean[]) obj2;
                qt0 qt0Var = (qt0) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i2 = this.c;
                    setcustomverification.bot = uc7.s1(i2).o1(this.b);
                    setcustomverification.peer = uc7.s1(i2).j1(this.d);
                    ConnectionsManager.getInstance(i2).sendRequest(setcustomverification, new ql(zArr, qt0Var, (byte) 7));
                    return;
                }
                return;
            default:
                final vra vraVar = (vra) obj2;
                final v06 v06Var = (v06) obj;
                final e S = LaunchActivity.S();
                if (S != null) {
                    final TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    final long j = this.b;
                    final int i3 = this.c;
                    final long j2 = this.d;
                    b7c b7cVar = new b7c() {
                        @Override
                        public final void h(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
                            vra vraVar2 = vraVar;
                            int i4 = i3;
                            long j3 = j2;
                            e eVar = e.this;
                            wy wyVar = new wy(vraVar2, i4, j3, eVar, v06Var, (byte) 4);
                            int currentAccount = eVar.getCurrentAccount();
                            boolean[] zArr2 = z15.a;
                            if (zArr2[currentAccount]) {
                                return;
                            }
                            zArr2[currentAccount] = true;
                            z15.b(eVar, j, tL_inputCheckPasswordSRP, twoStepVerificationActivity, null, wyVar);
                        }
                    };
                    twoStepVerificationActivity.a0 = (byte) 1;
                    twoStepVerificationActivity.c0 = b7cVar;
                    twoStepVerificationActivity.x0(new p15(S, twoStepVerificationActivity, (byte) 1));
                    return;
                }
                return;
        }
    }

    public tt0(boolean[] zArr, int i, long j, long j2, qt0 qt0Var) {
        this.e = zArr;
        this.c = i;
        this.b = j;
        this.d = j2;
        this.f = qt0Var;
    }
}
