package ki;

import android.os.SystemClock;
import android.text.TextUtils;
import di.u7;
import java.io.Serializable;
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.x11;
public final class r1 implements org.telegram.ui.ActionBar.q1 {
    public final int f18527a;
    public final long f18528b;
    public final long f18529c;
    public final Serializable d;
    public final Object f18530e;

    public r1(Integer num, gj gjVar, int i7, long j3, long j10) {
        this.d = num;
        this.f18530e = gjVar;
        this.f18527a = i7;
        this.f18528b = j3;
        this.f18529c = j10;
    }

    public void a(String str, int[] iArr, boolean z10) {
        Integer num = (Integer) this.d;
        gj gjVar = (gj) this.f18530e;
        if (z10) {
            x11.T.remove(num);
            x11.S.remove(num);
        }
        if (str == null) {
            x11.m(gjVar);
            return;
        }
        TLRPC.Message message = gjVar.f23819k;
        int i7 = this.f18527a;
        if (!z10) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            x11.o(gjVar);
            ns.f(i7).k(ns.A1, gjVar, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        org.telegram.messenger.g0.i3(new u7(gjVar, message, str, iArr, i7, this.f18528b), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f18529c)));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean[] zArr = (boolean[]) this.d;
        p1 p1Var = (p1) this.f18530e;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
        setcustomverification.enabled = false;
        setcustomverification.flags |= 1;
        int i10 = this.f18527a;
        setcustomverification.bot = np.s1(i10).o1(this.f18528b);
        setcustomverification.peer = np.s1(i10).j1(this.f18529c);
        ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new bi.v2(22, zArr, p1Var));
    }

    public r1(boolean[] zArr, int i7, long j3, long j10, p1 p1Var) {
        this.d = zArr;
        this.f18527a = i7;
        this.f18528b = j3;
        this.f18529c = j10;
        this.f18530e = p1Var;
    }
}
