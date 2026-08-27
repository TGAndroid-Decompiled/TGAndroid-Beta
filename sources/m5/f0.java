package m5;

import android.content.Context;
import android.os.Handler;
import c2.t0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public final class f0 extends com.google.android.gms.common.api.j implements g0 {
    public static final r5.b G = new r5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a6.b(10), r5.j.f46777a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final n5.e0 D;
    public final List E;
    public int F;

    public final e0 f17770k;

    public t0 f17771l;

    public boolean f17772m;

    public boolean f17773n;

    public TaskCompletionSource f17774o;

    public TaskCompletionSource f17775p;

    public final AtomicLong f17776q;

    public final Object f17777r;

    public final Object f17778s;

    public d f17779t;

    public String f17780u;
    public double v;

    public boolean f17781w;

    public int f17782x;

    public int f17783y;

    public y f17784z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f3198c);
        this.f17770k = new e0(this);
        this.f17777r = new Object();
        this.f17778s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f17767b;
        this.A = eVar.f17766a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f17776q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(f0 f0Var, long j10, int i10) {
        TaskCompletionSource taskCompletionSource;
        synchronized (f0Var.B) {
            HashMap map = f0Var.B;
            Long lValueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) map.get(lValueOf);
            f0Var.B.remove(lValueOf);
        }
        if (taskCompletionSource != null) {
            if (i10 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(y5.l.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(f0 f0Var, int i10) {
        synchronized (f0Var.f17778s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f17775p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(y5.l.m(new Status(i10, null, null, null)));
                }
                f0Var.f17775p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.f17771l == null) {
            f0Var.f17771l = new t0(f0Var.f3391f, 1);
        }
        return f0Var.f17771l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f17777r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f17774o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(y5.l.m(new Status(i10, null, null, null)));
                }
                this.f17774o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (castDevice.c(2048) || !castDevice.c(4) || castDevice.c(1)) {
            return;
        }
        "Chromecast Audio".equals(castDevice.f3130e);
    }
}
