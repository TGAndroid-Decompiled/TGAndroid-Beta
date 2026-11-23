package ai;

import android.util.Log;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.ls;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h21;
import org.telegram.ui.Components.j21;
import org.telegram.ui.Dictation.DictationAsr;
public final class g implements Runnable {
    public final int f1194a = 1;
    public final float[] f1195b;
    public final android.support.v4.media.session.a0 f1196c;
    public final h21 d;
    public final boolean[] f1197e;

    public g(float[] fArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, boolean[] zArr) {
        this.f1195b = fArr;
        this.f1196c = a0Var;
        this.d = h21Var;
        this.f1197e = zArr;
    }

    @Override
    public final void run() {
        switch (this.f1194a) {
            case 0:
                final boolean[] zArr = this.f1197e;
                final android.support.v4.media.session.a0 a0Var = this.f1196c;
                final h21 h21Var = this.d;
                final float[] fArr = this.f1195b;
                p[] pVarArr = DictationAsr.f43033a;
                if (!zArr[0]) {
                    if (a0Var == null) {
                        gj gjVar = h21Var.f35713b;
                        Integer valueOf = Integer.valueOf(j21.r(gjVar));
                        int i7 = gjVar.K1;
                        j21.R.remove(valueOf);
                        j21.S.remove(valueOf);
                        HashMap hashMap = j21.P;
                        if (hashMap != null) {
                            hashMap.remove(valueOf);
                        }
                        if (s2.f26694a) {
                            a8.b("local transcription of msg_id=" + gjVar.e1() + ": unknown language, no words");
                        }
                        TLRPC.Message message = gjVar.f24177k;
                        message.voiceTranscription = "";
                        message.voiceTranscriptionWords = null;
                        message.voiceTranscriptionLocal = true;
                        message.voiceTranscriptionFinal = true;
                        message.voiceTranscriptionOpen = true;
                        message.voiceTranscriptionId = 0L;
                        j21.q(gjVar);
                        ls f10 = ls.f(i7);
                        Boolean bool = Boolean.TRUE;
                        f10.k(115, gjVar, null, null, bool, bool);
                        return;
                    }
                    DictationAsr.e0((p) a0Var.f1675b, new q() {
                        @Override
                        public final void a(boolean z10) {
                            boolean[] zArr2 = zArr;
                            android.support.v4.media.session.a0 a0Var2 = a0Var;
                            h21 h21Var2 = h21Var;
                            float[] fArr2 = fArr;
                            p[] pVarArr2 = DictationAsr.f43033a;
                            if (zArr2[0]) {
                                return;
                            }
                            if (!z10) {
                                p pVar = (p) a0Var2.f1675b;
                                if (pVar != null && pVar.f1446f == 0 && !DictationAsr.y(pVar) && !g1.b()) {
                                    HashMap hashMap2 = j21.S;
                                    Integer num = h21Var2.f35712a;
                                    hashMap2.remove(num);
                                    j21.R.remove(num);
                                    j21.o(h21Var2.f35713b);
                                    return;
                                }
                                h21Var2.a(null, null, true);
                                return;
                            }
                            new Thread(new g(fArr2, a0Var2, h21Var2, zArr2), "DictationAsrFile").start();
                        }
                    });
                    return;
                }
                return;
            default:
                float[] fArr2 = this.f1195b;
                android.support.v4.media.session.a0 a0Var2 = this.f1196c;
                h21 h21Var2 = this.d;
                boolean[] zArr2 = this.f1197e;
                try {
                    DictationAsr.a0(fArr2, a0Var2, h21Var2, zArr2);
                    return;
                } catch (Throwable th2) {
                    Log.e("Dictation", "tinyasr: transcription failed", th2);
                    org.telegram.messenger.g0.g3(new f(zArr2, h21Var2, 1));
                    return;
                }
        }
    }

    public g(boolean[] zArr, android.support.v4.media.session.a0 a0Var, h21 h21Var, float[] fArr) {
        this.f1197e = zArr;
        this.f1196c = a0Var;
        this.d = h21Var;
        this.f1195b = fArr;
    }
}
