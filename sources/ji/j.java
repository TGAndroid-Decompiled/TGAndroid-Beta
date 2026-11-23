package ji;

import android.util.Log;
import org.telegram.messenger.g0;
public final class j implements Runnable {
    public final int f17973a;
    public final o f17974b;

    public j(o oVar, int i7) {
        this.f17973a = i7;
        this.f17974b = oVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f17973a) {
            case 0:
                o oVar = this.f17974b;
                if (oVar.f17997c == 3) {
                    if (!oVar.f17995b.c()) {
                        oVar.g("draft gone", true);
                        return;
                    } else {
                        g0.h3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                o oVar2 = this.f17974b;
                float[] fArr = oVar2.V;
                if (oVar2.f17997c == 4) {
                    if (oVar2.f17995b.b(fArr)) {
                        float f10 = fArr[0];
                        boolean z11 = true;
                        float f11 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (Math.abs(f10 - oVar2.P) > 5.0E-4f || Math.abs(f11 - oVar2.Q) > 5.0E-4f || z10 != oVar2.T) {
                            if (z10 && !oVar2.T) {
                                oVar2.R = oVar2.P;
                                oVar2.S = oVar2.Q;
                            }
                            if (z10 != oVar2.T) {
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
                                sb2.append(oVar2.O);
                                sb2.append(" frozen=");
                                if (oVar2.f18001e0 == null) {
                                    z11 = false;
                                }
                                sb2.append(z11);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            oVar2.P = f10;
                            oVar2.Q = f11;
                            oVar2.T = z10;
                            oVar2.o();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z12 : oVar2.f(oVar2.c(), oVar2.P, oVar2.Q)) {
                                    if (z12) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(oVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(oVar2.f18010n.length());
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
                o oVar3 = this.f17974b;
                if (oVar3.f17997c != 0) {
                    oVar3.s();
                    if (oVar3.f17997c != 0) {
                        g0.h3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
