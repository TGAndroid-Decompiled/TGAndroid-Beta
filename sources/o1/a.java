package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.i11;
import org.telegram.ui.Components.k11;
public final class a implements Choreographer.FrameCallback {
    public final int f15489a;
    public final Object f15490b;

    public a(Object obj, int i10) {
        this.f15489a = i10;
        this.f15490b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15489a) {
            case 0:
                b bVar = (b) ((u) ((la.h) this.f15490b).f14151b).f13369b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15493b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15492a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15513i;
                        if (j10 == 0) {
                            hVar.f15513i = uptimeMillis;
                            hVar.e(hVar.f15509b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15513i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15518u;
                                double d = lVar.f15524i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15509b, kVar2.f15508a, j12);
                                l lVar2 = kVar2.f15518u;
                                lVar2.f15524i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15498a, c10.f15499b, j12);
                                kVar2.f15509b = c11.f15498a;
                                kVar2.f15508a = c11.f15499b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15518u.c(kVar2.f15509b, kVar2.f15508a, j11);
                                kVar.f15509b = c12.f15498a;
                                kVar.f15508a = c12.f15499b;
                            }
                            float max = Math.max(kVar.f15509b, kVar.h);
                            kVar.f15509b = max;
                            kVar.f15509b = Math.min(max, kVar.f15512g);
                            float f7 = kVar.f15508a;
                            l lVar3 = kVar.f15518u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15524i)) < lVar3.d) {
                                kVar.f15509b = (float) kVar.f15518u.f15524i;
                                kVar.f15508a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15509b, hVar.f15512g);
                            hVar.f15509b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15509b = max2;
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
                        bVar.d = new la.h(bVar.f15494c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14152c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                i11 i11Var = ((k11) this.f15490b).f25578a;
                if (i11Var != null) {
                    Handler handler = i11Var.getHandler();
                    if (handler != null && i11Var.f24883b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((k11) this.f15490b).f25578a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
