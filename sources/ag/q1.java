package ag;

import android.util.Log;
import l7.hb;
import l7.wf;
public final class q1 implements Runnable {
    public final int f633a;
    public final Object f634b;

    public q1(com.google.android.gms.common.api.internal.m1 m1Var, p2.u uVar) {
        this.f633a = 18;
        this.f634b = uVar;
    }

    private final void a() {
        Object obj;
        synchronized (((androidx.lifecycle.z) this.f634b).f1649a) {
            obj = ((androidx.lifecycle.z) this.f634b).f1653f;
            ((androidx.lifecycle.z) this.f634b).f1653f = androidx.lifecycle.z.f1648k;
        }
        ((androidx.lifecycle.z) this.f634b).j(obj);
    }

    private final void b() {
        b8.a aVar = (b8.a) this.f634b;
        synchronized (aVar.f1978a) {
            try {
                if (!aVar.b()) {
                    return;
                }
                Log.e("WakeLock", String.valueOf(aVar.f1985j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                aVar.d();
                if (!aVar.b()) {
                    return;
                }
                aVar.f1980c = 1;
                aVar.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.q1.run():void");
    }

    public q1(Object obj, int i10) {
        this.f633a = i10;
        this.f634b = obj;
    }

    public q1(wf wfVar) {
        this.f633a = 28;
        hb hbVar = hb.UNKNOWN_EVENT;
        this.f634b = wfVar;
    }
}
