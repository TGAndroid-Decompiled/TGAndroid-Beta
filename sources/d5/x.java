package d5;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.o0;
import com.google.android.gms.internal.cast.s5;
import com.google.android.gms.internal.cast.x0;
import com.google.android.gms.internal.cast.z0;
import com.google.android.gms.internal.play_billing.r1;
import com.google.android.gms.tasks.OnSuccessListener;
import g7.o7;
import h7.a8;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import m.f3;
import m.m1;
import org.telegram.ui.lg;
import r0.j0;

public final class x implements OnSuccessListener, ud.i {

    public static x f4848e;

    public int f4849a;

    public Object f4850b;

    public Object f4851c;
    public Object d;

    public x(ImageView imageView) {
        this.f4849a = 0;
        this.f4850b = imageView;
    }

    public static void a(x xVar, int i10) {
        synchronized (xVar.d) {
            try {
                if (xVar.f4849a == i10) {
                    return;
                }
                xVar.f4849a = i10;
                for (WeakReference weakReference : (CopyOnWriteArrayList) xVar.f4851c) {
                    com.google.android.exoplayer2.upstream.s sVar = (com.google.android.exoplayer2.upstream.s) weakReference.get();
                    if (sVar != null) {
                        sVar.a(i10);
                    } else {
                        ((CopyOnWriteArrayList) xVar.f4851c).remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized x f(Context context) {
        try {
            if (f4848e == null) {
                f4848e = new x(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f4848e;
    }

    @Override
    public void b() {
        i();
    }

    @Override
    public void c(ud.j jVar) {
        i();
    }

    public void d() {
        ImageView imageView = (ImageView) this.f4850b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            m1.a(drawable);
        }
        if (drawable != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 <= 21 && i10 == 21) {
                if (((f3) this.d) == null) {
                    this.d = new f3();
                }
                f3 f3Var = (f3) this.d;
                f3Var.f17321c = null;
                f3Var.f17320b = false;
                f3Var.d = null;
                f3Var.f17319a = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    f3Var.f17320b = true;
                    f3Var.f17321c = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    f3Var.f17319a = true;
                    f3Var.d = imageTintMode;
                }
                if (f3Var.f17320b || f3Var.f17319a) {
                    m.r.d(drawable, f3Var, imageView.getDrawableState());
                    return;
                }
            }
            f3 f3Var2 = (f3) this.f4851c;
            if (f3Var2 != null) {
                m.r.d(drawable, f3Var2, imageView.getDrawableState());
            }
        }
    }

    public u5.k e() {
        String strValueOf;
        if (TextUtils.isEmpty((String) this.f4850b)) {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
        if (r1.b(this.f4849a)) {
            int i10 = this.f4849a;
            boolean zA = i10 != 0 ? r1.a(i10) : false;
            if (TextUtils.isEmpty((String) this.d) && !zA) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            }
            if (TextUtils.isEmpty((String) this.d) || !zA) {
                return new u5.k((String) this.f4850b, (String) this.f4851c, (String) this.d, this.f4849a);
            }
            throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
        }
        StringBuilder sb2 = new StringBuilder("Authenticator combination is unsupported on API ");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(": ");
        int i11 = this.f4849a;
        if (i11 == 15) {
            strValueOf = "BIOMETRIC_STRONG";
        } else if (i11 == 255) {
            strValueOf = "BIOMETRIC_WEAK";
        } else if (i11 == 32768) {
            strValueOf = "DEVICE_CREDENTIAL";
        } else if (i11 != 32783) {
            strValueOf = i11 != 33023 ? String.valueOf(i11) : "BIOMETRIC_WEAK | DEVICE_CREDENTIAL";
        } else {
            strValueOf = "BIOMETRIC_STRONG | DEVICE_CREDENTIAL";
        }
        sb2.append(strValueOf);
        throw new IllegalArgumentException(sb2.toString());
    }

    public int g() {
        int i10;
        synchronized (this.d) {
            i10 = this.f4849a;
        }
        return i10;
    }

    public void h(AttributeSet attributeSet, int i10) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = (ImageView) this.f4850b;
        Context context = imageView.getContext();
        int[] iArr = f.a.f5578f;
        j9.a aVarG = j9.a.G(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) aVarG.f12864c;
        j0.j(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) aVarG.f12864c, i10);
        try {
            Drawable drawable3 = imageView.getDrawable();
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = o7.b(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                m1.a(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList colorStateListX = aVarG.x(2);
                int i11 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(colorStateListX);
                if (i11 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode modeB = m1.b(typedArray.getInt(3, -1), null);
                int i12 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(modeB);
                if (i12 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } finally {
            aVarG.I();
        }
    }

    public void i() {
        float[] fArr = (float[]) this.f4850b;
        Arrays.fill(fArr, 0.0f);
        for (ud.e eVar : (ud.j) this.d) {
            fArr[((Integer) eVar.f48505a).intValue()] = eVar.c();
        }
        ((lg) this.f4851c).run();
    }

    public void j(int i10, boolean z10, boolean z11) {
        int iNumberOfLeadingZeros = 31 - Integer.numberOfLeadingZeros(this.f4849a);
        int iB = a8.b(this.f4849a, 1 << i10, z10);
        this.f4849a = iB;
        int iNumberOfLeadingZeros2 = 31 - Integer.numberOfLeadingZeros(iB);
        if (iNumberOfLeadingZeros != iNumberOfLeadingZeros2) {
            ((ud.j) this.d).i(Integer.valueOf(iNumberOfLeadingZeros2), z11);
        }
    }

    public void k(Throwable th) {
        n2.x xVar = (n2.x) this.d;
        if (th instanceof TimeoutException) {
            xVar.F(102, 28, n2.a0.f18105p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "Asynchronous call to Billing Override Service timed out.", th);
        } else {
            xVar.F(95, 28, n2.a0.f18105p);
            com.google.android.gms.internal.play_billing.u.i("BillingClientTesting", "An error occurred while retrieving billing override.", th);
        }
        ((Runnable) this.f4851c).run();
    }

    @Override
    public void onSuccess(Object obj) {
        af.h hVar;
        o0 o0Var = (o0) this.f4850b;
        String str = (String) this.f4851c;
        int i10 = this.f4849a;
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        Bundle bundle = (Bundle) obj;
        n5.h hVar2 = o0Var.f3603a;
        y5.l.h(hVar2);
        com.google.android.gms.internal.cast.s sVar = o0Var.f3604b;
        if (i10 == 3) {
            com.google.android.gms.internal.cast.d dVar = o0Var.f3605c;
            hVar = new af.h();
            hVar.f274a = o0Var;
            hVar.f275b = dVar;
            hVar.f276c = str;
            hVar.f277e = new m4(hVar);
            hVar2.a(new m4(hVar));
            if (sVar != null) {
                x0 x0Var = new x0(hVar, 1);
                com.google.android.gms.internal.cast.s.f3644i.b("register callback = %s", x0Var);
                y5.l.e("Must be called from the main thread.");
                sVar.f3646b.add(x0Var);
            }
        } else if (i10 == 2) {
            i10 = 2;
            com.google.android.gms.internal.cast.d dVar2 = o0Var.f3605c;
            hVar = new af.h();
            hVar.f274a = o0Var;
            hVar.f275b = dVar2;
            hVar.f276c = str;
            hVar.f277e = new m4(hVar);
            hVar2.a(new m4(hVar));
            if (sVar != null) {
                x0 x0Var2 = new x0(hVar, 1);
                com.google.android.gms.internal.cast.s.f3644i.b("register callback = %s", x0Var2);
                y5.l.e("Must be called from the main thread.");
                sVar.f3646b.add(x0Var2);
            }
        }
        if (i10 == 1 || i10 == 2) {
            z0 z0Var = new z0(sharedPreferences, o0Var, o0Var.f3605c, bundle, str);
            hVar2.a(new s5(z0Var));
            if (sVar != null) {
                x0 x0Var3 = new x0(z0Var, 0);
                com.google.android.gms.internal.cast.s.f3644i.b("register callback = %s", x0Var3);
                y5.l.e("Must be called from the main thread.");
                sVar.f3646b.add(x0Var3);
            }
        }
    }

    public x(Context context) {
        this.f4850b = new Handler(Looper.getMainLooper());
        this.f4851c = new CopyOnWriteArrayList();
        this.d = new Object();
        this.f4849a = 0;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        g0.M(context, new androidx.mediarouter.app.f(this, 3), intentFilter);
    }

    public x() {
        this.f4850b = null;
        this.f4851c = null;
        this.d = null;
        this.f4849a = 0;
    }
}
