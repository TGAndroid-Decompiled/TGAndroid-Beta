package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class t0c implements fn3 {
    public final Integer a;
    public final k47 b;
    public final int c;
    public final long d;
    public final long e;

    public t0c(Integer num, k47 k47Var, int i, long j, long j2) {
        this.a = num;
        this.b = k47Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = v0c.S;
            Integer num = this.a;
            hashMap.remove(num);
            v0c.R.remove(num);
        }
        k47 k47Var = this.b;
        if (str == null) {
            v0c.n(k47Var);
            return;
        }
        TLRPC.Message message = k47Var.k;
        if (!z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            v0c.q(k47Var);
            nm7.f(this.c).k(nm7.A1, k47Var, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        gm.d3(new vf(k47Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
    }
}
