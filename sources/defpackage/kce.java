package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
public final class kce extends mg6 {
    public boolean d = true;
    public final kxe e;
    public final nbd f;
    public final z3f g;
    public final zxe h;

    public kce(ik5 ik5Var, nbd nbdVar, z3f z3fVar) {
        fre.i(ik5Var, "ImageLabelerOptions can not be null");
        this.f = nbdVar;
        this.g = z3fVar;
        g6e g6eVar = new g6e();
        g6eVar.b = Float.valueOf(ik5Var.a);
        this.e = new kxe(g6eVar);
        this.h = new zxe(ae7.c().b(), (byte) 1);
    }

    @Override
    public final synchronized void b() {
        this.f.zzb();
        z3f z3fVar = this.g;
        ?? obj = new Object();
        obj.c = tse.TYPE_THIN;
        aec aecVar = new aec((byte) 17, false);
        aecVar.b = this.e;
        ccd ccdVar = ncd.f;
        Object[] objArr = {yse.NO_ERROR};
        p0f.a(1, objArr);
        aecVar.c = new hfd(1, objArr);
        obj.d = new bxe(aecVar);
        yjb.c(1, new vc1(z3fVar, new qx((ep) obj, 0), ete.ON_DEVICE_IMAGE_LABEL_LOAD, z3fVar.b(), (byte) 3));
    }

    @Override
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        z3f z3fVar = this.g;
        ?? obj = new Object();
        obj.c = tse.TYPE_THIN;
        yjb.c(1, new vc1(z3fVar, new qx((ep) obj, 0), ete.ON_DEVICE_IMAGE_LABEL_CLOSE, z3fVar.b(), (byte) 3));
    }

    @Override
    public final Object e(go5 go5Var) {
        yse yseVar;
        ArrayList d;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                d = this.f.d(go5Var);
                f(yse.NO_ERROR, go5Var, elapsedRealtime);
                this.d = false;
            } catch (be7 e) {
                if (e.a == 14) {
                    yseVar = yse.MODEL_NOT_DOWNLOADED;
                } else {
                    yseVar = yse.UNKNOWN_ERROR;
                }
                f(yseVar, go5Var, elapsedRealtime);
                throw e;
            }
        }
        return d;
    }

    public final void f(yse yseVar, go5 go5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        z3f z3fVar = this.g;
        ete eteVar = ete.ON_DEVICE_IMAGE_LABEL_DETECT;
        z3fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (z3fVar.c(eteVar, elapsedRealtime2)) {
            z3fVar.i.put(eteVar, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.c = tse.TYPE_THIN;
            rod rodVar = new rod((byte) 8);
            gl2 gl2Var = new gl2((byte) 22, false);
            gl2Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            gl2Var.c = yseVar;
            gl2Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            gl2Var.e = bool;
            gl2Var.f = bool;
            rodVar.b = new lre(gl2Var);
            Bitmap bitmap = go5Var.a;
            fre.h(bitmap);
            int allocationByteCount = bitmap.getAllocationByteCount();
            v8b v8bVar = new v8b((byte) 17, false);
            v8bVar.b = jqe.BITMAP;
            v8bVar.c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
            rodVar.d = new tqe(v8bVar);
            rodVar.c = this.e;
            obj.e = new qwe(rodVar);
            yjb.c(1, new vc1(z3fVar, new qx((ep) obj, 0), eteVar, z3fVar.b(), (byte) 3));
        }
        rod rodVar2 = new rod((byte) 1);
        rodVar2.d = this.e;
        rodVar2.b = yseVar;
        rodVar2.c = Boolean.valueOf(this.d);
        yjb.c(1, new t3f(this.g, new cpd(rodVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        zxe zxeVar = this.h;
        short s = yseVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (zxeVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (zxeVar.b.get() != -1 && elapsedRealtime3 - zxeVar.b.get() <= 1800000) {
                return;
            }
            zxeVar.a.i(new mgb(0, Arrays.asList(new sd7(24305, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new hg2(zxeVar, elapsedRealtime3, (byte) 10));
        }
    }
}
