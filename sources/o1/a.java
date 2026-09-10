package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.e3;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.k11;
public final class a implements Choreographer.FrameCallback {
    public final int f14105a;
    public final Object f14106b;

    public a(Object obj, int i10) {
        this.f14105a = i10;
        this.f14106b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f14105a) {
            case 0:
                b bVar = (b) ((l2.g) ((e3) this.f14106b).f13001b).f12719b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f14109b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f14108a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f14129i;
                        if (j10 == 0) {
                            hVar.f14129i = uptimeMillis;
                            hVar.e(hVar.f14125b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f14129i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f14134u;
                                double d = lVar2.f14140i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar2.c(kVar2.f14125b, kVar2.f14124a, j12);
                                l lVar3 = kVar2.f14134u;
                                lVar3.f14140i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f14114a, c10.f14115b, j12);
                                kVar2.f14125b = c11.f14114a;
                                kVar2.f14124a = c11.f14115b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f14134u.c(kVar2.f14125b, kVar2.f14124a, j11);
                                kVar.f14125b = c12.f14114a;
                                kVar.f14124a = c12.f14115b;
                            }
                            float max = Math.max(kVar.f14125b, kVar.h);
                            kVar.f14125b = max;
                            kVar.f14125b = Math.min(max, kVar.f14128g);
                            float f7 = kVar.f14124a;
                            l lVar4 = kVar.f14134u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f14140i)) < lVar4.d) {
                                kVar.f14125b = (float) kVar.f14134u.f14140i;
                                kVar.f14124a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f14125b, hVar.f14128g);
                            hVar.f14125b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f14125b = max2;
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
                        bVar.d = new e3(bVar.f14110c);
                    }
                    e3 e3Var = bVar.d;
                    ((Choreographer) e3Var.f13002c).postFrameCallback((a) e3Var.d);
                    return;
                }
                return;
            default:
                i11 i11Var = ((k11) this.f14106b).f24562a;
                if (i11Var != null) {
                    Handler handler = i11Var.getHandler();
                    if (handler != null && i11Var.f23862b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((k11) this.f14106b).f24562a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
