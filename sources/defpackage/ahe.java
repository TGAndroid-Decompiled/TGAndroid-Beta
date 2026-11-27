package defpackage;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Arrays;
public final class ahe extends qi6 {
    public boolean d = true;
    public final b2f e;
    public final ggd f;
    public final q8f g;
    public final q2f h;

    public ahe(lm5 lm5Var, ggd ggdVar, q8f q8fVar) {
        xve.i(lm5Var, "ImageLabelerOptions can not be null");
        this.f = ggdVar;
        this.g = q8fVar;
        g9d g9dVar = new g9d();
        g9dVar.b = Float.valueOf(lm5Var.a);
        this.e = new b2f(g9dVar);
        this.h = new q2f(kg7.c().b(), (byte) 1);
    }

    @Override
    public final synchronized void b() {
        this.f.zzb();
        q8f q8fVar = this.g;
        ?? obj = new Object();
        obj.c = kxe.TYPE_THIN;
        zhc zhcVar = new zhc((byte) 17, false);
        zhcVar.b = this.e;
        vgd vgdVar = ghd.f;
        Object[] objArr = {pxe.NO_ERROR};
        i5f.a(1, objArr);
        zhcVar.c = new yjd(1, objArr);
        obj.d = new s1f(zhcVar);
        xnb.c(1, new dd1(q8fVar, new rx((fp) obj, 0), vxe.ON_DEVICE_IMAGE_LABEL_LOAD, q8fVar.b(), (byte) 3));
    }

    @Override
    public final synchronized void c() {
        this.f.zzc();
        this.d = true;
        q8f q8fVar = this.g;
        ?? obj = new Object();
        obj.c = kxe.TYPE_THIN;
        xnb.c(1, new dd1(q8fVar, new rx((fp) obj, 0), vxe.ON_DEVICE_IMAGE_LABEL_CLOSE, q8fVar.b(), (byte) 3));
    }

    @Override
    public final Object e(jq5 jq5Var) {
        pxe pxeVar;
        ArrayList a;
        synchronized (this) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                a = this.f.a(jq5Var);
                f(pxe.NO_ERROR, jq5Var, elapsedRealtime);
                this.d = false;
            } catch (lg7 e) {
                if (e.a == 14) {
                    pxeVar = pxe.MODEL_NOT_DOWNLOADED;
                } else {
                    pxeVar = pxe.UNKNOWN_ERROR;
                }
                f(pxeVar, jq5Var, elapsedRealtime);
                throw e;
            }
        }
        return a;
    }

    public final void f(pxe pxeVar, jq5 jq5Var, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        q8f q8fVar = this.g;
        vxe vxeVar = vxe.ON_DEVICE_IMAGE_LABEL_DETECT;
        q8fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        if (q8fVar.c(vxeVar, elapsedRealtime2)) {
            q8fVar.i.put(vxeVar, Long.valueOf(elapsedRealtime2));
            ?? obj = new Object();
            obj.c = kxe.TYPE_THIN;
            htd htdVar = new htd((byte) 8);
            am2 am2Var = new am2((byte) 22, false);
            am2Var.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            am2Var.c = pxeVar;
            am2Var.d = Boolean.valueOf(this.d);
            Boolean bool = Boolean.TRUE;
            am2Var.e = bool;
            am2Var.f = bool;
            htdVar.b = new cwe(am2Var);
            Bitmap bitmap = jq5Var.a;
            xve.h(bitmap);
            int allocationByteCount = bitmap.getAllocationByteCount();
            k7b k7bVar = new k7b((byte) 18, false);
            k7bVar.b = ave.BITMAP;
            k7bVar.c = Integer.valueOf(allocationByteCount & Integer.MAX_VALUE);
            htdVar.d = new kve(k7bVar);
            htdVar.c = this.e;
            obj.e = new h1f(htdVar);
            xnb.c(1, new dd1(q8fVar, new rx((fp) obj, 0), vxeVar, q8fVar.b(), (byte) 3));
        }
        htd htdVar2 = new htd((byte) 1);
        htdVar2.d = this.e;
        htdVar2.b = pxeVar;
        htdVar2.c = Boolean.valueOf(this.d);
        xnb.c(1, new k8f(this.g, new std(htdVar2), elapsedRealtime));
        long currentTimeMillis = System.currentTimeMillis();
        q2f q2fVar = this.h;
        short s = pxeVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (q2fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (q2fVar.b.get() != -1 && elapsedRealtime3 - q2fVar.b.get() <= 1800000) {
                return;
            }
            q2fVar.a.i(new ikb(0, Arrays.asList(new cg7(24305, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg2(q2fVar, elapsedRealtime3, (byte) 11));
        }
    }
}
