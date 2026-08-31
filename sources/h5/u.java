package h5;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import k7.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.j6;
import org.telegram.ui.ng;
public final class u implements OnSuccessListener, xd.i {
    public static u f7298e;
    public int f7299a;
    public Object f7300b;
    public Object f7301c;
    public Object d;

    public u(Context context) {
        this.f7300b = new Handler(Looper.getMainLooper());
        this.f7301c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f7299a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new androidx.mediarouter.app.h(this, 6), intentFilter);
    }

    public static void b(u uVar, int i10) {
        synchronized (uVar.d) {
            try {
                if (uVar.f7299a == i10) {
                    return;
                }
                uVar.f7299a = i10;
                Iterator it = ((CopyOnWriteArrayList) uVar.f7301c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    g5.r rVar = (g5.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) uVar.f7301c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized u d(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f7298e == null) {
                    f7298e = new u(context);
                }
                uVar = f7298e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    @Override
    public void a() {
        g();
    }

    public x5.k c() {
        boolean z4;
        String str;
        if (!TextUtils.isEmpty((String) this.f7300b)) {
            if (!s1.b(this.f7299a)) {
                StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(": ");
                int i10 = this.f7299a;
                if (i10 != 15) {
                    if (i10 != 255) {
                        if (i10 != 32768) {
                            if (i10 != 32783) {
                                if (i10 != 33023) {
                                    str = String.valueOf(i10);
                                } else {
                                    str = "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
                                }
                            } else {
                                str = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
                            }
                        } else {
                            str = "DEVICE_CREDENTIAL";
                        }
                    } else {
                        str = "BIOMETRIC_WEAK";
                    }
                } else {
                    str = "BIOMETRIC_STRONG";
                }
                sb.append(str);
                throw new IllegalArgumentException(sb.toString());
            }
            int i11 = this.f7299a;
            if (i11 != 0) {
                z4 = s1.a(i11);
            } else {
                z4 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z4) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z4) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new x5.k((String) this.f7300b, (String) this.f7301c, (String) this.d, this.f7299a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    @Override
    public void e(xd.j jVar) {
        g();
    }

    public int f() {
        int i10;
        synchronized (this.d) {
            i10 = this.f7299a;
        }
        return i10;
    }

    public void g() {
        float[] fArr = (float[]) this.f7300b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((xd.j) this.d).iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            fArr[((Integer) eVar.f50512a).intValue()] = eVar.c();
        }
        ((ng) this.f7301c).run();
    }

    public void h(int i10, boolean z4, boolean z10) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f7299a);
        int b10 = x8.b(this.f7299a, 1 << i10, z4);
        this.f7299a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((xd.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z10);
        }
    }

    public void i(Throwable th2) {
        p2.x xVar = (p2.x) this.d;
        if (th2 instanceof TimeoutException) {
            xVar.F(102, 28, p2.a0.f44102p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            xVar.F(95, 28, p2.a0.f44102p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f7301c).run();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: h5.u.onSuccess(java.lang.Object):void");
    }

    public u(int i10) {
        switch (i10) {
            case 3:
                j6 j6Var = new j6(true, true, true, false);
                this.d = j6Var;
                Paint paint = new Paint(1);
                j6Var.t(AndroidUtilities.dp(13.0f));
                j6Var.r(-1);
                j6Var.u(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f7300b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f7301c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
            default:
                this.f7300b = null;
                this.f7301c = null;
                this.d = null;
                this.f7299a = 0;
                return;
        }
    }
}
