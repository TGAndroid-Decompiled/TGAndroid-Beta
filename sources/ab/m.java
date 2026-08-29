package ab;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bg.b3;
import com.google.firebase.messaging.FirebaseMessaging;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import l3.g0;
import lh.f3;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.cu;
import org.telegram.ui.Components.jr;
import org.telegram.ui.c1;
import org.telegram.ui.c5;
import org.telegram.ui.s4;
import org.telegram.ui.th;
import org.telegram.ui.v4;
import org.telegram.ui.x4;
import r0.b0;
import r0.j0;
public final class m {
    public static m f323e;
    public boolean f324a;
    public Object f325b;
    public Object f326c;
    public Object d;

    public m(View view) {
        cu[] cuVarArr = {new cu(), new cu(), new cu()};
        this.f325b = cuVarArr;
        this.d = new ArrayList();
        AnimatorSet animatorSet = new AnimatorSet();
        this.f326c = animatorSet;
        animatorSet.playTogether(g(cuVarArr[0], 0, 255, 0, 300), g(cuVarArr[1], 0, 255, 150, 300), g(cuVarArr[2], 0, 255, 300, 300), g(cuVarArr[0], 255, 0, 1000, 400), g(cuVarArr[1], 255, 0, 1000, 400), g(cuVarArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new f3(this, view));
    }

    public static void a(tb.e[][][] eVarArr, int i10, tb.e eVar) {
        tb.e[] eVarArr2 = eVarArr[i10 + eVar.d][eVar.f48203c];
        rb.d dVar = eVar.f48201a;
        int ordinal = dVar.ordinal();
        char c3 = 2;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        c3 = 0;
                    } else {
                        throw new IllegalStateException("Illegal mode " + dVar);
                    }
                } else {
                    c3 = 3;
                }
            } else {
                c3 = 1;
            }
        }
        tb.e eVar2 = eVarArr2[c3];
        if (eVar2 != null && eVar2.f48205f <= eVar.f48205f) {
            return;
        }
        eVarArr2[c3] = eVar;
    }

    public static boolean d(rb.d dVar, char c3) {
        int i10;
        int ordinal = dVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 6) {
                        return tb.c.b(String.valueOf(c3));
                    }
                    return false;
                }
            } else {
                int[] iArr = tb.c.f48196a;
                if (c3 < '`') {
                    i10 = iArr[c3];
                } else {
                    i10 = -1;
                }
                if (i10 == -1) {
                    return false;
                }
            }
        } else if (c3 < '0' || c3 > '9') {
            return false;
        }
        return true;
    }

    public static boolean e(x4 x4Var) {
        if (x4Var.f44453a == null && x4Var.f44454b == null) {
            return false;
        }
        return true;
    }

    public static m i() {
        if (f323e == null) {
            f323e = new Object();
        }
        return f323e;
    }

    public static rb.e j(int i10) {
        int b10 = m1.j.b(i10);
        if (b10 != 0) {
            if (b10 != 1) {
                return rb.e.c(40);
            }
            return rb.e.c(26);
        }
        return rb.e.c(9);
    }

    public void b(rb.e r13, tb.e[][][] r14, int r15, tb.e r16) {
        throw new UnsupportedOperationException("Method not decompiled: ab.m.b(rb.e, tb.e[][][], int, tb.e):void");
    }

    public void c(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f326c).start();
        }
        if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public int f(int i10, int i11, int i12) {
        boolean b10;
        nb.b bVar = (nb.b) this.f325b;
        if (this.f324a) {
            b10 = bVar.b(i11, i10);
        } else {
            b10 = bVar.b(i10, i11);
        }
        if (b10) {
            return (i12 << 1) | 1;
        }
        return i12 << 1;
    }

    public ValueAnimator g(cu cuVar, int i10, int i11, int i12, int i13) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i10, i11);
        ofInt.addUpdateListener(new b3(13, this, cuVar));
        ofInt.setDuration(i13);
        ofInt.setStartDelay(i12);
        ofInt.setInterpolator(jr.f29800f);
        return ofInt;
    }

    public g0 h(rb.e eVar) {
        int i10;
        String str = (String) this.f325b;
        int length = str.length();
        nb.e eVar2 = (nb.e) this.f326c;
        CharsetEncoder[] charsetEncoderArr = eVar2.f17216a;
        CharsetEncoder[] charsetEncoderArr2 = eVar2.f17216a;
        tb.e[][][] eVarArr = (tb.e[][][]) Array.newInstance(tb.e.class, length + 1, charsetEncoderArr.length, 4);
        b(eVar, eVarArr, 0, null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < charsetEncoderArr2.length; i12++) {
                for (int i13 = 0; i13 < 4; i13++) {
                    tb.e eVar3 = eVarArr[i11][i12][i13];
                    if (eVar3 != null && i11 < length) {
                        b(eVar, eVarArr, i11, eVar3);
                    }
                }
            }
        }
        int i14 = -1;
        int i15 = -1;
        int i16 = Integer.MAX_VALUE;
        for (int i17 = 0; i17 < charsetEncoderArr2.length; i17++) {
            for (int i18 = 0; i18 < 4; i18++) {
                tb.e eVar4 = eVarArr[length][i17][i18];
                if (eVar4 != null && (i10 = eVar4.f48205f) < i16) {
                    i14 = i17;
                    i15 = i18;
                    i16 = i10;
                }
            }
        }
        if (i14 >= 0) {
            return new g0(this, eVar, eVarArr[length][i14][i15]);
        }
        throw new Exception(a4.w.n("Internal error: failed to encode \"", str, "\""));
    }

    public synchronized void k() {
        try {
            if (this.f324a) {
                return;
            }
            Boolean m10 = m();
            this.f326c = m10;
            if (m10 == null) {
                ((a9.o) ((w9.b) this.f325b)).a(new a9.f(25));
            }
            this.f324a = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean l() {
        boolean h;
        try {
            k();
            Boolean bool = (Boolean) this.f326c;
            if (bool != null) {
                h = bool.booleanValue();
            } else {
                h = ((FirebaseMessaging) this.d).f5112a.h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return h;
    }

    public Boolean m() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        u8.g gVar = ((FirebaseMessaging) this.d).f5112a;
        gVar.a();
        Context context = gVar.f49131a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        if (sharedPreferences.contains("auto_init")) {
            return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            }
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public rb.c n() {
        rb.c cVar = (rb.c) this.d;
        if (cVar != null) {
            return cVar;
        }
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 6; i12++) {
            i11 = f(i12, 8, i11);
        }
        int f9 = f(8, 7, f(8, 8, f(7, 8, i11)));
        for (int i13 = 5; i13 >= 0; i13--) {
            f9 = f(8, i13, f9);
        }
        int i14 = ((nb.b) this.f325b).f17203b;
        int i15 = i14 - 7;
        for (int i16 = i14 - 1; i16 >= i15; i16--) {
            i10 = f(8, i16, i10);
        }
        for (int i17 = i14 - 8; i17 < i14; i17++) {
            i10 = f(i17, 8, i10);
        }
        rb.c a2 = rb.c.a(f9, i10);
        if (a2 == null) {
            a2 = rb.c.a(f9 ^ 21522, i10 ^ 21522);
        }
        this.d = a2;
        if (a2 != null) {
            return a2;
        }
        throw mb.c.a();
    }

    public rb.e o() {
        rb.e eVar = (rb.e) this.f326c;
        if (eVar != null) {
            return eVar;
        }
        int i10 = ((nb.b) this.f325b).f17203b;
        int i11 = (i10 - 17) / 4;
        if (i11 <= 6) {
            return rb.e.c(i11);
        }
        int i12 = i10 - 11;
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 5; i15 >= 0; i15--) {
            for (int i16 = i10 - 9; i16 >= i12; i16--) {
                i14 = f(i16, i15, i14);
            }
        }
        rb.e b10 = rb.e.b(i14);
        if (b10 != null && (b10.f47109a * 4) + 17 == i10) {
            this.f326c = b10;
            return b10;
        }
        for (int i17 = 5; i17 >= 0; i17--) {
            for (int i18 = i10 - 9; i18 >= i12; i18--) {
                i13 = f(i17, i18, i13);
            }
        }
        rb.e b11 = rb.e.b(i13);
        if (b11 != null && (b11.f47109a * 4) + 17 == i10) {
            this.f326c = b11;
            return b11;
        }
        throw mb.c.a();
    }

    public void p() {
        if (((rb.c) this.d) != null) {
            int i10 = m1.j.c(8)[((rb.c) this.d).f47096b];
            nb.b bVar = (nb.b) this.f325b;
            int i11 = bVar.f17203b;
            for (int i12 = 0; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i11; i13++) {
                    if (th.a(i10, i12, i13)) {
                        bVar.a(i13, i12);
                    }
                }
            }
        }
    }

    public void q(View view) {
        ArrayList arrayList = (ArrayList) this.d;
        arrayList.remove(view);
        if (arrayList.isEmpty()) {
            ((AnimatorSet) this.f326c).cancel();
        }
    }

    public boolean r(String str, String str2) {
        synchronized (this) {
            try {
                if (!((h9.d) ((AtomicMarkableReference) this.f325b).getReference()).c(str, str2)) {
                    return false;
                }
                AtomicMarkableReference atomicMarkableReference = (AtomicMarkableReference) this.f325b;
                atomicMarkableReference.set((h9.d) atomicMarkableReference.getReference(), true);
                h9.o oVar = new h9.o(this, 1);
                AtomicReference atomicReference = (AtomicReference) this.d;
                while (!atomicReference.compareAndSet(null, oVar)) {
                    if (atomicReference.get() != null) {
                        return true;
                    }
                }
                ((com.google.firebase.messaging.s) ((s3) this.f326c).f16689b).Q(oVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void s(ViewGroup viewGroup, c6 c6Var, x4 x4Var, v4 v4Var) {
        Objects.requireNonNull(viewGroup);
        Context context = viewGroup.getContext();
        if (((ViewGroup) this.f325b) != viewGroup) {
            if (this.f324a) {
                int i10 = c5.B;
                ((s4) this.d).b(false);
            }
            this.f325b = viewGroup;
            this.f326c = (WindowManager) f0.e.f(context, WindowManager.class);
            s4 s4Var = new s4(this, context, c6Var, v4Var);
            this.d = s4Var;
            c1 c1Var = new c1(this, 3);
            WeakHashMap weakHashMap = j0.f46829a;
            b0.j(s4Var, c1Var);
        }
        ((s4) this.d).a(x4Var);
        if (!this.f324a) {
            if (((s4) this.d).getParent() != null) {
                ((WindowManager) this.f326c).removeView((s4) this.d);
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1000, 0, -3);
            layoutParams.softInputMode = 16;
            layoutParams.flags |= -1945959040;
            AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
            AndroidUtilities.setPreferredMaxRefreshRate((WindowManager) this.f326c, (s4) this.d, layoutParams);
            ((WindowManager) this.f326c).addView((s4) this.d, layoutParams);
            viewGroup.requestDisallowInterceptTouchEvent(true);
            this.f324a = true;
        }
    }

    public void t(Runnable runnable, Executor executor) {
        synchronized (this.f325b) {
            try {
                if (this.f324a) {
                    ((ArrayDeque) this.f326c).add(new w(runnable, executor));
                    return;
                }
                this.f324a = true;
                w(runnable, executor);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void u(SpannableString spannableString, int i10) {
        cu[] cuVarArr = (cu[]) this.f325b;
        int i11 = i10 + 1;
        spannableString.setSpan(cuVarArr[0], i10, i11, 0);
        int i12 = i10 + 2;
        spannableString.setSpan(cuVarArr[1], i11, i12, 0);
        spannableString.setSpan(cuVarArr[2], i12, i10 + 3, 0);
    }

    public void v() {
        synchronized (this.f325b) {
            try {
                if (((ArrayDeque) this.f326c).isEmpty()) {
                    this.f324a = false;
                    return;
                }
                w wVar = (w) ((ArrayDeque) this.f326c).remove();
                w(wVar.f348b, wVar.f347a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void w(Runnable runnable, Executor executor) {
        try {
            executor.execute(new o(3, this, runnable));
        } catch (RejectedExecutionException unused) {
            v();
        }
    }

    public m(s3 s3Var, boolean z10) {
        this.f326c = s3Var;
        this.d = new AtomicReference(null);
        this.f324a = z10;
        this.f325b = new AtomicMarkableReference(new h9.d(z10 ? 8192 : 1024), false);
    }
}
