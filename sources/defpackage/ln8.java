package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
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
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ProfileActivity;
public final class ln8 implements y60, vcc, rb9, we9, lc9, l74, ebc, yr9, zu9, ll5, OnCompleteListener, ms4, e9, c38, f69, OnSuccessListener {
    public final byte a;
    public Object b;

    public ln8(byte b) {
        this.a = b;
        switch (b) {
            case 13:
                this.b = new HashSet();
                return;
            default:
                this.b = new l69((byte) 26);
                return;
        }
    }

    @Override
    public final void B() {
        ((l74) this.b).B();
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        boolean[] zArr = (boolean[]) this.b;
        if (z && (y = imageReceiver.y()) != null && !zArr[0]) {
            y.I(0, false, false);
            gl.d3(new pk1(y, (byte) 0));
            zArr[0] = true;
        }
    }

    @Override
    public final int D() {
        return ((d49) this.b).F();
    }

    @Override
    public final void E1() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    se9Var.a.W3();
                    return;
                }
                return;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    re9Var.a.W3();
                    return;
                }
                return;
        }
    }

    @Override
    public final void F() {
        ((ProfileActivity) this.b).presentFragment(new v60());
        dismiss();
    }

    @Override
    public final boolean G(mc9 mc9Var) {
        return false;
    }

    @Override
    public final eib G0() {
        switch (this.a) {
            case 6:
                return (ib9) this.b;
            default:
                return (vf9) this.b;
        }
    }

    @Override
    public final void H(xe9 xe9Var, View view) {
        hd9 hd9Var = (hd9) this.b;
        cs5 I = cs5.I(hd9Var, view);
        I.T = true;
        hd9Var.getParentActivity();
        hd9Var.getResourceProvider();
        hd9Var.y0 = lf9.b(I, hd9Var, xe9Var, false);
    }

    @Override
    public final lk0 I0() {
        switch (this.a) {
            case 6:
                return ((ib9) this.b).a;
            default:
                return ((vf9) this.b).a;
        }
    }

    public final void J(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    @Override
    public final void K() {
        hd9 hd9Var = (hd9) this.b;
        int i = 0;
        hd9Var.y0(false, true);
        int i2 = hd9Var.J0;
        if (i2 != 2) {
            i = i2;
        }
        hd9Var.B0(i, true);
    }

    @Override
    public final int M() {
        d49 d49Var = (d49) this.b;
        return d49Var.n - d49Var.B();
    }

    @Override
    public final cs5 N(View view) {
        return cs5.I((hd9) this.b, view);
    }

    @Override
    public final void O(CharSequence charSequence) {
        ge9 ge9Var = ((ii9) this.b).F;
        if (ge9Var != null && charSequence != null && charSequence.length() > 0) {
            ge9Var.a.u4(charSequence.toString());
        }
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    @Override
    public final void P() {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.D0();
        jh3 jh3Var = hd9Var.z0;
        if (jh3Var == null) {
            return;
        }
        jh3Var.setLocked(hd9Var.i0());
    }

    @Override
    public final boolean P0() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var == null || !se9Var.a.V4()) {
                    return false;
                }
                return true;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var == null || !re9Var.a.V4()) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final void Q(ve9 ve9Var, View view) {
        hd9 hd9Var = (hd9) this.b;
        cs5 I = cs5.I(hd9Var, view);
        I.T = true;
        hd9Var.y0 = lf9.c(I, hd9Var, hd9Var.getParentActivity(), hd9Var.getResourceProvider(), ve9Var, false);
    }

    @Override
    public final wxb T(int i, int i2) {
        wxb T = ((l74) this.b).T(i, i2);
        if (i2 != 1) {
            return T;
        }
        return new tm4(T);
    }

    @Override
    public final void U(Editable editable) {
        ii9 ii9Var = (ii9) this.b;
        lk0 lk0Var = ii9Var.a;
        if (lk0Var != null) {
            lk0Var.s = true;
            lk0Var.r = ii9Var.r.q2;
        }
        ii9Var.w();
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            ge9Var.a();
        }
    }

    @Override
    public final void U0(int i, int i2) {
        ld9 ld9Var;
        ld9 ld9Var2;
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null && (ld9Var = se9Var.a.R3) != null) {
                    ld9Var.f(i, i2);
                    return;
                }
                return;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null && (ld9Var2 = re9Var.a.R3) != null) {
                    ld9Var2.f(i, i2);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean U1(int i) {
        if (i == ((qaa) this.b).r) {
            return true;
        }
        return false;
    }

    @Override
    public final View Z(int i) {
        return ((d49) this.b).q(i);
    }

    @Override
    public final boolean a(float f) {
        int[] iArr;
        hd9 hd9Var = (hd9) this.b;
        FrameLayout frameLayout = hd9Var.w0;
        boolean z = false;
        if (frameLayout != null) {
            frameLayout.getLocationOnScreen(new int[2]);
            if (f >= iArr[1]) {
                z = true;
            }
        }
        hd9Var.y0(z, true);
        return z;
    }

    @Override
    public final int a0() {
        hja hjaVar = ((ija) this.b).r;
        if (hjaVar == null) {
            return 0;
        }
        int[] iArr = hjaVar.c;
        if (iArr != null) {
            return (iArr.length - 1) * hjaVar.d;
        }
        return hjaVar.a() - hjaVar.b();
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        o3d o3dVar = new o3d((TaskCompletionSource) obj2);
        l4d l4dVar = (l4d) ((r3d) obj).k();
        Parcel e = l4dVar.e();
        int i = w3d.a;
        e.writeStrongBinder(o3dVar);
        w3d.c(e, (hh0) this.b);
        l4dVar.f(e, 1);
    }

    @Override
    public final void b(wi9 wi9Var, String str) {
        hd9 hd9Var = (hd9) this.b;
        eq2 eq2Var = hd9Var.A0;
        if (eq2Var == null) {
            eq2Var = new eq2(new k88(this, (byte) 25), hd9Var.getResourceProvider());
            hd9Var.A0 = eq2Var;
        }
        eq2Var.z(wi9Var, str);
    }

    @Override
    public final boolean b0(boolean z) {
        return false;
    }

    @Override
    public final void c(int i) {
        ((hd9) this.b).p0(74, i);
    }

    @Override
    public final void d(mc9 mc9Var) {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    ye9 ye9Var = se9Var.a;
                    ye9Var.i4(mc9Var);
                    ye9Var.p3.g(mc9Var, true);
                    return;
                }
                return;
            case 7:
            default:
                ge9 ge9Var = ((ii9) this.b).F;
                if (ge9Var != null) {
                    ye9 ye9Var2 = ge9Var.a;
                    ye9Var2.i4(mc9Var);
                    ye9Var2.p3.g(mc9Var, true);
                    return;
                }
                return;
            case 8:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    ye9 ye9Var3 = re9Var.a;
                    ye9Var3.i4(mc9Var);
                    ye9Var3.p3.g(mc9Var, true);
                    return;
                }
                return;
        }
    }

    @Override
    public final int d0(View view) {
        return d49.v(view) + ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).bottomMargin;
    }

    @Override
    public final void d1() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null) {
                    ye9 ye9Var = se9Var.a;
                    ld9 ld9Var = ye9Var.R3;
                    if (ld9Var != null) {
                        ld9Var.g();
                    }
                    ye9Var.p3.onContentChanged();
                    return;
                }
                return;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null) {
                    ye9 ye9Var2 = re9Var.a;
                    ld9 ld9Var2 = ye9Var2.R3;
                    if (ld9Var2 != null) {
                        ld9Var2.g();
                    }
                    ye9Var2.p3.onContentChanged();
                    return;
                }
                return;
        }
    }

    @Override
    public final void dismiss() {
        ((ProfileActivity) this.b).T0.U(null, null);
    }

    @Override
    public final void e() {
        int i;
        hd9 hd9Var = (hd9) this.b;
        me9 me9Var = hd9Var.Q.v3;
        if (me9Var != null && me9Var.w() && hd9Var.Q.E4()) {
            i = 1;
        } else {
            i = 0;
        }
        hd9Var.B0(i, true);
        hd9Var.C0();
        hd9Var.A0();
    }

    @Override
    public final void f() {
        hd9 hd9Var = (hd9) this.b;
        hd9Var.J0 = hd9Var.L0;
        hd9Var.y0(false, false);
        hd9Var.B0(2, true);
    }

    @Override
    public final void f0(fv9 fv9Var) {
        ((l74) this.b).f0(fv9Var);
    }

    @Override
    public final CharSequence getContentDescription() {
        j8c j8cVar;
        ija ijaVar = (ija) this.b;
        try {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(ijaVar.s)) {
                sb.append(ijaVar.s);
            }
            hja hjaVar = ijaVar.r;
            if (hjaVar != null && (j8cVar = hjaVar.e) != null) {
                CharSequence charSequence = (CharSequence) j8cVar.g(0, Integer.valueOf(ijaVar.f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb.length() > 0) {
                        sb.append(", ");
                    }
                    sb.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) ijaVar.r.e.g(-1, Integer.valueOf(ijaVar.r.b()));
                CharSequence charSequence3 = (CharSequence) ijaVar.r.e.g(1, Integer.valueOf(ijaVar.r.a()));
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
            fa4.g(th, true);
            return ijaVar.s;
        }
    }

    @Override
    public final boolean i() {
        ii9 ii9Var = (ii9) this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null) {
            return ge9Var.a.V4();
        }
        return false;
    }

    @Override
    public final void j(boolean z, float f) {
        int[] iArr;
        int round;
        ija ijaVar = (ija) this.b;
        hja hjaVar = ijaVar.r;
        if (hjaVar != null && ijaVar.n != null) {
            if (hjaVar.c != null) {
                double length = f * (iArr.length - 1);
                int j = Utilities.j((int) Math.floor(length), ijaVar.r.c.length - 1, 0);
                int j2 = Utilities.j((int) Math.ceil(length), ijaVar.r.c.length - 1, 0);
                int[] iArr2 = ijaVar.r.c;
                round = Math.round(gl.U1(Math.round(((float) (length - Math.floor(length))) * ijaVar.r.d) / ijaVar.r.d, iArr2[j], iArr2[j2]));
            } else {
                round = Math.round(((ijaVar.r.a() - ijaVar.r.b()) * f) + hjaVar.b());
            }
            int i = ijaVar.h;
            if (i != Integer.MIN_VALUE) {
                round = Math.max(round, i);
            }
            int i2 = ijaVar.f;
            if (i2 != round) {
                if (ijaVar.c(i2) != ijaVar.c(round)) {
                    gl.X3(ijaVar.e);
                }
                ijaVar.f = round;
                ijaVar.e(round, true);
                p8c p8cVar = ijaVar.n;
                if (p8cVar != null) {
                    p8cVar.a(Integer.valueOf(ijaVar.f));
                }
            }
        }
    }

    @Override
    public final boolean k() {
        if (((qu9) this.b).W.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void l(int i, int i2) {
        ld9 ld9Var;
        ii9 ii9Var = (ii9) this.b;
        ge9 ge9Var = ii9Var.F;
        if (ge9Var != null && ii9Var.a != null && (ld9Var = ge9Var.a.R3) != null) {
            ld9Var.f(i, i2);
        }
    }

    @Override
    public final void m() {
        switch (this.a) {
            case 6:
                ib9 ib9Var = (ib9) this.b;
                se9 se9Var = ib9Var.P;
                if (se9Var != null) {
                    se9Var.a.T3(ib9Var.a);
                    return;
                }
                return;
            default:
                vf9 vf9Var = (vf9) this.b;
                re9 re9Var = vf9Var.O;
                if (re9Var != null) {
                    re9Var.a.T3(vf9Var.a);
                    return;
                }
                return;
        }
    }

    @Override
    public final void n(int i, int i2) {
        int i3;
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        RectF rectF = ProfileActivity.Z6;
        long a = profileActivity.a();
        profileActivity.getMessagesController().M4(i, a);
        if (profileActivity.w2 == null && profileActivity.v2 == null) {
            return;
        }
        UndoView undoView = profileActivity.M;
        TLRPC.User V1 = profileActivity.getMessagesController().V1(Long.valueOf(a));
        TLRPC.UserFull userFull = profileActivity.w2;
        if (userFull != null) {
            i3 = userFull.ttl_period;
        } else {
            i3 = profileActivity.v2.ttl_period;
        }
        undoView.k(a, i2, V1, Integer.valueOf(i3), null, null);
    }

    @Override
    public final Object n0(ua9 ua9Var) {
        bp9 bp9Var = (bp9) this.b;
        bp9Var.a = ua9Var;
        return bp9Var;
    }

    @Override
    public final void o(boolean z, float[] fArr) {
        ((qu9) this.b).W.d(z, fArr);
    }

    @Override
    public final void onComplete(Task task) {
        na1 na1Var = (na1) this.b;
        Exception exception = task.getException();
        if (exception == null) {
            if (task.isCanceled()) {
                na1Var.m(null);
                return;
            } else {
                na1Var.resumeWith(task.getResult());
                return;
            }
        }
        na1Var.resumeWith(new sa9(exception));
    }

    @Override
    public final void onContentChanged() {
        hd9 hd9Var = (hd9) this.b;
        if (hd9Var.z0 != null) {
            boolean i3 = hd9Var.Q.i3();
            hd9Var.M0 = i3;
            hd9Var.z0.h(i3);
            hd9Var.z0.invalidate();
        }
        jh3 jh3Var = hd9Var.z0;
        if (jh3Var != null) {
            jh3Var.setLocked(hd9Var.i0());
        }
        Runnable runnable = hd9Var.N0;
        gl.r(runnable);
        gl.e3(runnable, 1000L);
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        Scroller scroller = ((qmb) this.b).c;
        if (scroller != null) {
            scroller.abortAnimation();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        qmb qmbVar = (qmb) this.b;
        Scroller scroller = qmbVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
            qmbVar.c.fling((int) qmbVar.Z1, 0, Math.round(-f), Math.round(f2), 0, (int) qmbVar.Y1, 0, Integer.MAX_VALUE);
            qmbVar.z0.postInvalidate();
            return true;
        }
        return true;
    }

    @Override
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        qmb qmbVar = (qmb) this.b;
        Scroller scroller = qmbVar.c;
        if (scroller != null) {
            scroller.abortAnimation();
        }
        qmbVar.Z1 = Utilities.i(qmbVar.Z1 + f, qmbVar.Y1, 0.0f);
        qmbVar.W0();
        qmbVar.z0.invalidate();
        return true;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onSuccess(Object obj) {
        ydd yddVar = (ydd) this.b;
        yddVar.h = (p6a) obj;
        k91 k91Var = yddVar.g;
        if (k91Var != null) {
            k91Var.a();
        }
    }

    public final void p(w59 w59Var) {
        for (int i = 0; i < w59Var.d; i++) {
            ((HashSet) this.b).add(new p5a(((Integer) w59Var.get(i)).intValue()));
        }
    }

    public final defpackage.xl3 q(defpackage.tg2 r41) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ln8.q(tg2):xl3");
    }

    @Override
    public final void r(int i) {
        qaa qaaVar = (qaa) this.b;
        taa taaVar = qaaVar.L;
        qaaVar.s = i;
        if (qaaVar.w != i) {
            qaaVar.d.clear();
        }
        int i2 = qaaVar.K;
        if (qaaVar.b() == 0 && !qaaVar.e.e() && !qaaVar.J) {
            taaVar.L1.e(false, true);
        } else {
            taaVar.s2.b(i2);
        }
        qaaVar.f();
        int i3 = taa.T2;
        taaVar.D0(true);
    }

    @Override
    public final fib s0() {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var == null) {
                    return null;
                }
                return se9Var.a.getTextSelectionHelper();
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var == null) {
                    return null;
                }
                return re9Var.a.getTextSelectionHelper();
        }
    }

    @Override
    public final void t(mc9 mc9Var, int i, int i2) {
        ge9 ge9Var;
        fib textSelectionHelper;
        ii9 ii9Var = (ii9) this.b;
        if (!ii9Var.H && i != i2 && (ge9Var = ii9Var.F) != null && (textSelectionHelper = ge9Var.a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.w() || textSelectionHelper.W != ii9Var) {
                ii9Var.post(new zy0(this, mc9Var, i2, textSelectionHelper, i, (byte) 5));
            }
        }
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final int u(View view) {
        return d49.y(view) - ((ViewGroup.MarginLayoutParams) ((e49) view.getLayoutParams())).topMargin;
    }

    @Override
    public final void w(lk0 lk0Var) {
        hd9 hd9Var = (hd9) this.b;
        if (lk0Var != null && (lk0Var.b instanceof TL_iv.pageBlockMap) && gl.H1(hd9Var)) {
            x02 x02Var = new x02(hd9Var.getParentActivity(), hd9Var, false, false, false, hd9Var.getResourceProvider());
            x02Var.W3 = new cff((byte) 24);
            x02Var.J1 = true;
            x02Var.u3.setVisibility(8);
            x02Var.t4 = new lt2(hd9Var, lk0Var, x02Var, (byte) 27);
            x02Var.Z0();
            x02Var.show();
        }
    }

    public final void y(vk9 vk9Var) {
        eq2 eq2Var = (eq2) this.b;
        eq2Var.a = vk9Var;
        Iterator it = ((LinkedList) eq2Var.b).iterator();
        while (it.hasNext()) {
            ((d2d) it.next()).b();
        }
        ((LinkedList) eq2Var.b).clear();
    }

    @Override
    public final void y0(CharSequence charSequence) {
        switch (this.a) {
            case 6:
                se9 se9Var = ((ib9) this.b).P;
                if (se9Var != null && charSequence != null && charSequence.length() > 0) {
                    se9Var.a.u4(charSequence.toString());
                    return;
                }
                return;
            default:
                re9 re9Var = ((vf9) this.b).O;
                if (re9Var != null && charSequence != null && charSequence.length() > 0) {
                    re9Var.a.u4(charSequence.toString());
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean z(mc9 mc9Var) {
        return false;
    }

    @Override
    public final void A() {
    }

    @Override
    public final void I() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void Y(mc9 mc9Var) {
    }

    @Override
    public final void m2(ArrayList arrayList) {
    }

    @Override
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void x(int i) {
    }

    public ln8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ln8(q3d q3dVar, hh0 hh0Var) {
        this.a = (byte) 28;
        this.b = hh0Var;
    }

    public ln8(byte b, boolean z) {
        this.a = b;
    }

    public ln8(ArrayList arrayList) {
        this.a = (byte) 17;
        this.b = DesugarCollections.unmodifiableList(arrayList);
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }

    @Override
    public final void g(mc9 mc9Var, boolean z) {
    }
}
