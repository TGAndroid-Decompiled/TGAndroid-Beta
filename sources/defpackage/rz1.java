package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
public final class rz1 implements Runnable {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public rz1(h3f h3fVar, rhb rhbVar, String str) {
        this.a = (byte) 10;
        this.b = h3fVar;
        this.c = rhbVar;
        this.d = str;
    }

    private final void a() {
        k89 k89Var;
        ugd ugdVar = (ugd) this.b;
        HashMap hashMap = ugdVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            k89Var = (k89) ugdVar.c.D.get(str);
        }
        if (k89Var != null) {
            k89Var.o((String) this.d);
        } else {
            bhd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        ok2 ok2Var = (ok2) this.c;
        Intent intent = ok2Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        Integer num = null;
        if (TextUtils.isEmpty(stringExtra)) {
            u = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = ok2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = ok2Var.a;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            jif t = jif.t((Context) this.b);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new fdf(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(gp3.e, new fkd((CountDownLatch) this.d, (byte) 2));
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rz1.c():void");
    }

    @Override
    public final void run() {
        b90 b90Var;
        k89 k89Var;
        Bundle bundle = null;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((tz1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                ha9 ha9Var = (ha9) this.d;
                ha9Var.b((b90) this.b, (TaskCompletionSource) this.c);
                ((AtomicInteger) ha9Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(ha9Var.b, ha9Var.a()) * (60000.0d / ha9Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + b90Var.b;
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused) {
                    return;
                }
            case 2:
                try {
                    obj = ((tn4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new us4((un4) this.c, obj, (byte) 10));
                return;
            case 3:
                tia tiaVar = (tia) this.d;
                tiaVar.d.c.remove((String) this.b);
                ec9 ec9Var = (ec9) this.c;
                if (!(ec9Var.a instanceof t3)) {
                    try {
                        ec9Var.get();
                        return;
                    } catch (Exception e) {
                        tiaVar.c.l(e);
                        return;
                    }
                }
                return;
            case 4:
                dzc.h((View) this.b, (xab) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                y26 y26Var = (y26) this.b;
                dd8 dd8Var = (dd8) this.d;
                if (dd8Var.a > 0) {
                    Bundle bundle2 = (Bundle) dd8Var.c;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.c);
                    }
                    y26Var.onCreate(bundle);
                }
                if (dd8Var.a >= 2) {
                    y26Var.onStart();
                }
                if (dd8Var.a >= 3) {
                    y26Var.onResume();
                }
                if (dd8Var.a >= 4) {
                    y26Var.onStop();
                }
                if (dd8Var.a >= 5) {
                    y26Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                nkd.H((nkd) this.b, (oo8) this.c, (xg0) this.d);
                return;
            case 8:
                nkd.G((nkd) this.b, (du2) this.c, (eu2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((zif) this.b).I) {
                    k89Var = (k89) ((zif) this.b).I.get((String) this.c);
                }
                if (k89Var != null) {
                    k89Var.o((String) this.d);
                    return;
                } else {
                    zif.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public rz1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public rz1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public rz1() {
        this.a = (byte) 2;
    }

    public rz1(View view, hzc hzcVar, xab xabVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = xabVar;
        this.d = valueAnimator;
    }
}
