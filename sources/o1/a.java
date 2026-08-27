package o1;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;
import org.telegram.ui.Components.d01;
import org.telegram.ui.Components.f01;

public final class a implements Choreographer.FrameCallback {

    public final int f19117a;

    public final Object f19118b;

    public a(Object obj, int i10) {
        this.f19117a = i10;
        this.f19118b = obj;
    }

    @Override
    public final void doFrame(long j10) {
        long j11;
        long j12;
        j jVar;
        j jVar2;
        float f10;
        k kVar;
        boolean z10;
        switch (this.f19117a) {
            case 0:
                b bVar = (b) ((n1.d) ((j9.a) this.f19118b).f12863b).f18088b;
                long jUptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = bVar.f19121b;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i10 = 0;
                while (i10 < arrayList.size()) {
                    h hVar = (h) arrayList.get(i10);
                    if (hVar == null) {
                        i10 = i10;
                    } else {
                        a0.k kVar2 = bVar.f19120a;
                        Long l10 = (Long) kVar2.get(hVar);
                        if (l10 == null) {
                            j11 = hVar.f19143i;
                            if (j11 == 0) {
                                hVar.f19143i = jUptimeMillis;
                                hVar.e(hVar.f19138b);
                                i10 = i10;
                            } else {
                                j12 = jUptimeMillis - j11;
                                hVar.f19143i = jUptimeMillis;
                                jVar = (j) hVar;
                                if (jVar.v != Float.MAX_VALUE) {
                                    k kVar3 = jVar.f19147u;
                                    double d = kVar3.f19154i;
                                    long j13 = j12 / 2;
                                    e eVarC = kVar3.c(jVar.f19138b, jVar.f19137a, j13);
                                    k kVar4 = jVar.f19147u;
                                    kVar4.f19154i = jVar.v;
                                    jVar.v = Float.MAX_VALUE;
                                    e eVarC2 = kVar4.c(eVarC.f19127a, eVarC.f19128b, j13);
                                    jVar.f19138b = eVarC2.f19127a;
                                    jVar.f19137a = eVarC2.f19128b;
                                    jVar2 = jVar;
                                } else {
                                    jVar2 = jVar;
                                    e eVarC3 = jVar.f19147u.c(jVar.f19138b, jVar.f19137a, j12);
                                    jVar2.f19138b = eVarC3.f19127a;
                                    jVar2.f19137a = eVarC3.f19128b;
                                }
                                float fMax = Math.max(jVar2.f19138b, jVar2.h);
                                jVar2.f19138b = fMax;
                                float fMin = Math.min(fMax, jVar2.f19142g);
                                jVar2.f19138b = fMin;
                                f10 = jVar2.f19137a;
                                kVar = jVar2.f19147u;
                                kVar.getClass();
                                if (Math.abs(f10) < kVar.f19151e) {
                                    z10 = false;
                                } else {
                                    z10 = false;
                                }
                                float fMin2 = Math.min(hVar.f19138b, hVar.f19142g);
                                hVar.f19138b = fMin2;
                                float fMax2 = Math.max(fMin2, hVar.h);
                                hVar.f19138b = fMax2;
                                hVar.e(fMax2);
                                if (z10) {
                                    hVar.d(false);
                                }
                            }
                        } else if (l10.longValue() < jUptimeMillis2) {
                            kVar2.remove(hVar);
                            j11 = hVar.f19143i;
                            if (j11 == 0) {
                                hVar.f19143i = jUptimeMillis;
                                hVar.e(hVar.f19138b);
                                i10 = i10;
                            } else {
                                j12 = jUptimeMillis - j11;
                                hVar.f19143i = jUptimeMillis;
                                jVar = (j) hVar;
                                if (jVar.v != Float.MAX_VALUE) {
                                    k kVar5 = jVar.f19147u;
                                    double d10 = kVar5.f19154i;
                                    long j14 = j12 / 2;
                                    e eVarC4 = kVar5.c(jVar.f19138b, jVar.f19137a, j14);
                                    k kVar6 = jVar.f19147u;
                                    kVar6.f19154i = jVar.v;
                                    jVar.v = Float.MAX_VALUE;
                                    e eVarC5 = kVar6.c(eVarC4.f19127a, eVarC4.f19128b, j14);
                                    jVar.f19138b = eVarC5.f19127a;
                                    jVar.f19137a = eVarC5.f19128b;
                                    jVar2 = jVar;
                                } else {
                                    jVar2 = jVar;
                                    e eVarC6 = jVar.f19147u.c(jVar.f19138b, jVar.f19137a, j12);
                                    jVar2.f19138b = eVarC6.f19127a;
                                    jVar2.f19137a = eVarC6.f19128b;
                                }
                                float fMax3 = Math.max(jVar2.f19138b, jVar2.h);
                                jVar2.f19138b = fMax3;
                                float fMin3 = Math.min(fMax3, jVar2.f19142g);
                                jVar2.f19138b = fMin3;
                                f10 = jVar2.f19137a;
                                kVar = jVar2.f19147u;
                                kVar.getClass();
                                if (Math.abs(f10) < kVar.f19151e || Math.abs(fMin3 - ((float) kVar.f19154i)) >= kVar.d) {
                                    z10 = false;
                                } else {
                                    jVar2.f19138b = (float) jVar2.f19147u.f19154i;
                                    jVar2.f19137a = 0.0f;
                                    z10 = true;
                                }
                                float fMin4 = Math.min(hVar.f19138b, hVar.f19142g);
                                hVar.f19138b = fMin4;
                                float fMax4 = Math.max(fMin4, hVar.h);
                                hVar.f19138b = fMax4;
                                hVar.e(fMax4);
                                if (z10) {
                                    hVar.d(false);
                                }
                            }
                        } else {
                            i10 = i10;
                        }
                    }
                    i10++;
                }
                if (bVar.f19123e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    bVar.f19123e = false;
                }
                if (arrayList.size() > 0) {
                    if (bVar.d == null) {
                        bVar.d = new j9.a(bVar.f19122c);
                    }
                    j9.a aVar = bVar.d;
                    ((Choreographer) aVar.f12864c).postFrameCallback((a) aVar.d);
                }
                break;
            default:
                d01 d01Var = ((f01) this.f19118b).f28221a;
                if (d01Var != null) {
                    Handler handler = d01Var.getHandler();
                    if (handler != null && d01Var.f27594b.get()) {
                        handler.sendMessage(handler.obtainMessage(0));
                    }
                    if (((f01) this.f19118b).f28221a.O) {
                        Choreographer.getInstance().postFrameCallback(this);
                    }
                }
                break;
        }
    }
}
