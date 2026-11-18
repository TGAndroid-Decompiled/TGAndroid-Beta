package ji;

import ai.x2;
import android.util.Log;
import java.util.Locale;
import org.telegram.ui.bn;
public final class f implements Runnable {
    public final int f17935a;
    public final m f17936b;

    public f(m mVar, int i7) {
        this.f17935a = i7;
        this.f17936b = mVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        switch (this.f17935a) {
            case 0:
                this.f17936b.n("field send preview");
                return;
            case 1:
                m mVar = this.f17936b;
                if (mVar.f17963c == 2) {
                    if (mVar.f17981y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("self-check ok: chunks=");
                    sb2.append(mVar.f17981y);
                    sb2.append(" in=");
                    sb2.append(mVar.f17979w);
                    sb2.append("B out=");
                    sb2.append(mVar.f17980x);
                    sb2.append("B (ratio ");
                    if (mVar.f17980x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(mVar.f17979w / mVar.f17980x));
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
                m mVar2 = this.f17936b;
                if (mVar2.f17963c == 2) {
                    mVar2.u();
                    return;
                }
                return;
            case 3:
                this.f17936b.m();
                return;
            default:
                m mVar3 = this.f17936b;
                mVar3.t();
                bn bnVar = mVar3.f17961b.f38384a.D3;
                if (bnVar != null) {
                    bnVar.presentFragment(new x2());
                    return;
                }
                return;
        }
    }
}
