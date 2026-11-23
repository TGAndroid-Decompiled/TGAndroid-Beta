package ji;

import ai.q2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f17934a;
    public final n f17935b;

    public h(n nVar, int i7) {
        this.f17934a = i7;
        this.f17935b = nVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17934a) {
            case 0:
                n nVar = this.f17935b;
                if (nVar.f17960c == 2) {
                    if (nVar.f17978y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(nVar.f17978y);
                    sb2.append(" in=");
                    sb2.append(nVar.f17976w);
                    sb2.append("B out=");
                    sb2.append(nVar.f17977x);
                    sb2.append("B (ratio ");
                    if (nVar.f17977x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(nVar.f17976w / nVar.f17977x));
                    } else {
                        str = "-";
                    }
                    sb2.append(str);
                    sb2.append(", expect 3.00 at 48 kHz) source=");
                    int i7 = nVar.F;
                    if (i7 == 1) {
                        str2 = "MediaController";
                    } else if (i7 == 2) {
                        str2 = "AudioRecorderV2";
                    } else {
                        str2 = "none";
                    }
                    p5.c.t(sb2, str2, "VoiceLive");
                    return;
                }
                return;
            case 1:
                n nVar2 = this.f17935b;
                if (nVar2.f17960c == 2) {
                    nVar2.t();
                    return;
                }
                return;
            case 2:
                n nVar3 = this.f17935b;
                nVar3.s();
                bn bnVar = nVar3.f17958b.f38848a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new q2());
                    return;
                }
                return;
            default:
                this.f17935b.m("field send preview");
                return;
        }
    }
}
