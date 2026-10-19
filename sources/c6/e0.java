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
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a8.d(1), g6.j.f10850a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final d6.d0 D;
    public final List E;
    public int F;
    public final d0 f4836k;
    public com.google.android.gms.internal.cast.a0 f4837l;
    public boolean f4838m;
    public boolean f4839n;
    public TaskCompletionSource f4840o;
    public TaskCompletionSource f4841p;
    public final AtomicLong f4842q;
    public final Object f4843r;
    public final Object f4844s;
    public d f4845t;
    public String f4846u;
    public double v;
    public boolean f4847w;
    public int f4848x;
    public int f4849y;
    public x f4850z;

    public e0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f6356c);
        this.f4836k = new d0(this);
        this.f4843r = new Object();
        this.f4844s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f4834b;
        this.A = eVar.f4833a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f4842q = new AtomicLong(0L);
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
        synchronized (e0Var.f4844s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f4841p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(n6.l.m(new Status(i10, null, null, null)));
                }
                e0Var.f4841p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f4837l == null) {
            e0Var.f4837l = new com.google.android.gms.internal.cast.a0(e0Var.f6530f, 0);
        }
        return e0Var.f4837l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f4843r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f4840o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(i10, null, null, null)));
                }
                this.f4840o = null;
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
