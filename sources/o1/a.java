package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.w11;
public final class a implements Choreographer.FrameCallback {
    public final int f16962a;
    public final Object f16963b;

    public a(Object obj, int i10) {
        this.f16962a = i10;
        this.f16963b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f16962a) {
            case 0:
                b bVar = (b) ((k2.e) ((la.h) this.f16963b).f15399b).f14389b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16966b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16965a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16988i;
                        if (j10 == 0) {
                            hVar.f16988i = uptimeMillis;
                            hVar.e(hVar.f16983b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16988i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16993u;
                                double d = lVar.f17000i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16983b, kVar2.f16982a, j12);
                                l lVar2 = kVar2.f16993u;
                                lVar2.f17000i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16972a, c10.f16973b, j12);
                                kVar2.f16983b = c11.f16972a;
                                kVar2.f16982a = c11.f16973b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f16993u.c(kVar2.f16983b, kVar2.f16982a, j11);
                                kVar.f16983b = c12.f16972a;
                                kVar.f16982a = c12.f16973b;
                            }
                            float max = Math.max(kVar.f16983b, kVar.h);
                            kVar.f16983b = max;
                            kVar.f16983b = Math.min(max, kVar.f16987g);
                            float f7 = kVar.f16982a;
                            l lVar3 = kVar.f16993u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16997e && Math.abs(min - ((float) lVar3.f17000i)) < lVar3.d) {
                                kVar.f16983b = (float) kVar.f16993u.f17000i;
                                kVar.f16982a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f16983b, hVar.f16987g);
                            hVar.f16983b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16983b = max2;
                            hVar.e(max2);
                            if (z10) {
                                hVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.f16968e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16968e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16967c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15400c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                u11 u11Var = ((w11) this.f16963b).f32472a;
                if (u11Var != null) {
                    Handler handler = u11Var.getHandler();
                    if (handler != null && u11Var.f31290b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((w11) this.f16963b).f32472a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
