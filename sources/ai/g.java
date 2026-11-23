package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.fj;
import org.telegram.messenger.ks;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.i21;
import org.telegram.ui.Dictation.DictationAsr;
public final class g implements Runnable {
    public final int f1199a = 1;
    public final float[] f1200b;
    public final android.support.v4.media.session.a0 f1201c;
    public final g21 d;
    public final boolean[] f1202e;

    public g(float[] fArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, boolean[] zArr) {
        this.f1200b = fArr;
        this.f1201c = a0Var;
        this.d = g21Var;
        this.f1202e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1199a) {
            case 0:
                boolean[] zArr = this.f1202e;
                android.support.v4.media.session.a0 a0Var = this.f1201c;
                g21 g21Var = this.d;
                float[] fArr = this.f1200b;
                q[] qVarArr = DictationAsr.f43143a;
                if (!zArr[0]) {
                    if (a0Var == null) {
                        fj fjVar = g21Var.f35295b;
                        Integer valueOf = Integer.valueOf(i21.r(fjVar));
                        int i7 = fjVar.K1;
                        i21.R.remove(valueOf);
                        i21.S.remove(valueOf);
                        HashMap hashMap = i21.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (s2.f26829a) {
                            a8.b("local transcription of msg_id=" + fjVar.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = fjVar.f24073k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        i21.q(fjVar);
                        ks f10 = ks.f(i7);
                        Boolean bool = Boolean.TRUE;
                        f10.k(115, fjVar, null, null, bool, bool);
                        return;
                    }
                    DictationAsr.i0((q) a0Var.f1676b, false, new h(zArr, a0Var, g21Var, fArr));
                    return;
                }
                return;
            default:
                float[] fArr2 = this.f1200b;
                android.support.v4.media.session.a0 a0Var2 = this.f1201c;
                g21 g21Var2 = this.d;
                boolean[] zArr2 = this.f1202e;
                try {
                    DictationAsr.e0(fArr2, a0Var2, g21Var2, zArr2);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new f(zArr2, g21Var2, 1));
                    return;
                }
        }
    }

    public g(boolean[] zArr, android.support.v4.media.session.a0 a0Var, g21 g21Var, float[] fArr) {
        this.f1202e = zArr;
        this.f1201c = a0Var;
        this.d = g21Var;
        this.f1200b = fArr;
    }
}
