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
public final class ey1 implements Runnable {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public ey1(f1f f1fVar, aec aecVar, String str) {
        this.a = (byte) 10;
        this.b = f1fVar;
        this.c = aecVar;
        this.d = str;
    }

    private final void a() {
        i69 i69Var;
        ted tedVar = (ted) this.b;
        HashMap hashMap = tedVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            i69Var = (i69) tedVar.c.D.get(str);
        }
        if (i69Var != null) {
            i69Var.o((String) this.d);
        } else {
            afd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        aj2 aj2Var = (aj2) this.c;
        Intent intent = aj2Var.a;
        String stringExtra = intent.getStringExtra("google.message_id");
        if (stringExtra == null) {
            stringExtra = intent.getStringExtra("message_id");
        }
        boolean isEmpty = TextUtils.isEmpty(stringExtra);
        Integer num = null;
        if (isEmpty) {
            u = Tasks.forResult(null);
        } else {
            Bundle bundle = new Bundle();
            Intent intent2 = aj2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = aj2Var.a;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            igf t = igf.t((Context) this.b);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new ebf(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(wn3.e, new v39((CountDownLatch) this.d, (byte) 29));
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ey1.c():void");
    }

    @Override
    public final void run() {
        b80 b80Var;
        i69 i69Var;
        Bundle bundle = null;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((gy1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                f89 f89Var = (f89) this.d;
                f89Var.b((b80) this.b, (TaskCompletionSource) this.c);
                ((AtomicInteger) f89Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(f89Var.b, f89Var.a()) * (60000.0d / f89Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + b80Var.b;
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
                    obj = ((sl4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new tq4((tl4) this.c, obj, (byte) 10));
                return;
            case 3:
                rga rgaVar = (rga) this.d;
                rgaVar.d.c.remove((String) this.b);
                ea9 ea9Var = (ea9) this.c;
                if (!(ea9Var.a instanceof t3)) {
                    try {
                        ea9Var.get();
                        return;
                    } catch (Exception e) {
                        rgaVar.c.l(e);
                        return;
                    }
                }
                return;
            case 4:
                cxc.h((View) this.b, (v8b) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                y06 y06Var = (y06) this.b;
                ab8 ab8Var = (ab8) this.d;
                if (ab8Var.a > 0) {
                    Bundle bundle2 = (Bundle) ab8Var.c;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.c);
                    }
                    y06Var.onCreate(bundle);
                }
                if (ab8Var.a >= 2) {
                    y06Var.onStart();
                }
                if (ab8Var.a >= 3) {
                    y06Var.onResume();
                }
                if (ab8Var.a >= 4) {
                    y06Var.onStop();
                }
                if (ab8Var.a >= 5) {
                    y06Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                lid.H((lid) this.b, (z24) this.c, (sg0) this.d);
                return;
            case 8:
                lid.G((lid) this.b, (ss2) this.c, (ts2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((ygf) this.b).I) {
                    i69Var = (i69) ((ygf) this.b).I.get((String) this.c);
                }
                if (i69Var != null) {
                    i69Var.o((String) this.d);
                    return;
                } else {
                    ygf.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public ey1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public ey1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public ey1() {
        this.a = (byte) 2;
    }

    public ey1(View view, gxc gxcVar, v8b v8bVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = v8bVar;
        this.d = valueAnimator;
    }
}
