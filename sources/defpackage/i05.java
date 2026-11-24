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
public final class i05 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static i05 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public nib c;
    public ua4 d;
    public final Context e;
    public final d05 f;
    public final rhb h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final st w;
    public final st x;
    public final q79 y;

    public i05(Context context, Looper looper) {
        d05 d05Var = d05.e;
        this.a = 10000;
        this.b = false;
        boolean z = true;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new st(0);
        this.x = new st(0);
        this.E = true;
        this.e = context;
        q79 q79Var = new q79(looper, this);
        this.y = q79Var;
        this.f = d05Var;
        this.h = new rhb(d05Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = nfe.d;
        if (bool == null) {
            bool = Boolean.valueOf((ate.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? z : false);
            nfe.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        q79Var.sendMessage(q79Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            i05 i05Var = I;
            if (i05Var != null) {
                i05Var.r.incrementAndGet();
                q79 q79Var = i05Var.y;
                q79Var.sendMessageAtFrontOfQueue(q79Var.obtainMessage(10));
            }
        }
    }

    public static Status d(gp gpVar, ot2 ot2Var) {
        String str = gpVar.b.c;
        String valueOf = String.valueOf(ot2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ot2Var.c, ot2Var);
    }

    public static i05 e(Context context) {
        i05 i05Var;
        synchronized (H) {
            i05Var = I;
            if (i05Var == null) {
                Looper looper = lbf.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = d05.d;
                i05 i05Var2 = new i05(applicationContext, looper);
                I = i05Var2;
                i05Var = i05Var2;
            }
        }
        return i05Var;
    }

    public final w3d b(c05 c05Var) {
        gp gpVar = c05Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        w3d w3dVar = (w3d) concurrentHashMap.get(gpVar);
        if (w3dVar == null) {
            w3dVar = new w3d(this, c05Var);
            concurrentHashMap.put(gpVar, w3dVar);
        }
        if (w3dVar.b.w()) {
            this.x.add(gpVar);
        }
        w3dVar.o();
        return w3dVar;
    }

    public final void c(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, defpackage.c05 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i05.c(com.google.android.gms.tasks.TaskCompletionSource, int, c05):void");
    }

    public final boolean f() {
        if (!this.b) {
            ol9 ol9Var = (ol9) nl9.C0().b;
            if (ol9Var == null || ol9Var.b) {
                int o = this.h.o(203400000);
                if (o != -1 && o != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(ot2 ot2Var, int i) {
        PendingIntent pendingIntent;
        int intValue;
        d05 d05Var = this.f;
        d05Var.getClass();
        Context context = this.e;
        if (!nq5.f(context)) {
            boolean b = ot2Var.b();
            int i2 = ot2Var.b;
            if (b) {
                pendingIntent = ot2Var.c;
            } else {
                pendingIntent = null;
                Intent a = d05Var.a(i2, context, null);
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
                d05Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, d5d.a | 134217728));
                Integer num = ot2Var.e;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                int i4 = intValue;
                p3d p3dVar = new p3d(i4, ot2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                ua4 ua4Var = d05Var.c;
                ua4 ua4Var2 = ua4Var;
                if (ua4Var == null) {
                    ?? c05Var = new c05(context, ua4.n, wo.g, b05.c);
                    d05Var.c = c05Var;
                    ua4Var2 = c05Var;
                }
                bib b2 = cib.b();
                b2.c = new o94[]{wfd.b};
                b2.b = false;
                b2.a = new et8(p3dVar, (byte) 25);
                ua4Var2.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ot2 ot2Var, int i) {
        if (!g(ot2Var, i)) {
            q79 q79Var = this.y;
            q79Var.sendMessage(q79Var.obtainMessage(5, i, 0, ot2Var));
        }
    }

    @Override
    public final boolean handleMessage(android.os.Message r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i05.handleMessage(android.os.Message):boolean");
    }
}
