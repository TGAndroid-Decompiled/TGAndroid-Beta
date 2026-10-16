package c6;

import android.content.Context;
import android.os.Handler;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public final class e0 extends com.google.android.gms.common.api.j implements f0 {
    public static final g6.b G = new g6.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.d(1), g6.j.f9945a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final d6.d0 D;
    public final List E;
    public int F;
    public final d0 f4468k;
    public com.google.android.gms.internal.cast.a0 f4469l;
    public boolean f4470m;
    public boolean f4471n;
    public TaskCompletionSource f4472o;
    public TaskCompletionSource f4473p;
    public final AtomicLong f4474q;
    public final Object f4475r;
    public final Object f4476s;
    public d f4477t;
    public String f4478u;
    public double v;
    public boolean f4479w;
    public int f4480x;
    public int f4481y;
    public x f4482z;

    public e0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f4900c);
        this.f4468k = new d0(this);
        this.f4475r = new Object();
        this.f4476s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f4466b;
        this.A = eVar.f4465a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f4474q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(e0 e0Var, long j10, int i10) {
        TaskCompletionSource taskCompletionSource;
        synchronized (e0Var.B) {
            HashMap hashMap = e0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            e0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i10 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(n6.l.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i10) {
        synchronized (e0Var.f4476s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f4473p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(n6.l.m(new Status(i10, null, null, null)));
                }
                e0Var.f4473p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f4469l == null) {
            e0Var.f4469l = new com.google.android.gms.internal.cast.a0(e0Var.f5078f, 0);
        }
        return e0Var.f4469l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f4475r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f4472o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(i10, null, null, null)));
                }
                this.f4472o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }
}
