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
public final class bhd extends c05 {
    public static final ce6 H = new ce6("CastClient", null);
    public static final zo I = new zo("Cast.API_CXLESS", new or5((byte) 13), x9d.a);
    public dcd A;
    public final CastDevice B;
    public final HashMap C;
    public final HashMap D;
    public final vjf E;
    public final List F;
    public byte G;
    public final ugd l;
    public q79 m;
    public boolean n;
    public boolean o;
    public TaskCompletionSource p;
    public TaskCompletionSource q;
    public final AtomicLong r;
    public final Object s;
    public final Object t;
    public ws u;
    public String v;
    public double w;
    public boolean x;
    public int y;
    public int z;

    public bhd(Context context, ge1 ge1Var) {
        super(context, I, ge1Var, b05.c);
        this.l = new ugd(this);
        this.s = new Object();
        this.t = new Object();
        this.F = DesugarCollections.synchronizedList(new ArrayList());
        this.E = ge1Var.b;
        this.B = ge1Var.a;
        this.C = new HashMap();
        this.D = new HashMap();
        this.r = new AtomicLong(0L);
        this.G = (byte) 1;
        j();
    }

    public static void f(bhd bhdVar, long j, int i) {
        TaskCompletionSource taskCompletionSource;
        synchronized (bhdVar.C) {
            HashMap hashMap = bhdVar.C;
            Long valueOf = Long.valueOf(j);
            taskCompletionSource = (TaskCompletionSource) hashMap.get(valueOf);
            bhdVar.C.remove(valueOf);
        }
        if (taskCompletionSource != null) {
            if (i == 0) {
                taskCompletionSource.setResult(null);
            } else {
                taskCompletionSource.setException(dod.a(new Status(i, null, null, null)));
            }
        }
    }

    public static void g(bhd bhdVar, int i) {
        synchronized (bhdVar.t) {
            TaskCompletionSource taskCompletionSource = bhdVar.q;
            if (taskCompletionSource == null) {
                return;
            }
            if (i == 0) {
                taskCompletionSource.setResult(new Status(0, null, null, null));
            } else {
                taskCompletionSource.setException(dod.a(new Status(i, null, null, null)));
            }
            bhdVar.q = null;
        }
    }

    public static Handler k(bhd bhdVar) {
        q79 q79Var = bhdVar.m;
        if (q79Var == null) {
            q79 q79Var2 = new q79(bhdVar.g, (byte) 3);
            bhdVar.m = q79Var2;
            return q79Var2;
        }
        return q79Var;
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
                taskCompletionSource.setException(dod.a(new Status(i, null, null, null)));
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
