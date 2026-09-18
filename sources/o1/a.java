package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.u;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.m11;
public final class a implements Choreographer.FrameCallback {
    public final int f15461a;
    public final Object f15462b;

    public a(Object obj, int i10) {
        this.f15461a = i10;
        this.f15462b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15461a) {
            case 0:
                b bVar = (b) ((u) ((lf.i) this.f15462b).f14179b).f13383b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15465b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15464a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15485i;
                        if (j10 == 0) {
                            hVar.f15485i = uptimeMillis;
                            hVar.e(hVar.f15481b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15485i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15490u;
                                double d = lVar.f15496i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15481b, kVar2.f15480a, j12);
                                l lVar2 = kVar2.f15490u;
                                lVar2.f15496i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15470a, c10.f15471b, j12);
                                kVar2.f15481b = c11.f15470a;
                                kVar2.f15480a = c11.f15471b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15490u.c(kVar2.f15481b, kVar2.f15480a, j11);
                                kVar.f15481b = c12.f15470a;
                                kVar.f15480a = c12.f15471b;
                            }
                            float max = Math.max(kVar.f15481b, kVar.h);
                            kVar.f15481b = max;
                            kVar.f15481b = Math.min(max, kVar.f15484g);
                            float f7 = kVar.f15480a;
                            l lVar3 = kVar.f15490u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15496i)) < lVar3.d) {
                                kVar.f15481b = (float) kVar.f15490u.f15496i;
                                kVar.f15480a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15481b, hVar.f15484g);
                            hVar.f15481b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15481b = max2;
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
                        bVar.d = new lf.i(bVar.f15466c);
                    }
                    lf.i iVar = bVar.d;
                    ((Choreographer) iVar.f14180c).postFrameCallback((a) iVar.d);
                    return;
                }
                return;
            default:
                k11 k11Var = ((m11) this.f15462b).f26279a;
                if (k11Var != null) {
                    Handler handler = k11Var.getHandler();
                    if (handler != null && k11Var.f25531b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((m11) this.f15462b).f26279a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
