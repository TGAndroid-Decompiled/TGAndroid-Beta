package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.j11;
import org.telegram.ui.Components.l11;
public final class a implements Choreographer.FrameCallback {
    public final int f15493a;
    public final Object f15494b;

    public a(Object obj, int i10) {
        this.f15493a = i10;
        this.f15494b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15493a) {
            case 0:
                b bVar = (b) ((u) ((lf.h) this.f15494b).f14215b).f13384b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15497b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15496a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15517i;
                        if (j10 == 0) {
                            hVar.f15517i = uptimeMillis;
                            hVar.e(hVar.f15513b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15517i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15522u;
                                double d = lVar.f15528i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15513b, kVar2.f15512a, j12);
                                l lVar2 = kVar2.f15522u;
                                lVar2.f15528i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15502a, c10.f15503b, j12);
                                kVar2.f15513b = c11.f15502a;
                                kVar2.f15512a = c11.f15503b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15522u.c(kVar2.f15513b, kVar2.f15512a, j11);
                                kVar.f15513b = c12.f15502a;
                                kVar.f15512a = c12.f15503b;
                            }
                            float max = Math.max(kVar.f15513b, kVar.h);
                            kVar.f15513b = max;
                            kVar.f15513b = Math.min(max, kVar.f15516g);
                            float f7 = kVar.f15512a;
                            l lVar3 = kVar.f15522u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15528i)) < lVar3.d) {
                                kVar.f15513b = (float) kVar.f15522u.f15528i;
                                kVar.f15512a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15513b, hVar.f15516g);
                            hVar.f15513b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15513b = max2;
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
                        bVar.d = new lf.h(bVar.f15498c);
                    }
                    lf.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14216c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                j11 j11Var = ((l11) this.f15494b).f25993a;
                if (j11Var != null) {
                    Handler handler = j11Var.getHandler();
                    if (handler != null && j11Var.f25168b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((l11) this.f15494b).f25993a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
