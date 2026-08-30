package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.biometric.f0;
import java.util.ArrayList;
import l7.w0;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.y01;
public final class a implements Choreographer.FrameCallback {
    public final int f16170a;
    public final Object f16171b;

    public a(Object obj, int i10) {
        this.f16170a = i10;
        this.f16171b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        j jVar;
        float min;
        boolean z4;
        switch (this.f16170a) {
            case 0:
                b bVar = (b) ((f0) ((w0) this.f16171b).f11676b).f483b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16174b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.k kVar = bVar.f16173a;
                        Long l10 = (Long) kVar.get(hVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f16194i;
                        if (j11 == 0) {
                            hVar.f16194i = uptimeMillis;
                            hVar.e(hVar.f16190b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f16194i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar2 = jVar2.f16198u;
                                double d = kVar2.f16204i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c3 = kVar2.c(jVar2.f16190b, jVar2.f16189a, j13);
                                k kVar3 = jVar2.f16198u;
                                kVar3.f16204i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c10 = kVar3.c(c3.f16179a, c3.f16180b, j13);
                                jVar2.f16190b = c10.f16179a;
                                jVar2.f16189a = c10.f16180b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                jVar = jVar2;
                                e c11 = jVar2.f16198u.c(jVar2.f16190b, jVar2.f16189a, j12);
                                jVar.f16190b = c11.f16179a;
                                jVar.f16189a = c11.f16180b;
                            }
                            float max = Math.max(jVar.f16190b, jVar.h);
                            jVar.f16190b = max;
                            jVar.f16190b = Math.min(max, jVar.f16193g);
                            float f10 = jVar.f16189a;
                            k kVar4 = jVar.f16198u;
                            kVar4.getClass();
                            if (Math.abs(f10) < kVar4.e && Math.abs(min - ((float) kVar4.f16204i)) < kVar4.d) {
                                jVar.f16190b = (float) jVar.f16198u.f16204i;
                                jVar.f16189a = 0.0f;
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            float min2 = Math.min(hVar.f16190b, hVar.f16193g);
                            hVar.f16190b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16190b = max2;
                            hVar.e(max2);
                            if (z4) {
                                hVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new w0(bVar.f16175c);
                    }
                    w0 w0Var = bVar.d;
                    ((Choreographer) w0Var.f11677c).postFrameCallback((a) w0Var.d);
                    return;
                }
                return;
            default:
                y01 y01Var = ((a11) this.f16171b).f23262a;
                if (y01Var != null) {
                    Handler handler = y01Var.getHandler();
                    if (handler != null && y01Var.f30811b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((a11) this.f16171b).f23262a.P) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
