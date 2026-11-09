package m6;

import a8.ia;
import a8.k1;
import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c8.zc;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import f5.r;
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
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Components.i6;
import org.telegram.ui.xf;
public final class n implements OnSuccessListener, te.i {
    public static n f19919e;
    public int f19920a;
    public Object f19921b;
    public Object f19922c;
    public Object d;

    public n(int i7, String str, int i10, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f19921b = str;
        this.f19920a = i10;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f19922c = unmodifiableList;
        this.d = bArr;
    }

    public static synchronized n i(Context context) {
        n nVar;
        synchronized (n.class) {
            try {
                if (f19919e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new r("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new l(obj);
                    obj.f19920a = 1;
                    obj.f19922c = unconfigurableScheduledExecutorService;
                    obj.f19921b = context.getApplicationContext();
                    f19919e = obj;
                }
                nVar = f19919e;
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
        boolean z9;
        String str;
        if (!TextUtils.isEmpty((String) this.f19921b)) {
            if (!k1.b(this.f19920a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i7 = this.f19920a;
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
            int i10 = this.f19920a;
            if (i10 != 0) {
                z9 = k1.a(i10);
            } else {
                z9 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z9) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z9) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            int i11 = this.f19920a;
            ?? obj = new Object();
            obj.f19921b = (String) this.f19921b;
            obj.f19922c = (String) this.f19922c;
            obj.d = (String) this.d;
            obj.f19920a = i11;
            return obj;
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int c() {
        int i7 = this.f19920a;
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
        boolean z9;
        synchronized (this.f19921b) {
            try {
                if (((Looper) this.f19922c) == null) {
                    if (this.f19920a == 0 && ((HandlerThread) this.d) == null) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    ia.p(z9);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f19922c = ((HandlerThread) this.d).getLooper();
                }
                this.f19920a++;
                looper = (Looper) this.f19922c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void e() {
        float[] fArr = (float[]) this.f19921b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((te.j) this.d).iterator();
        while (it.hasNext()) {
            te.e eVar = (te.e) it.next();
            fArr[((Integer) eVar.f55508a).intValue()] = eVar.c();
        }
        ((xf) this.f19922c).run();
    }

    @Override
    public void f(te.j jVar) {
        e();
    }

    public void g() {
        boolean z9;
        HandlerThread handlerThread;
        synchronized (this.f19921b) {
            try {
                if (this.f19920a > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                int i7 = this.f19920a - 1;
                this.f19920a = i7;
                if (i7 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f19922c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i7, boolean z9, boolean z10) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f19920a);
        int b10 = zc.b(this.f19920a, 1 << i7, z9);
        this.f19920a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((te.j) this.d).f(Integer.valueOf(numberOfLeadingZeros2), z10);
        }
    }

    public void j(Throwable th2) {
        w wVar = (w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(102, 28, z.f11208p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, z.f11208p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f19922c).run();
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
        return mVar.f19916b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: m6.n.onSuccess(java.lang.Object):void");
    }

    public n(int i7) {
        switch (i7) {
            case 4:
                i6 i6Var = new i6(true, true, true);
                this.d = i6Var;
                Paint paint = new Paint(1);
                i6Var.w(g0.L(13.0f));
                i6Var.u(-1);
                i6Var.x(g0.o());
                paint.setColor(i0.a.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f19921b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f19922c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new r2(g0.L(1.0f)), 0, 1, 0);
                return;
            case 7:
                this.f19921b = new Object();
                this.f19922c = null;
                this.d = null;
                this.f19920a = 0;
                return;
            default:
                this.f19921b = null;
                this.f19922c = null;
                this.d = null;
                this.f19920a = 0;
                return;
        }
    }
}
