package defpackage;

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
public final class afd extends by4 {
    public static final dc6 H = new dc6("CastClient", null);
    public static final yn I = new yn("Cast.API_CXLESS", new op5((byte) 13), v7d.a);
    public bad A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final uhf E;
    public final List F;
    public byte G;
    public final ted l;
    public o59 m;
    public boolean n;
    public boolean o;
    public TaskCompletionSource p;
    public TaskCompletionSource q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public wr u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public afd(Context context, yc1 yc1Var) {
        super(context, I, yc1Var, ay4.c);
        this.l = new ted(this);
        this.s = new Object();
        this.t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = yc1Var.b;
        this.B = yc1Var.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = (byte) 1;
        j();
    }

    public static void f(afd afdVar, long j, int i) {
        TaskCompletionSource taskCompletionSource;
        synchronized (afdVar.C) {
            HashMap hashMap = afdVar.C;
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            afdVar.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(bmd.a(new Status(i, null, null, null)));
            }
        }
    }

    public static void g(afd afdVar, int i) {
        synchronized (afdVar.t) {
            TaskCompletionSource taskCompletionSource = afdVar.q;
            if (taskCompletionSource == null) {
                return;
            }
            if (i == 0) {
                taskCompletionSource.setResult(new Status(0, null, null, null));
            } else {
                taskCompletionSource.setException(bmd.a(new Status(i, null, null, null)));
            }
            afdVar.q = null;
        }
    }

    public static Handler k(afd afdVar) {
        o59 o59Var = afdVar.m;
        if (o59Var == null) {
            o59 o59Var2 = new o59(afdVar.g, (byte) 3);
            afdVar.m = o59Var2;
            return o59Var2;
        }
        return o59Var;
    }

    public final void h() {
        H.b("removing all MessageReceivedCallbacks", new Object[0]);
        synchronized (this.D) {
            this.D.clear();
        }
    }

    public final void i(int i) {
        synchronized (this.s) {
            TaskCompletionSource taskCompletionSource = this.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setException(bmd.a(new Status(i, null, null, null)));
            }
            this.p = null;
        }
    }

    public final void j() {
        CastDevice castDevice = this.B;
        if (!castDevice.c(2048) && castDevice.c(4) && !castDevice.c(1)) {
            "Chromecast Audio".equals(castDevice.e);
        }
    }
}
