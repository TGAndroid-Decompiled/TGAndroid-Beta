package defpackage;

import android.util.Log;
import java.util.Locale;
public final class lnc implements Runnable {
    public final byte a;
    public final snc b;

    public lnc(snc sncVar, byte b) {
        this.a = b;
        this.b = sncVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        byte b = this.a;
        snc sncVar = this.b;
        switch (b) {
            case 0:
                if (sncVar.c == 2) {
                    if (sncVar.y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                    sb.append(sncVar.y);
                    sb.append(" in=");
                    sb.append(sncVar.w);
                    sb.append("B out=");
                    sb.append(sncVar.x);
                    sb.append("B (ratio ");
                    if (sncVar.x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(sncVar.w / sncVar.x));
                    } else {
                        str = "-";
                    }
                    sb.append(str);
                    sb.append(", expect 3.00 at 48 kHz) source=");
                    byte b2 = sncVar.F;
                    if (b2 == 1) {
                        str2 = "MediaController";
                    } else if (b2 == 2) {
                        str2 = "AudioRecorderV2";
                    } else {
                        str2 = "none";
                    }
                    bs2.x(sb, str2, "VoiceLive");
                    return;
                }
                return;
            case 1:
                sncVar.n("field send preview");
                return;
            case 2:
                if (sncVar.c == 2) {
                    sncVar.v();
                    return;
                }
                return;
            default:
                sncVar.u();
                zu1 zu1Var = sncVar.b.a.E3;
                if (zu1Var != null) {
                    zu1Var.presentFragment(new woa());
                    return;
                }
                return;
        }
    }
}
