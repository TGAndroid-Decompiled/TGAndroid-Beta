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
public final class l0 implements ed, no7, k8, gx2, d39, en7, fn7, t46, wu9, q12, ll5, z7c, gj, mw4 {
    public final byte a;
    public final Object b;

    public l0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 21:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f0((xx) obj, (byte) 8));
                duration.start();
                return;
            default:
                be0 be0Var = (be0) obj;
                if (z && !z2) {
                    be0Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void D() {
        om omVar = (om) this.b;
        omVar.b();
        omVar.f();
    }

    @Override
    public final void E(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final vxc W(View view, vxc vxcVar) {
        yc ycVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                io5 H0 = gl.H0(vxcVar, false);
                io5 H02 = gl.H0(vxcVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = vxcVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), vxcVar);
                }
                return vxc.b;
            default:
                xf4 xf4Var = (xf4) obj;
                xf4Var.getClass();
                io5 H03 = gl.H0(vxcVar, false);
                rb0 rb0Var = (rb0) xf4Var.d;
                if (rb0Var == view && (ycVar = rb0Var.b) != null) {
                    ycVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                return vxc.b;
        }
    }

    @Override
    public final void a(int i, ArrayList arrayList) {
        gl.e3(new z20((o1) this.b, arrayList, (byte) 4), 100L);
    }

    @Override
    public final void b(int i) {
        ug ugVar = (ug) this.b;
        if (i == 0) {
            ugVar.run();
        }
    }

    @Override
    public final void d(boolean z) {
        m mVar = (m) this.b;
        sw swVar = mVar.M.L;
        if (swVar != null) {
            mVar.h = true;
            swVar.a(true);
        }
    }

    @Override
    public final void e(float r8, float r9, int r10, android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.e(float, float, int, android.view.View):void");
    }

    @Override
    public final void f(float f) {
        bu buVar = (bu) this.b;
        k27 k27Var = buVar.N;
        if (k27Var == null) {
            return;
        }
        k27Var.b0 = f;
        MediaController.w().h0(buVar.N, f);
    }

    @Override
    public final void i(hn7 hn7Var, int i) {
        ri riVar = (ri) this.b;
        try {
            if (i == 0) {
                riVar.setText(k96.M0(2131751422, null));
            } else {
                riVar.setText(k96.M0(2131745348, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void j(int i) {
        boolean z;
        byte b;
        dg0 dg0Var = (dg0) this.b;
        qw4 qw4Var = dg0Var.a;
        ew4 ew4Var = dg0Var.g;
        if (Build.VERSION.SDK_INT >= 31 && ew4Var != null) {
            ArrayList arrayList = ew4Var.a;
            if (dg0Var.l || qw4.f().a) {
                if (fod.a(i, 4) || fod.a(i, 2)) {
                    zw4 e = qw4Var.e();
                    ViewGroup viewGroup = dg0Var.n;
                    if (viewGroup != null) {
                        e.b(viewGroup.getY(), dg0Var.m.getWidth(), dg0Var.n.getY() + dg0Var.n.getHeight());
                    }
                    ew4Var.b = e.b;
                    while (ew4Var.b > arrayList.size()) {
                        arrayList.add(new cw4(arrayList.size()));
                    }
                    for (int i2 = 0; i2 < ew4Var.b; i2++) {
                        cw4 cw4Var = (cw4) arrayList.get(i2);
                        cw4Var.a.set(e.c(i2));
                        cw4Var.b(ew4Var.m, ew4Var.n, ew4Var.o);
                        cw4Var.c(ew4Var.k);
                        int i3 = ew4Var.p;
                        int i4 = ew4Var.q;
                        int i5 = ew4Var.r;
                        int i6 = ew4Var.s;
                        cw4Var.u = i3;
                        cw4Var.v = i4;
                        cw4Var.w = i5;
                        cw4Var.x = i6;
                    }
                }
                ew4Var.c = dg0Var.o;
                ew4Var.d = dg0Var.m;
                byte b2 = 1;
                if (qw4Var.j > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = !z;
                if (ew4Var.l != z2) {
                    ew4Var.l = z2;
                    if (!z) {
                        b = 5;
                    } else {
                        b = 1;
                    }
                    ew4Var.m = b;
                    if (!z) {
                        b2 = 10;
                    }
                    ew4Var.n = b2;
                    ew4Var.o = Math.max((int) b, (int) b2);
                    for (int i7 = 0; i7 < ew4Var.b; i7++) {
                        ((cw4) arrayList.get(i7)).b(ew4Var.m, ew4Var.n, ew4Var.o);
                    }
                    ew4Var.f();
                }
                int i8 = qw4Var.k;
                int i9 = qw4Var.l;
                ew4Var.t = i8;
                ew4Var.u = i9;
                ew4Var.f();
                ew4Var.e();
                Runnable runnable = dg0Var.j;
                if (runnable != null) {
                    runnable.run();
                }
            }
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
    public final void o(long j) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 3:
                ((i9) obj).a(j, true);
                return;
            default:
                ((k9) obj).b(j);
                return;
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final void r(KeyEvent keyEvent) {
        m8 m8Var;
        r7 r7Var = (r7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
            r7Var.d.d(true);
        }
    }

    @Override
    public final void s(int i, int i2, boolean z) {
        int i3;
        y60 y60Var = (y60) this.b;
        int i4 = i * 60;
        if (i == 0) {
            i3 = 71;
        } else {
            i3 = 70;
        }
        y60Var.n(i4, i3);
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r0 r0Var = (r0) obj;
                c01 g = hdVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(deletetone, new hc((byte) 0), new p(r0Var, g, hdVar, (byte) 2));
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            default:
                ((wy) obj).run();
                return;
            case 6:
                ((rb) obj).run();
                return;
            case 7:
                bc bcVar = (bc) obj;
                bcVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().m1(bcVar.S);
                updatestarrefprogram.commission_permille = 0;
                hd hdVar2 = new hd(3, null, bcVar.getParentActivity());
                hdVar2.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, hdVar2, (byte) 0));
                return;
            case 8:
                hd hdVar3 = (hd) obj;
                DialogInterface.OnCancelListener onCancelListener = hdVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(hdVar3);
                }
                hdVar3.dismiss();
                return;
            case 9:
                ((s67) obj).run();
                return;
            case 10:
                ((et) obj).run();
                return;
            case 11:
                ((kf) obj).run();
                return;
            case 12:
                ((lf) obj).run();
                return;
            case 13:
                ((nd3) obj).run();
                return;
            case 14:
                ((o52) obj).run();
                hdVar.dismiss();
                return;
            case 15:
                ((fe2) obj).run();
                return;
        }
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void c() {
    }

    @Override
    public final void p() {
    }

    private final void w(ImageReceiver imageReceiver) {
    }

    private final void x(ImageReceiver imageReceiver) {
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void k(boolean z) {
    }

    private final void g(int i, Drawable drawable) {
    }

    private final void t(int i, Drawable drawable) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }
}
