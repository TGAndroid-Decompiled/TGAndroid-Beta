package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import l7.w0;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.y01;
public final class a implements Choreographer.FrameCallback {
    public final int f16308a;
    public final Object f16309b;

    public a(Object obj, int i10) {
        this.f16308a = i10;
        this.f16309b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        j jVar;
        float min;
        boolean z4;
        switch (this.f16308a) {
            case 0:
                b bVar = (b) ((ja.c) ((w0) this.f16309b).f12080b).f9988a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16312b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.k kVar = bVar.f16311a;
                        Long l10 = (Long) kVar.get(hVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f16334i;
                        if (j11 == 0) {
                            hVar.f16334i = uptimeMillis;
                            hVar.e(hVar.f16329b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f16334i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar2 = jVar2.f16338u;
                                double d = kVar2.f16345i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c3 = kVar2.c(jVar2.f16329b, jVar2.f16328a, j13);
                                k kVar3 = jVar2.f16338u;
                                kVar3.f16345i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c10 = kVar3.c(c3.f16318a, c3.f16319b, j13);
                                jVar2.f16329b = c10.f16318a;
                                jVar2.f16328a = c10.f16319b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                jVar = jVar2;
                                e c11 = jVar2.f16338u.c(jVar2.f16329b, jVar2.f16328a, j12);
                                jVar.f16329b = c11.f16318a;
                                jVar.f16328a = c11.f16319b;
                            }
                            float max = Math.max(jVar.f16329b, jVar.h);
                            jVar.f16329b = max;
                            jVar.f16329b = Math.min(max, jVar.f16333g);
                            float f10 = jVar.f16328a;
                            k kVar4 = jVar.f16338u;
                            kVar4.getClass();
                            if (Math.abs(f10) < kVar4.f16342e && Math.abs(min - ((float) kVar4.f16345i)) < kVar4.d) {
                                jVar.f16329b = (float) jVar.f16338u.f16345i;
                                jVar.f16328a = 0.0f;
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            float min2 = Math.min(hVar.f16329b, hVar.f16333g);
                            hVar.f16329b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16329b = max2;
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
                if (bVar.f16314e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16314e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new w0(bVar.f16313c);
                    }
                    w0 w0Var = bVar.d;
                    ((Choreographer) w0Var.f12081c).postFrameCallback((a) w0Var.d);
                    return;
                }
                return;
            default:
                y01 y01Var = ((a11) this.f16309b).f25119a;
                if (y01Var != null) {
                    Handler handler = y01Var.getHandler();
                    if (handler != null && y01Var.f33267b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((a11) this.f16309b).f25119a.P) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
