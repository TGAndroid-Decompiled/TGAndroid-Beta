package defpackage;

import android.os.SystemClock;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
public final class iz5 implements gz5 {
    public final j2f a;
    public final q2f b;
    public final Executor c;
    public final AtomicReference d;
    public final CancellationTokenSource e = new CancellationTokenSource();
    public final mle f;

    public iz5(tae taeVar, j2f j2fVar, Executor executor) {
        this.a = j2fVar;
        this.c = executor;
        this.d = new AtomicReference(taeVar);
        taeVar.getClass();
        this.f = mle.TYPE_THICK;
        this.b = new q2f(jg7.c().b(), (byte) 0);
    }

    public static final dle e() {
        ?? obj = new Object();
        obj.a = Float.valueOf(-1.0f);
        return new dle(obj);
    }

    @Override
    public final a94[] a() {
        return this.f == mle.TYPE_THICK ? zt7.a : new a94[]{zt7.b};
    }

    public final Task c(final String str) {
        boolean z;
        xve.i(str, "Text can not be null");
        final tae taeVar = (tae) this.d.get();
        if (taeVar != null) {
            z = true;
        } else {
            z = false;
        }
        xve.j("LanguageIdentification has been closed", z);
        final boolean z2 = !taeVar.c.get();
        return taeVar.a(this.c, new Callable() {
            @Override
            public final Object call() {
                iz5 iz5Var = iz5.this;
                tae taeVar2 = taeVar;
                String str2 = str;
                boolean z3 = z2;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                try {
                    String e = taeVar2.e(str2.substring(0, Math.min(str2.length(), 200)));
                    ?? obj = new Object();
                    ?? obj2 = new Object();
                    obj2.a = e;
                    obj.a = new vqe(obj2);
                    iz5Var.d(elapsedRealtime, z3, new yre(obj), sle.NO_ERROR);
                    return e;
                } catch (RuntimeException e2) {
                    iz5Var.d(elapsedRealtime, z3, null, sle.UNKNOWN_ERROR);
                    throw e2;
                }
            }
        }, this.e.getToken());
    }

    @Override
    @es7(y26.ON_DESTROY)
    public void close() {
        String a;
        tae taeVar = (tae) this.d.getAndSet(null);
        if (taeVar == null) {
            return;
        }
        this.e.cancel();
        taeVar.d(this.c);
        ?? obj = new Object();
        obj.c = this.f;
        htd htdVar = new htd((byte) 6);
        htdVar.c = e();
        obj.d = new yse(htdVar);
        rx rxVar = new rx((u8a) obj, 1);
        j2f j2fVar = this.a;
        Task task = j2fVar.e;
        if (task.isSuccessful()) {
            a = (String) task.getResult();
        } else {
            a = v26.c.a(j2fVar.g);
        }
        xnb.c(1, new dd1(j2fVar, rxVar, ame.ON_DEVICE_LANGUAGE_IDENTIFICATION_CLOSE, a, (byte) 2));
    }

    public final void d(long j, boolean z, yre yreVar, sle sleVar) {
        String a;
        int i;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        j2f j2fVar = this.a;
        ame ameVar = ame.ON_DEVICE_LANGUAGE_IDENTIFICATION_DETECT;
        j2fVar.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        HashMap hashMap = j2fVar.i;
        if (hashMap.get(ameVar) == null || elapsedRealtime2 - ((Long) hashMap.get(ameVar)).longValue() > 30000) {
            hashMap.put(ameVar, Long.valueOf(elapsedRealtime2));
            htd htdVar = new htd((byte) 6);
            htdVar.c = e();
            htd htdVar2 = new htd((byte) 5);
            htdVar2.b = Long.valueOf(Long.MAX_VALUE & elapsedRealtime);
            htdVar2.d = Boolean.valueOf(z);
            htdVar2.c = sleVar;
            htdVar.b = new ake(htdVar2);
            if (yreVar != null) {
                htdVar.d = yreVar;
            }
            ?? obj = new Object();
            obj.c = this.f;
            obj.d = new yse(htdVar);
            rx rxVar = new rx((u8a) obj, 0);
            Task task = j2fVar.e;
            if (task.isSuccessful()) {
                a = (String) task.getResult();
            } else {
                a = v26.c.a(j2fVar.g);
            }
            xnb.c(1, new dd1(j2fVar, rxVar, ameVar, a, (byte) 2));
        }
        long currentTimeMillis = System.currentTimeMillis();
        q2f q2fVar = this.b;
        if (this.f == mle.TYPE_THICK) {
            i = 24603;
        } else {
            i = 24602;
        }
        int i2 = i;
        short s = sleVar.a;
        long j2 = currentTimeMillis - elapsedRealtime;
        synchronized (q2fVar) {
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (q2fVar.b.get() != -1 && elapsedRealtime3 - q2fVar.b.get() <= 1800000) {
                return;
            }
            q2fVar.a.i(new ikb(0, Arrays.asList(new bg7(i2, s, 0, j2, currentTimeMillis, null, null, 0, -1)))).addOnFailureListener(new zg2(q2fVar, elapsedRealtime3, (byte) 10));
        }
    }
}
