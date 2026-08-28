package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m5.c0;
import org.telegram.ui.Components.b01;
import org.telegram.ui.Components.d01;
public final class a implements Choreographer.FrameCallback {
    public final int f18770a;
    public final Object f18771b;

    public a(Object obj, int i9) {
        this.f18770a = i9;
        this.f18771b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i9;
        j jVar;
        float min;
        boolean z10;
        switch (this.f18770a) {
            case 0:
                b bVar = (b) ((c0) ((j4.c) this.f18771b).f13431b).f17378b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f18774b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i10);
                    if (hVar != null) {
                        a0.k kVar = bVar.f18773a;
                        Long l10 = (Long) kVar.get(hVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f18796i;
                        if (j11 == 0) {
                            hVar.f18796i = uptimeMillis;
                            hVar.e(hVar.f18791b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f18796i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar2 = jVar2.f18800u;
                                double d = kVar2.f18807i;
                                i9 = i10;
                                long j13 = j12 / 2;
                                e c10 = kVar2.c(jVar2.f18791b, jVar2.f18790a, j13);
                                k kVar3 = jVar2.f18800u;
                                kVar3.f18807i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c11 = kVar3.c(c10.f18780a, c10.f18781b, j13);
                                jVar2.f18791b = c11.f18780a;
                                jVar2.f18790a = c11.f18781b;
                                jVar = jVar2;
                            } else {
                                i9 = i10;
                                jVar = jVar2;
                                e c12 = jVar2.f18800u.c(jVar2.f18791b, jVar2.f18790a, j12);
                                jVar.f18791b = c12.f18780a;
                                jVar.f18790a = c12.f18781b;
                            }
                            float max = Math.max(jVar.f18791b, jVar.h);
                            jVar.f18791b = max;
                            jVar.f18791b = Math.min(max, jVar.f18795g);
                            float f10 = jVar.f18790a;
                            k kVar4 = jVar.f18800u;
                            kVar4.getClass();
                            if (Math.abs(f10) < kVar4.f18804e && Math.abs(min - ((float) kVar4.f18807i)) < kVar4.d) {
                                jVar.f18791b = (float) jVar.f18800u.f18807i;
                                jVar.f18790a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f18791b, hVar.f18795g);
                            hVar.f18791b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f18791b = max2;
                            hVar.e(max2);
                            if (z10) {
                                hVar.d(false);
                            }
                            i10 = i9 + 1;
                        }
                    }
                    i9 = i10;
                    i10 = i9 + 1;
                }
                if (bVar.f18776e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f18776e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new j4.c(bVar.f18775c);
                    }
                    j4.c cVar = bVar.d;
                    ((Choreographer) cVar.f13432c).postFrameCallback((a) cVar.d);
                    return;
                }
                return;
            default:
                b01 b01Var = ((d01) this.f18771b).f27620a;
                if (b01Var != null) {
                    Handler handler = b01Var.getHandler();
                    if (handler != null && b01Var.f26955b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((d01) this.f18771b).f27620a.O) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
