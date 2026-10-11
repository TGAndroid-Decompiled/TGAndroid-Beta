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
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.q6;
import org.telegram.ui.sg;
import w7.g0;
public final class l implements OnSuccessListener, me.k {
    public static l f14059e;
    public int f14060a;
    public Object f14061b;
    public Object f14062c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f14060a = i10;
        this.d = str;
        this.f14061b = arrayList;
        this.f14062c = arrayList2;
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
                if (f14059e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new w("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new j(obj);
                    obj.f14060a = 1;
                    obj.f14062c = unconfigurableScheduledExecutorService;
                    obj.f14061b = context.getApplicationContext();
                    f14059e = obj;
                }
                lVar = f14059e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override
    public void a() {
        f();
    }

    public l b() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f14061b)) {
            if (!te.b.c(this.f14060a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f14060a;
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
            int i11 = this.f14060a;
            if (i11 != 0) {
                z10 = te.b.b(i11);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new l((String) this.f14061b, (String) this.f14062c, (String) this.d, this.f14060a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    @Override
    public void c(me.l lVar) {
        f();
    }

    public int d() {
        int i10 = this.f14060a;
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
        synchronized (this.f14061b) {
            try {
                if (((Looper) this.f14062c) == null) {
                    if (this.f14060a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f14062c = ((HandlerThread) this.d).getLooper();
                }
                this.f14060a++;
                looper = (Looper) this.f14062c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void f() {
        float[] fArr = (float[]) this.f14061b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((me.l) this.d).iterator();
        while (it.hasNext()) {
            me.g gVar = (me.g) it.next();
            fArr[((Integer) gVar.f16376a).intValue()] = gVar.c();
        }
        ((sg) this.f14062c).run();
    }

    public void h() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f14061b) {
            try {
                if (this.f14060a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                int i10 = this.f14060a - 1;
                this.f14060a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f14062c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void i(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f14060a);
        int b10 = g0.b(this.f14060a, 1 << i10, z10);
        this.f14060a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((me.l) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void j(Throwable th2) {
        d0 d0Var = (d0) this.d;
        if (th2 instanceof TimeoutException) {
            d0Var.F(102, 28, c5.g0.f4252p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            d0Var.F(95, 28, c5.g0.f4252p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f14062c).run();
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
        return kVar.f14056b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.onSuccess(java.lang.Object):void");
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f14061b = obj;
        this.f14062c = obj2;
        this.d = obj3;
        this.f14060a = i10;
    }

    public l(android.content.Context r12, java.lang.String r13) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.<init>(android.content.Context, java.lang.String):void");
    }

    public l(int i10) {
        switch (i10) {
            case 2:
                this.f14061b = null;
                this.f14062c = null;
                this.d = null;
                this.f14060a = 0;
                return;
            case 8:
                this.f14061b = new Object();
                this.f14062c = null;
                this.d = null;
                this.f14060a = 0;
                return;
            default:
                q6 q6Var = new q6(true, true, true);
                this.d = q6Var;
                Paint paint = new Paint(1);
                q6Var.w(AndroidUtilities.dp(13.0f));
                q6Var.u(-1);
                q6Var.x(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f14061b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f14062c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
        }
    }

    public l(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f14061b = str;
        this.f14060a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f14062c = unmodifiableList;
        this.d = bArr;
    }
}
