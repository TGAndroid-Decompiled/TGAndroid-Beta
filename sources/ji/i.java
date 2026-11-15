package ji;

import android.util.Log;
import org.telegram.messenger.g0;
public final class i implements Runnable {
    public final int f17552a;
    public final m f17553b;

    public i(m mVar, int i7) {
        this.f17552a = i7;
        this.f17553b = mVar;
    }

    @Override
    public final void run() {
        boolean z10;
        String str;
        switch (this.f17552a) {
            case 0:
                m mVar = this.f17553b;
                if (mVar.f17573c == 3) {
                    if (!mVar.f17571b.c()) {
                        mVar.g("draft gone", true);
                        return;
                    } else {
                        g0.i3(this, 300L);
                        return;
                    }
                }
                return;
            case 1:
                m mVar2 = this.f17553b;
                float[] fArr = mVar2.V;
                if (mVar2.f17573c == 4) {
                    if (mVar2.f17571b.b(fArr)) {
                        float f10 = fArr[0];
                        boolean z11 = true;
                        float f11 = fArr[1];
                        if (fArr[2] > 0.5f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (Math.abs(f10 - mVar2.P) > 5.0E-4f || Math.abs(f11 - mVar2.Q) > 5.0E-4f || z10 != mVar2.T) {
                            if (z10 && !mVar2.T) {
                                mVar2.R = mVar2.P;
                                mVar2.S = mVar2.Q;
                            }
                            if (z10 != mVar2.T) {
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
                                sb2.append(mVar2.O);
                                sb2.append(" frozen=");
                                if (mVar2.f17577e0 == null) {
                                    z11 = false;
                                }
                                sb2.append(z11);
                                Log.d("VoiceLive", sb2.toString());
                            }
                            mVar2.P = f10;
                            mVar2.Q = f11;
                            mVar2.T = z10;
                            mVar2.n();
                            if (!z10) {
                                int i7 = 0;
                                for (boolean z12 : mVar2.f(mVar2.c(), mVar2.P, mVar2.Q)) {
                                    if (z12) {
                                        i7++;
                                    }
                                }
                                StringBuilder m10 = i5.c.m(i7, "field: trim applied, ", " of ");
                                m10.append(mVar2.c().size());
                                m10.append(" words cut, text ");
                                m10.append(mVar2.f17586n.length());
                                m10.append(" chars");
                                Log.d("VoiceLive", m10.toString());
                            }
                        }
                    }
                    g0.i3(this, 50L);
                    return;
                }
                return;
            default:
                m mVar3 = this.f17553b;
                if (mVar3.f17573c != 0) {
                    mVar3.s();
                    if (mVar3.f17573c != 0) {
                        g0.i3(this, 250L);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
