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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Cells.k0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.q91;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.au0;
import org.telegram.ui.bc1;
import p4.u;
import p4.v;
import pg.s1;
import pg.u0;
import qg.v1;
import yh.f0;
import za.b0;
import zg.n0;
public final class t implements l2.i, k1.f, lp0, me.f, ah.j, o91, v1, com.google.android.gms.common.api.internal.o, n5.b, w2.d, Continuation, ll0 {
    public final int f15996a;
    public Object f15997b;

    public t(int i10, boolean z10) {
        this.f15996a = i10;
    }

    @Override
    public long A(long j3, long j10) {
        return 1L;
    }

    public void B(b0 b0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.f15997b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new za.k(this)).a(new i5.a(null, b0Var, i5.d.f12013a, null), new j2.e(16));
    }

    @Override
    public void B0(ah.a aVar) {
        aVar.a(((or0) this.f15997b).getThemedColor(h6.f20786d6));
        aVar.b(SharedConfig.chatBlurEnabled());
    }

    public void C(aa.a aVar) {
        h8.j jVar = (h8.j) this.f15997b;
        jVar.f11041a = aVar;
        Iterator it = jVar.f11043c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11043c.clear();
        jVar.f11042b = null;
    }

    public void D(float f7) {
        q91 q91Var = (q91) this.f15997b;
        if (f7 == 1.0f) {
            View[] viewArr = q91Var.f30096e;
            View[] viewArr2 = q91Var.f30096e;
            if (viewArr[1] != null) {
                q91Var.F();
                q91Var.h.put(q91Var.f30097f[1], viewArr2[1]);
                q91Var.removeView(viewArr2[1]);
                q91Var.E(viewArr2[0], 0.0f);
                viewArr2[1] = null;
            }
            q91Var.z(q91Var.f30094b);
            return;
        }
        View[] viewArr3 = q91Var.f30096e;
        View[] viewArr4 = q91Var.f30096e;
        View view = viewArr3[1];
        if (view == null) {
            return;
        }
        if (q91Var.f30103y) {
            q91Var.E(view, (1.0f - f7) * viewArr3[0].getMeasuredWidth());
            View view2 = viewArr4[0];
            q91Var.E(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            q91Var.E(view, (1.0f - f7) * (-viewArr3[0].getMeasuredWidth()));
            View view3 = viewArr4[0];
            q91Var.E(view3, view3.getMeasuredWidth() * f7);
        }
        q91Var.w(false);
    }

    public void E(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f15997b;
        if (pVar == eVar.f45382y && mVar != null) {
            u uVar = eVar.f45381x.f45480a;
            String d = mVar.d();
            v vVar = new v(uVar, d, eVar.b(uVar, d), false);
            vVar.i(mVar);
            if (eVar.d != vVar) {
                eVar.h(eVar, vVar, eVar.f45382y, 3, eVar.f45381x, collection);
                eVar.f45381x = null;
                eVar.f45382y = null;
            }
        } else if (pVar == eVar.f45364e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    public void F() {
        ArrayDeque arrayDeque = (ArrayDeque) this.f15997b;
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
        ArrayDeque arrayDeque = (ArrayDeque) this.f15997b;
        if (arrayDeque.isEmpty()) {
            return 0L;
        }
        return ((Long) arrayDeque.peek()).longValue();
    }

    @Override
    public void X(float f7, boolean z10) {
        bc1 bc1Var = (bc1) ((k0) this.f15997b);
        int i10 = (int) (h6.f21019q * 100.0f);
        int i11 = (int) (f7 * 100.0f);
        h6.f21019q = f7;
        if (i10 != i11) {
            ThemeActivity themeActivity = bc1Var.f36342e.f38011e;
            cm0 cm0Var = (cm0) themeActivity.f34559b.K(themeActivity.f34567f0);
            if (cm0Var != null) {
                ((e9) cm0Var.f47748a).setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (h6.f21019q * 100.0f))));
            }
            h6.E(true);
        }
    }

    @Override
    public long b(long j3) {
        return 0L;
    }

    @Override
    public Object c(sd.p pVar, ld.c cVar) {
        return ((a0) this.f15997b).c(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override
    public Object mo27get() {
        return new s5.i((Context) ((gd.a) this.f15997b).mo27get(), "com.google.android.datatransport.events", Integer.valueOf(s5.i.d).intValue());
    }

    @Override
    public CharSequence getContentDescription() {
        return " ";
    }

    @Override
    public de.b getData() {
        return ((a0) this.f15997b).f14324c;
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
    public int i0() {
        return 0;
    }

    @Override
    public j k(long j3) {
        return (j) this.f15997b;
    }

    @Override
    public void l(Canvas canvas) {
        or0 or0Var = (or0) this.f15997b;
        canvas.drawColor(or0Var.getThemedColor(h6.f20786d6));
        if (SharedConfig.chatBlurEnabled()) {
            or0Var.O0.b(canvas, -2);
        }
    }

    @Override
    public void m(View view, n0 n0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f15997b;
        tVar.f54749a.eb(null, tVar.f54752e, tVar.f54750b, view, 0.0f, 0.0f, n0Var, false, z10, z11, false);
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

    public boolean p(int i10) {
        h91 h91Var = ((q91) this.f15997b).L;
        if (h91Var == null) {
            return false;
        }
        return h91Var.c(i10);
    }

    @Override
    public boolean q() {
        return false;
    }

    @Override
    public void q0(float f7) {
        au0 au0Var = (au0) this.f15997b;
        u0.e(au0Var.P1).k(String.valueOf(pg.m.f45722a.indexOf(au0Var.W0.getCurrentBrush())), f7);
        s1 s1Var = au0Var.K1;
        s1Var.f45814c = f7;
        au0Var.t0(s1Var, null);
    }

    @Override
    public boolean t() {
        return true;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f15997b).call();
    }

    public String toString() {
        switch (this.f15996a) {
            case 17:
                se.b bVar = se.b.f48060e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((ra.a) this.f15997b).n());
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
        ((g8.c) obj).onLocationResult((LocationResult) this.f15997b);
    }

    @Override
    public void y() {
        ((o9) this.f15997b).f29338a.invalidate();
    }

    public t(Object obj, int i10) {
        this.f15996a = i10;
        this.f15997b = obj;
    }

    public t(int i10) {
        this.f15996a = i10;
        switch (i10) {
            case 20:
                this.f15997b = new ob.a(28);
                return;
            case 23:
                this.f15997b = new CopyOnWriteArrayList();
                return;
            default:
                this.f15997b = new ArrayDeque(16);
                return;
        }
    }

    @Override
    public float get() {
        au0 au0Var = (au0) this.f15997b;
        int i10 = au0Var.P1;
        pg.m currentBrush = au0Var.W0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f45840i;
        }
        return u0.e(i10).f(String.valueOf(pg.m.f45722a.indexOf(currentBrush)), currentBrush.d());
    }

    public t(EditText editText) {
        this.f15996a = 12;
        this.f15997b = new n6.k(editText);
    }

    public t(Context context, x xVar) {
        this.f15996a = 2;
        w wVar = ((n4.r) xVar.f16658b).f16641c;
        DesugarCollections.synchronizedSet(new HashSet());
        if (Build.VERSION.SDK_INT >= 29) {
            this.f15997b = new n4.j(context, wVar);
        } else {
            this.f15997b = new n4.j(context, wVar);
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
    public void g(boolean z10) {
    }

    @Override
    public long d(long j3, long j10) {
        return j10;
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
