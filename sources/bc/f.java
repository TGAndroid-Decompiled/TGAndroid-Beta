package bc;

import a8.fg;
import a8.ig;
import a8.lg;
import a8.mg;
import a8.ng;
import aa.m0;
import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m4.w1;
import o6.j;
import o6.l;
import o6.o;
import sb.m;
import w7.e5;
import y7.b7;
import y7.c7;
import y7.ca;
import y7.d8;
import y7.e7;
import y7.e8;
import y7.f8;
import y7.k7;
import y7.l7;
import y7.m7;
import y7.n;
import y7.q0;
import y7.r;
public final class f extends sb.e {
    public boolean d = true;
    public final f8 e;
    public final b f3845f;
    public final ca f3846g;
    public final mg h;

    public f(ac.b bVar, b bVar2, ca caVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f3845f = bVar2;
        this.f3846g = caVar;
        ?? obj = new Object();
        obj.f50869a = Float.valueOf(bVar.f52848a);
        this.e = new f8(obj);
        this.h = new mg(sb.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f3845f.zzb();
        ca caVar = this.f3846g;
        ?? obj = new Object();
        obj.f1152c = k7.TYPE_THIN;
        w1 w1Var = new w1(28, (byte) 0);
        w1Var.f18293b = this.e;
        y7.l lVar = n.f52241b;
        Object[] objArr = {l7.NO_ERROR};
        e5.a(1, objArr);
        w1Var.f18294c = new r(1, objArr);
        obj.d = new e8(w1Var);
        m.f48064a.execute(new fg(caVar, new ng((m0) obj, 0), m7.ON_DEVICE_IMAGE_LABEL_LOAD, caVar.b(), 8));
    }

    @Override
    public final synchronized void c() {
        this.f3845f.zzc();
        this.d = true;
        ca caVar = this.f3846g;
        ?? obj = new Object();
        obj.f1152c = k7.TYPE_THIN;
        m.f48064a.execute(new fg(caVar, new ng((m0) obj, 0), m7.ON_DEVICE_IMAGE_LABEL_CLOSE, caVar.b(), 8));
    }

    @Override
    public final Object e(xb.a aVar) {
        l7 l7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f3845f.a(aVar);
                f(l7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (ob.a e) {
                if (e.f19277a == 14) {
                    l7Var = l7.MODEL_NOT_DOWNLOADED;
                } else {
                    l7Var = l7.UNKNOWN_ERROR;
                }
                f(l7Var, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(l7 l7Var, xb.a aVar, long j10) {
        int i10;
        b7 b7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ca caVar = this.f3846g;
        m7 m7Var = m7.ON_DEVICE_IMAGE_LABEL_DETECT;
        caVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (caVar.c(m7Var, elapsedRealtime2)) {
            caVar.f52105i.put(m7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f1152c = k7.TYPE_THIN;
            s4.d dVar = new s4.d(17, false);
            ?? obj2 = new Object();
            obj2.f614a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f615b = l7Var;
            obj2.f616c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            dVar.f47720b = new e7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f51707a;
                l.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else if (i11 != 17 && i11 != 842094169) {
                if (i11 != 35) {
                    i10 = 0;
                } else {
                    l.h(null);
                    throw null;
                }
            } else {
                l.h(null);
                throw null;
            }
            m4.c cVar = new m4.c(27, false);
            if (i11 != -1) {
                if (i11 != 35) {
                    if (i11 != 842094169) {
                        if (i11 != 16) {
                            if (i11 != 17) {
                                b7Var = b7.UNKNOWN_FORMAT;
                            } else {
                                b7Var = b7.NV21;
                            }
                        } else {
                            b7Var = b7.NV16;
                        }
                    } else {
                        b7Var = b7.YV12;
                    }
                } else {
                    b7Var = b7.YUV_420_888;
                }
            } else {
                b7Var = b7.BITMAP;
            }
            cVar.f18009b = b7Var;
            cVar.f18010c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            dVar.d = new c7(cVar);
            dVar.f47721c = this.e;
            obj.e = new d8(dVar);
            m.f48064a.execute(new fg(caVar, new ng((m0) obj, 0), m7Var, caVar.b(), 8));
        }
        s4.d dVar2 = new s4.d(16, false);
        dVar2.d = this.e;
        dVar2.f47720b = l7Var;
        dVar2.f47721c = Boolean.valueOf(this.d);
        m.f48064a.execute(new ig(this.f3846g, new q0(dVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        mg mgVar = this.h;
        int i12 = l7Var.f52214a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (mgVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (mgVar.f618b.get() != -1 && elapsedRealtime3 - mgVar.f618b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            mgVar.f617a.f(new o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new lg(mgVar, elapsedRealtime3, 10));
        }
    }
}
