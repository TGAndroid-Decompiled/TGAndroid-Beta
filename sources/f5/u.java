package f5;

import android.content.Context;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.tasks.OnSuccessListener;
import h7.s7;
import i7.n8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import l3.g0;
import m.f3;
import m.m1;
import org.telegram.ui.ig;
import r0.j0;
public final class u implements OnSuccessListener, vd.j {
    public static u f6630e;
    public int f6631a;
    public Object f6632b;
    public Object f6633c;
    public Object d;

    public u(ImageView imageView) {
        this.f6631a = 0;
        this.f6632b = imageView;
    }

    public static void c(u uVar, int i10) {
        synchronized (uVar.d) {
            try {
                if (uVar.f6631a == i10) {
                    return;
                }
                uVar.f6631a = i10;
                Iterator it = ((CopyOnWriteArrayList) uVar.f6633c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) uVar.f6633c).remove(weakReference);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static synchronized u f(Context context) {
        u uVar;
        synchronized (u.class) {
            try {
                if (f6630e == null) {
                    f6630e = new u(context);
                }
                uVar = f6630e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return uVar;
    }

    @Override
    public void a() {
        i();
    }

    @Override
    public void b(vd.k kVar) {
        i();
    }

    public void d() {
        ImageView imageView = (ImageView) this.f6632b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((f3) this.d) == null) {
                    this.d = new Object();
                }
                f3 f3Var = (f3) this.d;
                f3Var.f16545c = null;
                f3Var.f16544b = false;
                f3Var.d = null;
                f3Var.f16543a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    f3Var.f16544b = true;
                    f3Var.f16545c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    f3Var.f16543a = true;
                    f3Var.d = imageTintMode;
                }
                if (f3Var.f16544b || f3Var.f16543a) {
                    m.r.d(drawable, f3Var, imageView.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.f6633c;
            if (f3Var2 != null) {
                m.r.d(drawable, f3Var2, imageView.getDrawableState());
            }
        }
    }

    public v5.l e() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f6632b)) {
            if (!h7.u.b(this.f6631a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i10 = this.f6631a;
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
            int i11 = this.f6631a;
            if (i11 != 0) {
                z10 = h7.u.a(i11);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new v5.l((String) this.f6632b, (String) this.f6633c, (String) this.d, this.f6631a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int g() {
        int i10;
        synchronized (this.d) {
            i10 = this.f6631a;
        }
        return i10;
    }

    public void h(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f6632b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f6235f;
        g0 z10 = g0.z(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) z10.f14097c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) z10.f14097c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = s7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList p10 = z10.p(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(p10);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            z10.B();
        } catch (Throwable th2) {
            z10.B();
            throw th2;
        }
    }

    public void i() {
        float[] fArr = (float[]) this.f6632b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((vd.k) this.d).iterator();
        while (it.hasNext()) {
            vd.f fVar = (vd.f) it.next();
            fArr[((Integer) fVar.f49514a).intValue()] = fVar.c();
        }
        ((ig) this.f6633c).run();
    }

    public void j(int i10, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f6631a);
        int b10 = n8.b(this.f6631a, 1 << i10, z10);
        this.f6631a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((vd.k) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th2) {
        p2.w wVar = (p2.w) this.d;
        if (th2 instanceof TimeoutException) {
            wVar.F(102, 28, p2.z.f45512p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th2);
        } else {
            wVar.F(95, 28, p2.z.f45512p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th2);
        }
        ((Runnable) this.f6633c).run();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: f5.u.onSuccess(java.lang.Object):void");
    }

    public u(Context context) {
        this.f6632b = new Handler(Looper.getMainLooper());
        this.f6633c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f6631a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        d0.M(context, new af.c(this, 4), intentFilter);
    }

    public u() {
        this.f6632b = null;
        this.f6633c = null;
        this.d = null;
        this.f6631a = 0;
    }
}
