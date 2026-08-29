package jb;

import ab.h;
import ag.j2;
import android.graphics.Bitmap;
import android.os.SystemClock;
import bg.c2;
import c2.p;
import h7.b9;
import h7.r8;
import j7.j7;
import j7.ja;
import j7.k7;
import j7.l8;
import j7.la;
import j7.m7;
import j7.m8;
import j7.n8;
import j7.q;
import j7.s;
import j7.s7;
import j7.t7;
import j7.u7;
import j7.w;
import j7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import z5.j;
import z5.l;
import z5.o;
public final class f extends ab.f {
    public boolean d = true;
    public final n8 f11431e;
    public final b f11432f;
    public final la f11433g;
    public final b9 h;

    public f(ib.b bVar, b bVar2, la laVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f11432f = bVar2;
        this.f11433g = laVar;
        ha.c cVar = new ha.c(20);
        cVar.f7981b = Float.valueOf(bVar.f7985a);
        this.f11431e = new n8(cVar);
        this.h = new b9(h.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f11432f.zzb();
        la laVar = this.f11433g;
        ?? obj = new Object();
        obj.f2120c = s7.TYPE_THIN;
        g9.l lVar = new g9.l(12, (byte) 0);
        lVar.f7168b = this.f11431e;
        q qVar = s.f11168b;
        Object[] objArr = {t7.NO_ERROR};
        r8.a(1, objArr);
        lVar.f7169c = new w(1, objArr);
        obj.d = new m8(lVar);
        ab.q.f333a.execute(new p(laVar, new j2((c2) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_LOAD, laVar.b(), false, 5));
    }

    @Override
    public final synchronized void c() {
        this.f11432f.zzc();
        this.d = true;
        la laVar = this.f11433g;
        ?? obj = new Object();
        obj.f2120c = s7.TYPE_THIN;
        ab.q.f333a.execute(new p(laVar, new j2((c2) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_CLOSE, laVar.b(), false, 5));
    }

    @Override
    public final Object e(fb.a aVar) {
        t7 t7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f11432f.a(aVar);
                f(t7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (wa.a e10) {
                if (e10.f49801a == 14) {
                    t7Var = t7.MODEL_NOT_DOWNLOADED;
                } else {
                    t7Var = t7.UNKNOWN_ERROR;
                }
                f(t7Var, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a2;
    }

    public final void f(t7 t7Var, fb.a aVar, long j10) {
        int i10;
        j7 j7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        la laVar = this.f11433g;
        u7 u7Var = u7.ON_DEVICE_IMAGE_LABEL_DETECT;
        laVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (laVar.c(u7Var, elapsedRealtime2)) {
            laVar.f11094i.put(u7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f2120c = s7.TYPE_THIN;
            androidx.biometric.e eVar = new androidx.biometric.e(24, false);
            ?? obj2 = new Object();
            obj2.f211a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f212b = t7Var;
            obj2.f213c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.f214e = bool;
            eVar.f1030b = new m7(obj2);
            int i11 = aVar.f6702e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f6699a;
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
            g9.l lVar = new g9.l(11, (byte) 0);
            if (i11 != -1) {
                if (i11 != 35) {
                    if (i11 != 842094169) {
                        if (i11 != 16) {
                            if (i11 != 17) {
                                j7Var = j7.UNKNOWN_FORMAT;
                            } else {
                                j7Var = j7.NV21;
                            }
                        } else {
                            j7Var = j7.NV16;
                        }
                    } else {
                        j7Var = j7.YV12;
                    }
                } else {
                    j7Var = j7.YUV_420_888;
                }
            } else {
                j7Var = j7.BITMAP;
            }
            lVar.f7168b = j7Var;
            lVar.f7169c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            eVar.d = new k7(lVar);
            eVar.f1031c = this.f11431e;
            obj.f2121e = new l8(eVar);
            ab.q.f333a.execute(new p(laVar, new j2((c2) obj, 0), u7Var, laVar.b(), false, 5));
        }
        androidx.biometric.e eVar2 = new androidx.biometric.e(23, false);
        eVar2.d = this.f11431e;
        eVar2.f1030b = t7Var;
        eVar2.f1031c = Boolean.valueOf(this.d);
        ab.q.f333a.execute(new ja(this.f11433g, new w0(eVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        b9 b9Var = this.h;
        int i12 = t7Var.f11203a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (b9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b9Var.f7568b.get() != -1 && elapsedRealtime3 - b9Var.f7568b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            b9Var.f7567a.f(new o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(b9Var, elapsedRealtime3, 3));
        }
    }
}
