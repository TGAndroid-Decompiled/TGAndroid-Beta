package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
public final class i09 implements ugc, hf9, ni9, cg9, g84, efc, rv9, ty9, on5, OnCompleteListener, qu4, f9, s68, s99, OnSuccessListener {
    public final byte a;
    public Object b;

    public i09(Context context) {
        boolean isEmpty;
        this.a = (byte) 17;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.b = sharedPreferences;
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    synchronized (this) {
                        isEmpty = sharedPreferences.getAll().isEmpty();
                    }
                    if (!isEmpty) {
                        Log.i("FirebaseMessaging", "App restored, clearing state");
                        n();
                    }
                }
            } catch (IOException e) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
                }
            }
        }
    }

    @Override
    public final int A() {
        q79 q79Var = (q79) this.b;
        return q79Var.n - q79Var.B();
    }

    @Override
    public final View B(int i) {
        return ((q79) this.b).q(i);
    }

    @Override
    public final void B1() {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var != null) {
                    pi9 pi9Var = ji9Var.a;
                    ch9 ch9Var = pi9Var.R3;
                    if (ch9Var != null) {
                        ch9Var.g();
                    }
                    pi9Var.p3.onContentChanged();
                    return;
                }
                return;
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var != null) {
                    pi9 pi9Var2 = ii9Var.a;
                    ch9 ch9Var2 = pi9Var2.R3;
                    if (ch9Var2 != null) {
                        ch9Var2.g();
                    }
                    pi9Var2.p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public final int C(View view) {
        return q79.v(view) + ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public final boolean C1(int i) {
        if (i == ((hea) this.b).r) {
            return true;
        }
        return false;
    }

    @Override
    public final void D() {
        ((g84) this.b).D();
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final amb E0() {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var == null) {
                    return null;
                }
                return ji9Var.a.getTextSelectionHelper();
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var == null) {
                    return null;
                }
                return ii9Var.a.getTextSelectionHelper();
        }
    }

    @Override
    public final boolean F(dg9 dg9Var) {
        return false;
    }

    public final void I(ko9 ko9Var) {
        xq2 xq2Var = (xq2) this.b;
        xq2Var.a = ko9Var;
        Iterator it = ((LinkedList) xq2Var.b).iterator();
        while (it.hasNext()) {
            ((u6d) it.next()).b();
        }
        ((LinkedList) xq2Var.b).clear();
    }

    @Override
    public final Object J(ie9 ie9Var) {
        ts9 ts9Var = (ts9) this.b;
        ts9Var.a = ie9Var;
        return ts9Var;
    }

    @Override
    public final void K(oi9 oi9Var, View view) {
        yg9 yg9Var = (yg9) this.b;
        fu5 I = fu5.I(yg9Var, view);
        I.W = true;
        yg9Var.getParentActivity();
        yg9Var.getResourceProvider();
        yg9Var.y0 = cj9.b(I, yg9Var, oi9Var, false);
    }

    @Override
    public final void L() {
        yg9 yg9Var = (yg9) this.b;
        int i = 0;
        yg9Var.z0(false, true);
        int i2 = yg9Var.J0;
        if (i2 != 2) {
            i = i2;
        }
        yg9Var.C0(i, true);
    }

    @Override
    public final void L0(CharSequence charSequence) {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var != null && charSequence != null && charSequence.length() > 0) {
                    ji9Var.a.v4(charSequence.toString());
                    return;
                }
                return;
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var != null && charSequence != null && charSequence.length() > 0) {
                    ii9Var.a.v4(charSequence.toString());
                    return;
                }
                return;
        }
    }

    @Override
    public final void M(CharSequence charSequence) {
        xh9 xh9Var = ((xl9) this.b).F;
        if (xh9Var != null && charSequence != null && charSequence.length() > 0) {
            xh9Var.a.v4(charSequence.toString());
        }
    }

    public final void N(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.s(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override
    public final fu5 O(View view) {
        return fu5.I((yg9) this.b, view);
    }

    @Override
    public final void Q(Editable editable) {
        xl9 xl9Var = (xl9) this.b;
        mk0 mk0Var = xl9Var.a;
        if (mk0Var != null) {
            mk0Var.s = true;
            mk0Var.r = xl9Var.r.r2;
        }
        xl9Var.w();
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            xh9Var.a();
        }
    }

    @Override
    public final void R() {
        yg9 yg9Var = (yg9) this.b;
        yg9Var.E0();
        di3 di3Var = yg9Var.z0;
        if (di3Var == null) {
            return;
        }
        di3Var.setLocked(yg9Var.i0());
    }

    @Override
    public final void S(mi9 mi9Var, View view) {
        yg9 yg9Var = (yg9) this.b;
        fu5 I = fu5.I(yg9Var, view);
        I.W = true;
        yg9Var.y0 = cj9.c(I, yg9Var, yg9Var.getParentActivity(), yg9Var.getResourceProvider(), mi9Var, false);
    }

    @Override
    public final zlb S0() {
        switch (this.a) {
            case 4:
                return (xe9) this.b;
            default:
                return (mj9) this.b;
        }
    }

    @Override
    public final boolean W(boolean z) {
        return false;
    }

    @Override
    public final mk0 X0() {
        switch (this.a) {
            case 4:
                return ((xe9) this.b).a;
            default:
                return ((mj9) this.b).a;
        }
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final boolean a(float f) {
        int[] iArr;
        yg9 yg9Var = (yg9) this.b;
        FrameLayout frameLayout = yg9Var.w0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f >= iArr[1]) {
                z = true;
            }
        }
        yg9Var.z0(z, true);
        return z;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        f8d f8dVar = new f8d((TaskCompletionSource) obj2);
        c9d c9dVar = (c9d) ((i8d) obj).k();
        Parcel e = c9dVar.e();
        int i = n8d.a;
        e.writeStrongBinder(f8dVar);
        n8d.c(e, (ih0) this.b);
        c9dVar.f(e, 1);
    }

    @Override
    public final void b(km9 km9Var, String str) {
        yg9 yg9Var = (yg9) this.b;
        xq2 xq2Var = yg9Var.A0;
        if (xq2Var == null) {
            xq2Var = new xq2(new ye9(this, (byte) 2), yg9Var.getResourceProvider());
            yg9Var.A0 = xq2Var;
        }
        xq2Var.z(km9Var, str);
    }

    @Override
    public final int c(View view) {
        return q79.y(view) - ((ViewGroup.MarginLayoutParams) ((r79) view.getLayoutParams())).topMargin;
    }

    @Override
    public final void d(int i) {
        ((yg9) this.b).p0(74, i);
    }

    @Override
    public final boolean d1() {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var == null || !ji9Var.a.W4()) {
                    return false;
                }
                return true;
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var == null || !ii9Var.a.W4()) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void e(dg9 dg9Var) {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var != null) {
                    pi9 pi9Var = ji9Var.a;
                    pi9Var.j4(dg9Var);
                    pi9Var.p3.j(dg9Var, true);
                    return;
                }
                return;
            case 5:
            default:
                xh9 xh9Var = ((xl9) this.b).F;
                if (xh9Var != null) {
                    pi9 pi9Var2 = xh9Var.a;
                    pi9Var2.j4(dg9Var);
                    pi9Var2.p3.j(dg9Var, true);
                    return;
                }
                return;
            case 6:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var != null) {
                    pi9 pi9Var3 = ii9Var.a;
                    pi9Var3.j4(dg9Var);
                    pi9Var3.p3.j(dg9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final x1c e0(int i, int i2) {
        x1c e0 = ((g84) this.b).e0(i, i2);
        if (i2 != 1) {
            return e0;
        }
        return new yo4(e0);
    }

    @Override
    public final void f() {
        int i;
        yg9 yg9Var = (yg9) this.b;
        di9 di9Var = yg9Var.Q.v3;
        if (di9Var != null && di9Var.w() && yg9Var.Q.F4()) {
            i = 1;
        } else {
            i = 0;
        }
        yg9Var.C0(i, true);
        yg9Var.D0();
        yg9Var.B0();
    }

    @Override
    public final void f2() {
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var != null) {
                    ji9Var.a.X3();
                    return;
                }
                return;
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var != null) {
                    ii9Var.a.X3();
                    return;
                }
                return;
        }
    }

    public final void g(j99 j99Var) {
        for (int i = 0; i < j99Var.d; i++) {
            ((HashSet) this.b).add(new h9a(((Integer) j99Var.get(i)).intValue()));
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        jcc jccVar;
        bna bnaVar = (bna) this.b;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(bnaVar.s)) {
                sb.append(bnaVar.s);
            }
            ana anaVar = bnaVar.r;
            if (anaVar != null && (jccVar = anaVar.e) != null) {
                CharSequence charSequence = (CharSequence) jccVar.g(0, Integer.valueOf(bnaVar.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) bnaVar.r.e.g(-1, Integer.valueOf(bnaVar.r.b()));
                CharSequence charSequence3 = (CharSequence) bnaVar.r.e.g(1, Integer.valueOf(bnaVar.r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence2);
                    sb.append(" – ");
                    sb.append(charSequence3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
            return null;
        } catch (Throwable th) {
            cc4.g(th, true);
            return bnaVar.s;
        }
    }

    @Override
    public final void h() {
        yg9 yg9Var = (yg9) this.b;
        yg9Var.J0 = yg9Var.L0;
        yg9Var.z0(false, false);
        yg9Var.C0(2, true);
    }

    @Override
    public final boolean i() {
        xl9 xl9Var = (xl9) this.b;
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null) {
            return xh9Var.a.W4();
        }
        return false;
    }

    @Override
    public final int i0() {
        ana anaVar = ((bna) this.b).r;
        if (anaVar == null) {
            return 0;
        }
        int[] iArr = anaVar.c;
        if (iArr != null) {
            return (iArr.length - 1) * anaVar.d;
        }
        return anaVar.a() - anaVar.b();
    }

    @Override
    public final boolean k() {
        if (((ky9) this.b).W.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ch9 ch9Var;
        xl9 xl9Var = (xl9) this.b;
        xh9 xh9Var = xl9Var.F;
        if (xh9Var != null && xl9Var.a != null && (ch9Var = xh9Var.a.R3) != null) {
            ch9Var.f(i, i2);
        }
    }

    @Override
    public final int m() {
        return ((q79) this.b).F();
    }

    @Override
    public final void m0(zy9 zy9Var) {
        ((g84) this.b).m0(zy9Var);
    }

    public final synchronized void n() {
        ((SharedPreferences) this.b).edit().clear().commit();
    }

    @Override
    public final void o(boolean z, float f) {
        int[] iArr;
        int round;
        bna bnaVar = (bna) this.b;
        ana anaVar = bnaVar.r;
        if (anaVar != null && bnaVar.n != null) {
            if (anaVar.c != null) {
                double length = f * (iArr.length - 1);
                int j = Utilities.j((int) Math.floor(length), bnaVar.r.c.length - 1, 0);
                int j2 = Utilities.j((int) Math.ceil(length), bnaVar.r.c.length - 1, 0);
                int[] iArr2 = bnaVar.r.c;
                round = Math.round(hl.U1(Math.round(((float) (length - Math.floor(length))) * bnaVar.r.d) / bnaVar.r.d, iArr2[j], iArr2[j2]));
            } else {
                round = Math.round(((bnaVar.r.a() - bnaVar.r.b()) * f) + anaVar.b());
            }
            int i = bnaVar.h;
            if (i != Integer.MIN_VALUE) {
                round = Math.max(round, i);
            }
            int i2 = bnaVar.f;
            if (i2 != round) {
                if (bnaVar.c(i2) != bnaVar.c(round)) {
                    hl.W3(bnaVar.e);
                }
                bnaVar.f = round;
                bnaVar.e(round, true);
                pcc pccVar = bnaVar.n;
                if (pccVar != null) {
                    pccVar.a(Integer.valueOf(bnaVar.f));
                }
            }
        }
    }

    @Override
    public final void o1(int i, int i2) {
        ch9 ch9Var;
        ch9 ch9Var2;
        switch (this.a) {
            case 4:
                ji9 ji9Var = ((xe9) this.b).P;
                if (ji9Var != null && (ch9Var = ji9Var.a.R3) != null) {
                    ch9Var.f(i, i2);
                    return;
                }
                return;
            default:
                ii9 ii9Var = ((mj9) this.b).O;
                if (ii9Var != null && (ch9Var2 = ii9Var.a.R3) != null) {
                    ch9Var2.f(i, i2);
                    return;
                }
                return;
        }
    }

    @Override
    public final void onComplete(Task task) {
        va1 va1Var = (va1) this.b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                va1Var.m(null);
                return;
            } else {
                va1Var.resumeWith(task.getResult());
                return;
            }
        }
        va1Var.resumeWith(new ge9(exception));
    }

    @Override
    public final void onContentChanged() {
        yg9 yg9Var = (yg9) this.b;
        if (yg9Var.z0 != null) {
            boolean j3 = yg9Var.Q.j3();
            yg9Var.M0 = j3;
            yg9Var.z0.h(j3);
            yg9Var.z0.invalidate();
        }
        di3 di3Var = yg9Var.z0;
        if (di3Var != null) {
            di3Var.setLocked(yg9Var.i0());
        }
        Runnable runnable = yg9Var.N0;
        hl.r(runnable);
        hl.d3(runnable, 1000L);
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = ((pqb) this.b).c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        pqb pqbVar = (pqb) this.b;
        Scroller scroller = pqbVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
            pqbVar.c.fling((int) pqbVar.Z1, 0, Math.round(-f), Math.round(f2), 0, (int) pqbVar.Y1, 0, Integer.MAX_VALUE);
            pqbVar.z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        pqb pqbVar = (pqb) this.b;
        Scroller scroller = pqbVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        pqbVar.Z1 = Utilities.i(pqbVar.Z1 + f, pqbVar.Y1, 0.0f);
        pqbVar.X0();
        pqbVar.z0.invalidate();
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onSuccess(Object obj) {
        pid pidVar = (pid) this.b;
        pidVar.h = (haa) obj;
        t91 t91Var = pidVar.g;
        if (t91Var != null) {
            t91Var.a();
        }
    }

    @Override
    public final void p(int i) {
        hea heaVar = (hea) this.b;
        kea keaVar = heaVar.L;
        heaVar.s = i;
        if (heaVar.w != i) {
            heaVar.d.clear();
        }
        int i2 = heaVar.K;
        if (heaVar.b() == 0 && !heaVar.e.e() && !heaVar.J) {
            keaVar.L1.e(false, true);
        } else {
            keaVar.s2.b(i2);
        }
        heaVar.f();
        int i3 = kea.T2;
        keaVar.E0(true);
    }

    @Override
    public final void q() {
        switch (this.a) {
            case 4:
                xe9 xe9Var = (xe9) this.b;
                ji9 ji9Var = xe9Var.P;
                if (ji9Var != null) {
                    ji9Var.a.U3(xe9Var.a);
                    return;
                }
                return;
            default:
                mj9 mj9Var = (mj9) this.b;
                ii9 ii9Var = mj9Var.O;
                if (ii9Var != null) {
                    ii9Var.a.U3(mj9Var.a);
                    return;
                }
                return;
        }
    }

    @Override
    public final void s(dg9 dg9Var, int i, int i2) {
        xh9 xh9Var;
        amb textSelectionHelper;
        xl9 xl9Var = (xl9) this.b;
        if (!xl9Var.H && i != i2 && (xh9Var = xl9Var.F) != null && (textSelectionHelper = xh9Var.a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.w() || textSelectionHelper.W != xl9Var) {
                xl9Var.post(new hz0(this, dg9Var, i2, textSelectionHelper, i, (byte) 5));
            }
        }
    }

    @Override
    public final void t(boolean z, float[] fArr) {
        ((ky9) this.b).W.d(z, fArr);
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        b29 y;
        boolean[] zArr = (boolean[]) this.b;
        if (z && (y = imageReceiver.y()) != null && !zArr[0]) {
            y.I(0, false, false);
            hl.c3(new zk1(y, (byte) 0));
            zArr[0] = true;
        }
    }

    @Override
    public final boolean w(dg9 dg9Var) {
        return false;
    }

    @Override
    public final void y(mk0 mk0Var) {
        yg9 yg9Var = (yg9) this.b;
        if (mk0Var != null && (mk0Var.b instanceof TL_iv.pageBlockMap) && hl.H1(yg9Var)) {
            n12 n12Var = new n12(yg9Var.getParentActivity(), yg9Var, false, false, false, yg9Var.getResourceProvider());
            n12Var.W3 = new sjf((byte) 24);
            n12Var.J1 = true;
            n12Var.u3.setVisibility(8);
            n12Var.t4 = new o48(yg9Var, mk0Var, n12Var, (byte) 6);
            n12Var.a1();
            n12Var.show();
        }
    }

    @Override
    public final void G() {
    }

    @Override
    public final void H() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void E(int i) {
    }

    @Override
    public final void U(dg9 dg9Var) {
    }

    @Override
    public final void X1(ArrayList arrayList) {
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
    }

    @Override
    public final void j(dg9 dg9Var, boolean z) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    public i09(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public i09(h8d h8dVar, ih0 ih0Var) {
        this.a = (byte) 27;
        this.b = ih0Var;
    }

    public i09() {
        this.a = (byte) 11;
        this.b = new HashSet();
    }

    public i09(byte b) {
        this.a = b;
    }

    public i09(ArrayList arrayList) {
        this.a = (byte) 15;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }
}
