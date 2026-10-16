package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import ji.h5;
import m.h3;
import org.telegram.ui.Components.x11;
import org.telegram.ui.Components.z11;
public final class a implements Choreographer.FrameCallback {
    public final int f16132a;
    public final Object f16133b;

    public a(Object obj, int i10) {
        this.f16132a = i10;
        this.f16133b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f16132a) {
            case 0:
                b bVar = (b) ((h5) ((h3) this.f16133b).f14850b).f13315b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16136b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f16135a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f16156i;
                        if (j11 == 0) {
                            hVar.f16156i = uptimeMillis;
                            hVar.f(hVar.f16152b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f16156i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f16161u;
                                double d = lVar2.f16167i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f16152b, kVar2.f16151a, j13);
                                l lVar3 = kVar2.f16161u;
                                lVar3.f16167i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f16141a, c10.f16142b, j13);
                                kVar2.f16152b = c11.f16141a;
                                kVar2.f16151a = c11.f16142b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f16161u.c(kVar2.f16152b, kVar2.f16151a, j12);
                                kVar.f16152b = c12.f16141a;
                                kVar.f16151a = c12.f16142b;
                            }
                            float max = Math.max(kVar.f16152b, kVar.h);
                            kVar.f16152b = max;
                            kVar.f16152b = Math.min(max, kVar.f16155g);
                            float f7 = kVar.f16151a;
                            l lVar4 = kVar.f16161u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f16167i)) < lVar4.d) {
                                kVar.f16152b = (float) kVar.f16161u.f16167i;
                                kVar.f16151a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f16152b, hVar.f16155g);
                            hVar.f16152b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16152b = max2;
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
                        bVar.d = new h3(bVar.f16137c);
                    }
                    h3 h3Var = bVar.d;
                    ((Choreographer) h3Var.f14851c).postFrameCallback((a) h3Var.d);
                    return;
                }
                return;
            default:
                x11 x11Var = ((z11) this.f16133b).f31424a;
                if (x11Var != null) {
                    Handler handler = x11Var.getHandler();
                    if (handler != null && x11Var.f30802b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((z11) this.f16133b).f31424a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
