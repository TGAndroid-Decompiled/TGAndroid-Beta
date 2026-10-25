package k6;

import a8.pf;
import a8.yb;
import a8.z0;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d5.b0;
import d5.e0;
import d5.v;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Components.r6;
import org.telegram.ui.jg;
public final class m implements OnSuccessListener, oe.k {
    public static m e;
    public int f16423a;
    public Object f16424b;
    public Object f16425c;
    public Object d;

    public m(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f16423a = i10;
        this.d = str;
        this.f16424b = arrayList;
        this.f16425c = arrayList2;
    }

    public static synchronized m j(Context context) {
        m mVar;
        synchronized (m.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new k(obj);
                    obj.f16423a = 1;
                    obj.f16425c = unconfigurableScheduledExecutorService;
                    obj.f16424b = context.getApplicationContext();
                    e = obj;
                }
                mVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override
    public void a() {
        f();
    }

    @Override
    public void b(oe.l lVar) {
        f();
    }

    public m c() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f16424b)) {
            if (!z0.b(this.f16423a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f16423a;
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
                sb2.append(str);
                throw new IllegalArgumentException(sb2.toString());
            }
            int i11 = this.f16423a;
            if (i11 != 0) {
                z10 = z0.a(i11);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new m((String) this.f16424b, (String) this.f16425c, (String) this.d, this.f16423a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int d() {
        int i10 = this.f16423a;
        if (i10 != 2) {
            if (i10 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public Looper e() {
        Looper looper;
        boolean z10;
        synchronized (this.f16424b) {
            try {
                if (((Looper) this.f16425c) == null) {
                    if (this.f16423a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    yb.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f16425c = ((HandlerThread) this.d).getLooper();
                }
                this.f16423a++;
                looper = (Looper) this.f16425c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void f() {
        float[] fArr = (float[]) this.f16424b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((oe.l) this.d).iterator();
        while (it.hasNext()) {
            oe.g gVar = (oe.g) it.next();
            fArr[((Integer) gVar.f19337a).intValue()] = gVar.c();
        }
        ((jg) this.f16425c).run();
    }

    public void g() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f16424b) {
            try {
                if (this.f16423a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.p(z10);
                int i10 = this.f16423a - 1;
                this.f16423a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f16425c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f16423a);
        int b10 = pf.b(this.f16423a, 1 << i10, z10);
        this.f16423a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((oe.l) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void i(Throwable th2) {
        b0 b0Var = (b0) this.d;
        if (th2 instanceof TimeoutException) {
            b0Var.F(102, 28, e0.f7969p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            b0Var.F(95, 28, e0.f7969p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f16425c).run();
    }

    public synchronized Task k(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.d).d(lVar)) {
                k kVar = new k(this);
                this.d = kVar;
                kVar.d(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.f16421b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: k6.m.onSuccess(java.lang.Object):void");
    }

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f16424b = obj;
        this.f16425c = obj2;
        this.d = obj3;
        this.f16423a = i10;
    }

    public m(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f16424b = str;
        this.f16423a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f16425c = unmodifiableList;
        this.d = bArr;
    }

    public m(int i10) {
        switch (i10) {
            case 6:
                r6 r6Var = new r6(true, true, true);
                this.d = r6Var;
                Paint paint = new Paint(1);
                r6Var.w(AndroidUtilities.dp(13.0f));
                r6Var.u(-1);
                r6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f16424b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f16425c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new n2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
            case 7:
                this.f16424b = new Object();
                this.f16425c = null;
                this.d = null;
                this.f16423a = 0;
                return;
            default:
                this.f16424b = null;
                this.f16425c = null;
                this.d = null;
                this.f16423a = 0;
                return;
        }
    }
}
