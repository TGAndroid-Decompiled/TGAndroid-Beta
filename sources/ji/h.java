package ji;

import ai.z2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class h implements Runnable {
    public final int f17965a;
    public final o f17966b;

    public h(o oVar, int i7) {
        this.f17965a = i7;
        this.f17966b = oVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17965a) {
            case 0:
                o oVar = this.f17966b;
                if (oVar.f17994c == 2) {
                    if (oVar.f18012y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(oVar.f18012y);
                    sb2.append(" in=");
                    sb2.append(oVar.f18010w);
                    sb2.append("B out=");
                    sb2.append(oVar.f18011x);
                    sb2.append("B (ratio ");
                    if (oVar.f18011x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(oVar.f18010w / oVar.f18011x));
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
                o oVar2 = this.f17966b;
                if (oVar2.f17994c == 2) {
                    oVar2.t();
                    return;
                }
                return;
            case 2:
                o oVar3 = this.f17966b;
                oVar3.s();
                bn bnVar = oVar3.f17992b.f39168a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new z2());
                    return;
                }
                return;
            default:
                this.f17966b.m("field send preview");
                return;
        }
    }
}
