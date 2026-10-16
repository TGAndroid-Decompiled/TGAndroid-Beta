package ac;

import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.android.gms.internal.cast.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import m2.t;
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
    public final b f491f;
    public final fa f492g;
    public final z8 h;

    public f(zb.a aVar, b bVar, fa faVar) {
        l.i(aVar, "ImageLabelerOptions can not be null");
        this.f491f = bVar;
        this.f492g = faVar;
        ?? obj = new Object();
        obj.f46477a = Float.valueOf(aVar.f48735a);
        this.e = new h8(obj);
        this.h = new z8(rb.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f491f.zzb();
        fa faVar = this.f492g;
        ?? obj = new Object();
        obj.f6196c = m7.TYPE_THIN;
        n3.b bVar = new n3.b(24, false);
        bVar.f15703b = this.e;
        m mVar = o.f48101b;
        Object[] objArr = {n7.NO_ERROR};
        k8.a(1, objArr);
        bVar.f15704c = new s(1, objArr);
        obj.d = new g8(bVar);
        rb.m.f43869a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.m) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_LOAD, faVar.b(), 7));
    }

    @Override
    public final synchronized void c() {
        this.f491f.zzc();
        this.d = true;
        fa faVar = this.f492g;
        ?? obj = new Object();
        obj.f6196c = m7.TYPE_THIN;
        rb.m.f43869a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.m) obj, 0), o7.ON_DEVICE_IMAGE_LABEL_CLOSE, faVar.b(), 7));
    }

    @Override
    public final Object e(wb.a aVar) {
        n7 n7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f491f.a(aVar);
                f(n7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (nb.a e) {
                if (e.f15954a == 14) {
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
        fa faVar = this.f492g;
        o7 o7Var = o7.ON_DEVICE_IMAGE_LABEL_DETECT;
        faVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (faVar.c(o7Var, elapsedRealtime2)) {
            faVar.f47996i.put(o7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f6196c = m7.TYPE_THIN;
            u2.c cVar = new u2.c(12, false);
            ?? obj2 = new Object();
            obj2.f5429b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f5430c = n7Var;
            obj2.f5428a = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.e = bool;
            cVar.f45875b = new g7(obj2);
            int i11 = aVar.e;
            if (i11 == -1) {
                Bitmap bitmap = aVar.f47510a;
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
            t tVar = new t(29, (byte) 0);
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
            tVar.f15110b = d7Var;
            tVar.f15111c = Integer.valueOf(i10 & Integer.MAX_VALUE);
            cVar.d = new e7(tVar);
            cVar.f45876c = this.e;
            obj.e = new f8(cVar);
            rb.m.f43869a.execute(new p(faVar, new a5.a((com.google.firebase.messaging.m) obj, 0), o7Var, faVar.b(), 7));
        }
        u2.c cVar2 = new u2.c(11, false);
        cVar2.d = this.e;
        cVar2.f45875b = n7Var;
        cVar2.f45876c = Boolean.valueOf(this.d);
        rb.m.f43869a.execute(new da(this.f492g, new r0(cVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        z8 z8Var = this.h;
        int i12 = n7Var.f48097a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (z8Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (z8Var.f46859b.get() != -1 && elapsedRealtime3 - z8Var.f46859b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            z8Var.f46858a.f(new n6.o(0, Arrays.asList(new j(24305, i12, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new ad.d(z8Var, elapsedRealtime3, 9));
        }
    }
}
