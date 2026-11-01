package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m2.t;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.i01;
public final class a implements Choreographer.FrameCallback {
    public final int f13930a;
    public final Object f13931b;

    public a(Object obj, int i10) {
        this.f13930a = i10;
        this.f13931b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        boolean z10;
        float min;
        int i10;
        boolean z11;
        switch (this.f13930a) {
            case 0:
                b bVar = (b) ((t) ((li.k) this.f13931b).f12101b).f12685b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f13934b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    j jVar = (j) arrayList.get(i11);
                    if (jVar != null) {
                        l lVar = bVar.f13933a;
                        Long l4 = (Long) lVar.get(jVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(jVar);
                            }
                        }
                        long j11 = jVar.f13954i;
                        if (j11 == 0) {
                            jVar.f13954i = uptimeMillis;
                            jVar.g(jVar.f13950b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            jVar.f13954i = uptimeMillis;
                            if (jVar.f13959n != Float.MAX_VALUE) {
                                k kVar = jVar.f13958m;
                                double d = kVar.f13965i;
                                z10 = true;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar.f13950b, jVar.f13949a, j13);
                                k kVar2 = jVar.f13958m;
                                kVar2.f13965i = jVar.f13959n;
                                jVar.f13959n = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.f13939a, c10.f13940b, j13);
                                jVar.f13950b = c11.f13939a;
                                jVar.f13949a = c11.f13940b;
                            } else {
                                z10 = true;
                                e c12 = jVar.f13958m.c(jVar.f13950b, jVar.f13949a, j12);
                                jVar.f13950b = c12.f13939a;
                                jVar.f13949a = c12.f13940b;
                            }
                            float max = Math.max(jVar.f13950b, jVar.h);
                            jVar.f13950b = max;
                            jVar.f13950b = Math.min(max, jVar.f13953g);
                            float f7 = jVar.f13949a;
                            k kVar3 = jVar.f13958m;
                            kVar3.getClass();
                            double abs = Math.abs(f7);
                            i10 = i11;
                            if (abs < kVar3.e && Math.abs(min - ((float) kVar3.f13965i)) < kVar3.d) {
                                jVar.f13950b = (float) jVar.f13958m.f13965i;
                                jVar.f13949a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(jVar.f13950b, jVar.f13953g);
                            jVar.f13950b = min2;
                            float max2 = Math.max(min2, jVar.h);
                            jVar.f13950b = max2;
                            jVar.g(max2);
                            if (z11) {
                                jVar.e(false);
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
                        bVar.d = new li.k(bVar.f13935c);
                    }
                    li.k kVar4 = bVar.d;
                    ((Choreographer) kVar4.f12102c).postFrameCallback((a) kVar4.d);
                    return;
                }
                return;
            default:
                g01 g01Var = ((i01) this.f13931b).f26976a;
                if (g01Var != null) {
                    Handler handler = g01Var.getHandler();
                    if (handler != null && g01Var.f26268b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((i01) this.f13931b).f26976a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
