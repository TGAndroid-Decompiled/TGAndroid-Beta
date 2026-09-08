package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import k2.g0;
import m2.t;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.w01;
public final class a implements Choreographer.FrameCallback {
    public final int f16821a;
    public final Object f16822b;

    public a(Object obj, int i10) {
        this.f16821a = i10;
        this.f16822b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f16821a) {
            case 0:
                b bVar = (b) ((g0) ((t) this.f16822b).f15844b).f14604b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16825b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f16824a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f16847i;
                        if (j10 == 0) {
                            hVar.f16847i = uptimeMillis;
                            hVar.e(hVar.f16842b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f16847i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f16852u;
                                double d = lVar2.f16859i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar2.c(kVar2.f16842b, kVar2.f16841a, j12);
                                l lVar3 = kVar2.f16852u;
                                lVar3.f16859i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f16831a, c10.f16832b, j12);
                                kVar2.f16842b = c11.f16831a;
                                kVar2.f16841a = c11.f16832b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f16852u.c(kVar2.f16842b, kVar2.f16841a, j11);
                                kVar.f16842b = c12.f16831a;
                                kVar.f16841a = c12.f16832b;
                            }
                            float max = Math.max(kVar.f16842b, kVar.h);
                            kVar.f16842b = max;
                            kVar.f16842b = Math.min(max, kVar.f16846g);
                            float f7 = kVar.f16841a;
                            l lVar4 = kVar.f16852u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.f16856e && Math.abs(min - ((float) lVar4.f16859i)) < lVar4.d) {
                                kVar.f16842b = (float) kVar.f16852u.f16859i;
                                kVar.f16841a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f16842b, hVar.f16846g);
                            hVar.f16842b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16842b = max2;
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
                if (bVar.f16827e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16827e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new t(bVar.f16826c);
                    }
                    t tVar = bVar.d;
                    ((Choreographer) tVar.f15845c).postFrameCallback((a) tVar.d);
                    return;
                }
                return;
            default:
                u01 u01Var = ((w01) this.f16822b).f32079a;
                if (u01Var != null) {
                    Handler handler = u01Var.getHandler();
                    if (handler != null && u01Var.f30782b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((w01) this.f16822b).f32079a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
