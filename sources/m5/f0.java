package m5;

import android.content.Context;
import android.os.Handler;
import c2.u0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public final class f0 extends com.google.android.gms.common.api.j implements g0 {
    public static final q5.b G = new q5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new b7.d(8), q5.j.f46018a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final n5.f0 D;
    public final List E;
    public int F;
    public final e0 f17393k;
    public u0 f17394l;
    public boolean f17395m;
    public boolean f17396n;
    public TaskCompletionSource f17397o;
    public TaskCompletionSource f17398p;
    public final AtomicLong f17399q;
    public final Object f17400r;
    public final Object f17401s;
    public d f17402t;
    public String f17403u;
    public double v;
    public boolean f17404w;
    public int f17405x;
    public int f17406y;
    public x f17407z;

    public f0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f2753c);
        this.f17393k = new e0(this);
        this.f17400r = new Object();
        this.f17401s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f17390b;
        this.A = eVar.f17389a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f17399q = new AtomicLong(0L);
        this.F = 1;
        j();
    }

    public static void f(f0 f0Var, long j10, int i9) {
        TaskCompletionSource taskCompletionSource;
        synchronized (f0Var.B) {
            HashMap hashMap = f0Var.B;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            f0Var.B.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i9 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
            }
        }
    }

    public static void g(f0 f0Var, int i9) {
        synchronized (f0Var.f17401s) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f17398p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i9 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
                }
                f0Var.f17398p = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Handler k(f0 f0Var) {
        if (f0Var.f17394l == null) {
            f0Var.f17394l = new u0(f0Var.f2946f, 1);
        }
        return f0Var.f17394l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i9) {
        synchronized (this.f17400r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f17397o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(x5.l.m(new Status(i9, null, null, null)));
                }
                this.f17397o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.f2693e);
        }
    }
}
