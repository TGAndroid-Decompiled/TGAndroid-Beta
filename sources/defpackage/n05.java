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
public final class n05 implements Handler.Callback {
    public static final Status F = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status G = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object H = new Object();
    public static n05 I;
    public volatile boolean E;
    public int a;
    public boolean b;
    public ikb c;
    public qa4 d;
    public final Context e;
    public final i05 f;
    public final zhc h;
    public final AtomicInteger n;
    public final AtomicInteger r;
    public final ConcurrentHashMap s;
    public final ss w;
    public final ss x;
    public final b99 y;

    public n05(Context context, Looper looper) {
        i05 i05Var = i05.e;
        this.a = 10000;
        this.b = false;
        boolean z = true;
        this.n = new AtomicInteger(1);
        this.r = new AtomicInteger(0);
        this.s = new ConcurrentHashMap(5, 0.75f, 1);
        this.w = new ss(0);
        this.x = new ss(0);
        this.E = true;
        this.e = context;
        b99 b99Var = new b99(looper, this);
        this.y = b99Var;
        this.f = i05Var;
        this.h = new zhc(i05Var);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = die.d;
        if (bool == null) {
            bool = Boolean.valueOf((rve.a() && packageManager.hasSystemFeature("android.hardware.type.automotive")) ? z : false);
            die.d = bool;
        }
        if (bool.booleanValue()) {
            this.E = false;
        }
        b99Var.sendMessage(b99Var.obtainMessage(6));
    }

    public static void a() {
        synchronized (H) {
            n05 n05Var = I;
            if (n05Var != null) {
                n05Var.r.incrementAndGet();
                b99 b99Var = n05Var.y;
                b99Var.sendMessageAtFrontOfQueue(b99Var.obtainMessage(10));
            }
        }
    }

    public static Status d(ho hoVar, ws2 ws2Var) {
        String str = hoVar.b.c;
        String valueOf = String.valueOf(ws2Var);
        StringBuilder sb = new StringBuilder(str.length() + 63 + valueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(17, sb.toString(), ws2Var.c, ws2Var);
    }

    public static n05 e(Context context) {
        n05 n05Var;
        synchronized (H) {
            n05Var = I;
            if (n05Var == null) {
                Looper looper = aef.a().getLooper();
                Context applicationContext = context.getApplicationContext();
                Object obj = i05.d;
                n05 n05Var2 = new n05(applicationContext, looper);
                I = n05Var2;
                n05Var = n05Var2;
            }
        }
        return n05Var;
    }

    public final l6d b(h05 h05Var) {
        ho hoVar = h05Var.f;
        ConcurrentHashMap concurrentHashMap = this.s;
        l6d l6dVar = (l6d) concurrentHashMap.get(hoVar);
        if (l6dVar == null) {
            l6dVar = new l6d(this, h05Var);
            concurrentHashMap.put(hoVar, l6dVar);
        }
        if (l6dVar.b.w()) {
            this.x.add(hoVar);
        }
        l6dVar.o();
        return l6dVar;
    }

    public final void c(com.google.android.gms.tasks.TaskCompletionSource r9, int r10, defpackage.h05 r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n05.c(com.google.android.gms.tasks.TaskCompletionSource, int, h05):void");
    }

    public final boolean f() {
        if (!this.b) {
            an9 an9Var = (an9) zm9.I0().b;
            if (an9Var == null || an9Var.b) {
                int f = this.h.f(203400000);
                if (f != -1 && f != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean g(ws2 ws2Var, int i) {
        PendingIntent pendingIntent;
        int intValue;
        i05 i05Var = this.f;
        i05Var.getClass();
        Context context = this.e;
        if (!qq5.f(context)) {
            boolean b = ws2Var.b();
            int i2 = ws2Var.b;
            if (b) {
                pendingIntent = ws2Var.c;
            } else {
                pendingIntent = null;
                Intent a = i05Var.a(i2, context, null);
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
                i05Var.g(context, i2, PendingIntent.getActivity(context, 0, intent, s7d.a | 134217728));
                Integer num = ws2Var.e;
                if (num == null) {
                    intValue = -1;
                } else {
                    intValue = num.intValue();
                }
                int i4 = intValue;
                e6d e6dVar = new e6d(i4, ws2Var.b, System.currentTimeMillis(), context.getPackageName(), false);
                qa4 qa4Var = i05Var.c;
                qa4 qa4Var2 = qa4Var;
                if (qa4Var == null) {
                    ?? h05Var = new h05(context, qa4.n, wn.g, g05.c);
                    i05Var.c = h05Var;
                    qa4Var2 = h05Var;
                }
                wjb b2 = xjb.b();
                b2.c = new a94[]{mid.b};
                b2.b = false;
                b2.a = new pq8(e6dVar, (byte) 28);
                qa4Var2.e(2, b2.a());
                return true;
            }
        }
        return false;
    }

    public final void h(ws2 ws2Var, int i) {
        if (!g(ws2Var, i)) {
            b99 b99Var = this.y;
            b99Var.sendMessage(b99Var.obtainMessage(5, i, 0, ws2Var));
        }
    }

    @Override
    public final boolean handleMessage(android.os.Message r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n05.handleMessage(android.os.Message):boolean");
    }
}
