package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import jg.s0;
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.h21;
public final class a implements Choreographer.FrameCallback {
    public final int f18940a;
    public final Object f18941b;

    public a(Object obj, int i10) {
        this.f18940a = i10;
        this.f18941b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        j jVar;
        float min;
        boolean z11;
        switch (this.f18940a) {
            case 0:
                b bVar = (b) ((s0) ((k6.c) this.f18941b).f16405b).f15827b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f18944b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        l lVar = bVar.f18943a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f18964i;
                        if (j11 == 0) {
                            hVar.f18964i = uptimeMillis;
                            hVar.f(hVar.f18960b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f18964i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar = jVar2.f18968u;
                                double d = kVar.f18974i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar2.f18960b, jVar2.f18959a, j13);
                                k kVar2 = jVar2.f18968u;
                                kVar2.f18974i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.f18949a, c10.f18950b, j13);
                                jVar2.f18960b = c11.f18949a;
                                jVar2.f18959a = c11.f18950b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                jVar = jVar2;
                                e c12 = jVar2.f18968u.c(jVar2.f18960b, jVar2.f18959a, j12);
                                jVar.f18960b = c12.f18949a;
                                jVar.f18959a = c12.f18950b;
                            }
                            float max = Math.max(jVar.f18960b, jVar.h);
                            jVar.f18960b = max;
                            jVar.f18960b = Math.min(max, jVar.f18963g);
                            float f7 = jVar.f18959a;
                            k kVar3 = jVar.f18968u;
                            kVar3.getClass();
                            if (Math.abs(f7) < kVar3.e && Math.abs(min - ((float) kVar3.f18974i)) < kVar3.d) {
                                jVar.f18960b = (float) jVar.f18968u.f18974i;
                                jVar.f18959a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f18960b, hVar.f18963g);
                            hVar.f18960b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f18960b = max2;
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
                        bVar.d = new k6.c(bVar.f18945c);
                    }
                    k6.c cVar = bVar.d;
                    ((Choreographer) cVar.f16406c).postFrameCallback((a) cVar.d);
                    return;
                }
                return;
            default:
                f21 f21Var = ((h21) this.f18941b).f28835a;
                if (f21Var != null) {
                    Handler handler = f21Var.getHandler();
                    if (handler != null && f21Var.f27985b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((h21) this.f18941b).f28835a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
