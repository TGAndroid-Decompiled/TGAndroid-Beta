package defpackage;

import android.util.Log;
import java.util.Locale;
public final class blc implements Runnable {
    public final byte a;
    public final glc b;

    public blc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override
    public final void run() {
        String str;
        String str2;
        byte b = this.a;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                if (glcVar.c == 2) {
                    if (glcVar.y == 0) {
                        Log.w("VoiceLive", "SELF-CHECK FAILED: no PCM from the recorder tap 1.5 s after lock (neither MediaController nor AudioCapture fed it)");
                        return;
                    }
                    StringBuilder sb = new StringBuilder("self-check ok: chunks=");
                    sb.append(glcVar.y);
                    sb.append(" in=");
                    sb.append(glcVar.w);
                    sb.append("B out=");
                    sb.append(glcVar.x);
                    sb.append("B (ratio ");
                    if (glcVar.x > 0) {
                        str = String.format(Locale.US, "%.2f", Double.valueOf(glcVar.w / glcVar.x));
                    } else {
                        str = "-";
                    }
                    sb.append(str);
                    sb.append(", expect 3.00 at 48 kHz) source=");
                    byte b2 = glcVar.F;
                    if (b2 == 1) {
                        str2 = "MediaController";
                    } else if (b2 == 2) {
                        str2 = "AudioRecorderV2";
                    } else {
                        str2 = "none";
                    }
                    ts2.w(sb, str2, "VoiceLive");
                    return;
                }
                return;
            case 1:
                if (glcVar.c == 2) {
                    glcVar.u();
                    return;
                }
                return;
            case 2:
                glcVar.t();
                yv1 yv1Var = glcVar.b.a.F3;
                if (yv1Var != null) {
                    yv1Var.presentFragment(new ana());
                    return;
                }
                return;
            default:
                glcVar.m("field send preview");
                return;
        }
    }
}
