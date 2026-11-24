package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class syb implements ul3 {
    public final Integer a;
    public final k27 b;
    public final int c;
    public final long d;
    public final long e;

    public syb(Integer num, k27 k27Var, int i, long j, long j2) {
        this.a = num;
        this.b = k27Var;
        this.c = i;
        this.d = j;
        this.e = j2;
    }

    @Override
    public final void a(String str, int[] iArr, boolean z) {
        if (z) {
            HashMap hashMap = uyb.S;
            Integer num = this.a;
            hashMap.remove(num);
            uyb.R.remove(num);
        }
        k27 k27Var = this.b;
        if (str == null) {
            uyb.n(k27Var);
            return;
        }
        TLRPC.Message message = k27Var.k;
        if (!z) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            message.voiceTranscription = str;
            message.voiceTranscriptionWords = iArr;
            message.voiceTranscriptionLocal = true;
            message.voiceTranscriptionFinal = false;
            message.voiceTranscriptionOpen = true;
            uyb.q(k27Var);
            kk7.f(this.c).k(kk7.z1, k27Var, null, null, Boolean.TRUE, Boolean.FALSE);
            return;
        }
        gl.d3(new ue(k27Var, message, str, iArr, this.c, this.d, (byte) 6), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
    }
}
