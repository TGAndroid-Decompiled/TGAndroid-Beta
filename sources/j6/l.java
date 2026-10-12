package j6;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c5.e0;
import c5.h0;
import c5.x;
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
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.r6;
import org.telegram.ui.xg;
import v7.u6;
import w7.m6;
public final class l implements OnSuccessListener, ne.k {
    public static l e;
    public int f12872a;
    public Object f12873b;
    public Object f12874c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f12872a = i10;
        this.d = str;
        this.f12873b = arrayList;
        this.f12874c = arrayList2;
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
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new x("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new j(obj);
                    obj.f12872a = 1;
                    obj.f12874c = unconfigurableScheduledExecutorService;
                    obj.f12873b = context.getApplicationContext();
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
        if (!TextUtils.isEmpty((String) this.f12873b)) {
            if (!v7.k.b(this.f12872a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f12872a;
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
            int i11 = this.f12872a;
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
            return new l((String) this.f12873b, (String) this.f12874c, (String) this.d, this.f12872a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int b() {
        int i10 = this.f12872a;
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
        synchronized (this.f12873b) {
            try {
                if (((Looper) this.f12874c) == null) {
                    if (this.f12872a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    u6.p(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f12874c = ((HandlerThread) this.d).getLooper();
                }
                this.f12872a++;
                looper = (Looper) this.f12874c;
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
        float[] fArr = (float[]) this.f12873b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((ne.l) this.d).iterator();
        while (it.hasNext()) {
            ne.g gVar = (ne.g) it.next();
            fArr[((Integer) gVar.f16302a).intValue()] = gVar.c();
        }
        ((xg) this.f12874c).run();
    }

    public void h() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f12873b) {
            try {
                if (this.f12872a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                int i10 = this.f12872a - 1;
                this.f12872a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f12874c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f12872a);
        int b10 = m6.b(this.f12872a, 1 << i10, z10);
        this.f12872a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((ne.l) this.d).h(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        e0 e0Var = (e0) this.d;
        if (th2 instanceof TimeoutException) {
            e0Var.F(102, 28, h0.f4380p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            e0Var.F(95, 28, h0.f4380p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f12874c).run();
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
        return kVar.f12870b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.onSuccess(java.lang.Object):void");
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f12873b = obj;
        this.f12874c = obj2;
        this.d = obj3;
        this.f12872a = i10;
    }

    public l(android.content.Context r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.<init>(android.content.Context, java.lang.String):void");
    }

    public l(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f12873b = str;
        this.f12872a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f12874c = unmodifiableList;
        this.d = bArr;
    }

    public l(int i10) {
        switch (i10) {
            case 3:
                r6 r6Var = new r6(true, true, true);
                this.d = r6Var;
                Paint paint = new Paint(1);
                r6Var.w(AndroidUtilities.dp(13.0f));
                r6Var.u(-1);
                r6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f12873b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f12874c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
            case 7:
                this.f12873b = new Object();
                this.f12874c = null;
                this.d = null;
                this.f12872a = 0;
                return;
            default:
                this.f12873b = null;
                this.f12874c = null;
                this.d = null;
                this.f12872a = 0;
                return;
        }
    }
}
