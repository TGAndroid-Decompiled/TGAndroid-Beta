package n4;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Parcel;
import android.util.Log;
import android.view.GestureDetector;
import android.view.View;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.l91;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.pp0;
import org.telegram.ui.Components.s91;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.u91;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.ec1;
import pg.r1;
import pg.t0;
import qg.v1;
import s4.d1;
import s4.i0;
import s4.q0;
import z7.ce;
public final class l implements pp0, me.f, ah.j, s91, v1, com.google.android.gms.common.api.internal.s, s4.f0, n5.b, OnCompleteListener, y2.g {
    public final Object f16325a;

    public l(Object obj) {
        this.f16325a = obj;
    }

    public static void n(String str, TreeMap treeMap) {
        String[] split = str.split(":", 2);
        if (split.length < 2) {
            return;
        }
        String trim = split[0].trim();
        String trim2 = split[1].trim();
        List list = (List) treeMap.get(trim);
        if (list == null) {
            list = new ArrayList();
            treeMap.put(trim, list);
        }
        list.add(trim2);
    }

    @Override
    public void A() {
        ((o9) this.f16325a).f29098a.invalidate();
    }

    @Override
    public void C(y2.i iVar, long j3, long j10) {
        boolean z10;
        l2.d dVar = (l2.d) this.f16325a;
        synchronized (z2.b.f53710b) {
            z10 = z2.b.f53711c;
        }
        if (!z10) {
            dVar.f15068a.x(new IOException(new ConcurrentModificationException()));
            return;
        }
        dVar.a();
    }

    @Override
    public void D(int i10, int i11) {
        ((i0) this.f16325a).p(i10, i11);
    }

    @Override
    public void L0(int i10, int i11) {
        ((i0) this.f16325a).t(i10, i11);
    }

    @Override
    public void X(float f7, boolean z10) {
        ec1 ec1Var = (ec1) ((k0) this.f16325a);
        int i10 = (int) (h6.f20792q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        h6.f20792q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = ec1Var.f37061e.f39178e;
            gm0 gm0Var = (gm0) themeActivity.f34368b.K(themeActivity.f34376f0);
            if (gm0Var != null) {
                ((e9) gm0Var.f47889a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.f20792q * 100.0f))));
            }
            h6.E(true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        r7.z zVar = (r7.z) ((r7.k) obj).u();
        r7.f fVar = new r7.f(1, (TaskCompletionSource) obj2);
        Parcel N0 = zVar.N0();
        r7.d.c(N0, (g8.e) this.f16325a);
        r7.d.d(N0, fVar);
        N0.writeString(null);
        zVar.R0(N0, 63);
    }

    public boolean b(int i10) {
        l91 l91Var = ((u91) this.f16325a).L;
        if (l91Var == null) {
            return false;
        }
        return l91Var.c(i10);
    }

    public void c(s4.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f16325a;
        int i10 = aVar.f47833a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f3167x.X(recyclerView, aVar.f47834b, aVar.d);
                    return;
                }
                recyclerView.f3167x.a0(recyclerView, aVar.f47834b, aVar.d, aVar.f47835c);
                return;
            }
            recyclerView.f3167x.Y(recyclerView, aVar.f47834b, aVar.d);
            return;
        }
        recyclerView.f3167x.V(recyclerView, aVar.f47834b, aVar.d);
    }

    public void d(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f16325a;
        int L = recyclerView.f3143e.L();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < L; i15++) {
            View K = recyclerView.f3143e.K(i15);
            d1 U = RecyclerView.U(K);
            if (U != null && !U.r() && (i13 = U.f47891c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f47898l) == 0) {
                    if (U.f47899m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f47899m = arrayList;
                        U.f47900n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f47899m.add(obj);
                }
                ((q0) K.getLayoutParams()).f48013c = true;
            }
        }
        pf.e eVar = recyclerView.f3138b;
        ArrayList arrayList2 = (ArrayList) eVar.f45459e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            d1 d1Var = (d1) arrayList2.get(size);
            if (d1Var != null && (i12 = d1Var.f47891c) >= i10 && i12 < i14) {
                d1Var.a(2);
                eVar.f(size);
            }
        }
        recyclerView.f3170y0 = true;
    }

    public void e(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f16325a;
        int L = recyclerView.f3143e.L();
        for (int i12 = 0; i12 < L; i12++) {
            d1 U = RecyclerView.U(recyclerView.f3143e.K(i12));
            if (U != null && !U.r() && U.f47891c >= i10) {
                U.n(i11, false);
                recyclerView.f3163u0.f47843f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3138b.f45459e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            d1 d1Var = (d1) arrayList.get(i13);
            if (d1Var != null && d1Var.f47891c >= i10) {
                d1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3168x0 = true;
    }

    public void f(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f16325a;
        int L = recyclerView.f3143e.L();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < L; i20++) {
            d1 U = RecyclerView.U(recyclerView.f3143e.K(i20));
            if (U != null && (i18 = U.f47891c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f3163u0.f47843f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f3138b.f45459e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            d1 d1Var = (d1) arrayList.get(i21);
            if (d1Var != null && (i17 = d1Var.f47891c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    d1Var.n(i11 - i10, false);
                } else {
                    d1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f3168x0 = true;
    }

    @Override
    public void g0(ah.a aVar) {
        aVar.a(((sr0) this.f16325a).getThemedColor(h6.f20559d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    @Override
    public Object mo27get() {
        String packageName = ((Context) ((gd.a) this.f16325a).mo27get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public boolean i(float f7) {
        return false;
    }

    @Override
    public void i0(int i10, int i11) {
        ((i0) this.f16325a).s(i10, i11);
    }

    @Override
    public void j1(int i10, int i11) {
        ((i0) this.f16325a).r(i10, i11, null);
    }

    public void k(float f7) {
        u91 u91Var = (u91) this.f16325a;
        if (f7 == 1.0f) {
            View[] viewArr = u91Var.f31114e;
            View[] viewArr2 = u91Var.f31114e;
            if (viewArr[1] != null) {
                u91Var.F();
                u91Var.h.put(u91Var.f31115f[1], viewArr2[1]);
                u91Var.removeView(viewArr2[1]);
                u91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            u91Var.z(u91Var.f31112b);
            return;
        }
        View[] viewArr3 = u91Var.f31114e;
        View[] viewArr4 = u91Var.f31114e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (u91Var.f31121y) {
            u91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            u91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            u91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            u91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        u91Var.w(false);
    }

    @Override
    public void l(Canvas canvas) {
        sr0 sr0Var = (sr0) this.f16325a;
        canvas.drawColor(sr0Var.getThemedColor(h6.f20559d6));
        if (SharedConfig.chatBlurEnabled()) {
            sr0Var.O0.b(canvas, -2);
        }
    }

    @Override
    public void l0(float f7) {
        cu0 cu0Var = (cu0) this.f16325a;
        t0.e(cu0Var.P1).k(String.valueOf(pg.m.f45582a.indexOf(cu0Var.W0.getCurrentBrush())), f7);
        r1 r1Var = cu0Var.K1;
        r1Var.f45653c = f7;
        cu0Var.t0(r1Var, null);
    }

    public void m(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f16325a;
        if (pVar == eVar.f45235y && mVar != null) {
            p4.v vVar = eVar.f45234x.f45336a;
            String d = mVar.d();
            p4.w wVar = new p4.w(vVar, d, eVar.b(vVar, d), false);
            wVar.i(mVar);
            if (eVar.d != wVar) {
                eVar.h(eVar, wVar, eVar.f45235y, 3, eVar.f45234x, collection);
                eVar.f45234x = null;
                eVar.f45235y = null;
            }
        } else if (pVar == eVar.f45217e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public int m0() {
        return 0;
    }

    public void o(aa.b bVar, TreeMap treeMap) {
        String str;
        List list = (List) treeMap.get("Sec-WebSocket-Protocol");
        if (list != null && (str = (String) list.get(0)) != null && str.length() != 0) {
            synchronized (((sc.u) this.f16325a).f48172c) {
            }
            throw new sc.n(19, "The protocol contained in the Sec-WebSocket-Protocol header is not supported: ".concat(str), bVar);
        }
    }

    @Override
    public void onComplete(Task task) {
        y8.e0 e0Var = (y8.e0) this.f16325a;
        if (task.isSuccessful()) {
            x8.m.L0(e0Var, true, (byte[]) task.getResult());
            return;
        }
        Log.e("WearableLS", "Failed to resolve future, sending null response", task.getException());
        x8.m.L0(e0Var, false, null);
    }

    public void p() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16325a;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long r10 = r();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + r10);
    }

    public void q(long j3) {
        long r10 = r();
        if (r10 != j3) {
            if (r10 != -1) {
                if (r10 == -2) {
                    r10 = -2;
                } else {
                    return;
                }
            }
            StringBuilder u10 = a1.g.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(r10);
            throw new IOException(u10.toString());
        }
    }

    public long r() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f16325a;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public k4.d x(y2.i iVar, long j3, long j10, IOException iOException, int i10) {
        ((l2.d) this.f16325a).f15068a.x(iOException);
        return y2.l.f51918e;
    }

    public l(int i10) {
        switch (i10) {
            case 23:
                this.f16325a = new ce[zf.b.values().length];
                return;
            default:
                this.f16325a = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        cu0 cu0Var = (cu0) this.f16325a;
        int i10 = cu0Var.P1;
        pg.m currentBrush = cu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return t0.e(i10).f45685i;
        }
        return t0.e(i10).f(String.valueOf(pg.m.f45582a.indexOf(currentBrush)), currentBrush.d());
    }

    public l(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this.f16325a = new GestureDetector(context, onGestureListener, null);
    }

    public l(EditText editText) {
        this.f16325a = new n6.k(editText);
    }

    public l(Context context, y yVar) {
        x xVar = ((s) yVar.f16362b).f16345c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f16325a = new j(context, xVar);
        } else {
            this.f16325a = new j(context, xVar);
        }
    }

    public l(int i10, int i11) {
        this.f16325a = ApplicationLoader.applicationContext.getSharedPreferences(a1.g.m(i10, i11, "pip_layout_", "_"), 0);
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void z() {
    }

    @Override
    public void g(boolean z10) {
    }

    @Override
    public void H(y2.i iVar, long j3, long j10, boolean z10) {
    }

    @Override
    public void y(y2.i iVar, long j3, long j10, int i10) {
    }
}
