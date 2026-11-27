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
public final class rjd extends h05 {
    public static final he6 H = new he6("CastClient", null);
    public static final zn I = new zn("Cast.API_CXLESS", new rr5((byte) 13), ocd.a);
    public ued A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final kmf E;
    public final List F;
    public byte G;
    public final kjd l;
    public b99 m;
    public boolean n;
    public boolean o;
    public TaskCompletionSource p;
    public TaskCompletionSource q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public xr u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public rjd(Context context, gd1 gd1Var) {
        super(context, I, gd1Var, g05.c);
        this.l = new kjd(this);
        this.s = new Object();
        this.t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = gd1Var.b;
        this.B = gd1Var.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = (byte) 1;
        j();
    }

    public static void f(rjd rjdVar, long j, int i) {
        TaskCompletionSource taskCompletionSource;
        synchronized (rjdVar.C) {
            HashMap hashMap = rjdVar.C;
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            rjdVar.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(sqd.a(new Status(i, null, null, null)));
            }
        }
    }

    public static void g(rjd rjdVar, int i) {
        synchronized (rjdVar.t) {
            TaskCompletionSource taskCompletionSource = rjdVar.q;
            if (taskCompletionSource == null) {
                return;
            }
            if (i == 0) {
                taskCompletionSource.setResult(new Status(0, null, null, null));
            } else {
                taskCompletionSource.setException(sqd.a(new Status(i, null, null, null)));
            }
            rjdVar.q = null;
        }
    }

    public static Handler k(rjd rjdVar) {
        b99 b99Var = rjdVar.m;
        if (b99Var == null) {
            b99 b99Var2 = new b99(rjdVar.g, (byte) 3);
            rjdVar.m = b99Var2;
            return b99Var2;
        }
        return b99Var;
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
                taskCompletionSource.setException(sqd.a(new Status(i, null, null, null)));
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
