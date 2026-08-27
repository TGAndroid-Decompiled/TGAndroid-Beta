package ib;

import a5.n;
import af.h;
import android.graphics.Bitmap;
import android.os.SystemClock;
import com.google.firebase.messaging.m;
import g7.b8;
import g7.c9;
import i7.i7;
import i7.ia;
import i7.j7;
import i7.k8;
import i7.ka;
import i7.l7;
import i7.l8;
import i7.m8;
import i7.q;
import i7.r7;
import i7.s;
import i7.s7;
import i7.t7;
import i7.w;
import i7.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import y5.j;
import y5.l;
import y5.o;

public final class f extends za.e {
    public boolean d = true;

    public final m8 f11105e;

    public final b f11106f;

    public final ka f11107g;
    public final c9 h;

    public f(hb.b bVar, b bVar2, ka kaVar) {
        l.i(bVar, "ImageLabelerOptions can not be null");
        this.f11106f = bVar2;
        this.f11107g = kaVar;
        ga.c cVar = new ga.c(17, false);
        cVar.f6834b = Float.valueOf(bVar.f6838a);
        this.f11105e = new m8(cVar);
        this.h = new c9(za.g.c().b(), 1);
    }

    @Override
    public final synchronized void b() {
        this.f11106f.zzb();
        ka kaVar = this.f11107g;
        m mVar = new m();
        mVar.f4604c = r7.TYPE_THIN;
        g5.b bVar = new g5.b(9);
        bVar.f6389b = this.f11105e;
        q qVar = s.f10800b;
        Object[] objArr = {s7.NO_ERROR};
        b8.a(1, objArr);
        bVar.f6390c = new w(1, objArr);
        mVar.d = new l8(bVar);
        za.m.f50301a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7.ON_DEVICE_IMAGE_LABEL_LOAD, kaVar.b(), false, 5));
    }

    @Override
    public final synchronized void c() {
        this.f11106f.zzc();
        this.d = true;
        ka kaVar = this.f11107g;
        m mVar = new m();
        mVar.f4604c = r7.TYPE_THIN;
        za.m.f50301a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7.ON_DEVICE_IMAGE_LABEL_CLOSE, kaVar.b(), false, 5));
    }

    @Override
    public final Object e(eb.a aVar) {
        ArrayList arrayListA;
        synchronized (this) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                arrayListA = this.f11106f.a(aVar);
                f(s7.NO_ERROR, aVar, jElapsedRealtime);
                this.d = false;
            } catch (va.a e9) {
                f(e9.f48826a == 14 ? s7.MODEL_NOT_DOWNLOADED : s7.UNKNOWN_ERROR, aVar, jElapsedRealtime);
                throw e9;
            }
        }
        return arrayListA;
    }

    public final void f(s7 s7Var, eb.a aVar, long j10) {
        int allocationByteCount;
        i7 i7Var;
        boolean z10;
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
        ka kaVar = this.f11107g;
        t7 t7Var = t7.ON_DEVICE_IMAGE_LABEL_DETECT;
        kaVar.getClass();
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        boolean z11 = false;
        if (kaVar.c(t7Var, jElapsedRealtime2)) {
            kaVar.f10714i.put(t7Var, Long.valueOf(jElapsedRealtime2));
            m mVar = new m();
            mVar.f4604c = r7.TYPE_THIN;
            n nVar = new n(24, z11);
            h hVar = new h();
            hVar.f274a = Long.valueOf(Long.MAX_VALUE & jElapsedRealtime);
            hVar.f275b = s7Var;
            hVar.f276c = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            hVar.d = bool;
            hVar.f277e = bool;
            nVar.f100b = new l7(hVar);
            int i10 = aVar.f5366e;
            if (i10 == -1) {
                Bitmap bitmap = aVar.f5363a;
                l.h(bitmap);
                allocationByteCount = bitmap.getAllocationByteCount();
            } else {
                if (i10 == 17 || i10 == 842094169) {
                    l.h(null);
                    throw null;
                }
                if (i10 == 35) {
                    l.h(null);
                    throw null;
                }
                allocationByteCount = 0;
            }
            g5.b bVar = new g5.b(8);
            if (i10 == -1) {
                i7Var = i7.BITMAP;
            } else if (i10 == 35) {
                i7Var = i7.YUV_420_888;
            } else if (i10 == 842094169) {
                i7Var = i7.YV12;
            } else if (i10 != 16) {
                i7Var = i10 != 17 ? i7.UNKNOWN_FORMAT : i7.NV21;
            } else {
                i7Var = i7.NV16;
            }
            bVar.f6389b = i7Var;
            bVar.f6390c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
            nVar.d = new j7(bVar);
            nVar.f101c = this.f11105e;
            mVar.f4605e = new k8(nVar);
            z10 = false;
            za.m.f50301a.execute(new bf.e(kaVar, new b6.a(mVar, 0), t7Var, kaVar.b(), false, 5));
        } else {
            z10 = false;
        }
        n nVar2 = new n(23, z10);
        nVar2.d = this.f11105e;
        nVar2.f100b = s7Var;
        nVar2.f101c = Boolean.valueOf(this.d);
        za.m.f50301a.execute(new ia(this.f11107g, new w0(nVar2), jElapsedRealtime));
        long jCurrentTimeMillis = System.currentTimeMillis();
        c9 c9Var = this.h;
        int i11 = s7Var.f10824a;
        long j11 = jCurrentTimeMillis - jElapsedRealtime;
        synchronized (c9Var) {
            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
            if (c9Var.f6435b.get() != -1 && jElapsedRealtime3 - c9Var.f6435b.get() <= TimeUnit.MINUTES.toMillis(30L)) {
                return;
            }
            c9Var.f6434a.f(new o(0, Arrays.asList(new j(24305, i11, 0, j11, jCurrentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new f2.c(c9Var, jElapsedRealtime3, 3));
        }
    }
}
