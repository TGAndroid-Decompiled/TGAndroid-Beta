package m6;

import a8.m1;
import a8.ma;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c8.ed;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import f5.s;
import f5.w;
import f5.z;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.s2;
import org.telegram.ui.Components.m6;
import org.telegram.ui.vf;
public final class n implements OnSuccessListener, te.i {
    public static n f20970e;
    public int f20971a;
    public Object f20972b;
    public Object f20973c;
    public Object d;

    public n(int i7, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f20972b = str;
        this.f20971a = i10;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f20973c = unmodifiableList;
        this.d = bArr;
    }

    public static synchronized n i(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f20970e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new s("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new l(obj);
                    obj.f20971a = 1;
                    obj.f20973c = unconfigurableScheduledExecutorService;
                    obj.f20972b = context.getApplicationContext();
                    f20970e = obj;
                }
                nVar = f20970e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public void a() {
        e();
    }

    public n b() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f20972b)) {
            if (!m1.b(this.f20971a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i7 = this.f20971a;
                if (i7 != 15) {
                    if (i7 != 255) {
                        if (i7 != 32768) {
                            if (i7 != 32783) {
                                if (i7 != 33023) {
                                    str = String.valueOf(i7);
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
            int i10 = this.f20971a;
            if (i10 != 0) {
                z10 = m1.a(i10);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            int i11 = this.f20971a;
            ?? obj = new Object();
            obj.f20972b = (String) this.f20972b;
            obj.f20973c = (String) this.f20973c;
            obj.d = (String) this.d;
            obj.f20971a = i11;
            return obj;
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int c() {
        int i7 = this.f20971a;
        if (i7 != 2) {
            if (i7 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public Looper d() {
        Looper looper;
        boolean z10;
        synchronized (this.f20972b) {
            try {
                if (((Looper) this.f20973c) == null) {
                    if (this.f20971a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    ma.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f20973c = ((HandlerThread) this.d).getLooper();
                }
                this.f20971a++;
                looper = (Looper) this.f20973c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void e() {
        float[] fArr = (float[]) this.f20972b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((te.j) this.d).iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            fArr[((Integer) eVar.f57788a).intValue()] = eVar.c();
        }
        ((vf) this.f20973c).run();
    }

    public void f() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f20972b) {
            try {
                if (this.f20971a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.p(z10);
                int i7 = this.f20971a - 1;
                this.f20971a = i7;
                if (i7 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f20973c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void g(te.j jVar) {
        e();
    }

    public void h(int i7, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f20971a);
        int b10 = ed.b(this.f20971a, 1 << i7, z10);
        this.f20971a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((te.j) this.d).f(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        w wVar = (w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.G(102, 28, z.f11333p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.G(95, 28, z.f11333p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f20973c).run();
    }

    public synchronized Task k(m mVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(mVar.toString()));
            }
            if (!((l) this.d).a(mVar)) {
                l lVar = new l(this);
                this.d = lVar;
                lVar.a(mVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return mVar.f20967b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: m6.n.onSuccess(java.lang.Object):void");
    }

    public n(int i7) {
        switch (i7) {
            case 5:
                m6 m6Var = new m6(true, true, true);
                this.d = m6Var;
                Paint paint = new Paint(1);
                m6Var.w(g0.L(13.0f));
                m6Var.u(-1);
                m6Var.x(g0.o());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f20972b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new s2(g0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f20973c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new s2(g0.L(1.0f)), 0, 1, 0);
                return;
            case 6:
            default:
                this.f20972b = null;
                this.f20973c = null;
                this.d = null;
                this.f20971a = 0;
                return;
            case 7:
                this.f20972b = new Object();
                this.f20973c = null;
                this.d = null;
                this.f20971a = 0;
                return;
        }
    }
}
