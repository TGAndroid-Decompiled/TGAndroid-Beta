package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;
public final class b2 implements RecognitionListener {
    public final int f1128a;
    public long f1129b;
    public final c2 f1130c;

    public b2(c2 c2Var, int i7) {
        this.f1130c = c2Var;
        this.f1128a = i7;
    }

    @Override
    public final void onBeginningOfSpeech() {
        this.f1130c.f1156m = 0;
        Log.d("Dictation", "session " + this.f1128a + " speech begins");
    }

    public final void onEndOfSegmentedSession() {
        StringBuilder sb2 = new StringBuilder("session ");
        int i7 = this.f1128a;
        sb2.append(i7);
        sb2.append(" end of segmented session");
        Log.d("Dictation", sb2.toString());
        this.f1130c.j(i7, "");
    }

    @Override
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.f1128a + " end of speech");
    }

    @Override
    public final void onError(int i7) {
        this.f1130c.i(this.f1128a, i7);
    }

    @Override
    public final void onPartialResults(Bundle bundle) {
        String str;
        String a10 = c2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = ((elapsedRealtime - this.f1129b) > 400L ? 1 : ((elapsedRealtime - this.f1129b) == 400L ? 0 : -1));
        c2 c2Var = this.f1130c;
        int i10 = this.f1128a;
        if (i7 > 0 || i10 != c2Var.f1154k) {
            this.f1129b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i10, "session ", " partial ");
            m10.append(i2.c(a10));
            if (i10 != c2Var.f1154k) {
                str = " (stale)";
            } else {
                str = "";
            }
            p5.c.t(m10, str, "Dictation");
        }
        c2Var.k(i10, a10);
    }

    @Override
    public final void onReadyForSpeech(Bundle bundle) {
        c2 c2Var = this.f1130c;
        c2Var.f1155l = 0;
        Log.d("Dictation", "session " + this.f1128a + " ready in " + (SystemClock.elapsedRealtime() - c2Var.f1158o) + " ms");
    }

    @Override
    public final void onResults(Bundle bundle) {
        this.f1130c.j(this.f1128a, c2.a(bundle));
    }

    @Override
    public final void onRmsChanged(float f10) {
        c2 c2Var = this.f1130c;
        if (this.f1128a == c2Var.f1154k && !c2Var.f1153j && c2Var.f1164u == null) {
            c2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    public final void onSegmentResults(Bundle bundle) {
        String a10 = c2.a(bundle);
        c2 c2Var = this.f1130c;
        if (!c2Var.f1153j) {
            int i7 = this.f1128a;
            StringBuilder m10 = i5.c.m(i7, "session ", " segment ");
            m10.append(i2.c(a10));
            Log.d("Dictation", m10.toString());
            i2 i2Var = c2Var.f1148g;
            boolean z10 = false;
            if (!i2Var.h(i7)) {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
                m11.append(i2.c(a10));
                i2Var.j(m11.toString());
            } else {
                String n10 = i2Var.n();
                if (a10 != null && !a10.trim().isEmpty()) {
                    i2Var.a(a10.trim(), i2Var.d);
                }
                i2Var.f1240b = i2.i(i2Var.f1240b, i2Var.f1241c);
                i2Var.f1241c = "";
                i2Var.d = false;
                z10 = !n10.equals(i2Var.n());
            }
            if (z10) {
                c2Var.e();
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
