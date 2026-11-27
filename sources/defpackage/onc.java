package defpackage;

import android.util.Log;
public final class onc implements Runnable {
    public final byte a;
    public final snc b;

    public onc(snc sncVar, byte b) {
        this.a = b;
        this.b = sncVar;
    }

    @Override
    public final void run() {
        boolean z;
        String str;
        byte b = this.a;
        boolean z2 = true;
        snc sncVar = this.b;
        switch (b) {
            case 0:
                if (sncVar.c == 3) {
                    if (!sncVar.b.c()) {
                        sncVar.k("draft gone", true);
                        return;
                    } else {
                        hl.d3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                float[] fArr = sncVar.W;
                if (sncVar.c == 4) {
                    if (sncVar.b.b(fArr)) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (Math.abs(f - sncVar.Q) > 5.0E-4f || Math.abs(f2 - sncVar.R) > 5.0E-4f || z != sncVar.U) {
                            if (z && !sncVar.U) {
                                sncVar.S = sncVar.Q;
                                sncVar.T = sncVar.R;
                            }
                            if (z != sncVar.U) {
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
                                sb.append(sncVar.P);
                                sb.append(" frozen=");
                                if (sncVar.g0 == null) {
                                    z2 = false;
                                }
                                sb.append(z2);
                                Log.d("VoiceLive", sb.toString());
                            }
                            sncVar.Q = f;
                            sncVar.R = f2;
                            sncVar.U = z;
                            sncVar.q();
                            if (!z) {
                                int i = 0;
                                for (boolean z3 : sncVar.j(sncVar.b(), sncVar.Q, sncVar.R)) {
                                    if (z3) {
                                        i++;
                                    }
                                }
                                StringBuilder m = uh9.m(i, "field: trim applied, ", " of ");
                                m.append(sncVar.b().size());
                                m.append(" words cut, text ");
                                m.append(sncVar.n.length());
                                m.append(" chars");
                                Log.d("VoiceLive", m.toString());
                            }
                        }
                    }
                    hl.d3(this, 50L);
                    return;
                }
                return;
            default:
                if (sncVar.c != 0) {
                    sncVar.u();
                    if (sncVar.c != 0) {
                        hl.d3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
