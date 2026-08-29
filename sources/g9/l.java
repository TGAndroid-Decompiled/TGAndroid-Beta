package g9;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import com.google.android.exoplayer2.upstream.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import i7.oa;
import j3.n1;
import j3.o1;
import j3.p1;
import j3.r1;
import j3.s1;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import l4.b1;
import l4.c0;
import l4.h0;
import lh.d4;
import lh.h9;
import lh.i9;
import lh.m7;
import lh.w3;
import o5.e0;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import r0.j0;
import r0.m1;
public final class l implements SuccessContinuation, h0, n3.g, md.b, s0, r0.o, OnCompleteListener, com.google.android.gms.common.api.internal.s, o9.a {
    public final int f7167a;
    public Object f7168b;
    public Object f7169c;

    public l(int i10, byte b10) {
        this.f7167a = i10;
    }

    public static String r(l lVar) {
        Collection<String> collection = (Collection) lVar.f7169c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) lVar.f7168b;
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
                    s5.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!s5.a.f47578a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            char charAt = str2.charAt(i10);
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

    @Override
    public m1 I0(View view, m1 m1Var) {
        m2.g gVar = (m2.g) this.f7169c;
        m1 h = j0.h(view, m1Var);
        if (h.f46843a.n()) {
            return h;
        }
        Rect rect = (Rect) this.f7168b;
        rect.left = h.b();
        rect.top = h.d();
        rect.right = h.c();
        rect.bottom = h.a();
        int childCount = gVar.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            m1 b10 = j0.b(gVar.getChildAt(i10), h);
            rect.left = Math.min(b10.b(), rect.left);
            rect.top = Math.min(b10.d(), rect.top);
            rect.right = Math.min(b10.c(), rect.right);
            rect.bottom = Math.min(b10.a(), rect.bottom);
        }
        return h.f(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override
    public void a(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new n1(this, l10, pVar, xVar, 2));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f7168b;
        String str = (String) this.f7169c;
        s5.x xVar = (s5.x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        z5.l.j("Not connected to device", z10);
        s5.f fVar = (s5.f) xVar.u();
        Parcel M0 = fVar.M0();
        M0.writeString(str);
        fVar.R0(M0, 5);
        synchronized (e0Var.f19260s) {
            try {
                if (e0Var.f19257p != null) {
                    taskCompletionSource.setException(z5.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f19257p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(int i10, c0 c0Var, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new o1(this, l10, xVar, 1));
        }
    }

    @Override
    public void c(int i10, c0 c0Var, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new o1(this, l10, xVar, 0));
        }
    }

    @Override
    public Object d(Uri uri, com.google.android.exoplayer2.upstream.o oVar) {
        k4.a aVar = (k4.a) ((s0) this.f7168b).d(uri, oVar);
        List list = (List) this.f7169c;
        if (list != null && !list.isEmpty()) {
            return (k4.a) aVar.a(list);
        }
        return aVar;
    }

    @Override
    public java.lang.Object e(md.c r6, uc.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: g9.l.e(md.c, uc.c):java.lang.Object");
    }

    @Override
    public void f(int i10, c0 c0Var, l4.p pVar, l4.x xVar, IOException iOException, boolean z10) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new p1(this, l10, pVar, xVar, iOException, z10, 0));
        }
    }

    @Override
    public void g(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new n1(this, l10, pVar, xVar, 1));
        }
    }

    @Override
    public void h(int i10, c0 c0Var, l4.p pVar, l4.x xVar) {
        Pair l10 = l(i10, c0Var);
        if (l10 != null) {
            ((s1) this.f7169c).f10759i.c(new n1(this, l10, pVar, xVar, 0));
        }
    }

    public boolean i(int i10) {
        return ((f5.g) this.f7168b).f6596a.get(i10);
    }

    public void j() {
        String str = (String) this.f7168b;
        try {
            l9.b bVar = (l9.b) this.f7169c;
            bVar.getClass();
            new File(bVar.f15103b, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public nb.b k() {
        if (((nb.b) this.f7169c) == null) {
            nb.f fVar = (nb.f) this.f7168b;
            int[] iArr = fVar.f17220c;
            mb.d dVar = fVar.f17218a;
            int i10 = dVar.f16954a;
            int i11 = dVar.f16955b;
            nb.b bVar = new nb.b(i10, i11);
            if (fVar.f17219b.length < i10) {
                fVar.f17219b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f17219b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
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
            if (i19 - i22 > length / 16) {
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
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f17204c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f7169c = bVar;
            } else {
                throw mb.e.a();
            }
        }
        return (nb.b) this.f7169c;
    }

    public Pair l(int i10, c0 c0Var) {
        c0 c0Var2;
        r1 r1Var = (r1) this.f7168b;
        c0 c0Var3 = null;
        if (c0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 < r1Var.f10727c.size()) {
                    if (((c0) r1Var.f10727c.get(i11)).d == c0Var.d) {
                        Object obj = c0Var.f14262a;
                        Object obj2 = r1Var.f10726b;
                        int i12 = j3.a.d;
                        c0Var2 = c0Var.b(Pair.create(obj2, obj));
                        break;
                    }
                    i11++;
                } else {
                    c0Var2 = null;
                    break;
                }
            }
            if (c0Var2 == null) {
                return null;
            }
            c0Var3 = c0Var2;
        }
        return Pair.create(Integer.valueOf(i10 + r1Var.d), c0Var3);
    }

    @Override
    public StackTraceElement[] m(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        o9.a[] aVarArr = (o9.a[]) this.f7168b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            o9.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.m(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((f7.v) this.f7169c).m(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public o3.k n(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f7169c)) {
            if (!((AtomicBoolean) this.f7169c).get()) {
                try {
                    a2 = ((m4.a) this.f7168b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f7169c).set(true);
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
            return (o3.k) a2.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public void o(boolean z10, boolean z11, float f9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f7168b;
        w3 w3Var = (w3) this.f7169c;
        i9 i9Var = w3Var.f16356e;
        i9.f15739x1 = f9;
        h9 h9Var = i9Var.f15788v0;
        if (h9Var != null) {
            h9Var.setSpeed(f9);
        }
        d4.a0(w3Var.f16362l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public void onComplete(Task task) {
        m8.c cVar = (m8.c) this.f7168b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f7169c;
        synchronized (cVar.f16896f) {
            cVar.f16895e.remove(taskCompletionSource);
        }
    }

    public void p(o0.g gVar) {
        androidx.biometric.o oVar = (androidx.biometric.o) this.f7169c;
        ag.o1 o1Var = (ag.o1) this.f7168b;
        int i10 = gVar.f19002b;
        if (i10 == 0) {
            oVar.execute(new ab.o(26, o1Var, gVar.f19001a));
        } else {
            oVar.execute(new m7(o1Var, i10));
        }
    }

    public o3.w q(int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = (int[]) this.f7168b;
            if (i11 < iArr.length) {
                if (i10 == iArr[i11]) {
                    return ((b1[]) this.f7169c)[i11];
                }
                i11++;
            } else {
                f5.a.o("BaseMediaChunkOutput", "Unmatched track of type: " + i10);
                return new o3.j();
            }
        }
    }

    @Override
    public Task then(Object obj) {
        switch (this.f7167a) {
            case 0:
                n9.a aVar = (n9.a) obj;
                p pVar = ((m) this.f7169c).f7173e;
                if (aVar == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
                    return Tasks.forResult(null);
                }
                return Tasks.whenAll(p.b(pVar), pVar.f7190m.v((Executor) this.f7168b, null));
            case 1:
                n9.a aVar2 = (n9.a) obj;
                n nVar = (n) this.f7169c;
                if (aVar2 == null) {
                    Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
                    return Tasks.forResult(null);
                }
                l lVar = (l) nVar.f7176c;
                p.b((p) ((l) nVar.f7176c).f7169c);
                ((p) lVar.f7169c).f7190m.v((Executor) this.f7168b, null);
                ((p) lVar.f7169c).f7194q.trySetResult(null);
                return Tasks.forResult(null);
            default:
                return ((p) this.f7169c).f7183e.R(new n(0, this, (Boolean) obj));
        }
    }

    public String toString() {
        switch (this.f7167a) {
            case 22:
                try {
                    return k().toString();
                } catch (mb.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public l(int i10, Object obj, Object obj2) {
        this.f7167a = i10;
        this.f7169c = obj;
        this.f7168b = obj2;
    }

    public l(Object obj, Object obj2, boolean z10, int i10) {
        this.f7167a = i10;
        this.f7168b = obj;
        this.f7169c = obj2;
    }

    public l(androidx.biometric.e eVar) {
        this.f7167a = 8;
        this.f7169c = new Object();
        this.f7168b = eVar;
        oa.b();
    }

    public l() {
        this.f7167a = 4;
        this.f7168b = new AtomicInteger();
        this.f7169c = new AtomicInteger();
    }

    public l(o9.a[] aVarArr) {
        this.f7167a = 29;
        this.f7168b = aVarArr;
        this.f7169c = new f7.v(16);
    }

    public l(nb.f fVar) {
        this.f7167a = 22;
        this.f7168b = fVar;
    }

    public l(f5.g gVar, SparseArray sparseArray) {
        this.f7167a = 14;
        this.f7168b = gVar;
        SparseBooleanArray sparseBooleanArray = gVar.f6596a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = gVar.a(i10);
            k3.a aVar = (k3.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f7169c = sparseArray2;
    }

    public l(int i10) {
        this.f7167a = 5;
        Bitmap createBitmap = Bitmap.createBitmap(i10, i10, Bitmap.Config.ALPHA_8);
        this.f7168b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.f7169c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public l(ArrayList arrayList, ArrayList arrayList2) {
        this.f7167a = 6;
        int size = arrayList.size();
        this.f7168b = new int[size];
        this.f7169c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f7168b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f7169c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public l(int i10, int i11) {
        this.f7167a = 6;
        this.f7168b = new int[]{i10, i11};
        this.f7169c = new float[]{0.0f, 1.0f};
    }

    public l(int i10, int i11, int i12) {
        this.f7167a = 6;
        this.f7168b = new int[]{i10, i11, i12};
        this.f7169c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public l(m mVar, Executor executor, String str) {
        this.f7167a = 0;
        this.f7169c = mVar;
        this.f7168b = executor;
    }

    public l(m2.g gVar) {
        this.f7167a = 20;
        this.f7169c = gVar;
        this.f7168b = new Rect();
    }

    public l(m4.a aVar) {
        this.f7167a = 26;
        this.f7168b = aVar;
        this.f7169c = new AtomicBoolean(false);
    }
}
