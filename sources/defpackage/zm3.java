package defpackage;

import android.util.Log;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Dictation.DictationAsr;
public final class zm3 implements Runnable {
    public final byte a = 1;
    public final float[] b;
    public final in3 c;
    public final t0c d;
    public final boolean[] e;

    public zm3(float[] fArr, in3 in3Var, t0c t0cVar, boolean[] zArr) {
        this.b = fArr;
        this.c = in3Var;
        this.d = t0cVar;
        this.e = zArr;
    }

    @Override
    public final void run() {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.e;
                in3 in3Var = this.c;
                t0c t0cVar = this.d;
                float[] fArr = this.b;
                gn3[] gn3VarArr = DictationAsr.a;
                if (!zArr[0]) {
                    if (in3Var == null) {
                        k47 k47Var = t0cVar.b;
                        Integer valueOf = Integer.valueOf(v0c.r(k47Var));
                        int i = k47Var.K1;
                        v0c.R.remove(valueOf);
                        v0c.S.remove(valueOf);
                        HashMap hashMap = v0c.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (e21.a) {
                            fc4.b("local transcription of msg_id=" + k47Var.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = k47Var.k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        v0c.q(k47Var);
                        nm7 f = nm7.f(i);
                        Boolean bool = Boolean.TRUE;
                        f.k(116, k47Var, null, null, bool, bool);
                        return;
                    }
                    DictationAsr.i0((gn3) in3Var.b, false, new an3(zArr, in3Var, t0cVar, fArr));
                    return;
                }
                return;
            default:
                float[] fArr2 = this.b;
                in3 in3Var2 = this.c;
                t0c t0cVar2 = this.d;
                boolean[] zArr2 = this.e;
                try {
                    DictationAsr.d0(fArr2, in3Var2, t0cVar2, zArr2);
                    return;
                } catch (Throwable th) {
                    Log.e("Dictation", "tinyasr: transcription failed", th);
                    gm.c3(new ym3(zArr2, t0cVar2, (byte) 1));
                    return;
                }
        }
    }

    public zm3(boolean[] zArr, in3 in3Var, t0c t0cVar, float[] fArr) {
        this.e = zArr;
        this.c = in3Var;
        this.d = t0cVar;
        this.b = fArr;
    }
}
