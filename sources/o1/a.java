package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.v11;
public final class a implements Choreographer.FrameCallback {
    public final int f16952a;
    public final Object f16953b;

    public a(Object obj, int i10) {
        this.f16952a = i10;
        this.f16953b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f16952a) {
            case 0:
                b bVar = (b) ((k2.e) ((la.h) this.f16953b).f15397b).f14388b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16956b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16955a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16978i;
                        if (j10 == 0) {
                            hVar.f16978i = uptimeMillis;
                            hVar.e(hVar.f16973b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16978i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16983u;
                                double d = lVar.f16990i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16973b, kVar2.f16972a, j12);
                                l lVar2 = kVar2.f16983u;
                                lVar2.f16990i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16962a, c10.f16963b, j12);
                                kVar2.f16973b = c11.f16962a;
                                kVar2.f16972a = c11.f16963b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f16983u.c(kVar2.f16973b, kVar2.f16972a, j11);
                                kVar.f16973b = c12.f16962a;
                                kVar.f16972a = c12.f16963b;
                            }
                            float max = Math.max(kVar.f16973b, kVar.h);
                            kVar.f16973b = max;
                            kVar.f16973b = Math.min(max, kVar.f16977g);
                            float f7 = kVar.f16972a;
                            l lVar3 = kVar.f16983u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16987e && Math.abs(min - ((float) lVar3.f16990i)) < lVar3.d) {
                                kVar.f16973b = (float) kVar.f16983u.f16990i;
                                kVar.f16972a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f16973b, hVar.f16977g);
                            hVar.f16973b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16973b = max2;
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
                if (bVar.f16958e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16958e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16957c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15398c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                t11 t11Var = ((v11) this.f16953b).f31499a;
                if (t11Var != null) {
                    Handler handler = t11Var.getHandler();
                    if (handler != null && t11Var.f30922b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((v11) this.f16953b).f31499a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
