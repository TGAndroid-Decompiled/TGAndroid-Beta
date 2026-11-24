package defpackage;

import android.util.Log;
import java.util.Locale;
public final class bjc implements Runnable {
    public final byte a;
    public final gjc b;

    public bjc(gjc gjcVar, byte b) {
        this.a = b;
        this.b = gjcVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        byte b = this.a;
        gjc gjcVar = this.b;
        switch (b) {
            case 0:
                if (gjcVar.c == 2) {
                    if (gjcVar.y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                    sb.append(gjcVar.y);
                    sb.append(" in=");
                    sb.append(gjcVar.w);
                    sb.append("B out=");
                    sb.append(gjcVar.x);
                    sb.append("B (ratio ");
                    if (gjcVar.x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(gjcVar.w / gjcVar.x));
                    } else {
                        str = "-";
                    }
                    sb.append(str);
                    sb.append(", expect 3.00 at 48 kHz) source=");
                    byte b2 = gjcVar.F;
                    if (b2 == 1) {
                        str2 = "MediaController";
                    } else if (b2 == 2) {
                        str2 = "AudioRecorderV2";
                    } else {
                        str2 = "none";
                    }
                    ir2.x(sb, str2, "VoiceLive");
                    return;
                }
                return;
            case 1:
                if (gjcVar.c == 2) {
                    gjcVar.u();
                    return;
                }
                return;
            case 2:
                gjcVar.t();
                mu1 mu1Var = gjcVar.b.a.F3;
                if (mu1Var != null) {
                    mu1Var.presentFragment(new zka());
                    return;
                }
                return;
            default:
                gjcVar.m("field send preview");
                return;
        }
    }
}
