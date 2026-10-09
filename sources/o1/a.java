package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.f3;
import org.telegram.ui.Components.a21;
import org.telegram.ui.Components.c21;
public final class a implements Choreographer.FrameCallback {
    public final int f16907a;
    public final Object f16908b;

    public a(Object obj, int i10) {
        this.f16907a = i10;
        this.f16908b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16907a) {
            case 0:
                b bVar = (b) ((f3) ((la.h) this.f16908b).f15462b).f15668b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16911b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16910a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16933i;
                        if (j10 == 0) {
                            hVar.f16933i = uptimeMillis;
                            hVar.f(hVar.f16928b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16933i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16938u;
                                double d = lVar.f16945i;
                                z10 = true;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16928b, kVar2.f16927a, j12);
                                l lVar2 = kVar2.f16938u;
                                lVar2.f16945i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16917a, c10.f16918b, j12);
                                kVar2.f16928b = c11.f16917a;
                                kVar2.f16927a = c11.f16918b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f16938u.c(kVar2.f16928b, kVar2.f16927a, j11);
                                kVar.f16928b = c12.f16917a;
                                kVar.f16927a = c12.f16918b;
                            }
                            float max = Math.max(kVar.f16928b, kVar.h);
                            kVar.f16928b = max;
                            kVar.f16928b = Math.min(max, kVar.f16932g);
                            float f7 = kVar.f16927a;
                            l lVar3 = kVar.f16938u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16942e && Math.abs(min - ((float) lVar3.f16945i)) < lVar3.d) {
                                kVar.f16928b = (float) kVar.f16938u.f16945i;
                                kVar.f16927a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f16928b, hVar.f16932g);
                            hVar.f16928b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16928b = max2;
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
                if (bVar.f16913e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16913e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16912c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15463c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                a21 a21Var = ((c21) this.f16908b).f25213a;
                if (a21Var != null) {
                    Handler handler = a21Var.getHandler();
                    if (handler != null && a21Var.f24546b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((c21) this.f16908b).f25213a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
