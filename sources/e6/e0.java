package e6;

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
    public static final i6.b H = new i6.b("CastClient", null);
    public static final com.google.android.gms.common.api.e I = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a6.b(2), i6.j.f14629a);
    public x A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final f6.e0 E;
    public final List F;
    public int G;
    public final d0 f9693l;
    public com.google.android.gms.internal.cast.z f9694m;
    public boolean f9695n;
    public boolean f9696o;
    public TaskCompletionSource f9697p;
    public TaskCompletionSource f9698q;
    public final AtomicLong f9699r;
    public final Object f9700s;
    public final Object f9701t;
    public d f9702u;
    public String v;
    public double f9703w;
    public boolean f9704x;
    public int f9705y;
    public int f9706z;

    public e0(Context context, e eVar) {
        super(context, I, eVar, com.google.android.gms.common.api.i.f6594c);
        this.f9693l = new d0(this);
        this.f9700s = new Object();
        this.f9701t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = eVar.f9691b;
        this.B = eVar.f9690a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.f9699r = new AtomicLong(0L);
        this.G = 1;
        j();
    }

    public static void f(e0 e0Var, long j10, int i3) {
        TaskCompletionSource taskCompletionSource;
        synchronized (e0Var.C) {
            HashMap hashMap = e0Var.C;
            Long valueOf = Long.valueOf(j10);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            e0Var.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i3 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i3) {
        synchronized (e0Var.f9701t) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f9698q;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i3 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
                }
                e0Var.f9698q = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f9694m == null) {
            e0Var.f9694m = new com.google.android.gms.internal.cast.z(e0Var.f6777g, 0);
        }
        return e0Var.f9694m;
    }

    public final void h() {
        H.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public final void i(int i3) {
        synchronized (this.f9700s) {
            try {
                TaskCompletionSource taskCompletionSource = this.f9697p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(p6.m.l(new Status(i3, null, null, null)));
                }
                this.f9697p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.B;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.f6533e);
        }
    }
}
