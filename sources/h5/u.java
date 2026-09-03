package h5;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnSuccessListener;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import k7.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.o2;
import org.telegram.ui.Components.j6;
import org.telegram.ui.pg;
public final class u implements OnSuccessListener, xd.i {
    public static u e;
    public int f6980a;
    public Object f6981b;
    public Object f6982c;
    public Object d;

    public u(Context context) {
        this.f6981b = new Handler(Looper.getMainLooper());
        this.f6982c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f6980a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new androidx.mediarouter.app.h(this, 6), intentFilter);
    }

    public static void b(u uVar, int i10) {
        synchronized (uVar.d) {
            try {
                if (uVar.f6980a == i10) {
                    return;
                }
                uVar.f6980a = i10;
                Iterator it = ((CopyOnWriteArrayList) uVar.f6982c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    g5.r rVar = (g5.r) weakReference.get();
                    if (rVar != null) {
                        rVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) uVar.f6982c).remove(weakReference);
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
                if (e == null) {
                    e = new u(context);
                }
                uVar = e;
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
        if (!TextUtils.isEmpty((String) this.f6981b)) {
            if (!com.google.android.gms.internal.cast.n.b(this.f6980a)) {
                StringBuilder sb = new StringBuilder("Authenticator combination is unsupported on API ");
                sb.append(Build.VERSION.SDK_INT);
                sb.append(": ");
                int i10 = this.f6980a;
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
            int i11 = this.f6980a;
            if (i11 != 0) {
                z4 = com.google.android.gms.internal.cast.n.a(i11);
            } else {
                z4 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z4) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z4) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new x5.k((String) this.f6981b, (String) this.f6982c, (String) this.d, this.f6980a);
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
            i10 = this.f6980a;
        }
        return i10;
    }

    public void g() {
        float[] fArr = (float[]) this.f6981b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((xd.j) this.d).iterator();
        while (it.hasNext()) {
            xd.e eVar = (xd.e) it.next();
            fArr[((Integer) eVar.f46967a).intValue()] = eVar.c();
        }
        ((pg) this.f6982c).run();
    }

    public void h(int i10, boolean z4, boolean z10) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f6980a);
        int b10 = w8.b(this.f6980a, 1 << i10, z4);
        this.f6980a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((xd.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z10);
        }
    }

    public void i(Throwable th2) {
        p2.y yVar = (p2.y) this.d;
        if (th2 instanceof TimeoutException) {
            yVar.F(102, 28, p2.b0.f40997p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            yVar.F(95, 28, p2.b0.f40997p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f6982c).run();
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
                this.f6981b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f6982c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new o2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
            default:
                this.f6981b = null;
                this.f6982c = null;
                this.d = null;
                this.f6980a = 0;
                return;
        }
    }
}
