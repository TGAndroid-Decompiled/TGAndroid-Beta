package j6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import c5.c0;
import c5.f0;
import c5.v;
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
import m.c3;
import m.l1;
import m.q;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.q2;
import org.telegram.ui.Components.n6;
import org.telegram.ui.ug;
import r0.i0;
import v7.w7;
import w7.d0;
public final class l implements OnSuccessListener, le.k {
    public static l e;
    public int f12911a;
    public Object f12912b;
    public Object f12913c;
    public Object d;

    public l(int i10, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f12911a = i10;
        this.d = str;
        this.f12912b = arrayList;
        this.f12913c = arrayList2;
    }

    public static synchronized l l(Context context) {
        l lVar;
        synchronized (l.class) {
            try {
                if (e == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new v("MessengerIpcClient")));
                    ?? obj = new Object();
                    obj.d = new j(obj);
                    obj.f12911a = 1;
                    obj.f12913c = unconfigurableScheduledExecutorService;
                    obj.f12912b = context.getApplicationContext();
                    e = obj;
                }
                lVar = e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lVar;
    }

    @Override
    public void a() {
        h();
    }

    public void b() {
        ImageView imageView = (ImageView) this.f12912b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            l1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((c3) this.d) == null) {
                    this.d = new Object();
                }
                c3 c3Var = (c3) this.d;
                c3Var.f14384c = null;
                c3Var.f14383b = false;
                c3Var.d = null;
                c3Var.f14382a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    c3Var.f14383b = true;
                    c3Var.f14384c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    c3Var.f14382a = true;
                    c3Var.d = imageTintMode;
                }
                if (c3Var.f14383b || c3Var.f14382a) {
                    q.d(drawable, c3Var, imageView.getDrawableState());
                    return;
                }
            }
            c3 c3Var2 = (c3) this.f12913c;
            if (c3Var2 != null) {
                q.d(drawable, c3Var2, imageView.getDrawableState());
            }
        }
    }

    @Override
    public void c(le.l lVar) {
        h();
    }

    public l d() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f12912b)) {
            if (!v7.m.b(this.f12911a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f12911a;
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
            int i11 = this.f12911a;
            if (i11 != 0) {
                z10 = v7.m.a(i11);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new l((String) this.f12912b, (String) this.f12913c, (String) this.d, this.f12911a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int e() {
        int i10 = this.f12911a;
        if (i10 != 2) {
            if (i10 != 3) {
                return 0;
            }
            return 512;
        }
        return 2048;
    }

    public void f(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f12912b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f8768f;
        lf.h Q = lf.h.Q(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) Q.f14231c;
        i0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) Q.f14231c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = w7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                l1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList D = Q.D(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(D);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = l1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            Q.R();
        } catch (Throwable th2) {
            Q.R();
            throw th2;
        }
    }

    public Looper g() {
        Looper looper;
        boolean z10;
        synchronized (this.f12912b) {
            try {
                if (((Looper) this.f12913c) == null) {
                    if (this.f12911a == 0 && ((HandlerThread) this.d) == null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    e2.d.g(z10);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.d = handlerThread;
                    handlerThread.start();
                    this.f12913c = ((HandlerThread) this.d).getLooper();
                }
                this.f12911a++;
                looper = (Looper) this.f12913c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return looper;
    }

    public void h() {
        float[] fArr = (float[]) this.f12912b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((le.l) this.d).iterator();
        while (it.hasNext()) {
            le.g gVar = (le.g) it.next();
            fArr[((Integer) gVar.f14194a).intValue()] = gVar.c();
        }
        ((ug) this.f12913c).run();
    }

    public void i() {
        boolean z10;
        HandlerThread handlerThread;
        synchronized (this.f12912b) {
            try {
                if (this.f12911a > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                int i10 = this.f12911a - 1;
                this.f12911a = i10;
                if (i10 == 0 && (handlerThread = (HandlerThread) this.d) != null) {
                    handlerThread.quit();
                    this.d = null;
                    this.f12913c = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void j(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f12911a);
        int b10 = d0.b(this.f12911a, 1 << i10, z10);
        this.f12911a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((le.l) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th2) {
        c0 c0Var = (c0) this.d;
        if (th2 instanceof TimeoutException) {
            c0Var.F(102, 28, f0.f3887p);
            u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            c0Var.F(95, 28, f0.f3887p);
            u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f12913c).run();
    }

    public synchronized Task m(k kVar) {
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
        return kVar.f12909b.getTask();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: j6.l.onSuccess(java.lang.Object):void");
    }

    public l(Object obj, Object obj2, Object obj3, int i10) {
        this.f12912b = obj;
        this.f12913c = obj2;
        this.d = obj3;
        this.f12911a = i10;
    }

    public l(int i10) {
        switch (i10) {
            case 2:
                this.f12912b = null;
                this.f12913c = null;
                this.d = null;
                this.f12911a = 0;
                return;
            case 8:
                this.f12912b = new Object();
                this.f12913c = null;
                this.d = null;
                this.f12911a = 0;
                return;
            default:
                n6 n6Var = new n6(true, true, true, false);
                this.d = n6Var;
                Paint paint = new Paint(1);
                n6Var.t(AndroidUtilities.dp(13.0f));
                n6Var.r(-1);
                n6Var.u(AndroidUtilities.bold());
                paint.setColor(i0.a.k(-16777216, 58));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                this.f12912b = spannableStringBuilder;
                spannableStringBuilder.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                this.f12913c = spannableStringBuilder2;
                spannableStringBuilder2.append((CharSequence) " ").setSpan(new q2(AndroidUtilities.dp(1.0f)), 0, 1, 0);
                return;
        }
    }

    public l(ImageView imageView) {
        this.f12911a = 0;
        this.f12912b = imageView;
    }

    public l(int i10, String str, int i11, ArrayList arrayList, byte[] bArr) {
        List unmodifiableList;
        this.f12912b = str;
        this.f12911a = i11;
        if (arrayList == null) {
            unmodifiableList = Collections.EMPTY_LIST;
        } else {
            unmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        }
        this.f12913c = unmodifiableList;
        this.d = bArr;
    }
}
