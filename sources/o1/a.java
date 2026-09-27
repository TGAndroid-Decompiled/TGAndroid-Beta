package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.m11;
public final class a implements Choreographer.FrameCallback {
    public final int f15543a;
    public final Object f15544b;

    public a(Object obj, int i10) {
        this.f15543a = i10;
        this.f15544b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15543a) {
            case 0:
                b bVar = (b) ((ka.c) ((la.h) this.f15544b).f14168b).f13554b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15547b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15546a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15567i;
                        if (j10 == 0) {
                            hVar.f15567i = uptimeMillis;
                            hVar.e(hVar.f15563b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15567i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15572u;
                                double d = lVar.f15578i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15563b, kVar2.f15562a, j12);
                                l lVar2 = kVar2.f15572u;
                                lVar2.f15578i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15552a, c10.f15553b, j12);
                                kVar2.f15563b = c11.f15552a;
                                kVar2.f15562a = c11.f15553b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15572u.c(kVar2.f15563b, kVar2.f15562a, j11);
                                kVar.f15563b = c12.f15552a;
                                kVar.f15562a = c12.f15553b;
                            }
                            float max = Math.max(kVar.f15563b, kVar.h);
                            kVar.f15563b = max;
                            kVar.f15563b = Math.min(max, kVar.f15566g);
                            float f7 = kVar.f15562a;
                            l lVar3 = kVar.f15572u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15578i)) < lVar3.d) {
                                kVar.f15563b = (float) kVar.f15572u.f15578i;
                                kVar.f15562a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15563b, hVar.f15566g);
                            hVar.f15563b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15563b = max2;
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
                        bVar.d = new la.h(bVar.f15548c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f14169c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                k11 k11Var = ((m11) this.f15544b).f26284a;
                if (k11Var != null) {
                    Handler handler = k11Var.getHandler();
                    if (handler != null && k11Var.f25597b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((m11) this.f15544b).f26284a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
