package defpackage;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.m;
public final class m0 implements fd, nr7, l8, ay2, s69, eq7, fq7, x66, qy9, h22, on5, zbc, hj, ry4 {
    public final byte a;
    public final Object b;

    public m0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean C(View view) {
        return false;
    }

    @Override
    public final void H() {
        pm pmVar = (pm) this.b;
        pmVar.b();
        pmVar.f();
    }

    @Override
    public final l2d S(View view, l2d l2dVar) {
        zc zcVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                mq5 H0 = hl.H0(l2dVar, false);
                mq5 H02 = hl.H0(l2dVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = l2dVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), l2dVar);
                }
                return l2d.b;
            default:
                vh4 vh4Var = (vh4) obj;
                vh4Var.getClass();
                mq5 H03 = hl.H0(l2dVar, false);
                tb0 tb0Var = (tb0) vh4Var.d;
                if (tb0Var == view && (zcVar = tb0Var.b) != null) {
                    zcVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                return l2d.b;
        }
    }

    @Override
    public final void a(int i, ArrayList arrayList) {
        hl.d3(new a30((p1) this.b, arrayList, (byte) 4), 100L);
    }

    @Override
    public final void b(int i) {
        xd xdVar = (xd) this.b;
        if (i == 0) {
            xdVar.run();
        }
    }

    @Override
    public final void d(float r8, float r9, int r10, android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m0.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void e(boolean z) {
        m mVar = (m) this.b;
        tw twVar = mVar.M.L;
        if (twVar != null) {
            mVar.h = true;
            twVar.a(true);
        }
    }

    @Override
    public final void g(float f) {
        cu cuVar = (cu) this.b;
        r47 r47Var = cuVar.N;
        if (r47Var == null) {
            return;
        }
        r47Var.b0 = f;
        MediaController.z().k0(cuVar.N, f);
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
        si siVar = (si) this.b;
        try {
            if (i == 0) {
                siVar.setText(ob6.M0(2131751399, null));
            } else {
                siVar.setText(ob6.M0(2131745268, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void k(int i) {
        boolean z;
        byte b;
        eg0 eg0Var = (eg0) this.b;
        vy4 vy4Var = eg0Var.a;
        jy4 jy4Var = eg0Var.g;
        if (Build.VERSION.SDK_INT >= 31 && jy4Var != null) {
            ArrayList arrayList = jy4Var.a;
            if (eg0Var.l || vy4.f().a) {
                if (vsd.a(i, 4) || vsd.a(i, 2)) {
                    fz4 e = vy4Var.e();
                    ViewGroup viewGroup = eg0Var.n;
                    if (viewGroup != null) {
                        e.b(viewGroup.getY(), eg0Var.m.getWidth(), eg0Var.n.getY() + eg0Var.n.getHeight());
                    }
                    jy4Var.b = e.b;
                    while (jy4Var.b > arrayList.size()) {
                        arrayList.add(new hy4(arrayList.size()));
                    }
                    for (int i2 = 0; i2 < jy4Var.b; i2++) {
                        hy4 hy4Var = (hy4) arrayList.get(i2);
                        hy4Var.a.set(e.c(i2));
                        hy4Var.b(jy4Var.m, jy4Var.n, jy4Var.o);
                        hy4Var.c(jy4Var.k);
                        int i3 = jy4Var.p;
                        int i4 = jy4Var.q;
                        int i5 = jy4Var.r;
                        int i6 = jy4Var.s;
                        hy4Var.u = i3;
                        hy4Var.v = i4;
                        hy4Var.w = i5;
                        hy4Var.x = i6;
                    }
                }
                jy4Var.c = eg0Var.o;
                jy4Var.d = eg0Var.m;
                byte b2 = 1;
                if (vy4Var.j > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                if (jy4Var.l != z2) {
                    jy4Var.l = z2;
                    if (!z) {
                        b = 5;
                    } else {
                        b = 1;
                    }
                    jy4Var.m = b;
                    if (!z) {
                        b2 = 10;
                    }
                    jy4Var.n = b2;
                    jy4Var.o = Math.max((int) b, (int) b2);
                    for (int i7 = 0; i7 < jy4Var.b; i7++) {
                        ((hy4) arrayList.get(i7)).b(jy4Var.m, jy4Var.n, jy4Var.o);
                    }
                    jy4Var.f();
                }
                int i8 = vy4Var.k;
                int i9 = vy4Var.l;
                jy4Var.t = i8;
                jy4Var.u = i9;
                jy4Var.f();
                jy4Var.e();
                Runnable runnable = eg0Var.j;
                if (runnable != null) {
                    runnable.run();
                }
            }
        }
    }

    @Override
    public final void l(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((j9) obj).a(j, true);
                return;
            default:
                ((l9) obj).b(j);
                return;
        }
    }

    @Override
    public final boolean m() {
        return false;
    }

    @Override
    public final boolean n(float f) {
        return false;
    }

    @Override
    public final void o(KeyEvent keyEvent) {
        n8 n8Var;
        s7 s7Var = (s7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (n8Var = s7Var.d) != null && n8Var.isShowing()) {
            s7Var.d.d(true);
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new g0((yx) obj, (byte) 8));
                duration.start();
                return;
            default:
                de0 de0Var = (de0) obj;
                if (z && !z2) {
                    de0Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                s0 s0Var = (s0) obj;
                l01 g = idVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(s0Var.e2);
                ConnectionsManager.getInstance(s0Var.a).sendRequestTyped(deletetone, new ic((byte) 0), new p(s0Var, g, idVar, (byte) 2));
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 9:
            case 15:
            default:
                ((wy) obj).run();
                return;
            case 6:
                cc ccVar = (cc) obj;
                ccVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = ccVar.getMessagesController().o1(ccVar.S);
                updatestarrefprogram.commission_permille = 0;
                id idVar2 = new id(3, null, ccVar.getParentActivity());
                idVar2.q(150L);
                ccVar.getConnectionsManager().sendRequest(updatestarrefprogram, new qb(ccVar, idVar2, (byte) 0));
                return;
            case 7:
                ((pb) obj).run();
                return;
            case 8:
                id idVar3 = (id) obj;
                DialogInterface.OnCancelListener onCancelListener = idVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(idVar3);
                }
                idVar3.dismiss();
                return;
            case 10:
                ((kt) obj).run();
                return;
            case 11:
                ((te) obj).run();
                return;
            case 12:
                ((ue) obj).run();
                return;
            case 13:
                ((ge3) obj).run();
                return;
            case 14:
                ((e62) obj).run();
                idVar.dismiss();
                return;
            case 16:
                ((re2) obj).run();
                return;
            case 17:
                ((o97) obj).run();
                return;
        }
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        int i3;
        a70 a70Var = (a70) this.b;
        int i4 = i * 60;
        if (i == 0) {
            i3 = 71;
        } else {
            i3 = 70;
        }
        a70Var.H(i4, i3);
    }

    @Override
    public final void z(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void p() {
    }

    private final void s(ImageReceiver imageReceiver) {
    }

    private final void t(ImageReceiver imageReceiver) {
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void j(boolean z) {
    }

    private final void f(int i, Drawable drawable) {
    }

    private final void q(int i, Drawable drawable) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }
}
