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
    public final n8 f12267e;
    public final b f12268f;
    public final la f12269g;
    public final d9 h;

    public f(kb.b bVar, b bVar2, la laVar) {
        m.i(bVar, "ImageLabelerOptions can not be null");
        this.f12268f = bVar2;
        this.f12269g = laVar;
        ?? obj = new Object();
        obj.f9631a = Float.valueOf(bVar.f9992a);
        this.f12267e = new n8(obj);
        this.h = new d9(h.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f12268f.zzb();
        la laVar = this.f12269g;
        ?? obj = new Object();
        obj.f157c = s7.TYPE_THIN;
        f7.b bVar = new f7.b((char) 0, 25);
        bVar.f6120b = this.f12267e;
        q qVar = s.f12009b;
        Object[] objArr = {t7.NO_ERROR};
        k7.h.a(1, objArr);
        bVar.f6121c = new w(1, objArr);
        obj.d = new m8(bVar);
        o.f2429a.execute(new p(laVar, new e0((a9.a) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_LOAD, laVar.b(), false, 6));
    }

    @Override
    public final synchronized void c() {
        this.f12268f.zzc();
        this.d = true;
        la laVar = this.f12269g;
        ?? obj = new Object();
        obj.f157c = s7.TYPE_THIN;
        o.f2429a.execute(new p(laVar, new e0((a9.a) obj, 0), u7.ON_DEVICE_IMAGE_LABEL_CLOSE, laVar.b(), false, 6));
    }

    @Override
    public final Object e(hb.a aVar) {
        t7 t7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f12268f.a(aVar);
                f(t7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (ya.a e6) {
                if (e6.f50837a == 14) {
                    t7Var = t7.MODEL_NOT_DOWNLOADED;
                } else {
                    t7Var = t7.UNKNOWN_ERROR;
                }
                f(t7Var, aVar, elapsedRealtime);
                throw e6;
            }
        }
        return a2;
    }

    public final void f(t7 t7Var, hb.a aVar, long j10) {
        int i10;
        j7 j7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        la laVar = this.f12269g;
        u7 u7Var = u7.ON_DEVICE_IMAGE_LABEL_DETECT;
        laVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (laVar.c(u7Var, elapsedRealtime2)) {
            laVar.f11935i.put(u7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f157c = s7.TYPE_THIN;
            w0 w0Var = new w0(2, false);
            ?? obj2 = new Object();
            obj2.f2315a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f2316b = t7Var;
            obj2.f2317c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.f2318e = bool;
            w0Var.f12080b = new m7(obj2);
            int i11 = aVar.f7369e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f7366a;
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
            bVar.f6120b = j7Var;
            bVar.f6121c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            w0Var.d = new k7(bVar);
            w0Var.f12081c = this.f12267e;
            obj.f158e = new l8(w0Var);
            o.f2429a.execute(new p(laVar, new e0((a9.a) obj, 0), u7Var, laVar.b(), false, 6));
        }
        w0 w0Var2 = new w0(1, false);
        w0Var2.d = this.f12267e;
        w0Var2.f12080b = t7Var;
        w0Var2.f12081c = Boolean.valueOf(this.d);
        o.f2429a.execute(new ja(this.f12269g, new x0(w0Var2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.h;
        int i12 = t7Var.f12044a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.f9589b.get() != -1 && elapsedRealtime3 - d9Var.f9589b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f9588a.f(new b6.p(0, Arrays.asList(new k(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(d9Var, elapsedRealtime3, 4));
        }
    }
}
