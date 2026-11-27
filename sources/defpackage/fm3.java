package defpackage;

import android.util.Log;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
public final class fm3 implements Runnable {
    public final byte a = 1;
    public final float[] b;
    public final pm3 c;
    public final s2c d;
    public final boolean[] e;

    public fm3(float[] fArr, pm3 pm3Var, s2c s2cVar, boolean[] zArr) {
        this.b = fArr;
        this.c = pm3Var;
        this.d = s2cVar;
        this.e = zArr;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.e;
                pm3 pm3Var = this.c;
                s2c s2cVar = this.d;
                float[] fArr = this.b;
                nm3[] nm3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (pm3Var == null) {
                        r47 r47Var = s2cVar.b;
                        Integer valueOf = Integer.valueOf(u2c.r(r47Var));
                        int i = r47Var.K1;
                        u2c.R.remove(valueOf);
                        u2c.S.remove(valueOf);
                        HashMap hashMap = u2c.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (f11.a) {
                            cc4.b("local transcription of msg_id=" + r47Var.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = r47Var.k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        u2c.q(r47Var);
                        jn7 f = jn7.f(i);
                        Boolean bool = Boolean.TRUE;
                        f.k(116, r47Var, null, null, bool, bool);
                        return;
                    }
                    DictationAsr.k0((nm3) pm3Var.b, false, new im3(zArr, pm3Var, s2cVar, fArr));
                    return;
                }
                return;
            default:
                float[] fArr2 = this.b;
                pm3 pm3Var2 = this.c;
                s2c s2cVar2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.f0(fArr2, pm3Var2, s2cVar2, zArr2);
                    return;
                } catch (Throwable th) {
                    Log.e("Dictation", "tinyasr: transcription failed", th);
                    hl.c3(new em3(zArr2, s2cVar2, (byte) 1));
                    return;
                }
        }
    }

    public fm3(boolean[] zArr, pm3 pm3Var, s2c s2cVar, float[] fArr) {
        this.e = zArr;
        this.c = pm3Var;
        this.d = s2cVar;
        this.b = fArr;
    }
}
