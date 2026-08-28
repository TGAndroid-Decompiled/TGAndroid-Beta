package hb;

import android.graphics.Bitmap;
import android.os.SystemClock;
import f7.d9;
import f7.y7;
import h7.i7;
import h7.ia;
import h7.j7;
import h7.k8;
import h7.ka;
import h7.l7;
import h7.l8;
import h7.m8;
import h7.q;
import h7.r7;
import h7.s;
import h7.s7;
import h7.t7;
import h7.w;
import h7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import x5.j;
import x5.l;
import x5.o;
import ya.m;
public final class f extends ya.e {
    public boolean d = true;
    public final m8 f10396e;
    public final b f10397f;
    public final ka f10398g;
    public final d9 h;

    public f(gb.b bVar, b bVar2, ka kaVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f10397f = bVar2;
        this.f10398g = kaVar;
        xa.c cVar = new xa.c(17);
        cVar.f49099b = Float.valueOf(bVar.f6038a);
        this.f10396e = new m8(cVar);
        this.h = new d9(ya.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f10397f.zzb();
        ka kaVar = this.f10398g;
        ?? obj = new Object();
        obj.f4162c = r7.TYPE_THIN;
        g5.b bVar = new g5.b(6);
        bVar.f7111b = this.f10396e;
        q qVar = s.f10091b;
        Object[] objArr = {s7.NO_ERROR};
        y7.a(1, objArr);
        bVar.f7112c = new w(1, objArr);
        obj.d = new l8(bVar);
        m.f49706a.execute(new af.f(kaVar, new a6.a((com.google.firebase.messaging.m) obj, 0), t7.ON_DEVICE_IMAGE_LABEL_LOAD, kaVar.b(), false, 5));
    }

    @Override
    public final synchronized void c() {
        this.f10397f.zzc();
        this.d = true;
        ka kaVar = this.f10398g;
        ?? obj = new Object();
        obj.f4162c = r7.TYPE_THIN;
        m.f49706a.execute(new af.f(kaVar, new a6.a((com.google.firebase.messaging.m) obj, 0), t7.ON_DEVICE_IMAGE_LABEL_CLOSE, kaVar.b(), false, 5));
    }

    @Override
    public final Object e(db.a aVar) {
        s7 s7Var;
        ArrayList a2;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a2 = this.f10397f.a(aVar);
                f(s7.NO_ERROR, aVar, elapsedRealtime);
                this.d = false;
            } catch (ua.a e10) {
                if (e10.f48141a == 14) {
                    s7Var = s7.MODEL_NOT_DOWNLOADED;
                } else {
                    s7Var = s7.UNKNOWN_ERROR;
                }
                f(s7Var, aVar, elapsedRealtime);
                throw e10;
            }
        }
        return a2;
    }

    public final void f(s7 s7Var, db.a aVar, long j10) {
        int i9;
        i7 i7Var;
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ka kaVar = this.f10398g;
        t7 t7Var = t7.ON_DEVICE_IMAGE_LABEL_DETECT;
        kaVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (!kaVar.c(t7Var, elapsedRealtime2)) {
            z10 = false;
        } else {
            kaVar.f10005i.put(t7Var, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.f4162c = r7.TYPE_THIN;
            a5.m mVar = new a5.m(24, false);
            ?? obj2 = new Object();
            obj2.f1413a = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            obj2.f1414b = s7Var;
            obj2.f1415c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            obj2.d = bool;
            obj2.f1416e = bool;
            mVar.f98b = new l7(obj2);
            int i10 = aVar.f4469e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.f4466a;
                l.h(bitmap);
                i9 = bitmap.getAllocationByteCount();
            } else if (i10 != 17 && i10 != 842094169) {
                if (i10 != 35) {
                    i9 = 0;
                } else {
                    l.h(null);
                    throw null;
                }
            } else {
                l.h(null);
                throw null;
            }
            g5.b bVar = new g5.b(5);
            if (i10 != -1) {
                if (i10 != 35) {
                    if (i10 != 842094169) {
                        if (i10 != 16) {
                            if (i10 != 17) {
                                i7Var = i7.UNKNOWN_FORMAT;
                            } else {
                                i7Var = i7.NV21;
                            }
                        } else {
                            i7Var = i7.NV16;
                        }
                    } else {
                        i7Var = i7.YV12;
                    }
                } else {
                    i7Var = i7.YUV_420_888;
                }
            } else {
                i7Var = i7.BITMAP;
            }
            bVar.f7111b = i7Var;
            bVar.f7112c = Integer.valueOf(i9 & Integer.MAX_VALUE);
            mVar.d = new j7(bVar);
            mVar.f99c = this.f10396e;
            obj.f4163e = new k8(mVar);
            z10 = false;
            m.f49706a.execute(new af.f(kaVar, new a6.a((com.google.firebase.messaging.m) obj, 0), t7Var, kaVar.b(), false, 5));
        }
        a5.m mVar2 = new a5.m(23, z10);
        mVar2.d = this.f10396e;
        mVar2.f98b = s7Var;
        mVar2.f99c = Boolean.valueOf(this.d);
        m.f49706a.execute(new ia(this.f10398g, new w0(mVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        d9 d9Var = this.h;
        int i11 = s7Var.f10115a;
        long j11 = currentTimeMillis - elapsedRealtime;
        synchronized (d9Var) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (d9Var.f5644b.get() != -1 && elapsedRealtime3 - d9Var.f5644b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            d9Var.f5643a.f(new o(0, Arrays.asList(new j(24305, i11, 0, j11, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.d(d9Var, elapsedRealtime3, 3));
        }
    }
}
