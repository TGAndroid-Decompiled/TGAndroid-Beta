package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import m.e3;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.x01;
public final class a implements Choreographer.FrameCallback {
    public final int f15322a;
    public final Object f15323b;

    public a(Object obj, int i10) {
        this.f15322a = i10;
        this.f15323b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15322a) {
            case 0:
                b bVar = (b) ((ka.c) ((e3) this.f15323b).f14165b).f13564b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15326b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        a0.l lVar = bVar.f15325a;
                        Long l4 = (Long) lVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                lVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15346i;
                        if (j10 == 0) {
                            hVar.f15346i = uptimeMillis;
                            hVar.e(hVar.f15342b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15346i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar2 = kVar2.f15351u;
                                double d = lVar2.f15357i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar2.c(kVar2.f15342b, kVar2.f15341a, j12);
                                l lVar3 = kVar2.f15351u;
                                lVar3.f15357i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar3.c(c10.f15331a, c10.f15332b, j12);
                                kVar2.f15342b = c11.f15331a;
                                kVar2.f15341a = c11.f15332b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15351u.c(kVar2.f15342b, kVar2.f15341a, j11);
                                kVar.f15342b = c12.f15331a;
                                kVar.f15341a = c12.f15332b;
                            }
                            float max = Math.max(kVar.f15342b, kVar.h);
                            kVar.f15342b = max;
                            kVar.f15342b = Math.min(max, kVar.f15345g);
                            float f7 = kVar.f15341a;
                            l lVar4 = kVar.f15351u;
                            lVar4.getClass();
                            if (Math.abs(f7) < lVar4.e && Math.abs(min - ((float) lVar4.f15357i)) < lVar4.d) {
                                kVar.f15342b = (float) kVar.f15351u.f15357i;
                                kVar.f15341a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15342b, hVar.f15345g);
                            hVar.f15342b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15342b = max2;
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
                        bVar.d = new e3(bVar.f15327c);
                    }
                    e3 e3Var = bVar.d;
                    ((Choreographer) e3Var.f14166c).postFrameCallback((a) e3Var.d);
                    return;
                }
                return;
            default:
                v01 v01Var = ((x01) this.f15323b).f29840a;
                if (v01Var != null) {
                    Handler handler = v01Var.getHandler();
                    if (handler != null && v01Var.f28545b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((x01) this.f15323b).f29840a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
