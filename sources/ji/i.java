package ji;

import ai.r2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class i implements Runnable {
    public final int f18039a;
    public final n f18040b;

    public i(n nVar, int i7) {
        this.f18039a = i7;
        this.f18040b = nVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f18039a) {
            case 0:
                n nVar = this.f18040b;
                if (nVar.f18062c == 2) {
                    if (nVar.f18080y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(nVar.f18080y);
                    sb2.append(" in=");
                    sb2.append(nVar.f18078w);
                    sb2.append("B out=");
                    sb2.append(nVar.f18079x);
                    sb2.append("B (ratio ");
                    if (nVar.f18079x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(nVar.f18078w / nVar.f18079x));
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
                n nVar2 = this.f18040b;
                if (nVar2.f18062c == 2) {
                    nVar2.s();
                    return;
                }
                return;
            case 2:
                n nVar3 = this.f18040b;
                nVar3.q();
                bn bnVar = nVar3.f18060b.f38823a.F3;
                if (bnVar != null) {
                    bnVar.presentFragment(new r2());
                    return;
                }
                return;
            default:
                this.f18040b.k("field send preview");
                return;
        }
    }
}
