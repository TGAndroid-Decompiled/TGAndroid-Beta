package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import l7.w0;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.z01;
public final class a implements Choreographer.FrameCallback {
    public final int f16306a;
    public final Object f16307b;

    public a(Object obj, int i10) {
        this.f16306a = i10;
        this.f16307b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        j jVar;
        float min;
        boolean z4;
        switch (this.f16306a) {
            case 0:
                b bVar = (b) ((ja.c) ((w0) this.f16307b).f12080b).f9988a;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f16310b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.k kVar = bVar.f16309a;
                        Long l10 = (Long) kVar.get(hVar);
                        if (l10 != null) {
                            if (l10.longValue() < uptimeMillis2) {
                                kVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f16332i;
                        if (j11 == 0) {
                            hVar.f16332i = uptimeMillis;
                            hVar.e(hVar.f16327b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f16332i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar2 = jVar2.f16336u;
                                double d = kVar2.f16343i;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c3 = kVar2.c(jVar2.f16327b, jVar2.f16326a, j13);
                                k kVar3 = jVar2.f16336u;
                                kVar3.f16343i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c10 = kVar3.c(c3.f16316a, c3.f16317b, j13);
                                jVar2.f16327b = c10.f16316a;
                                jVar2.f16326a = c10.f16317b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                jVar = jVar2;
                                e c11 = jVar2.f16336u.c(jVar2.f16327b, jVar2.f16326a, j12);
                                jVar.f16327b = c11.f16316a;
                                jVar.f16326a = c11.f16317b;
                            }
                            float max = Math.max(jVar.f16327b, jVar.h);
                            jVar.f16327b = max;
                            jVar.f16327b = Math.min(max, jVar.f16331g);
                            float f10 = jVar.f16326a;
                            k kVar4 = jVar.f16336u;
                            kVar4.getClass();
                            if (Math.abs(f10) < kVar4.f16340e && Math.abs(min - ((float) kVar4.f16343i)) < kVar4.d) {
                                jVar.f16327b = (float) jVar.f16336u.f16343i;
                                jVar.f16326a = 0.0f;
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            float min2 = Math.min(hVar.f16327b, hVar.f16331g);
                            hVar.f16327b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f16327b = max2;
                            hVar.e(max2);
                            if (z4) {
                                hVar.d(false);
                            }
                            i11 = i10 + 1;
                        }
                    }
                    i10 = i11;
                    i11 = i10 + 1;
                }
                if (bVar.f16312e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f16312e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new w0(bVar.f16311c);
                    }
                    w0 w0Var = bVar.d;
                    ((Choreographer) w0Var.f12081c).postFrameCallback((a) w0Var.d);
                    return;
                }
                return;
            default:
                z01 z01Var = ((b11) this.f16307b).f25455a;
                if (z01Var != null) {
                    Handler handler = z01Var.getHandler();
                    if (handler != null && z01Var.f33678b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((b11) this.f16307b).f25455a.P) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
