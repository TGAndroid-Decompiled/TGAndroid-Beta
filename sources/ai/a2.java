package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;
public final class a2 implements RecognitionListener {
    public final int f1119a;
    public long f1120b;
    public final b2 f1121c;

    public a2(b2 b2Var, int i7) {
        this.f1121c = b2Var;
        this.f1119a = i7;
    }

    @Override
    public final void onBeginningOfSpeech() {
        this.f1121c.f1151m = 0;
        Log.d("Dictation", "session " + this.f1119a + " speech begins");
    }

    public final void onEndOfSegmentedSession() {
        StringBuilder sb2 = new StringBuilder("session ");
        int i7 = this.f1119a;
        sb2.append(i7);
        sb2.append(" end of segmented session");
        Log.d("Dictation", sb2.toString());
        this.f1121c.j(i7, "");
    }

    @Override
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.f1119a + " end of speech");
    }

    @Override
    public final void onError(int i7) {
        this.f1121c.i(this.f1119a, i7);
    }

    @Override
    public final void onPartialResults(Bundle bundle) {
        String str;
        String a10 = b2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = ((elapsedRealtime - this.f1120b) > 400L ? 1 : ((elapsedRealtime - this.f1120b) == 400L ? 0 : -1));
        b2 b2Var = this.f1121c;
        int i10 = this.f1119a;
        if (i7 > 0 || i10 != b2Var.f1148k) {
            this.f1120b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i10, "session ", " partial \"");
            m10.append(h2.c(a10));
            m10.append("\"");
            if (i10 != b2Var.f1148k) {
                str = " (stale)";
            } else {
                str = "";
            }
            r.b.t(m10, str, "Dictation");
        }
        b2Var.k(i10, a10);
    }

    @Override
    public final void onReadyForSpeech(Bundle bundle) {
        b2 b2Var = this.f1121c;
        b2Var.f1150l = 0;
        Log.d("Dictation", "session " + this.f1119a + " ready in " + (SystemClock.elapsedRealtime() - b2Var.f1153o) + " ms");
    }

    @Override
    public final void onResults(Bundle bundle) {
        this.f1121c.j(this.f1119a, b2.a(bundle));
    }

    @Override
    public final void onRmsChanged(float f10) {
        b2 b2Var = this.f1121c;
        if (this.f1119a == b2Var.f1148k && !b2Var.f1146j && b2Var.f1159u == null) {
            b2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    public final void onSegmentResults(Bundle bundle) {
        String a10 = b2.a(bundle);
        b2 b2Var = this.f1121c;
        if (!b2Var.f1146j) {
            int i7 = this.f1119a;
            StringBuilder m10 = i5.c.m(i7, "session ", " segment \"");
            m10.append(h2.c(a10));
            m10.append("\"");
            Log.d("Dictation", m10.toString());
            h2 h2Var = b2Var.f1141g;
            boolean z10 = false;
            if (!h2Var.h(i7)) {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
                m11.append(h2.c(a10));
                h2Var.j(m11.toString());
            } else {
                String n10 = h2Var.n();
                if (a10 != null && !a10.trim().isEmpty()) {
                    h2Var.a(a10.trim(), h2Var.d);
                }
                h2Var.f1239b = h2.i(h2Var.f1239b, h2Var.f1240c);
                h2Var.f1240c = "";
                h2Var.d = false;
                z10 = !n10.equals(h2Var.n());
            }
            if (z10) {
                b2Var.e();
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
