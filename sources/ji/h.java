package ji;

import ai.a3;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f17968a;
    public final o f17969b;

    public h(o oVar, int i7) {
        this.f17968a = i7;
        this.f17969b = oVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17968a) {
            case 0:
                o oVar = this.f17969b;
                if (oVar.f17997c == 2) {
                    if (oVar.f18015y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(oVar.f18015y);
                    sb2.append(" in=");
                    sb2.append(oVar.f18013w);
                    sb2.append("B out=");
                    sb2.append(oVar.f18014x);
                    sb2.append("B (ratio ");
                    if (oVar.f18014x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(oVar.f18013w / oVar.f18014x));
                    } else {
                        str = "-";
                    }
                    sb2.append(str);
                    sb2.append(", expect 3.00 at 48 kHz) source=");
                    int i7 = oVar.F;
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
                o oVar2 = this.f17969b;
                if (oVar2.f17997c == 2) {
                    oVar2.t();
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f17969b;
                oVar3.s();
                bn bnVar = oVar3.f17995b.f39178a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new a3());
                    return;
                }
                return;
            default:
                this.f17969b.m("field send preview");
                return;
        }
    }
}
