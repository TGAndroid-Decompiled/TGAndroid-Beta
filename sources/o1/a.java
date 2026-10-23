package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.w0;
import m.g3;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.y11;
public final class a implements Choreographer.FrameCallback {
    public final int f17593a;
    public final Object f17594b;

    public a(Object obj, int i10) {
        this.f17593a = i10;
        this.f17594b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        k kVar;
        float min;
        boolean z11;
        switch (this.f17593a) {
            case 0:
                b bVar = (b) ((w0) ((g3) this.f17594b).f16265b).f14874b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f17597b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f17596a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f17617i;
                        if (j11 == 0) {
                            hVar.f17617i = uptimeMillis;
                            hVar.f(hVar.f17613b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f17617i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f17622u;
                                double d = lVar2.f17628i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = lVar2.c(kVar2.f17613b, kVar2.f17612a, j13);
                                l lVar3 = kVar2.f17622u;
                                lVar3.f17628i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f17602a, c10.f17603b, j13);
                                kVar2.f17613b = c11.f17602a;
                                kVar2.f17612a = c11.f17603b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                kVar = kVar2;
                                e c12 = kVar2.f17622u.c(kVar2.f17613b, kVar2.f17612a, j12);
                                kVar.f17613b = c12.f17602a;
                                kVar.f17612a = c12.f17603b;
                            }
                            float max = Math.max(kVar.f17613b, kVar.h);
                            kVar.f17613b = max;
                            kVar.f17613b = Math.min(max, kVar.f17616g);
                            float f7 = kVar.f17612a;
                            l lVar4 = kVar.f17622u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f17628i)) < lVar4.d) {
                                kVar.f17613b = (float) kVar.f17622u.f17628i;
                                kVar.f17612a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f17613b, hVar.f17616g);
                            hVar.f17613b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f17613b = max2;
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
                        bVar.d = new g3(bVar.f17598c);
                    }
                    g3 g3Var = bVar.d;
                    ((Choreographer) g3Var.f16266c).postFrameCallback((a) g3Var.d);
                    return;
                }
                return;
            default:
                w11 w11Var = ((y11) this.f17594b).f32784a;
                if (w11Var != null) {
                    Handler handler = w11Var.getHandler();
                    if (handler != null && w11Var.f32101b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((y11) this.f17594b).f32784a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
