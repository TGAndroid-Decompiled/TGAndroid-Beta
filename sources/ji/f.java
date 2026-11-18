package ji;

import ai.x2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class f implements Runnable {
    public final int f17938a;
    public final m f17939b;

    public f(m mVar, int i7) {
        this.f17938a = i7;
        this.f17939b = mVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17938a) {
            case 0:
                this.f17939b.n("field send preview");
                return;
            case 1:
                m mVar = this.f17939b;
                if (mVar.f17966c == 2) {
                    if (mVar.f17984y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(mVar.f17984y);
                    sb2.append(" in=");
                    sb2.append(mVar.f17982w);
                    sb2.append("B out=");
                    sb2.append(mVar.f17983x);
                    sb2.append("B (ratio ");
                    if (mVar.f17983x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(mVar.f17982w / mVar.f17983x));
                    } else {
                        str = "-";
                    }
                    sb2.append(str);
                    sb2.append(", expect 3.00 at 48 kHz) source=");
                    int i7 = mVar.F;
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
            case 2:
                m mVar2 = this.f17939b;
                if (mVar2.f17966c == 2) {
                    mVar2.u();
                    return;
                }
                return;
            case 3:
                this.f17939b.m();
                return;
            default:
                m mVar3 = this.f17939b;
                mVar3.t();
                bn bnVar = mVar3.f17964b.f38384a.D3;
                if (bnVar != null) {
                    bnVar.presentFragment(new x2());
                    return;
                }
                return;
        }
    }
}
