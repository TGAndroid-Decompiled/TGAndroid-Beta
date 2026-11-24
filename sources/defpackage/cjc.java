package defpackage;

import android.util.Log;
public final class cjc implements Runnable {
    public final byte a;
    public final gjc b;

    public cjc(gjc gjcVar, byte b) {
        this.a = b;
        this.b = gjcVar;
    }

    @Override
    public final void run() {
        boolean z;
        String str;
        byte b = this.a;
        boolean z2 = true;
        gjc gjcVar = this.b;
        switch (b) {
            case 0:
                if (gjcVar.c == 3) {
                    if (!gjcVar.b.c()) {
                        gjcVar.j("draft gone", true);
                        return;
                    } else {
                        gl.e3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                float[] fArr = gjcVar.V;
                if (gjcVar.c == 4) {
                    if (gjcVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Math.abs(f - gjcVar.P) > 5.0E-4f || Math.abs(f2 - gjcVar.Q) > 5.0E-4f || z != gjcVar.T) {
                            if (z && !gjcVar.T) {
                                gjcVar.R = gjcVar.P;
                                gjcVar.S = gjcVar.Q;
                            }
                            if (z != gjcVar.T) {
                                StringBuilder sb = new StringBuilder("field: trim ");
                                if (z) {
                                    str = "drag";
                                } else {
                                    str = "release";
                                }
                                sb.append(str);
                                sb.append(" l=");
                                sb.append(f);
                                sb.append(" r=");
                                sb.append(f2);
                                sb.append(" total=");
                                sb.append(gjcVar.O);
                                sb.append(" frozen=");
                                if (gjcVar.e0 == null) {
                                    z2 = false;
                                }
                                sb.append(z2);
                                Log.d("VoiceLive", sb.toString());
                            }
                            gjcVar.P = f;
                            gjcVar.Q = f2;
                            gjcVar.T = z;
                            gjcVar.p();
                            if (!z) {
                                int i = 0;
                                for (boolean z3 : gjcVar.i(gjcVar.b(), gjcVar.P, gjcVar.Q)) {
                                    if (z3) {
                                        i++;
                                    }
                                }
                                StringBuilder m = de9.m(i, "field: trim applied, ", " of ");
                                m.append(gjcVar.b().size());
                                m.append(" words cut, text ");
                                m.append(gjcVar.n.length());
                                m.append(" chars");
                                Log.d("VoiceLive", m.toString());
                            }
                        }
                    }
                    gl.e3(this, 50L);
                    return;
                }
                return;
            default:
                if (gjcVar.c != 0) {
                    gjcVar.t();
                    if (gjcVar.c != 0) {
                        gl.e3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
