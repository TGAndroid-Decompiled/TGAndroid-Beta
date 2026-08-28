package g5;

import a5.m;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.biometric.j;
import c2.t;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import g7.oa;
import h3.n1;
import h3.o1;
import h3.p1;
import h3.r1;
import h3.s1;
import ih.i4;
import ih.l9;
import ih.m9;
import j4.a1;
import j4.d0;
import j4.i0;
import j4.q;
import j4.y;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kb.e;
import l3.g;
import m3.k;
import m3.w;
import m5.f0;
import mc.i;
import n2.a0;
import n2.d;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import q5.f;
import q5.x;
import r0.j0;
import r0.m1;
import r0.o;
import x5.l;
public final class b implements i0, g, kd.b, s0, OnCompleteListener, o, s, m9.a, je.b, a0, b6 {
    public final int f7110a;
    public Object f7111b;
    public Object f7112c;

    public b(int i9) {
        this.f7110a = i9;
    }

    public static String i(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public static String v(b bVar) {
        Collection<String> collection = (Collection) bVar.f7111b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.f7112c;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z10 = true;
                for (String str2 : collection) {
                    q5.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!q5.a.f46007a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i9 = 0; i9 < str2.length(); i9++) {
                            char charAt = str2.charAt(i9);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public void A(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7111b);
            t10.c();
            x3.p((x3) t10.f3691b, l3Var);
            ((t) this.f7112c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7111b);
            t10.c();
            x3.r((x3) t10.f3691b, a4Var);
            ((t) this.f7112c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f7111b);
            t10.c();
            x3.s((x3) t10.f3691b, b4Var);
            ((t) this.f7112c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public Object D(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        i4.a aVar = (i4.a) ((s0) this.f7111b).D(uri, oVar);
        List list = (List) this.f7112c;
        if (list != null && !list.isEmpty()) {
            return (i4.a) aVar.a(list);
        }
        return aVar;
    }

    public void E(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f3691b, g3Var);
            ((t) this.f7112c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void F(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f3691b, i3Var);
            ((t) this.f7112c).h((x3) t10.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public ColorFilter H() {
        return f6.f23317v3;
    }

    @Override
    public m1 L0(View view, m1 m1Var) {
        m2.g gVar = (m2.g) this.f7112c;
        m1 h = j0.h(view, m1Var);
        if (h.f46929a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f7111b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            m1 b10 = j0.b(gVar.getChildAt(i9), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public int N0(int i9) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f7111b;
        int indexOfKey = sparseIntArray.indexOfKey(i9);
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return f6.w0(null, i9, false);
    }

    @Override
    public Paint O(String str) {
        return f6.S0(str);
    }

    @Override
    public boolean a() {
        return f6.I.q();
    }

    @Override
    public je.a a1(we.b bVar) {
        int i9;
        List list = (List) this.f7112c;
        List list2 = (List) bVar.f48793b;
        if (list2 != null) {
            i9 = list2.size();
        } else {
            i9 = 0;
        }
        if (i9 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i9);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(bVar, (List) this.f7111b, list);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        f0 f0Var = (f0) this.f7111b;
        String str = (String) this.f7112c;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (f0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        l.j("Not connected to device", z10);
        f fVar = (f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (f0Var.f17401s) {
            try {
                if (f0Var.f17398p != null) {
                    taskCompletionSource.setException(l.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.f17398p = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void b(int i9, d0 d0Var, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new o1(this, n10, yVar, 0));
        }
    }

    @Override
    public void c(int i9, d0 d0Var, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new o1(this, n10, yVar, 1));
        }
    }

    @Override
    public void d(int i9, d0 d0Var, q qVar, y yVar, IOException iOException, boolean z10) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new p1(this, n10, qVar, yVar, iOException, z10, 0));
        }
    }

    @Override
    public void e(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new n1(this, n10, qVar, yVar, 2));
        }
    }

    @Override
    public void f(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new n1(this, n10, qVar, yVar, 1));
        }
    }

    @Override
    public void g(int i9, d0 d0Var, q qVar, y yVar) {
        Pair n10 = n(i9, d0Var);
        if (n10 != null) {
            ((s1) this.f7112c).f9722i.c(new n1(this, n10, qVar, yVar, 0));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    public d h() {
        if (((n2.l) this.f7111b) != null) {
            return new d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean j(int i9) {
        return ((d5.g) this.f7111b).f4361a.get(i9);
    }

    @Override
    public StackTraceElement[] k(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        m9.a[] aVarArr = (m9.a[]) this.f7111b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i9 = 0; i9 < 1; i9++) {
            m9.a aVar = aVarArr[i9];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.k(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((v9.d) this.f7112c).k(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public na.n l(sa.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: g5.b.l(sa.a):na.n");
    }

    public lb.b m() {
        if (((lb.b) this.f7112c) == null) {
            lb.f fVar = (lb.f) this.f7111b;
            int[] iArr = fVar.f16753c;
            kb.d dVar = fVar.f16751a;
            int i9 = dVar.f14733a;
            int i10 = dVar.f14734b;
            lb.b bVar = new lb.b(i9, i10);
            if (fVar.f16752b.length < i9) {
                fVar.f16752b = new byte[i9];
            }
            for (int i11 = 0; i11 < 32; i11++) {
                iArr[i11] = 0;
            }
            for (int i12 = 1; i12 < 5; i12++) {
                byte[] b10 = dVar.b((i10 * i12) / 5, fVar.f16752b);
                int i13 = (i9 * 4) / 5;
                for (int i14 = i9 / 5; i14 < i13; i14++) {
                    int i15 = (b10[i14] & 255) >> 3;
                    iArr[i15] = iArr[i15] + 1;
                }
            }
            int length = iArr.length;
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < length; i19++) {
                int i20 = iArr[i19];
                if (i20 > i16) {
                    i18 = i19;
                    i16 = i20;
                }
                if (i20 > i17) {
                    i17 = i20;
                }
            }
            int i21 = 0;
            int i22 = 0;
            for (int i23 = 0; i23 < length; i23++) {
                int i24 = i23 - i18;
                int i25 = iArr[i23] * i24 * i24;
                if (i25 > i22) {
                    i21 = i23;
                    i22 = i25;
                }
            }
            if (i18 <= i21) {
                int i26 = i18;
                i18 = i21;
                i21 = i26;
            }
            if (i18 - i21 > length / 16) {
                int i27 = i18 - 1;
                int i28 = i27;
                int i29 = -1;
                while (i27 > i21) {
                    int i30 = i27 - i21;
                    int i31 = (i17 - iArr[i27]) * (i18 - i27) * i30 * i30;
                    if (i31 > i29) {
                        i28 = i27;
                        i29 = i31;
                    }
                    i27--;
                }
                int i32 = i28 << 3;
                byte[] a2 = dVar.a();
                for (int i33 = 0; i33 < i10; i33++) {
                    int i34 = i33 * i9;
                    for (int i35 = 0; i35 < i9; i35++) {
                        if ((a2[i34 + i35] & 255) < i32) {
                            int i36 = (i35 / 32) + (bVar.f16737c * i33);
                            int[] iArr2 = bVar.d;
                            iArr2[i36] = iArr2[i36] | (1 << (i35 & 31));
                        }
                    }
                }
                this.f7112c = bVar;
            } else {
                throw e.a();
            }
        }
        return (lb.b) this.f7112c;
    }

    public Pair n(int i9, d0 d0Var) {
        d0 d0Var2;
        r1 r1Var = (r1) this.f7111b;
        d0 d0Var3 = null;
        if (d0Var != null) {
            int i10 = 0;
            while (true) {
                if (i10 < r1Var.f9690c.size()) {
                    if (((d0) r1Var.f9690c.get(i10)).d == d0Var.d) {
                        Object obj = d0Var.f13426a;
                        Object obj2 = r1Var.f9689b;
                        int i11 = h3.a.d;
                        d0Var2 = d0Var.b(Pair.create(obj2, obj));
                        break;
                    }
                    i10++;
                } else {
                    d0Var2 = null;
                    break;
                }
            }
            if (d0Var2 == null) {
                return null;
            }
            d0Var3 = d0Var2;
        }
        return Pair.create(Integer.valueOf(i9 + r1Var.d), d0Var3);
    }

    @Override
    public void o(float f10, float f11, int i9, int i10) {
        f6.q(f10, f11, i9, i10);
    }

    @Override
    public void onComplete(Task task) {
        k8.c cVar = (k8.c) this.f7111b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7112c;
        synchronized (cVar.f14675f) {
            cVar.f14674e.remove(taskCompletionSource);
        }
    }

    public k p(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f7112c)) {
            if (!((AtomicBoolean) this.f7112c).get()) {
                try {
                    a2 = ((i3.i) this.f7111b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f7112c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (k) a2.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override
    public int p0(int i9) {
        return N0(i9);
    }

    @Override
    public java.lang.Object q(kd.c r6, sc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: g5.b.q(kd.c, sc.c):java.lang.Object");
    }

    @Override
    public int q1(int i9) {
        return ((SparseIntArray) this.f7111b).get(i9);
    }

    public void r(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f7111b;
        ih.b4 b4Var = (ih.b4) this.f7112c;
        m9 m9Var = b4Var.f11262e;
        m9.f11780x1 = f10;
        l9 l9Var = m9Var.f11829v0;
        if (l9Var != null) {
            l9Var.setSpeed(f10);
        }
        i4.a0(b4Var.f11268l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void s(o0.f fVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f7112c;
        k5.i iVar = (k5.i) this.f7111b;
        int i9 = fVar.f18759b;
        if (i9 == 0) {
            oVar.execute(new j(iVar, fVar.f18758a, false, 28));
        } else {
            oVar.execute(new m.i3(iVar, i9));
        }
    }

    public void t(n2.l lVar) {
        this.f7111b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.f7112c = str;
            }
        }
    }

    @Override
    public boolean t0() {
        return false;
    }

    public String toString() {
        switch (this.f7110a) {
            case 14:
                try {
                    return m().toString();
                } catch (e unused) {
                    return "";
                }
            case 26:
                return ((HashMap) this.f7111b).toString();
            default:
                return super.toString();
        }
    }

    public w u(int i9) {
        int i10 = 0;
        while (true) {
            int[] iArr = (int[]) this.f7111b;
            if (i10 < iArr.length) {
                if (i9 == iArr[i10]) {
                    return ((a1[]) this.f7112c)[i10];
                }
                i10++;
            } else {
                d5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i9);
                return new m3.j();
            }
        }
    }

    public void w(g3 g3Var) {
        try {
            E(g3Var, (p3) this.f7111b);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(g3 g3Var, int i9, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.f7111b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3691b, i9);
            p3 p3Var = (p3) o3Var.a();
            this.f7111b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f3691b, j10);
                p3Var = (p3) o3Var2.a();
            }
            E(g3Var, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f3691b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f3691b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f7111b;
            } else {
                o3 o3Var = (o3) ((p3) this.f7111b).g();
                o3Var.c();
                p3.r((p3) o3Var.f3691b, j10);
                p3Var = (p3) o3Var.a();
            }
            E(g3Var2, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(g3 g3Var, int i9, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f7111b).g();
            o3Var.c();
            p3.p((p3) o3Var.f3691b, i9);
            this.f7111b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f3691b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f3691b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.f7111b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f7111b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f3691b, j10);
                p3Var = (p3) o3Var2.a();
            }
            E(g3Var2, p3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public b(int i9, Object obj, Object obj2) {
        this.f7110a = i9;
        this.f7111b = obj;
        this.f7112c = obj2;
    }

    public b(Object obj, Object obj2, boolean z10, int i9) {
        this.f7110a = i9;
        this.f7112c = obj;
        this.f7111b = obj2;
    }

    public b(m mVar) {
        this.f7110a = 1;
        this.f7112c = new Object();
        this.f7111b = mVar;
        oa.b();
    }

    public b(Context context, p3 p3Var) {
        this.f7110a = 24;
        t tVar = new t(5);
        try {
            w2.q.b(context);
            tVar.f2234c = w2.q.a().c(u2.a.f47963e).a("PLAY_BILLING_LIBRARY", new t2.c("proto"), new za.a(15));
        } catch (Throwable unused) {
            tVar.f2233b = true;
        }
        this.f7112c = tVar;
        this.f7111b = p3Var;
    }

    public b(m9.a[] aVarArr) {
        this.f7110a = 21;
        this.f7111b = aVarArr;
        this.f7112c = new v9.d(15);
    }

    public b(lb.f fVar) {
        this.f7110a = 14;
        this.f7111b = fVar;
    }

    public b(d5.g gVar, SparseArray sparseArray) {
        this.f7110a = 8;
        this.f7111b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.f4361a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i9 = 0; i9 < sparseBooleanArray.size(); i9++) {
            int a2 = gVar.a(i9);
            i3.a aVar = (i3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f7112c = sparseArray2;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f7110a = 3;
        int size = arrayList.size();
        this.f7111b = new int[size];
        this.f7112c = new float[size];
        for (int i9 = 0; i9 < size; i9++) {
            ((int[]) this.f7111b)[i9] = ((Integer) arrayList.get(i9)).intValue();
            ((float[]) this.f7112c)[i9] = ((Float) arrayList2.get(i9)).floatValue();
        }
    }

    @Override
    public void c1(int i9, int i10) {
    }

    public b(int i9, int i10) {
        this.f7110a = 3;
        this.f7111b = new int[]{i9, i10};
        this.f7112c = new float[]{0.0f, 1.0f};
    }

    public b(int i9, int i10, int i11) {
        this.f7110a = 3;
        this.f7111b = new int[]{i9, i10, i11};
        this.f7112c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(m2.g gVar) {
        this.f7110a = 17;
        this.f7112c = gVar;
        this.f7111b = new Rect();
    }

    public b(i3.i iVar) {
        this.f7110a = 18;
        this.f7111b = iVar;
        this.f7112c = new AtomicBoolean(false);
    }
}
