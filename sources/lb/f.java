package lb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import b4.e0;
import b6.k;
import b6.m;
import c2.p;
import cb.h;
import cb.o;
import j7.d9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import l7.j7;
import l7.ja;
import l7.k7;
import l7.l8;
import l7.la;
import l7.m7;
import l7.m8;
import l7.n8;
import l7.q;
import l7.s;
import l7.s7;
import l7.t7;
import l7.u7;
import l7.w;
import l7.w0;
import l7.x0;
public final class f extends cb.f {
    public boolean d = true;
    public final n8 e;
    public final b f11847f;
    public final la f11848g;
    public final d9 h;

    public f(kb.b bVar, b bVar2, la laVar) {
        m.i(bVar, "ImageLabelerOptions can not be null");
        this.f11847f = bVar2;
        this.f11848g = laVar;
        ?? obj = new Object();
        obj.f9037a = Float.valueOf(bVar.f9358a);
        this.e = new n8(obj);
        this.h = new d9(h.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f11847f.zzb();
        la laVar = this.f11848g;
        ?? obj = new Object();
        obj.f145c = s7.TYPE_THIN;
        f7.b bVar = new f7.b((char) 0, 25);
        bVar.f6012b = this.e;
        q qVar = s.f11612b;
        Object[] objArr = {t7.NO_ERROR};
        k7.g.a(1, objArr);
        bVar.f6013c = new w(1, objArr);
        obj.d = new m8(bVar);
        o.f2237a.execute(new p(laVar, new e0((a9.a) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_LOAD, laVar.b(), false, 6));
    }

    @Override
    public final synchronized void c() {
        this.f11847f.zzc();
        this.d = true;
        la laVar = this.f11848g;
        ?? obj = new Object();
        obj.f145c = s7.TYPE_THIN;
        o.f2237a.execute(new p(laVar, new e0((a9.a) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_CLOSE, laVar.b(), false, 6));
    }

    @Override
    public final Object e(hb.a aVar) {
        t7 t7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f11847f.a(aVar);
                f(t7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (ya.a e) {
                if (e.f47110a == 14) {
                    t7Var = t7.MODEL_NOT_DOWNLOADED;
                } else {
                    t7Var = t7.UNKNOWN_ERROR;
                }
                f(t7Var, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(t7 t7Var, hb.a aVar, long j10) {
        int i10;
        j7 j7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        la laVar = this.f11848g;
        u7 u7Var = u7.ON_DEVICE_IMAGE_LABEL_DETECT;
        laVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (laVar.c(u7Var, elapsedRealtime2)) {
            laVar.f11544i.put(u7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f145c = s7.TYPE_THIN;
            w0 w0Var = new w0(2, false);
            ?? obj2 = new Object();
            obj2.f2129a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f2130b = t7Var;
            obj2.f2131c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            w0Var.f11676b = new m7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f7051a;
                m.h(bitmap);
                i10 = bitmap.getAllocationByteCount();
            } else if (i11 != 17 && i11 != 842094169) {
                if (i11 != 35) {
                    i10 = 0;
                } else {
                    m.h(null);
                    throw null;
                }
            } else {
                m.h(null);
                throw null;
            }
            f7.b bVar = new f7.b((char) 0, 24);
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
            bVar.f6012b = j7Var;
            bVar.f6013c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            w0Var.d = new k7(bVar);
            w0Var.f11677c = this.e;
            obj.e = new l8(w0Var);
            o.f2237a.execute(new p(laVar, new e0((a9.a) obj, 0), u7Var, laVar.b(), false, 6));
        }
        w0 w0Var2 = new w0(1, false);
        w0Var2.d = this.e;
        w0Var2.f11676b = t7Var;
        w0Var2.f11677c = Boolean.valueOf(this.d);
        o.f2237a.execute(new ja(this.f11848g, new x0(w0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.h;
        int i12 = t7Var.f11644a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.f8977b.get() != -1 && elapsedRealtime3 - d9Var.f8977b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f8976a.f(new b6.p(0, Arrays.asList(new k(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime3, 4));
        }
    }
}
