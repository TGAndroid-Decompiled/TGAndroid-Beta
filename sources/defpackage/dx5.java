package defpackage;

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class dx5 implements bx5 {
    public final sxe a;
    public final zxe b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final vge f;

    public dx5(d6e d6eVar, sxe sxeVar, Executor executor) {
        this.a = sxeVar;
        this.c = executor;
        this.d = new AtomicReference(d6eVar);
        d6eVar.getClass();
        this.f = vge.TYPE_THICK;
        this.b = new zxe(ae7.c().b(), (byte) 0);
    }

    public static final mge e() {
        ?? obj = new Object();
        obj.a = Float.valueOf(-1.0f);
        return new mge(obj);
    }

    @Override
    public final f84[] a() {
        return this.f == vge.TYPE_THICK ? uq7.a : new f84[]{uq7.b};
    }

    public final Task c(final String str) {
        boolean z;
        fre.i(str, "Text can not be null");
        final d6e d6eVar = (d6e) this.d.get();
        if (d6eVar != null) {
            z = true;
        } else {
            z = false;
        }
        fre.j("LanguageIdentification has been closed", z);
        final boolean z2 = !d6eVar.c.get();
        return d6eVar.a(this.c, new Callable() {
            @Override
            public final Object call() {
                dx5 dx5Var = dx5.this;
                d6e d6eVar2 = d6eVar;
                String str2 = str;
                boolean z3 = z2;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = d6eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.a = e;
                    obj.a = new eme(obj2);
                    dx5Var.d(elapsedRealtime, z3, new hne(obj), bhe.NO_ERROR);
                    return e;
                } catch (RuntimeException e2) {
                    dx5Var.d(elapsedRealtime, z3, null, bhe.UNKNOWN_ERROR);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override
    @ep7(u06.ON_DESTROY)
    public void close() {
        String a;
        d6e d6eVar = (d6e) this.d.getAndSet(null);
        if (d6eVar == null) {
            return;
        }
        this.e.cancel();
        d6eVar.d(this.c);
        ?? obj = new Object();
        obj.c = this.f;
        rod rodVar = new rod((byte) 6);
        rodVar.c = e();
        obj.d = new goe(rodVar);
        qx qxVar = new qx((wtc) obj, 1);
        sxe sxeVar = this.a;
        Task task = sxeVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r06.c.a(sxeVar.g);
        }
        yjb.c(1, new vc1(sxeVar, qxVar, jhe.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE, a, (byte) 2));
    }

    public final void d(long j, boolean z, hne hneVar, bhe bheVar) {
        String a;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        sxe sxeVar = this.a;
        jhe jheVar = jhe.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
        sxeVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = sxeVar.i;
        if (hashMap.get(jheVar) == null || elapsedRealtime2 - ((Long) hashMap.get(jheVar)).longValue() > 30000) {
            hashMap.put(jheVar, Long.valueOf(elapsedRealtime2));
            rod rodVar = new rod((byte) 6);
            rodVar.c = e();
            rod rodVar2 = new rod((byte) 5);
            rodVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            rodVar2.d = Boolean.valueOf(z);
            rodVar2.c = bheVar;
            rodVar.b = new jfe(rodVar2);
            if (hneVar != null) {
                rodVar.d = hneVar;
            }
            ?? obj = new Object();
            obj.c = this.f;
            obj.d = new goe(rodVar);
            qx qxVar = new qx((wtc) obj, 0);
            Task task = sxeVar.e;
            if (task.isSuccessful()) {
                a = (String) task.getResult();
            } else {
                a = r06.c.a(sxeVar.g);
            }
            yjb.c(1, new vc1(sxeVar, qxVar, jheVar, a, (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        zxe zxeVar = this.b;
        if (this.f == vge.TYPE_THICK) {
            i = 24603;
        } else {
            i = 24602;
        }
        int i2 = i;
        short s = bheVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (zxeVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (zxeVar.b.get() != -1 && elapsedRealtime3 - zxeVar.b.get() <= 1800000) {
                return;
            }
            zxeVar.a.i(new mgb(0, Arrays.asList(new sd7(i2, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new hg2(zxeVar, elapsedRealtime3, (byte) 9));
        }
    }
}
