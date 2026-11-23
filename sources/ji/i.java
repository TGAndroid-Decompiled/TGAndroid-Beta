package ji;

import android.util.Log;
import org.telegram.messenger.g0;
public final class i implements Runnable {
    public final int f17936a;
    public final n f17937b;

    public i(n nVar, int i7) {
        this.f17936a = i7;
        this.f17937b = nVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f17936a) {
            case 0:
                n nVar = this.f17937b;
                if (nVar.f17960c == 3) {
                    if (!nVar.f17958b.c()) {
                        nVar.g("draft gone", true);
                        return;
                    } else {
                        g0.h3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                n nVar2 = this.f17937b;
                float[] fArr = nVar2.V;
                if (nVar2.f17960c == 4) {
                    if (nVar2.f17958b.b(fArr)) {
                        float f10 = fArr[0];
                        boolean z11 = true;
                        float f11 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (Math.abs(f10 - nVar2.P) > 5.0E-4f || Math.abs(f11 - nVar2.Q) > 5.0E-4f || z10 != nVar2.T) {
                            if (z10 && !nVar2.T) {
                                nVar2.R = nVar2.P;
                                nVar2.S = nVar2.Q;
                            }
                            if (z10 != nVar2.T) {
                                StringBuilder sb2 = new StringBuilder("field: trim ");
                                if (z10) {
                                    str = "drag";
                                } else {
                                    str = "release";
                                }
                                sb2.append(str);
                                sb2.append(" l=");
                                sb2.append(f10);
                                sb2.append(" r=");
                                sb2.append(f11);
                                sb2.append(" total=");
                                sb2.append(nVar2.O);
                                sb2.append(" frozen=");
                                if (nVar2.f17964e0 == null) {
                                    z11 = false;
                                }
                                sb2.append(z11);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            nVar2.P = f10;
                            nVar2.Q = f11;
                            nVar2.T = z10;
                            nVar2.o();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z12 : nVar2.f(nVar2.c(), nVar2.P, nVar2.Q)) {
                                    if (z12) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(nVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(nVar2.f17973n.length());
                                m10.append(" chars");
                                Log.d("VoiceLive", m10.toString());
                            }
                        }
                    }
                    g0.h3(this, 50L);
                    return;
                }
                return;
            default:
                n nVar3 = this.f17937b;
                if (nVar3.f17960c != 0) {
                    nVar3.s();
                    if (nVar3.f17960c != 0) {
                        g0.h3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
