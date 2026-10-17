package j6;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c5.d0;
import c5.g0;
import c5.w;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.io.DataInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Components.p6;
import org.telegram.ui.mg;
import v7.u6;
import w7.m6;
public final class l implements OnSuccessListener, ne.k {
    public static l e;
    public int f14283a;
    public Object f14284b;
    public Object f14285c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f14283a = i10;
        this.d = str;
        this.f14284b = arrayList;
        this.f14285c = arrayList2;
    }

    public static float[] g(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        float[] fArr = new float[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            fArr[i10] = dataInputStream.readFloat();
        }
        return fArr;
    }

    public static synchronized l k(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new j(obj);
                    obj.f14283a = 1;
                    obj.f14285c = unconfigurableScheduledExecutorService;
                    obj.f14284b = context.getApplicationContext();
                    e = obj;
                }
                lVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    public l a() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f14284b)) {
            if (!v7.k.b(this.f14283a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f14283a;
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
            int i11 = this.f14283a;
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
            return new l((String) this.f14284b, (String) this.f14285c, (String) this.d, this.f14283a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int b() {
        int i10 = this.f14283a;
        if (i10 != 2) {
            if (i10 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    @Override
    public void c() {
        f();
    }

    public Looper d() {
        Looper looper;
        boolean z10;
        synchronized (this.f14284b) {
            try {
                if (((Looper) this.f14285c) == null) {
                    if (this.f14283a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f14285c = ((HandlerThread) this.d).getLooper();
                }
                this.f14283a++;
                looper = (Looper) this.f14285c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    @Override
    public void e(ne.l lVar) {
        f();
    }

    public void f() {
        float[] fArr = (float[]) this.f14284b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((ne.l) this.d).iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            fArr[((Integer) gVar.f17389a).intValue()] = gVar.c();
        }
        ((mg) this.f14285c).run();
    }

    public void h() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f14284b) {
            try {
                if (this.f14283a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                int i10 = this.f14283a - 1;
                this.f14283a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f14285c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f14283a);
        int b10 = m6.b(this.f14283a, 1 << i10, z10);
        this.f14283a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((ne.l) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        d0 d0Var = (d0) this.d;
        if (th2 instanceof TimeoutException) {
            d0Var.F(102, 28, g0.f4748p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            d0Var.F(95, 28, g0.f4748p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f14285c).run();
    }

    public synchronized Task l(k kVar) {
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
        return kVar.f14281b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.onSuccess(java.lang.Object):void");
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f14284b = obj;
        this.f14285c = obj2;
        this.d = obj3;
        this.f14283a = i10;
    }

    public l(android.content.Context r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.<init>(android.content.Context, java.lang.String):void");
    }

    public l(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f14284b = str;
        this.f14283a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f14285c = unmodifiableList;
        this.d = bArr;
    }

    public l(int i10) {
        switch (i10) {
            case 5:
                p6 p6Var = new p6(true, true, true);
                this.d = p6Var;
                Paint paint = new Paint(1);
                p6Var.w(AndroidUtilities.dp(13.0f));
                p6Var.u(-1);
                p6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.b.o(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f14284b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f14285c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new p2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
            case 6:
            default:
                this.f14284b = null;
                this.f14285c = null;
                this.d = null;
                this.f14283a = 0;
                return;
            case 7:
                this.f14284b = new Object();
                this.f14285c = null;
                this.d = null;
                this.f14283a = 0;
                return;
        }
    }
}
