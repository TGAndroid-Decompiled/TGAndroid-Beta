package m2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.widget.EditText;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import k1.a0;
import n4.w;
import n4.x;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.Components.m91;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.o91;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bu0;
import org.telegram.ui.cc1;
import p4.u;
import p4.v;
import pg.s1;
import pg.u0;
import qg.v1;
import yh.f0;
import za.c0;
import zg.n0;
public final class t implements l2.i, k1.f, jp0, me.f, ah.j, m91, v1, com.google.android.gms.common.api.internal.o, n5.b, w2.d, Continuation, jl0 {
    public final int f15971a;
    public Object f15972b;

    public t(int i10, boolean z10) {
        this.f15971a = i10;
    }

    public boolean A(int i10) {
        f91 f91Var = ((o91) this.f15972b).L;
        if (f91Var == null) {
            return false;
        }
        return f91Var.c(i10);
    }

    public void B(c0 c0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.f15972b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new za.k(this)).a(new i5.a(null, c0Var, i5.d.f12014a, null), new j2.e(16));
    }

    @Override
    public void B0(ah.a aVar) {
        aVar.a(((mr0) this.f15972b).getThemedColor(i6.f20797d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void C(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15972b;
        jVar.f11042a = aVar;
        Iterator it = jVar.f11044c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11044c.clear();
        jVar.f11043b = null;
    }

    public void D(float f7) {
        o91 o91Var = (o91) this.f15972b;
        if (f7 == 1.0f) {
            View[] viewArr = o91Var.f29429e;
            View[] viewArr2 = o91Var.f29429e;
            if (viewArr[1] != null) {
                o91Var.F();
                o91Var.h.put(o91Var.f29430f[1], viewArr2[1]);
                o91Var.removeView(viewArr2[1]);
                o91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            o91Var.z(o91Var.f29427b);
            return;
        }
        View[] viewArr3 = o91Var.f29429e;
        View[] viewArr4 = o91Var.f29429e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (o91Var.f29436y) {
            o91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            o91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            o91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            o91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        o91Var.w(false);
    }

    public void E(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f15972b;
        if (pVar == eVar.f45348y && mVar != null) {
            u uVar = eVar.f45347x.f45446a;
            String d = mVar.d();
            v vVar = new v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f45348y, 3, eVar.f45347x, collection);
                eVar.f45347x = null;
                eVar.f45348y = null;
            }
        } else if (pVar == eVar.f45330e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public void F() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15972b;
        if (arrayDeque.isEmpty()) {
            return;
        }
        int size = arrayDeque.size();
        long H = H();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + H);
    }

    public void G(long j3) {
        long H = H();
        if (H != j3) {
            if (H != -1) {
                if (H == -2) {
                    H = -2;
                } else {
                    return;
                }
            }
            StringBuilder u10 = a1.g.u(j3, "expected non-string scope or scope ", " but found ");
            u10.append(H);
            throw new IOException(u10.toString());
        }
    }

    public long H() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15972b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void X(float f7, boolean z10) {
        cc1 cc1Var = (cc1) ((k0) this.f15972b);
        int i10 = (int) (i6.f21030q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        i6.f21030q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = cc1Var.f36625e.f38253e;
            am0 am0Var = (am0) themeActivity.f34531b.K(themeActivity.f34539f0);
            if (am0Var != null) {
                ((e9) am0Var.f47658a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (i6.f21030q * 100.0f))));
            }
            i6.E(true);
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    @Override
    public Object c(sd.p pVar, ld.c cVar) {
        return ((a0) this.f15972b).c(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public Object mo27get() {
        return new s5.i((Context) ((gd.a) this.f15972b).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public de.b getData() {
        return ((a0) this.f15972b).f14325c;
    }

    @Override
    public boolean h(float f7) {
        return false;
    }

    @Override
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public int i0() {
        return 0;
    }

    @Override
    public j k(long j3) {
        return (j) this.f15972b;
    }

    @Override
    public void l(Canvas canvas) {
        mr0 mr0Var = (mr0) this.f15972b;
        canvas.drawColor(mr0Var.getThemedColor(i6.f20797d6));
        if (SharedConfig.chatBlurEnabled()) {
            mr0Var.O0.b(canvas, -2);
        }
    }

    @Override
    public void m(View view, n0 n0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f15972b;
        tVar.f54662a.eb(null, tVar.f54665e, tVar.f54663b, view, 0.0f, 0.0f, n0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new f0(this, 13));
    }

    @Override
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override
    public boolean o() {
        return true;
    }

    @Override
    public void p() {
        ((o9) this.f15972b).f29410a.invalidate();
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void q0(float f7) {
        bu0 bu0Var = (bu0) this.f15972b;
        u0.e(bu0Var.P1).k(String.valueOf(pg.m.f45688a.indexOf(bu0Var.W0.getCurrentBrush())), f7);
        s1 s1Var = bu0Var.K1;
        s1Var.f45780c = f7;
        bu0Var.t0(s1Var, null);
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f15972b).call();
    }

    public String toString() {
        switch (this.f15971a) {
            case 17:
                se.b bVar = se.b.f47970e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f15972b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    @Override
    public long u() {
        return 0L;
    }

    @Override
    public boolean v() {
        return false;
    }

    @Override
    public long w(long j3) {
        return 1L;
    }

    @Override
    public void x(Object obj) {
        ((g8.c) obj).onLocationResult((LocationResult) this.f15972b);
    }

    @Override
    public long y(long j3, long j10) {
        return 1L;
    }

    public t(Object obj, int i10) {
        this.f15971a = i10;
        this.f15972b = obj;
    }

    public t(int i10) {
        this.f15971a = i10;
        switch (i10) {
            case 20:
                this.f15972b = new ob.a(28);
                return;
            case 23:
                this.f15972b = new CopyOnWriteArrayList();
                return;
            default:
                this.f15972b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        bu0 bu0Var = (bu0) this.f15972b;
        int i10 = bu0Var.P1;
        pg.m currentBrush = bu0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f45806i;
        }
        return u0.e(i10).f(String.valueOf(pg.m.f45688a.indexOf(currentBrush)), currentBrush.d());
    }

    public t(EditText editText) {
        this.f15971a = 12;
        this.f15972b = new n6.t(editText);
    }

    public t(Context context, x xVar) {
        this.f15971a = 2;
        w wVar = ((n4.r) xVar.f16612b).f16595c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15972b = new n4.j(context, wVar);
        } else {
            this.f15972b = new n4.j(context, wVar);
        }
    }

    @Override
    public void a() {
    }

    @Override
    public void j() {
    }

    @Override
    public void s() {
    }

    @Override
    public void z() {
    }

    @Override
    public void e(boolean z10) {
    }

    @Override
    public long d(long j3, long j10) {
        return j10;
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
