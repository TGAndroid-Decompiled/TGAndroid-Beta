package defpackage;

import android.util.Log;
public final class clc implements Runnable {
    public final byte a;
    public final glc b;

    public clc(glc glcVar, byte b) {
        this.a = b;
        this.b = glcVar;
    }

    @Override
    public final void run() {
        boolean z;
        String str;
        byte b = this.a;
        boolean z2 = true;
        glc glcVar = this.b;
        switch (b) {
            case 0:
                if (glcVar.c == 3) {
                    if (!glcVar.b.c()) {
                        glcVar.j("draft gone", true);
                        return;
                    } else {
                        gm.d3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                float[] fArr = glcVar.V;
                if (glcVar.c == 4) {
                    if (glcVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Math.abs(f - glcVar.P) > 5.0E-4f || Math.abs(f2 - glcVar.Q) > 5.0E-4f || z != glcVar.T) {
                            if (z && !glcVar.T) {
                                glcVar.R = glcVar.P;
                                glcVar.S = glcVar.Q;
                            }
                            if (z != glcVar.T) {
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
                                sb.append(glcVar.O);
                                sb.append(" frozen=");
                                if (glcVar.e0 == null) {
                                    z2 = false;
                                }
                                sb.append(z2);
                                Log.d("VoiceLive", sb.toString());
                            }
                            glcVar.P = f;
                            glcVar.Q = f2;
                            glcVar.T = z;
                            glcVar.p();
                            if (!z) {
                                int i = 0;
                                for (boolean z3 : glcVar.i(glcVar.b(), glcVar.P, glcVar.Q)) {
                                    if (z3) {
                                        i++;
                                    }
                                }
                                StringBuilder l = hg9.l(i, "field: trim applied, ", " of ");
                                l.append(glcVar.b().size());
                                l.append(" words cut, text ");
                                l.append(glcVar.n.length());
                                l.append(" chars");
                                Log.d("VoiceLive", l.toString());
                            }
                        }
                    }
                    gm.d3(this, 50L);
                    return;
                }
                return;
            default:
                if (glcVar.c != 0) {
                    glcVar.t();
                    if (glcVar.c != 0) {
                        gm.d3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
