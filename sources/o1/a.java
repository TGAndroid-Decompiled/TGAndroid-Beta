package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.g3;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.t11;
public final class a implements Choreographer.FrameCallback {
    public final int f17533a;
    public final Object f17534b;

    public a(Object obj, int i10) {
        this.f17533a = i10;
        this.f17534b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f17533a) {
            case 0:
                b bVar = (b) ((k0.b) ((g3) this.f17534b).f16203b).f14566b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f17537b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f17536a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f17557i;
                        if (j11 == 0) {
                            hVar.f17557i = uptimeMillis;
                            hVar.f(hVar.f17553b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f17557i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f17562u;
                                double d = lVar2.f17568i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f17553b, kVar2.f17552a, j13);
                                l lVar3 = kVar2.f17562u;
                                lVar3.f17568i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f17542a, c10.f17543b, j13);
                                kVar2.f17553b = c11.f17542a;
                                kVar2.f17552a = c11.f17543b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17562u.c(kVar2.f17553b, kVar2.f17552a, j12);
                                kVar.f17553b = c12.f17542a;
                                kVar.f17552a = c12.f17543b;
                            }
                            float max = Math.max(kVar.f17553b, kVar.h);
                            kVar.f17553b = max;
                            kVar.f17553b = Math.min(max, kVar.f17556g);
                            float f7 = kVar.f17552a;
                            l lVar4 = kVar.f17562u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f17568i)) < lVar4.d) {
                                kVar.f17553b = (float) kVar.f17562u.f17568i;
                                kVar.f17552a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17553b, hVar.f17556g);
                            hVar.f17553b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17553b = max2;
                            hVar.f(max2);
                            if (z11) {
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
                        bVar.d = new g3(bVar.f17538c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.f16204c).postFrameCallback((a) g3Var.d);
                    return;
                }
                return;
            default:
                r11 r11Var = ((t11) this.f17534b).f30437a;
                if (r11Var != null) {
                    Handler handler = r11Var.getHandler();
                    if (handler != null && r11Var.f29797b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((t11) this.f17534b).f30437a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
