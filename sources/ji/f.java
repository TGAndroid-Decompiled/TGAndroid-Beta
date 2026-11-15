package ji;

import ai.x2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.an;
public final class f implements Runnable {
    public final int f17545a;
    public final m f17546b;

    public f(m mVar, int i7) {
        this.f17545a = i7;
        this.f17546b = mVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17545a) {
            case 0:
                this.f17546b.l("field send preview");
                return;
            case 1:
                m mVar = this.f17546b;
                if (mVar.f17573c == 2) {
                    if (mVar.f17591y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(mVar.f17591y);
                    sb2.append(" in=");
                    sb2.append(mVar.f17589w);
                    sb2.append("B out=");
                    sb2.append(mVar.f17590x);
                    sb2.append("B (ratio ");
                    if (mVar.f17590x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(mVar.f17589w / mVar.f17590x));
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
                    r.b.t(sb2, str2, "VoiceLive");
                    return;
                }
                return;
            case 2:
                m mVar2 = this.f17546b;
                if (mVar2.f17573c == 2) {
                    mVar2.t();
                    return;
                }
                return;
            case 3:
                this.f17546b.k();
                return;
            default:
                m mVar3 = this.f17546b;
                mVar3.s();
                an anVar = mVar3.f17571b.f34928a.f32319x3;
                if (anVar != null) {
                    anVar.presentFragment(new x2());
                    return;
                }
                return;
        }
    }
}
