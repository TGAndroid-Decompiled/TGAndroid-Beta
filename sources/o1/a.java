package o1;

import a0.l;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import jg.s0;
import org.telegram.ui.Components.e21;
import org.telegram.ui.Components.g21;
public final class a implements Choreographer.FrameCallback {
    public final int f18941a;
    public final Object f18942b;

    public a(Object obj, int i10) {
        this.f18941a = i10;
        this.f18942b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        int i10;
        boolean z10;
        j jVar;
        float min;
        boolean z11;
        switch (this.f18941a) {
            case 0:
                b bVar = (b) ((s0) ((k6.c) this.f18942b).f16406b).f15828b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f18945b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        l lVar = bVar.f18944a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j11 = hVar.f18965i;
                        if (j11 == 0) {
                            hVar.f18965i = uptimeMillis;
                            hVar.f(hVar.f18961b);
                        } else {
                            long j12 = uptimeMillis - j11;
                            hVar.f18965i = uptimeMillis;
                            j jVar2 = (j) hVar;
                            if (jVar2.v != Float.MAX_VALUE) {
                                k kVar = jVar2.f18969u;
                                double d = kVar.f18975i;
                                z10 = true;
                                i10 = i11;
                                long j13 = j12 / 2;
                                e c10 = kVar.c(jVar2.f18961b, jVar2.f18960a, j13);
                                k kVar2 = jVar2.f18969u;
                                kVar2.f18975i = jVar2.v;
                                jVar2.v = Float.MAX_VALUE;
                                e c11 = kVar2.c(c10.f18950a, c10.f18951b, j13);
                                jVar2.f18961b = c11.f18950a;
                                jVar2.f18960a = c11.f18951b;
                                jVar = jVar2;
                            } else {
                                i10 = i11;
                                z10 = true;
                                jVar = jVar2;
                                e c12 = jVar2.f18969u.c(jVar2.f18961b, jVar2.f18960a, j12);
                                jVar.f18961b = c12.f18950a;
                                jVar.f18960a = c12.f18951b;
                            }
                            float max = Math.max(jVar.f18961b, jVar.h);
                            jVar.f18961b = max;
                            jVar.f18961b = Math.min(max, jVar.f18964g);
                            float f7 = jVar.f18960a;
                            k kVar3 = jVar.f18969u;
                            kVar3.getClass();
                            if (Math.abs(f7) < kVar3.e && Math.abs(min - ((float) kVar3.f18975i)) < kVar3.d) {
                                jVar.f18961b = (float) jVar.f18969u.f18975i;
                                jVar.f18960a = 0.0f;
                                z11 = z10;
                            } else {
                                z11 = false;
                            }
                            float min2 = Math.min(hVar.f18961b, hVar.f18964g);
                            hVar.f18961b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f18961b = max2;
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
                        bVar.d = new k6.c(bVar.f18946c);
                    }
                    k6.c cVar = bVar.d;
                    ((Choreographer) cVar.f16407c).postFrameCallback((a) cVar.d);
                    return;
                }
                return;
            default:
                e21 e21Var = ((g21) this.f18942b).f28393a;
                if (e21Var != null) {
                    Handler handler = e21Var.getHandler();
                    if (handler != null && e21Var.f27692b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((g21) this.f18942b).f28393a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
