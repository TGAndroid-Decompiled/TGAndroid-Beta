package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
public final class hy4 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static hy4 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public mgb c;
    public u84 d;
    public final Context e;
    public final cy4 f;
    public final aec h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final rs w;
    public final rs x;
    public final o59 y;

    public hy4(Context context, Looper looper) {
        cy4 cy4Var = cy4.e;
        this.a = 10000;
        this.b = false;
        boolean z = true;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new rs(0);
        this.x = new rs(0);
        this.E = true;
        this.e = context;
        o59 o59Var = new o59(looper, this);
        this.y = o59Var;
        this.f = cy4Var;
        this.h = new aec(cy4Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = mde.d;
        if (bool == null) {
            bool = Boolean.valueOf((xqe.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? z : false);
            mde.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        o59Var.sendMessage(o59Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            hy4 hy4Var = I;
            if (hy4Var != null) {
                hy4Var.r.incrementAndGet();
                o59 o59Var = hy4Var.y;
                o59Var.sendMessageAtFrontOfQueue(o59Var.obtainMessage(10));
            }
        }
    }

    public static Status d(go goVar, ds2 ds2Var) {
        String str = goVar.b.c;
        String valueOf = String.valueOf(ds2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ds2Var.c, ds2Var);
    }

    public static hy4 e(Context context) {
        hy4 hy4Var;
        synchronized (H) {
            hy4Var = I;
            if (hy4Var == null) {
                Looper looper = j9f.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = cy4.d;
                hy4 hy4Var2 = new hy4(applicationContext, looper);
                I = hy4Var2;
                hy4Var = hy4Var2;
            }
        }
        return hy4Var;
    }

    public final u1d b(by4 by4Var) {
        go goVar = by4Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        u1d u1dVar = (u1d) concurrentHashMap.get(goVar);
        if (u1dVar == null) {
            u1dVar = new u1d(this, by4Var);
            concurrentHashMap.put(goVar, u1dVar);
        }
        if (u1dVar.b.w()) {
            this.x.add(goVar);
        }
        u1dVar.o();
        return u1dVar;
    }

    public final void c(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, defpackage.by4 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy4.c(com.google.android.gms.tasks.TaskCompletionSource, int, by4):void");
    }

    public final boolean f() {
        if (!this.b) {
            mj9 mj9Var = (mj9) lj9.y().b;
            if (mj9Var == null || mj9Var.b) {
                int g = this.h.g(203400000);
                if (g != -1 && g != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(ds2 ds2Var, int i) {
        PendingIntent pendingIntent;
        int intValue;
        cy4 cy4Var = this.f;
        cy4Var.getClass();
        Context context = this.e;
        if (!no5.f(context)) {
            boolean b = ds2Var.b();
            int i2 = ds2Var.b;
            if (b) {
                pendingIntent = ds2Var.c;
            } else {
                pendingIntent = null;
                Intent a = cy4Var.a(i2, context, null);
                if (a != null) {
                    pendingIntent = PendingIntent.getActivity(context, 0, a, 201326592);
                }
            }
            if (pendingIntent != null) {
                int i3 = GoogleApiActivity.b;
                Intent intent = new Intent(context, GoogleApiActivity.class);
                intent.putExtra("pending_intent", pendingIntent);
                intent.putExtra("failing_client_id", i);
                intent.putExtra("notify_manager", true);
                cy4Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, b3d.a | 134217728));
                Integer num = ds2Var.e;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                int i4 = intValue;
                n1d n1dVar = new n1d(i4, ds2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                u84 u84Var = cy4Var.c;
                u84 u84Var2 = u84Var;
                if (u84Var == null) {
                    ?? by4Var = new by4(context, u84.n, vn.g, ay4.c);
                    cy4Var.c = by4Var;
                    u84Var2 = by4Var;
                }
                agb b2 = bgb.b();
                b2.c = new f84[]{udd.b};
                b2.b = false;
                b2.a = new g29(n1dVar, (byte) 23);
                u84Var2.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ds2 ds2Var, int i) {
        if (!g(ds2Var, i)) {
            o59 o59Var = this.y;
            o59Var.sendMessage(o59Var.obtainMessage(5, i, 0, ds2Var));
        }
    }

    @Override
    public final boolean handleMessage(android.os.Message r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hy4.handleMessage(android.os.Message):boolean");
    }
}
