package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;
public final class d2 implements RecognitionListener {
    public final int f1147a;
    public long f1148b;
    public final e2 f1149c;

    public d2(e2 e2Var, int i7) {
        this.f1149c = e2Var;
        this.f1147a = i7;
    }

    @Override
    public final void onBeginningOfSpeech() {
        this.f1149c.f1181m = 0;
        Log.d("Dictation", "session " + this.f1147a + " speech begins");
    }

    public final void onEndOfSegmentedSession() {
        StringBuilder sb2 = new StringBuilder("session ");
        int i7 = this.f1147a;
        sb2.append(i7);
        sb2.append(" end of segmented session");
        Log.d("Dictation", sb2.toString());
        this.f1149c.j(i7, "");
    }

    @Override
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.f1147a + " end of speech");
    }

    @Override
    public final void onError(int i7) {
        this.f1149c.i(this.f1147a, i7);
    }

    @Override
    public final void onPartialResults(Bundle bundle) {
        String str;
        String a10 = e2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = ((elapsedRealtime - this.f1148b) > 400L ? 1 : ((elapsedRealtime - this.f1148b) == 400L ? 0 : -1));
        e2 e2Var = this.f1149c;
        int i10 = this.f1147a;
        if (i7 > 0 || i10 != e2Var.f1179k) {
            this.f1148b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i10, "session ", " partial ");
            m10.append(k2.c(a10));
            if (i10 != e2Var.f1179k) {
                str = " (stale)";
            } else {
                str = "";
            }
            p5.c.t(m10, str, "Dictation");
        }
        e2Var.k(i10, a10);
    }

    @Override
    public final void onReadyForSpeech(Bundle bundle) {
        e2 e2Var = this.f1149c;
        e2Var.f1180l = 0;
        Log.d("Dictation", "session " + this.f1147a + " ready in " + (SystemClock.elapsedRealtime() - e2Var.f1183o) + " ms");
    }

    @Override
    public final void onResults(Bundle bundle) {
        this.f1149c.j(this.f1147a, e2.a(bundle));
    }

    @Override
    public final void onRmsChanged(float f10) {
        e2 e2Var = this.f1149c;
        if (this.f1147a == e2Var.f1179k && !e2Var.f1178j && e2Var.f1189u == null) {
            e2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    public final void onSegmentResults(Bundle bundle) {
        String a10 = e2.a(bundle);
        e2 e2Var = this.f1149c;
        if (!e2Var.f1178j) {
            int i7 = this.f1147a;
            StringBuilder m10 = i5.c.m(i7, "session ", " segment ");
            m10.append(k2.c(a10));
            Log.d("Dictation", m10.toString());
            k2 k2Var = e2Var.f1173g;
            boolean z10 = false;
            if (!k2Var.h(i7)) {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
                m11.append(k2.c(a10));
                k2Var.j(m11.toString());
            } else {
                String n10 = k2Var.n();
                if (a10 != null && !a10.trim().isEmpty()) {
                    k2Var.a(a10.trim(), k2Var.d);
                }
                k2Var.f1266b = k2.i(k2Var.f1266b, k2Var.f1267c);
                k2Var.f1267c = "";
                k2Var.d = false;
                z10 = !n10.equals(k2Var.n());
            }
            if (z10) {
                e2Var.e();
            }
        }
    }

    @Override
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override
    public final void onEvent(int i7, Bundle bundle) {
    }
}
