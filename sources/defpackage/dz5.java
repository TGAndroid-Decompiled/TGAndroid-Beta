package defpackage;

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class dz5 implements bz5 {
    public final uze a;
    public final b0f b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final wie f;

    public dz5(g8e g8eVar, uze uzeVar, Executor executor) {
        this.a = uzeVar;
        this.c = executor;
        this.d = new AtomicReference(g8eVar);
        g8eVar.getClass();
        this.f = wie.TYPE_THICK;
        this.b = new b0f(cg7.c().b(), (byte) 0);
    }

    public static final nie e() {
        ?? obj = new Object();
        obj.a = Float.valueOf(-1.0f);
        return new nie(obj);
    }

    @Override
    public final o94[] a() {
        return this.f == wie.TYPE_THICK ? ws7.a : new o94[]{ws7.b};
    }

    public final Task c(final String str) {
        boolean z;
        ite.i(str, "Text can not be null");
        final g8e g8eVar = (g8e) this.d.get();
        if (g8eVar != null) {
            z = true;
        } else {
            z = false;
        }
        ite.j("LanguageIdentification has been closed", z);
        final boolean z2 = !g8eVar.c.get();
        return g8eVar.a(this.c, new Callable() {
            @Override
            public final Object call() {
                dz5 dz5Var = dz5.this;
                g8e g8eVar2 = g8eVar;
                String str2 = str;
                boolean z3 = z2;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = g8eVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.a = e;
                    obj.a = new goe(obj2);
                    dz5Var.d(elapsedRealtime, z3, new kpe(obj), cje.NO_ERROR);
                    return e;
                } catch (RuntimeException e2) {
                    dz5Var.d(elapsedRealtime, z3, null, cje.UNKNOWN_ERROR);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override
    @hr7(u26.ON_DESTROY)
    public void close() {
        String a;
        g8e g8eVar = (g8e) this.d.getAndSet(null);
        if (g8eVar == null) {
            return;
        }
        this.e.cancel();
        g8eVar.d(this.c);
        ?? obj = new Object();
        obj.c = this.f;
        uqd uqdVar = new uqd((byte) 6);
        uqdVar.c = e();
        obj.d = new jqe(uqdVar);
        ry ryVar = new ry((e7a) obj, 1);
        uze uzeVar = this.a;
        Task task = uzeVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = r26.c.a(uzeVar.g);
        }
        mlb.c(1, new de1(uzeVar, ryVar, kje.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE, a, (byte) 2));
    }

    public final void d(long j, boolean z, kpe kpeVar, cje cjeVar) {
        String a;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        uze uzeVar = this.a;
        kje kjeVar = kje.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
        uzeVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = uzeVar.i;
        if (hashMap.get(kjeVar) == null || elapsedRealtime2 - ((Long) hashMap.get(kjeVar)).longValue() > 30000) {
            hashMap.put(kjeVar, Long.valueOf(elapsedRealtime2));
            uqd uqdVar = new uqd((byte) 6);
            uqdVar.c = e();
            uqd uqdVar2 = new uqd((byte) 5);
            uqdVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            uqdVar2.d = Boolean.valueOf(z);
            uqdVar2.c = cjeVar;
            uqdVar.b = new khe(uqdVar2);
            if (kpeVar != null) {
                uqdVar.d = kpeVar;
            }
            ?? obj = new Object();
            obj.c = this.f;
            obj.d = new jqe(uqdVar);
            ry ryVar = new ry((e7a) obj, 0);
            Task task = uzeVar.e;
            if (task.isSuccessful()) {
                a = (String) task.getResult();
            } else {
                a = r26.c.a(uzeVar.g);
            }
            mlb.c(1, new de1(uzeVar, ryVar, kjeVar, a, (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        b0f b0fVar = this.b;
        if (this.f == wie.TYPE_THICK) {
            i = 24603;
        } else {
            i = 24602;
        }
        int i2 = i;
        short s = cjeVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (b0fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (b0fVar.b.get() != -1 && elapsedRealtime3 - b0fVar.b.get() <= 1800000) {
                return;
            }
            b0fVar.a.i(new nib(0, Arrays.asList(new uf7(i2, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new vh2(b0fVar, elapsedRealtime3, (byte) 10));
        }
    }
}
