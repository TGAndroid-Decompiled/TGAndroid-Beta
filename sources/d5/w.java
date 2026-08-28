package d5;

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
import f7.t7;
import g7.z7;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import m.f3;
import m.m1;
import org.telegram.ui.jg;
import r0.j0;
public final class w implements OnSuccessListener, td.i {
    public static w f4400e;
    public int f4401a;
    public Object f4402b;
    public Object f4403c;
    public Object d;

    public w(ImageView imageView) {
        this.f4401a = 0;
        this.f4402b = imageView;
    }

    public static void a(w wVar, int i9) {
        synchronized (wVar.d) {
            try {
                if (wVar.f4401a == i9) {
                    return;
                }
                wVar.f4401a = i9;
                Iterator it = ((CopyOnWriteArrayList) wVar.f4403c).iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i9);
                    } else {
                        ((CopyOnWriteArrayList) wVar.f4403c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized w f(Context context) {
        w wVar;
        synchronized (w.class) {
            try {
                if (f4400e == null) {
                    f4400e = new w(context);
                }
                wVar = f4400e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return wVar;
    }

    @Override
    public void b() {
        i();
    }

    @Override
    public void c(td.j jVar) {
        i();
    }

    public void d() {
        ImageView imageView = (ImageView) this.f4402b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i9 = Build.VERSION.SDK_INT;
            if (i9 <= 21 && i9 == 21) {
                if (((f3) this.d) == null) {
                    this.d = new Object();
                }
                f3 f3Var = (f3) this.d;
                f3Var.f16946c = null;
                f3Var.f16945b = false;
                f3Var.d = null;
                f3Var.f16944a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    f3Var.f16945b = true;
                    f3Var.f16946c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    f3Var.f16944a = true;
                    f3Var.d = imageTintMode;
                }
                if (f3Var.f16945b || f3Var.f16944a) {
                    m.r.d(drawable, f3Var, imageView.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.f4403c;
            if (f3Var2 != null) {
                m.r.d(drawable, f3Var2, imageView.getDrawableState());
            }
        }
    }

    public t5.l e() {
        boolean z10;
        String str;
        if (!TextUtils.isEmpty((String) this.f4402b)) {
            if (!f7.m.b(this.f4401a)) {
                StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
                sb2.append(Build.VERSION.SDK_INT);
                sb2.append(": ");
                int i9 = this.f4401a;
                if (i9 != 15) {
                    if (i9 != 255) {
                        if (i9 != 32768) {
                            if (i9 != 32783) {
                                if (i9 != 33023) {
                                    str = String.valueOf(i9);
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
            int i10 = this.f4401a;
            if (i10 != 0) {
                z10 = f7.m.a(i10);
            } else {
                z10 = false;
            }
            if (TextUtils.isEmpty((String) this.d) && !z10) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (!TextUtils.isEmpty((String) this.d) && z10) {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
            return new t5.l((String) this.f4402b, (String) this.f4403c, (String) this.d, this.f4401a);
        }
        throw new IllegalArgumentException("Title must be set and non-empty.");
    }

    public int g() {
        int i9;
        synchronized (this.d) {
            i9 = this.f4401a;
        }
        return i9;
    }

    public void h(AttributeSet attributeSet, int i9) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f4402b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f5273f;
        j4.c E = j4.c.E(context, attributeSet, iArr, i9);
        TypedArray typedArray = (TypedArray) E.f13432c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) E.f13432c, i9);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = t7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList v = E.v(2);
                int i10 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(v);
                if (i10 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode b10 = m1.b(typedArray.getInt(3, -1), null);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(b10);
                if (i11 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            E.G();
        } catch (Throwable th) {
            E.G();
            throw th;
        }
    }

    public void i() {
        float[] fArr = (float[]) this.f4402b;
        Arrays.fill(fArr, 0.0f);
        Iterator it = ((td.j) this.d).iterator();
        while (it.hasNext()) {
            td.e eVar = (td.e) it.next();
            fArr[((Integer) eVar.f47783a).intValue()] = eVar.c();
        }
        ((jg) this.f4403c).run();
    }

    public void j(int i9, boolean z10, boolean z11) {
        int numberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f4401a);
        int b10 = z7.b(this.f4401a, 1 << i9, z10);
        this.f4401a = b10;
        int numberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(b10);
        if (numberOfLeadingZeros != numberOfLeadingZeros2) {
            ((td.j) this.d).i(Integer.valueOf(numberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th) {
        n2.y yVar = (n2.y) this.d;
        if (th instanceof TimeoutException) {
            yVar.F(102, 28, n2.b0.f18302p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            yVar.F(95, 28, n2.b0.f18302p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f4403c).run();
    }

    @Override
    public void onSuccess(java.lang.Object r15) {
        throw new UnsupportedOperationException("Method not decompiled: d5.w.onSuccess(java.lang.Object):void");
    }

    public w(Context context) {
        this.f4402b = new Handler(Looper.getMainLooper());
        this.f4403c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f4401a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        f0.M(context, new androidx.mediarouter.app.h(this, 3), intentFilter);
    }

    public w() {
        this.f4402b = null;
        this.f4403c = null;
        this.d = null;
        this.f4401a = 0;
    }
}
