package o1;

import a0.m;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.y01;
public final class a implements Choreographer.FrameCallback {
    public final int f15332a;
    public final Object f15333b;

    public a(Object obj, int i10) {
        this.f15332a = i10;
        this.f15333b = obj;
    }

    @Override
    public final void doFrame(long j3) {
        int i10;
        k kVar;
        float min;
        boolean z10;
        switch (this.f15332a) {
            case 0:
                b bVar = (b) ((ka.c) ((lf.i) this.f15333b).f14033b).f13567b;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f15336b;
                long uptimeMillis2 = SystemClock.uptimeMillis();
                int i11 = 0;
                while (i11 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i11);
                    if (hVar != null) {
                        m mVar = bVar.f15335a;
                        Long l4 = (Long) mVar.get(hVar);
                        if (l4 != null) {
                            if (l4.longValue() < uptimeMillis2) {
                                mVar.remove(hVar);
                            }
                        }
                        long j10 = hVar.f15356i;
                        if (j10 == 0) {
                            hVar.f15356i = uptimeMillis;
                            hVar.e(hVar.f15352b);
                        } else {
                            long j11 = uptimeMillis - j10;
                            hVar.f15356i = uptimeMillis;
                            k kVar2 = (k) hVar;
                            if (kVar2.v != Float.MAX_VALUE) {
                                l lVar = kVar2.f15361u;
                                double d = lVar.f15367i;
                                i10 = i11;
                                long j12 = j11 / 2;
                                e c10 = lVar.c(kVar2.f15352b, kVar2.f15351a, j12);
                                l lVar2 = kVar2.f15361u;
                                lVar2.f15367i = kVar2.v;
                                kVar2.v = Float.MAX_VALUE;
                                e c11 = lVar2.c(c10.f15341a, c10.f15342b, j12);
                                kVar2.f15352b = c11.f15341a;
                                kVar2.f15351a = c11.f15342b;
                                kVar = kVar2;
                            } else {
                                i10 = i11;
                                kVar = kVar2;
                                e c12 = kVar2.f15361u.c(kVar2.f15352b, kVar2.f15351a, j11);
                                kVar.f15352b = c12.f15341a;
                                kVar.f15351a = c12.f15342b;
                            }
                            float max = Math.max(kVar.f15352b, kVar.h);
                            kVar.f15352b = max;
                            kVar.f15352b = Math.min(max, kVar.f15355g);
                            float f7 = kVar.f15351a;
                            l lVar3 = kVar.f15361u;
                            lVar3.getClass();
                            if (Math.abs(f7) < lVar3.e && Math.abs(min - ((float) lVar3.f15367i)) < lVar3.d) {
                                kVar.f15352b = (float) kVar.f15361u.f15367i;
                                kVar.f15351a = 0.0f;
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            float min2 = Math.min(hVar.f15352b, hVar.f15355g);
                            hVar.f15352b = min2;
                            float max2 = Math.max(min2, hVar.h);
                            hVar.f15352b = max2;
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
                        bVar.d = new lf.i(bVar.f15337c);
                    }
                    lf.i iVar = bVar.d;
                    ((Choreographer) iVar.f14034c).postFrameCallback((a) iVar.d);
                    return;
                }
                return;
            default:
                w01 w01Var = ((y01) this.f15333b).f30070a;
                if (w01Var != null) {
                    Handler handler = w01Var.getHandler();
                    if (handler != null && w01Var.f29460b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((y01) this.f15333b).f30070a.S) {
                        Choreographer.getInstance().postFrameCallback(this);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
