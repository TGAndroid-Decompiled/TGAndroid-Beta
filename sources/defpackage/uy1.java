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
public final class uy1 implements Runnable {
    public final byte a;
    public Object b;
    public Object c;
    public Object d;

    public uy1(w5f w5fVar, zhc zhcVar, String str) {
        this.a = (byte) 10;
        this.b = w5fVar;
        this.c = zhcVar;
        this.d = str;
    }

    private final void a() {
        v99 v99Var;
        kjd kjdVar = (kjd) this.b;
        HashMap hashMap = kjdVar.c.D;
        String str = (String) this.c;
        synchronized (hashMap) {
            v99Var = (v99) kjdVar.c.D.get(str);
        }
        if (v99Var != null) {
            v99Var.o((String) this.d);
        } else {
            rjd.H.b("Discarded message for unknown namespace '%s'", str);
        }
    }

    private final void b() {
        int i;
        Task u;
        wj2 wj2Var = (wj2) this.c;
        Intent intent = wj2Var.a;
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
            Intent intent2 = wj2Var.a;
            String stringExtra2 = intent2.getStringExtra("google.message_id");
            if (stringExtra2 == null) {
                stringExtra2 = intent2.getStringExtra("message_id");
            }
            bundle.putString("google.message_id", stringExtra2);
            Intent intent3 = wj2Var.a;
            if (intent3.hasExtra("google.product_id")) {
                num = Integer.valueOf(intent3.getIntExtra("google.product_id", 0));
            }
            if (num != null) {
                bundle.putInt("google.product_id", num.intValue());
            }
            bundle.putBoolean("supports_message_handled", true);
            ykf t = ykf.t((Context) this.b);
            synchronized (t) {
                i = t.a;
                t.a = i + 1;
            }
            u = t.u(new uff(i, 2, bundle, (byte) 0));
        }
        u.addOnCompleteListener(no3.e, new l09((CountDownLatch) this.d, (byte) 29));
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uy1.c():void");
    }

    @Override
    public final void run() {
        d80 d80Var;
        v99 v99Var;
        Bundle bundle = null;
        Object obj = null;
        switch (this.a) {
            case 0:
                ((wy1) this.d).K((File) this.c, (ArrayList) this.b);
                return;
            case 1:
                rb9 rb9Var = (rb9) this.d;
                rb9Var.b((d80) this.b, (TaskCompletionSource) this.c);
                ((AtomicInteger) rb9Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(rb9Var.b, rb9Var.a()) * (60000.0d / rb9Var.a));
                String str = "Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d)) + " s for report: " + d80Var.b;
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
                    obj = ((xn4) this.b).call();
                } catch (Exception unused2) {
                }
                ((Handler) this.d).post(new xs4((yn4) this.c, obj, (byte) 10));
                return;
            case 3:
                kka kkaVar = (kka) this.d;
                kkaVar.d.c.remove((String) this.b);
                sd9 sd9Var = (sd9) this.c;
                if (!(sd9Var.a instanceof u3)) {
                    try {
                        sd9Var.get();
                        return;
                    } catch (Exception e) {
                        kkaVar.c.l(e);
                        return;
                    }
                }
                return;
            case 4:
                s1d.h((View) this.b, (k7b) this.c);
                ((ValueAnimator) this.d).start();
                return;
            case 5:
                c36 c36Var = (c36) this.b;
                pe8 pe8Var = (pe8) this.d;
                if (pe8Var.a > 0) {
                    Bundle bundle2 = (Bundle) pe8Var.c;
                    if (bundle2 != null) {
                        bundle = bundle2.getBundle((String) this.c);
                    }
                    c36Var.onCreate(bundle);
                }
                if (pe8Var.a >= 2) {
                    c36Var.onStart();
                }
                if (pe8Var.a >= 3) {
                    c36Var.onResume();
                }
                if (pe8Var.a >= 4) {
                    c36Var.onStop();
                }
                if (pe8Var.a >= 5) {
                    c36Var.onDestroy();
                    return;
                }
                return;
            case 6:
                a();
                return;
            case 7:
                cnd.H((cnd) this.b, (l09) this.c, (tg0) this.d);
                return;
            case 8:
                cnd.G((cnd) this.b, (mt2) this.c, (nt2) this.d);
                return;
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            default:
                synchronized (((olf) this.b).I) {
                    v99Var = (v99) ((olf) this.b).I.get((String) this.c);
                }
                if (v99Var != null) {
                    v99Var.o((String) this.d);
                    return;
                } else {
                    olf.X.b("Discarded message for unknown namespace '%s'", (String) this.c);
                    return;
                }
        }
    }

    public uy1(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    public uy1(Object obj, Object obj2, Object obj3, boolean z, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    public uy1() {
        this.a = (byte) 2;
    }

    public uy1(View view, w1d w1dVar, k7b k7bVar, ValueAnimator valueAnimator) {
        this.a = (byte) 4;
        this.b = view;
        this.c = k7bVar;
        this.d = valueAnimator;
    }
}
