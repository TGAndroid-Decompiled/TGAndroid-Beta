package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class s2c implements mm3 {
    public final Integer a;
    public final r47 b;
    public final int c;
    public final long d;
    public final long e;

    public s2c(Integer num, r47 r47Var, int i, long j, long j2) {
        this.a = num;
        this.b = r47Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = u2c.S;
            Integer num = this.a;
            hashMap.remove(num);
            u2c.R.remove(num);
        }
        r47 r47Var = this.b;
        if (str == null) {
            u2c.n(r47Var);
            return;
        }
        TLRPC.Message message = r47Var.k;
        if (!z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            u2c.q(r47Var);
            jn7.f(this.c).k(jn7.A1, r47Var, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        hl.d3(new he(r47Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
    }
}
