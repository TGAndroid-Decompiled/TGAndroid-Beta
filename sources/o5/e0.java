package o5;

import android.content.Context;
import android.os.Handler;
import c2.v0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
public final class e0 extends com.google.android.gms.common.api.j implements f0 {
    public static final s5.b G = new s5.b("CastClient", null);
    public static final com.google.android.gms.common.api.e H = new com.google.android.gms.common.api.e("Cast.API_CXLESS", new b6.b(10), s5.j.f47589a);
    public final CastDevice A;
    public final HashMap B;
    public final HashMap C;
    public final p5.d0 D;
    public final List E;
    public int F;
    public final d0 f19252k;
    public v0 f19253l;
    public boolean f19254m;
    public boolean f19255n;
    public TaskCompletionSource f19256o;
    public TaskCompletionSource f19257p;
    public final AtomicLong f19258q;
    public final Object f19259r;
    public final Object f19260s;
    public d f19261t;
    public String f19262u;
    public double v;
    public boolean f19263w;
    public int f19264x;
    public int f19265y;
    public x f19266z;

    public e0(Context context, e eVar) {
        super(context, H, eVar, com.google.android.gms.common.api.i.f3767c);
        this.f19252k = new d0(this);
        this.f19259r = new Object();
        this.f19260s = new Object();
        this.E = DesugarCollections.synchronizedList(new ArrayList());
        this.D = eVar.f19250b;
        this.A = eVar.f19249a;
        this.B = new HashMap();
        this.C = new HashMap();
        this.f19258q = new AtomicLong(0L);
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
                taskCompletionSource.setException(z5.l.m(new Status(i10, null, null, null)));
            }
        }
    }

    public static void g(e0 e0Var, int i10) {
        synchronized (e0Var.f19260s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f19257p;
                if (taskCompletionSource == null) {
                    return;
                }
                if (i10 == 0) {
                    taskCompletionSource.setResult(new Status(0, null, null, null));
                } else {
                    taskCompletionSource.setException(z5.l.m(new Status(i10, null, null, null)));
                }
                e0Var.f19257p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Handler k(e0 e0Var) {
        if (e0Var.f19253l == null) {
            e0Var.f19253l = new v0(e0Var.f3960f, 1);
        }
        return e0Var.f19253l;
    }

    public final void h() {
        G.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.C) {
            this.C.clear();
        }
    }

    public final void i(int i10) {
        synchronized (this.f19259r) {
            try {
                TaskCompletionSource taskCompletionSource = this.f19256o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setException(z5.l.m(new Status(i10, null, null, null)));
                }
                this.f19256o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        CastDevice castDevice = this.A;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.f3707e);
        }
    }
}
