package f6;

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
    public static final j6.b H = new j6.b("CastClient", null);
    public static final com.google.android.gms.common.api.e I = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new a9.e(4), j6.j.f16868a);
    public x A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final g6.d0 E;
    public final List F;
    public int G;
    public final d0 f11064l;
    public com.google.android.gms.internal.cast.y f11065m;
    public boolean f11066n;
    public boolean f11067o;
    public TaskCompletionSource f11068p;
    public TaskCompletionSource f11069q;
    public final AtomicLong f11070r;
    public final Object f11071s;
    public final Object f11072t;
    public d f11073u;
    public String v;
    public double f11074w;
    public boolean f11075x;
    public int f11076y;
    public int f11077z;

    public e0(Context context, e eVar) {
        super(context, I, eVar, com.google.android.gms.common.api.i.f5924c);
        this.f11064l = new d0(this);
        this.f11071s = new Object();
        this.f11072t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = eVar.f11062b;
        this.B = eVar.f11061a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.f11070r = new AtomicLong(0L);
        this.G = 1;
        j();
    }

    public static void f(e0 e0Var, long j3, int i7) {
        TaskCompletionSource taskCompletionSource;
        synchronized (e0Var.C) {
            HashMap hashMap = e0Var.C;
            Long valueOf = Long.valueOf(j3);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            e0Var.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i7 == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(q6.m.l(new Status(i7, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i7) {
        synchronized (e0Var.f11072t) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f11069q;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i7 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(q6.m.l(new Status(i7, null, null, null)));
                }
                e0Var.f11069q = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f11065m == null) {
            e0Var.f11065m = new com.google.android.gms.internal.cast.y(e0Var.f6107g, 0);
        }
        return e0Var.f11065m;
    }

    public final void h() {
        H.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public final void i(int i7) {
        synchronized (this.f11071s) {
            try {
                TaskCompletionSource taskCompletionSource = this.f11068p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(q6.m.l(new Status(i7, null, null, null)));
                }
                this.f11068p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.B;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.f5863e);
        }
    }
}
