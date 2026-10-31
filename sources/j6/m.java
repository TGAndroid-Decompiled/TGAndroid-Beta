package j6;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c5.c0;
import c5.s;
import c5.z;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.i0;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.e6;
import org.telegram.ui.lg;
import v7.t6;
import v7.u7;
public final class m implements OnSuccessListener, fe.l {
    public static m e;
    public int f9698a;
    public Object f9699b;
    public Object f9700c;
    public Object d;

    public m(Object obj, Object obj2, Object obj3, int i10) {
        this.f9699b = obj;
        this.f9700c = obj2;
        this.d = obj3;
        this.f9698a = i10;
    }

    public static synchronized m j(Context context) {
        m mVar;
        synchronized (m.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new s("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new j(obj);
                    obj.f9698a = 1;
                    obj.f9700c = unconfigurableScheduledExecutorService;
                    obj.f9699b = context.getApplicationContext();
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
    public void b(fe.m mVar) {
        f();
    }

    public m c() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f9699b)) {
            if (!v7.k.b(this.f9698a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f9698a;
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
            int i11 = this.f9698a;
            if (i11 != 0) {
                z10 = v7.k.a(i11);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new m((String) this.f9699b, (String) this.f9700c, (String) this.d, this.f9698a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int d() {
        int i10 = this.f9698a;
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
        synchronized (this.f9699b) {
            try {
                if (((Looper) this.f9700c) == null) {
                    if (this.f9698a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    t6.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f9700c = ((HandlerThread) this.d).getLooper();
                }
                this.f9698a++;
                looper = (Looper) this.f9700c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void f() {
        float[] fArr = (float[]) this.f9699b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((fe.m) this.d).iterator();
        while (it.hasNext()) {
            fe.h hVar = (fe.h) it.next();
            fArr[((Integer) hVar.f7034a).intValue()] = hVar.c();
        }
        ((lg) this.f9700c).run();
    }

    public void g() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f9699b) {
            try {
                if (this.f9698a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t6.p(z10);
                int i10 = this.f9698a - 1;
                this.f9698a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f9700c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void h(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f9698a);
        int b10 = u7.b(this.f9698a, 1 << i10, z10);
        this.f9698a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((fe.m) this.d).l(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void i(Throwable th2) {
        z zVar = (z) this.d;
        if (th2 instanceof TimeoutException) {
            zVar.F(102, 28, c0.f3769p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            zVar.F(95, 28, c0.f3769p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f9700c).run();
    }

    public synchronized Task k(k kVar) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Queueing ".concat(kVar.toString()));
            }
            if (!((j) this.d).d(kVar)) {
                j jVar = new j(this);
                this.d = jVar;
                jVar.d(kVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return kVar.f9696b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: j6.m.onSuccess(java.lang.Object):void");
    }

    public m(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f9699b = str;
        this.f9698a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f9700c = unmodifiableList;
        this.d = bArr;
    }

    public m(int i10) {
        switch (i10) {
            case 5:
                this.f9699b = new Object();
                this.f9700c = null;
                this.d = null;
                this.f9698a = 0;
                return;
            case 8:
                e6 e6Var = new e6(true, true, true);
                this.d = e6Var;
                Paint paint = new Paint(1);
                e6Var.w(i0.L(13.0f));
                e6Var.u(-1);
                e6Var.x(i0.o());
                paint.setColor(i0.b.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f9699b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new t2(i0.L(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f9700c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new t2(i0.L(1.0f)), 0, 1, 0);
                return;
            default:
                this.f9699b = null;
                this.f9700c = null;
                this.d = null;
                this.f9698a = 0;
                return;
        }
    }
}
