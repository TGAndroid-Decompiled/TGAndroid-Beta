package ac;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import mi.q;
import n6.j;
import n6.l;
import v7.z8;
import w7.k8;
import x7.d7;
import x7.da;
import x7.e7;
import x7.f8;
import x7.fa;
import x7.g7;
import x7.g8;
import x7.h8;
import x7.m;
import x7.m7;
import x7.n7;
import x7.o;
import x7.o7;
import x7.r0;
import x7.s;
public final class f extends rb.e {
    public boolean d = true;
    public final h8 e;
    public final b f489f;
    public final fa f490g;
    public final z8 h;

    public f(zb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f489f = bVar;
        this.f490g = faVar;
        le.b bVar2 = new le.b(28);
        bVar2.f16009b = Float.valueOf(aVar.f50120a);
        this.e = new h8(bVar2);
        this.h = new z8(rb.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f489f.zzb();
        fa faVar = this.f490g;
        ?? obj = new Object();
        obj.f7647c = m7.TYPE_THIN;
        n2.e eVar = new n2.e(25, false);
        eVar.f17039b = this.e;
        m mVar = o.f49489b;
        Object[] objArr = {n7.NO_ERROR};
        k8.a(1, objArr);
        eVar.f17040c = new s(1, objArr);
        obj.d = new g8(eVar);
        rb.m.f45199a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.l) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, faVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f489f.zzc();
        this.d = true;
        fa faVar = this.f490g;
        ?? obj = new Object();
        obj.f7647c = m7.TYPE_THIN;
        rb.m.f45199a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.l) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, faVar.b(), 7));
    }

    @Override
    public final Object e(wb.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f489f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (nb.a e) {
                if (e.f17334a == 14) {
                    n7Var = n7.MODEL_NOT_DOWNLOADED;
                } else {
                    n7Var = n7.UNKNOWN_ERROR;
                }
                f(n7Var, aVar, elapsedRealtime);
                throw e;
            }
        }
        return a2;
    }

    public final void f(n7 n7Var, wb.a aVar, long j10) {
        int i10;
        d7 d7Var;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        fa faVar = this.f490g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.f49384i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f7647c = m7.TYPE_THIN;
            u2.c cVar = new u2.c(12, false);
            ?? obj2 = new Object();
            obj2.f6881b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f6882c = n7Var;
            obj2.f6880a = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            cVar.f47261b = new g7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f48898a;
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
            q qVar = new q(27, (byte) 0);
            if (i11 != -1) {
                if (i11 != 35) {
                    if (i11 != 842094169) {
                        if (i11 != 16) {
                            if (i11 != 17) {
                                d7Var = d7.UNKNOWN_FORMAT;
                            } else {
                                d7Var = d7.NV21;
                            }
                        } else {
                            d7Var = d7.NV16;
                        }
                    } else {
                        d7Var = d7.YV12;
                    }
                } else {
                    d7Var = d7.YUV_420_888;
                }
            } else {
                d7Var = d7.BITMAP;
            }
            qVar.f16973b = d7Var;
            qVar.f16974c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            cVar.d = new e7(qVar);
            cVar.f47262c = this.e;
            obj.e = new f8(cVar);
            rb.m.f45199a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.l) obj, 0), o7Var, faVar.b(), 7));
        }
        u2.c cVar2 = new u2.c(11, false);
        cVar2.d = this.e;
        cVar2.f47261b = n7Var;
        cVar2.f47262c = Boolean.valueOf(this.d);
        rb.m.f45199a.execute(new da(this.f490g, new r0(cVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.h;
        int i12 = n7Var.f49485a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.f48246b.get() != -1 && elapsedRealtime3 - z8Var.f48246b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.f48245a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(z8Var, elapsedRealtime3, 9));
        }
    }
}
