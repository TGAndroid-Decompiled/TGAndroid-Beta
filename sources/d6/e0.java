package d6;

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
    public static final h6.b G = new h6.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new b8.d(1), h6.j.f12628a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final e6.d0 D;
    public final List E;
    public int F;
    public final d0 f8064k;
    public com.google.android.gms.internal.cast.y f8065l;
    public boolean f8066m;
    public boolean f8067n;
    public TaskCompletionSource f8068o;
    public TaskCompletionSource f8069p;
    public final AtomicLong f8070q;
    public final Object f8071r;
    public final Object f8072s;
    public d f8073t;
    public String f8074u;
    public double v;
    public boolean f8075w;
    public int f8076x;
    public int f8077y;
    public x f8078z;

    public e0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f6478c);
        this.f8064k = new d0(this);
        this.f8071r = new Object();
        this.f8072s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f8062b;
        this.A = eVar.f8061a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f8070q = new AtomicLong(0L);
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
                taskCompletionSource.setException(o6.l.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i10) {
        synchronized (e0Var.f8072s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f8069p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(o6.l.m(new Status(i10, null, null, null)));
                }
                e0Var.f8069p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f8065l == null) {
            e0Var.f8065l = new com.google.android.gms.internal.cast.y(e0Var.f6655f, 0);
        }
        return e0Var.f8065l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f8071r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f8068o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(o6.l.m(new Status(i10, null, null, null)));
                }
                this.f8068o = null;
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
