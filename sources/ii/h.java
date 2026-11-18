package ii;

import ai.v1;
import android.os.SystemClock;
import android.text.TextUtils;
import bi.k1;
import bi.l4;
import bi.r3;
import bi.s4;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.g21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class h implements r1 {
    public final int f16292a = 0;
    public final int f16293b;
    public final long f16294c;
    public final long d;
    public final Object f16295e;
    public final Object f16296f;

    public h(long j3, v1 v1Var, int i7, long j10, s4 s4Var) {
        this.f16294c = j3;
        this.f16295e = v1Var;
        this.f16293b = i7;
        this.d = j10;
        this.f16296f = s4Var;
    }

    public void a(String str, int[] iArr, boolean z10) {
        Integer num = (Integer) this.f16295e;
        fj fjVar = (fj) this.f16296f;
        if (z10) {
            g21.S.remove(num);
            g21.R.remove(num);
        }
        if (str == null) {
            g21.m(fjVar);
            return;
        }
        TLRPC.Message message = fjVar.f23965k;
        int i7 = this.f16293b;
        if (!z10) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            g21.o(fjVar);
            ks.f(i7).k(ks.A1, fjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        g0.h3(new l4(fjVar, message, str, iArr, i7, this.f16294c), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.d)));
    }

    @Override
    public void h(u1 u1Var, int i7) {
        switch (this.f16292a) {
            case 0:
                v1 v1Var = (v1) this.f16295e;
                s4 s4Var = (s4) this.f16296f;
                h2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.f16294c, twoStepVerificationActivity, v1Var, this.f16293b, this.d, s4Var);
                    twoStepVerificationActivity.f43872a0 = 1;
                    twoStepVerificationActivity.f43876c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    return;
                }
                return;
            default:
                boolean[] zArr = (boolean[]) this.f16295e;
                r3 r3Var = (r3) this.f16296f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.f16293b;
                    setcustomverification.bot = mp.u1(i10).q1(this.f16294c);
                    setcustomverification.peer = mp.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new k1(24, zArr, r3Var));
                    return;
                }
                return;
        }
    }

    public h(Integer num, fj fjVar, int i7, long j3, long j10) {
        this.f16295e = num;
        this.f16296f = fjVar;
        this.f16293b = i7;
        this.f16294c = j3;
        this.d = j10;
    }

    public h(boolean[] zArr, int i7, long j3, long j10, r3 r3Var) {
        this.f16295e = zArr;
        this.f16293b = i7;
        this.f16294c = j3;
        this.d = j10;
        this.f16296f = r3Var;
    }
}
