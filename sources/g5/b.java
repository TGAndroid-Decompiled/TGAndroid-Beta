package g5;

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
import c2.t;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.clearcut.e;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.e3;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.h3;
import com.google.android.gms.internal.play_billing.k3;
import com.google.android.gms.internal.play_billing.n3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.s3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.u3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.z3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e7.v;
import g7.e8;
import h3.n1;
import h3.o1;
import h3.p1;
import h3.r1;
import h3.s1;
import h7.k6;
import h7.oa;
import h7.w6;
import ia.d0;
import j4.a1;
import j4.c0;
import j4.h0;
import j4.p;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.atomic.AtomicBoolean;
import jh.e4;
import jh.h9;
import jh.i9;
import jh.x3;
import l3.h;
import ld.n;
import m.i3;
import m2.g;
import m3.j;
import m3.k;
import m3.w;
import m5.f0;
import n2.b0;
import n2.d;
import n2.z;
import nc.i;
import oa.m;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import r0.j0;
import r0.m1;
import r0.o;
import r5.f;
import r5.x;
import w2.q;
import y5.l;

public final class b implements h0, h, s0, ld.b, OnCompleteListener, o, s, z, n9.a, ke.b, c6 {

    public final int f6388a;

    public Object f6389b;

    public Object f6390c;

    public b(int i10) {
        this.f6388a = i10;
    }

    public static String j(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static String v(b bVar) {
        Collection<String> collection = (Collection) bVar.f6389b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.f6390c;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String string : collection) {
                r5.a.b(string);
                if (!z10) {
                    sb2.append(",");
                }
                if (!r5.a.f46766a.matcher(string).matches()) {
                    StringBuilder sb3 = new StringBuilder(string.length());
                    for (int i10 = 0; i10 < string.length(); i10++) {
                        char cCharAt = string.charAt(i10);
                        if ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && !((cCharAt >= '0' && cCharAt <= '9') || cCharAt == '_' || cCharAt == '-' || cCharAt == '.' || cCharAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(cCharAt)));
                        } else {
                            sb3.append(cCharAt);
                        }
                    }
                    string = sb3.toString();
                }
                sb2.append(string);
                z10 = false;
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

    public void A(k3 k3Var) {
        try {
            v3 v3VarT = w3.t();
            v3VarT.d((o3) this.f6389b);
            v3VarT.c();
            w3.p((w3) v3VarT.f4129b, k3Var);
            ((t) this.f6390c).h((w3) v3VarT.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(z3 z3Var) {
        try {
            t tVar = (t) this.f6390c;
            v3 v3VarT = w3.t();
            v3VarT.d((o3) this.f6389b);
            v3VarT.c();
            w3.r((w3) v3VarT.f4129b, z3Var);
            tVar.h((w3) v3VarT.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(a4 a4Var) {
        if (a4Var == null) {
            return;
        }
        try {
            v3 v3VarT = w3.t();
            v3VarT.d((o3) this.f6389b);
            v3VarT.c();
            w3.s((w3) v3VarT.f4129b, a4Var);
            ((t) this.f6390c).h((w3) v3VarT.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(f3 f3Var, o3 o3Var) {
        if (f3Var == null) {
            return;
        }
        try {
            v3 v3VarT = w3.t();
            v3VarT.d(o3Var);
            v3VarT.c();
            w3.n((w3) v3VarT.f4129b, f3Var);
            ((t) this.f6390c).h((w3) v3VarT.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void E(h3 h3Var, o3 o3Var) {
        try {
            v3 v3VarT = w3.t();
            v3VarT.d(o3Var);
            v3VarT.c();
            w3.o((w3) v3VarT.f4129b, h3Var);
            ((t) this.f6390c).h((w3) v3VarT.a());
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override
    public ColorFilter F() {
        return g6.f23371v3;
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        g gVar = (g) this.f6390c;
        m1 m1VarH = j0.h(view, m1Var);
        if (m1VarH.f46619a.n()) {
            return m1VarH;
        }
        Rect rect = (Rect) this.f6389b;
        rect.left = m1VarH.b();
        rect.top = m1VarH.d();
        rect.right = m1VarH.c();
        rect.bottom = m1VarH.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 m1VarB = j0.b(gVar.getChildAt(i10), m1VarH);
            rect.left = Math.min(m1VarB.b(), rect.left);
            rect.top = Math.min(m1VarB.d(), rect.top);
            rect.right = Math.min(m1VarB.c(), rect.right);
            rect.bottom = Math.min(m1VarB.a(), rect.bottom);
        }
        return m1VarH.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public Paint N(String str) {
        return g6.S0(str);
    }

    @Override
    public int N0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f6389b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i10);
        return iIndexOfKey >= 0 ? sparseIntArray.valueAt(iIndexOfKey) : g6.w0(null, i10, false);
    }

    @Override
    public ke.a V0(b bVar) {
        List list = (List) this.f6390c;
        List list2 = (List) bVar.f6389b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(bVar, (List) this.f6389b, list);
    }

    @Override
    public boolean a() {
        return g6.I.q();
    }

    @Override
    public StackTraceElement[] a0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        n9.a[] aVarArr = (n9.a[]) this.f6389b;
        StackTraceElement[] stackTraceElementArrA0 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            n9.a aVar = aVarArr[i10];
            if (stackTraceElementArrA0.length <= 1024) {
                break;
            }
            stackTraceElementArrA0 = aVar.a0(stackTraceElementArr);
        }
        return stackTraceElementArrA0.length > 1024 ? ((ab.a) this.f6390c).a0(stackTraceElementArrA0) : stackTraceElementArrA0;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        f0 f0Var = (f0) this.f6389b;
        String str = (String) this.f6390c;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        l.j("Not connected to device", f0Var.F == 2);
        f fVar = (f) xVar.u();
        Parcel parcelM0 = fVar.M0();
        parcelM0.writeString(str);
        fVar.R0(parcelM0, 5);
        synchronized (f0Var.f17778s) {
            try {
                if (f0Var.f17775p != null) {
                    taskCompletionSource.setException(l.m(new Status(2001, null, null, null)));
                } else {
                    f0Var.f17775p = taskCompletionSource;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public void b(int i10, c0 c0Var, j4.x xVar) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new o1(this, pairO, xVar, 0));
        }
    }

    @Override
    public void c(int i10, c0 c0Var, j4.x xVar) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new o1(this, pairO, xVar, 1));
        }
    }

    @Override
    public void d(int i10, c0 c0Var, p pVar, j4.x xVar, IOException iOException, boolean z10) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new p1(this, pairO, pVar, xVar, iOException, z10, 0));
        }
    }

    @Override
    public Object e(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        i4.a aVar = (i4.a) ((s0) this.f6389b).e(uri, oVar);
        List list = (List) this.f6390c;
        return (list == null || list.isEmpty()) ? aVar : (i4.a) aVar.a(list);
    }

    @Override
    public void f(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new n1(this, pairO, pVar, xVar, 2));
        }
    }

    @Override
    public void g(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new n1(this, pairO, pVar, xVar, 1));
        }
    }

    @Override
    public Drawable getDrawable(String str) {
        return null;
    }

    @Override
    public void h(int i10, c0 c0Var, p pVar, j4.x xVar) {
        Pair pairO = o(i10, c0Var);
        if (pairO != null) {
            ((s1) this.f6390c).f8152i.c(new n1(this, pairO, pVar, xVar, 0));
        }
    }

    public d i() {
        if (((n2.l) this.f6389b) != null) {
            return new d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public boolean k(int i10) {
        return ((d5.g) this.f6389b).f4794a.get(i10);
    }

    public m l(ta.a aVar) {
        m oVar;
        String str;
        m b0Var;
        Type type = aVar.f48152b;
        Class cls = aVar.f48151a;
        HashMap map = (HashMap) this.f6389b;
        if (map.get(type) != null) {
            throw new ClassCastException();
        }
        if (map.get(cls) != null) {
            throw new ClassCastException();
        }
        int i10 = 6;
        m aVar2 = null;
        if (EnumSet.class.isAssignableFrom(cls)) {
            oVar = new n1.d(type, i10);
        } else {
            oVar = cls == EnumMap.class ? new m5.o(type, i10) : null;
        }
        if (oVar != null) {
            return oVar;
        }
        oa.d.f((ArrayList) this.f6390c);
        if (Modifier.isAbstract(cls.getModifiers())) {
            b0Var = null;
        } else {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                w6 w6Var = ra.c.f46882a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e9) {
                    str = "Failed making constructor '" + ra.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e9.getMessage() + ra.c.e(e9);
                }
                b0Var = str != null ? new b0(str, i10) : new o0.b(declaredConstructor, 2);
            } catch (NoSuchMethodException unused) {
                b0Var = null;
            }
        }
        if (b0Var != null) {
            return b0Var;
        }
        int i11 = 17;
        if (Collection.class.isAssignableFrom(cls)) {
            int i12 = 16;
            if (SortedSet.class.isAssignableFrom(cls)) {
                aVar2 = new w9.d(i12);
            } else if (Set.class.isAssignableFrom(cls)) {
                aVar2 = new xa.a(i12);
            } else {
                aVar2 = Queue.class.isAssignableFrom(cls) ? new za.b(i12) : new ab.a(i11);
            }
        } else if (Map.class.isAssignableFrom(cls)) {
            if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                aVar2 = new v(i11);
            } else if (ConcurrentMap.class.isAssignableFrom(cls)) {
                aVar2 = new w9.d(i11);
            } else if (SortedMap.class.isAssignableFrom(cls)) {
                aVar2 = new xa.a(i11);
            } else {
                aVar2 = (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new ta.a(((ParameterizedType) type).getActualTypeArguments()[0]).f48151a)) ? new ab.a(18) : new za.b(i11);
            }
        }
        if (aVar2 != null) {
            return aVar2;
        }
        String strJ = j(cls);
        return strJ != null ? new e(strJ) : new b0(cls, 5);
    }

    @Override
    public void m(float f10, float f11, int i10, int i11) {
        g6.q(f10, f11, i10, i11);
    }

    public mb.b n() {
        if (((mb.b) this.f6390c) == null) {
            mb.f fVar = (mb.f) this.f6389b;
            int[] iArr = fVar.f17937c;
            lb.d dVar = fVar.f17935a;
            int i10 = dVar.f15514a;
            int i11 = dVar.f15515b;
            mb.b bVar = new mb.b(i10, i11);
            if (fVar.f17936b.length < i10) {
                fVar.f17936b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] bArrB = dVar.b((i11 * i13) / 5, fVar.f17936b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (bArrB[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 <= length / 16) {
                throw lb.e.a();
            }
            int i28 = i19 - 1;
            int i29 = i28;
            int i30 = -1;
            while (i28 > i22) {
                int i31 = i28 - i22;
                int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                if (i32 > i30) {
                    i29 = i28;
                    i30 = i32;
                }
                i28--;
            }
            int i33 = i29 << 3;
            byte[] bArrA = dVar.a();
            for (int i34 = 0; i34 < i11; i34++) {
                int i35 = i34 * i10;
                for (int i36 = 0; i36 < i10; i36++) {
                    if ((bArrA[i35 + i36] & 255) < i33) {
                        int i37 = (i36 / 32) + (bVar.f17921c * i34);
                        int[] iArr2 = bVar.d;
                        iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                    }
                }
            }
            this.f6390c = bVar;
        }
        return (mb.b) this.f6390c;
    }

    public Pair o(int i10, c0 c0Var) {
        c0 c0VarB;
        r1 r1Var = (r1) this.f6389b;
        c0 c0Var2 = null;
        if (c0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= r1Var.f8110c.size()) {
                    c0VarB = null;
                    break;
                }
                if (((c0) r1Var.f8110c.get(i11)).d == c0Var.d) {
                    Object obj = c0Var.f12503a;
                    Object obj2 = r1Var.f8109b;
                    int i12 = h3.a.d;
                    c0VarB = c0Var.b(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (c0VarB == null) {
                return null;
            }
            c0Var2 = c0VarB;
        }
        return Pair.create(Integer.valueOf(i10 + r1Var.d), c0Var2);
    }

    @Override
    public int o1(int i10) {
        return ((SparseIntArray) this.f6389b).get(i10);
    }

    @Override
    public void onComplete(Task task) {
        l8.c cVar = (l8.c) this.f6389b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f6390c;
        synchronized (cVar.f15456f) {
            cVar.f15455e.remove(taskCompletionSource);
        }
    }

    public k p(Object... objArr) {
        Constructor constructorC;
        synchronized (((AtomicBoolean) this.f6390c)) {
            try {
                if (!((AtomicBoolean) this.f6390c).get()) {
                    try {
                        constructorC = ((ia.l) this.f6389b).c();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f6390c).set(true);
                        constructorC = null;
                    } catch (Exception e9) {
                        throw new RuntimeException("Error instantiating extension", e9);
                    }
                }
                constructorC = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorC == null) {
            return null;
        }
        try {
            return (k) constructorC.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    @Override
    public Object q(ld.c cVar, tc.c cVar2) {
        ld.d dVar;
        b bVar;
        switch (this.f6388a) {
            case 10:
                Object objQ = ((b) this.f6389b).q(new ia.b0(cVar, (d0) this.f6390c), cVar2);
                return objQ == sc.a.f47847a ? objQ : pc.i.f45696a;
            default:
                if (cVar2 instanceof ld.d) {
                    dVar = (ld.d) cVar2;
                    int i10 = dVar.f15542b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dVar.f15542b = i10 - Integer.MIN_VALUE;
                    } else {
                        dVar = new ld.d(this, cVar2);
                    }
                } else {
                    dVar = new ld.d(this, cVar2);
                }
                Object objA = dVar.f15541a;
                Object obj = sc.a.f47847a;
                int i11 = dVar.f15542b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        cVar = dVar.f15544e;
                        bVar = dVar.d;
                        k6.b(objA);
                    } else {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k6.b(objA);
                    }
                    return pc.i.f45696a;
                }
                k6.b(objA);
                ld.b bVar2 = (ld.b) this.f6389b;
                dVar.d = this;
                dVar.f15544e = cVar;
                dVar.f15542b = 1;
                objA = n.a(bVar2, cVar, dVar);
                if (objA == obj) {
                    return obj;
                }
                bVar = this;
                Throwable th = (Throwable) objA;
                if (th != null) {
                    ia.z zVar = (ia.z) bVar.f6390c;
                    dVar.d = null;
                    dVar.f15544e = null;
                    dVar.f15542b = 2;
                    if (zVar.a(cVar, th, dVar) == obj) {
                        return obj;
                    }
                }
                return pc.i.f45696a;
        }
    }

    @Override
    public int q0(int i10) {
        return N0(i10);
    }

    public void r(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f6389b;
        x3 x3Var = (x3) this.f6390c;
        i9 i9Var = x3Var.f14122e;
        i9.f13461x1 = f10;
        h9 h9Var = i9Var.f13510v0;
        if (h9Var != null) {
            h9Var.setSpeed(f10);
        }
        e4.a0(x3Var.f14128l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void s(o0.g gVar) {
        androidx.biometric.n nVar = (androidx.biometric.n) this.f6390c;
        a9.i iVar = (a9.i) this.f6389b;
        int i10 = gVar.f19103b;
        if (i10 != 0) {
            nVar.execute(new i3(iVar, i10));
        } else {
            nVar.execute(new a9.o(iVar, gVar.f19102a, false, 29));
        }
    }

    public void t(n2.l lVar) {
        this.f6389b = lVar;
        if (lVar.a() != null) {
            lVar.a().getClass();
            String str = lVar.a().d;
            if (str != null) {
                this.f6390c = str;
            }
        }
    }

    public String toString() {
        switch (this.f6388a) {
            case 16:
                try {
                    return n().toString();
                } catch (lb.e unused) {
                    return "";
                }
            case 28:
                return ((HashMap) this.f6389b).toString();
            default:
                return super.toString();
        }
    }

    public w u(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f6389b;
            if (i11 >= iArr.length) {
                d5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new j();
            }
            if (i10 == iArr[i11]) {
                return ((a1[]) this.f6390c)[i11];
            }
            i11++;
        }
    }

    @Override
    public boolean u0() {
        return false;
    }

    public void w(f3 f3Var) {
        try {
            D(f3Var, (o3) this.f6389b);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void x(f3 f3Var, int i10, long j10) {
        try {
            n3 n3Var = (n3) ((o3) this.f6389b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4129b, i10);
            o3 o3Var = (o3) n3Var.a();
            this.f6389b = o3Var;
            if (j10 != 0) {
                n3 n3Var2 = (n3) o3Var.g();
                n3Var2.c();
                o3.r((o3) n3Var2.f4129b, j10);
                o3Var = (o3) n3Var2.a();
            }
            D(f3Var, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void y(f3 f3Var, long j10, boolean z10) {
        o3 o3Var;
        try {
            e3 e3Var = (e3) f3Var.g();
            s3 s3Var = (s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.f4129b, z10);
            e3Var.c();
            f3.r((f3) e3Var.f4129b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.f6389b;
            } else {
                n3 n3Var = (n3) ((o3) this.f6389b).g();
                n3Var.c();
                o3.r((o3) n3Var.f4129b, j10);
                o3Var = (o3) n3Var.a();
            }
            D(f3Var2, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void z(f3 f3Var, int i10, long j10, boolean z10) {
        o3 o3Var;
        try {
            n3 n3Var = (n3) ((o3) this.f6389b).g();
            n3Var.c();
            o3.p((o3) n3Var.f4129b, i10);
            this.f6389b = (o3) n3Var.a();
            e3 e3Var = (e3) f3Var.g();
            s3 s3Var = (s3) f3Var.o().g();
            s3Var.c();
            u3.n((u3) s3Var.f4129b, z10);
            e3Var.c();
            f3.r((f3) e3Var.f4129b, (u3) s3Var.a());
            f3 f3Var2 = (f3) e3Var.a();
            if (j10 == 0) {
                o3Var = (o3) this.f6389b;
            } else {
                n3 n3Var2 = (n3) ((o3) this.f6389b).g();
                n3Var2.c();
                o3.r((o3) n3Var2.f4129b, j10);
                o3Var = (o3) n3Var2.a();
            }
            D(f3Var2, o3Var);
        } catch (Throwable th) {
            u.i("BillingLogger", "Unable to log.", th);
        }
    }

    public b(int i10, Object obj, Object obj2) {
        this.f6388a = i10;
        this.f6389b = obj;
        this.f6390c = obj2;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f6388a = i10;
        this.f6390c = obj;
        this.f6389b = obj2;
    }

    public b(a5.n nVar) {
        this.f6388a = 4;
        this.f6390c = new e8();
        this.f6389b = nVar;
        oa.b();
    }

    public b(Context context, o3 o3Var) {
        this.f6388a = 23;
        t tVar = new t(5);
        try {
            q.b(context);
            tVar.f2347c = q.a().c(u2.a.f48257e).a("PLAY_BILLING_LIBRARY", new t2.c("proto"), new xa.a(15));
        } catch (Throwable unused) {
            tVar.f2346b = true;
        }
        this.f6390c = tVar;
        this.f6389b = o3Var;
    }

    public b(n9.a[] aVarArr) {
        this.f6388a = 25;
        this.f6389b = aVarArr;
        this.f6390c = new ab.a(16);
    }

    public b(mb.f fVar) {
        this.f6388a = 16;
        this.f6389b = fVar;
    }

    public b(d5.g gVar, SparseArray sparseArray) {
        this.f6388a = 6;
        this.f6389b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.f4794a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int iA = gVar.a(i10);
            i3.a aVar = (i3.a) sparseArray.get(iA);
            aVar.getClass();
            sparseArray2.append(iA, aVar);
        }
        this.f6390c = sparseArray2;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f6388a = 2;
        int size = arrayList.size();
        this.f6389b = new int[size];
        this.f6390c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f6389b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f6390c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override
    public void c1(int i10, int i11) {
    }

    public b(int i10, int i11) {
        this.f6388a = 2;
        this.f6389b = new int[]{i10, i11};
        this.f6390c = new float[]{0.0f, 1.0f};
    }

    public b(int i10, int i11, int i12) {
        this.f6388a = 2;
        this.f6389b = new int[]{i10, i11, i12};
        this.f6390c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(g gVar) {
        this.f6388a = 18;
        this.f6390c = gVar;
        this.f6389b = new Rect();
    }

    public b(ia.l lVar) {
        this.f6388a = 19;
        this.f6389b = lVar;
        this.f6390c = new AtomicBoolean(false);
    }
}
