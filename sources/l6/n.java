package l6;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import b8.k0;
import b8.zb;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import e5.r;
import e5.w;
import e5.z;
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
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.g6;
import org.telegram.ui.tf;
import x7.u;
public final class n implements OnSuccessListener, qe.i {
    public static n f18087e;
    public int f18088a;
    public Object f18089b;
    public Object f18090c;
    public Object d;

    public n(Object obj, Object obj2, Object obj3, int i3) {
        this.f18089b = obj;
        this.f18090c = obj2;
        this.d = obj3;
        this.f18088a = i3;
    }

    public static synchronized n i(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f18087e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new r("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new k(obj);
                    obj.f18088a = 1;
                    obj.f18090c = unconfigurableScheduledExecutorService;
                    obj.f18089b = context.getApplicationContext();
                    f18087e = obj;
                }
                nVar = f18087e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override
    public void a() {
        f();
    }

    @Override
    public void b(qe.j jVar) {
        f();
    }

    public n c() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f18089b)) {
            if (!k0.b(this.f18088a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i3 = this.f18088a;
                if (i3 != 15) {
                    if (i3 != 255) {
                        if (i3 != 32768) {
                            if (i3 != 32783) {
                                if (i3 != 33023) {
                                    str = String.valueOf(i3);
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
            int i10 = this.f18088a;
            if (i10 != 0) {
                z10 = k0.a(i10);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new n((String) this.f18089b, (String) this.f18090c, (String) this.d, this.f18088a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int d() {
        int i3 = this.f18088a;
        if (i3 != 2) {
            if (i3 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public Looper e() {
        Looper looper;
        boolean z10;
        synchronized (this.f18089b) {
            try {
                if (((Looper) this.f18090c) == null) {
                    if (this.f18088a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zb.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f18090c = ((HandlerThread) this.d).getLooper();
                }
                this.f18088a++;
                looper = (Looper) this.f18090c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void f() {
        float[] fArr = (float[]) this.f18089b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((qe.j) this.d).iterator();
        while (it.hasNext()) {
            qe.e eVar = (qe.e) it.next();
            fArr[((Integer) eVar.f53849a).intValue()] = eVar.c();
        }
        ((tf) this.f18090c).run();
    }

    public void g() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f18089b) {
            try {
                if (this.f18088a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zb.p(z10);
                int i3 = this.f18088a - 1;
                this.f18088a = i3;
                if (i3 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f18090c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i3, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f18088a);
        int b10 = u.b(this.f18088a, 1 << i3, z10);
        this.f18088a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((qe.j) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        w wVar = (w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(102, 28, z.f9651p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, z.f9651p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f18090c).run();
    }

    public synchronized Task k(l lVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(lVar.toString()));
            }
            if (!((k) this.d).a(lVar)) {
                k kVar = new k(this);
                this.d = kVar;
                kVar.a(lVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return lVar.f18084b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: l6.n.onSuccess(java.lang.Object):void");
    }

    public n(int i3, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f18089b = str;
        this.f18088a = i10;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f18090c = unmodifiableList;
        this.d = bArr;
    }

    public n(int i3) {
        switch (i3) {
            case 5:
                g6 g6Var = new g6(true, true, true);
                this.d = g6Var;
                Paint paint = new Paint(1);
                g6Var.w(g0.L(13.0f));
                g6Var.u(-1);
                g6Var.x(g0.o());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f18089b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f18090c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                return;
            case 6:
                this.f18089b = new Object();
                this.f18090c = null;
                this.d = null;
                this.f18088a = 0;
                return;
            default:
                this.f18089b = null;
                this.f18090c = null;
                this.d = null;
                this.f18088a = 0;
                return;
        }
    }
}
