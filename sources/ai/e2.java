package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;
public final class e2 implements RecognitionListener {
    public final int f1167a;
    public long f1168b;
    public final f2 f1169c;

    public e2(f2 f2Var, int i7) {
        this.f1169c = f2Var;
        this.f1167a = i7;
    }

    @Override
    public final void onBeginningOfSpeech() {
        this.f1169c.f1196m = 0;
        Log.d("Dictation", "session " + this.f1167a + " speech begins");
    }

    public final void onEndOfSegmentedSession() {
        StringBuilder sb2 = new StringBuilder("session ");
        int i7 = this.f1167a;
        sb2.append(i7);
        sb2.append(" end of segmented session");
        Log.d("Dictation", sb2.toString());
        this.f1169c.k(i7, "");
    }

    @Override
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.f1167a + " end of speech");
    }

    @Override
    public final void onError(int i7) {
        this.f1169c.j(this.f1167a, i7);
    }

    @Override
    public final void onPartialResults(Bundle bundle) {
        String str;
        String a10 = f2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i7 = ((elapsedRealtime - this.f1168b) > 400L ? 1 : ((elapsedRealtime - this.f1168b) == 400L ? 0 : -1));
        f2 f2Var = this.f1169c;
        int i10 = this.f1167a;
        if (i7 > 0 || i10 != f2Var.f1194k) {
            this.f1168b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i10, "session ", " partial ");
            m10.append(l2.c(a10));
            if (i10 != f2Var.f1194k) {
                str = " (stale)";
            } else {
                str = "";
            }
            p5.c.t(m10, str, "Dictation");
        }
        f2Var.l(i10, a10);
    }

    @Override
    public final void onReadyForSpeech(Bundle bundle) {
        f2 f2Var = this.f1169c;
        f2Var.f1195l = 0;
        Log.d("Dictation", "session " + this.f1167a + " ready in " + (SystemClock.elapsedRealtime() - f2Var.f1198o) + " ms");
    }

    @Override
    public final void onResults(Bundle bundle) {
        this.f1169c.k(this.f1167a, f2.a(bundle));
    }

    @Override
    public final void onRmsChanged(float f10) {
        f2 f2Var = this.f1169c;
        if (this.f1167a == f2Var.f1194k && !f2Var.f1193j && f2Var.f1204u == null) {
            f2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    public final void onSegmentResults(Bundle bundle) {
        String a10 = f2.a(bundle);
        f2 f2Var = this.f1169c;
        if (!f2Var.f1193j) {
            int i7 = this.f1167a;
            StringBuilder m10 = i5.c.m(i7, "session ", " segment ");
            m10.append(l2.c(a10));
            Log.d("Dictation", m10.toString());
            l2 l2Var = f2Var.f1188g;
            boolean z10 = false;
            if (!l2Var.h(i7)) {
                StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
                m11.append(l2.c(a10));
                l2Var.j(m11.toString());
            } else {
                String n10 = l2Var.n();
                if (a10 != null && !a10.trim().isEmpty()) {
                    l2Var.a(a10.trim(), l2Var.d);
                }
                l2Var.f1284b = l2.i(l2Var.f1284b, l2Var.f1285c);
                l2Var.f1285c = "";
                l2Var.d = false;
                z10 = !n10.equals(l2Var.n());
            }
            if (z10) {
                f2Var.f();
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
