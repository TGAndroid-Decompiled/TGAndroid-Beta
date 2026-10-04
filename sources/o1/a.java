package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.t11;
import org.telegram.ui.Components.v11;
public final class a implements Choreographer.FrameCallback {
    public final int f16953a;
    public final Object f16954b;

    public a(Object obj, int i10) {
        this.f16953a = i10;
        this.f16954b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f16953a) {
            case 0:
                b bVar = (b) ((k2.e) ((la.h) this.f16954b).f15398b).f14388b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16957b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f16956a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16979i;
                        if (j10 == 0) {
                            hVar.f16979i = uptimeMillis;
                            hVar.e(hVar.f16974b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16979i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f16984u;
                                double d = lVar.f16991i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f16974b, kVar2.f16973a, j12);
                                l lVar2 = kVar2.f16984u;
                                lVar2.f16991i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f16963a, c10.f16964b, j12);
                                kVar2.f16974b = c11.f16963a;
                                kVar2.f16973a = c11.f16964b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f16984u.c(kVar2.f16974b, kVar2.f16973a, j11);
                                kVar.f16974b = c12.f16963a;
                                kVar.f16973a = c12.f16964b;
                            }
                            float max = Math.max(kVar.f16974b, kVar.h);
                            kVar.f16974b = max;
                            kVar.f16974b = Math.min(max, kVar.f16978g);
                            float f7 = kVar.f16973a;
                            l lVar3 = kVar.f16984u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.f16988e && Math.abs(min - ((float) lVar3.f16991i)) < lVar3.d) {
                                kVar.f16974b = (float) kVar.f16984u.f16991i;
                                kVar.f16973a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f16974b, hVar.f16978g);
                            hVar.f16974b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16974b = max2;
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
                if (bVar.f16959e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16959e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new la.h(bVar.f16958c);
                    }
                    la.h hVar2 = bVar.d;
                    ((Choreographer) hVar2.f15399c).postFrameCallback((a) hVar2.d);
                    return;
                }
                return;
            default:
                t11 t11Var = ((v11) this.f16954b).f31500a;
                if (t11Var != null) {
                    Handler handler = t11Var.getHandler();
                    if (handler != null && t11Var.f30923b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((v11) this.f16954b).f31500a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
