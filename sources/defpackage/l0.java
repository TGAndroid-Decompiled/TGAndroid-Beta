package defpackage;

import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.m;
public final class l0 implements ee, qq7, k8, qy2, g59, oac, oc, ip7, jp7, t66, zw9, c32, ln5, aac, gk {
    public final byte a;
    public final Object b;

    public l0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void A() {
        on onVar = (on) this.b;
        onVar.b();
        onVar.f();
    }

    @Override
    public final void B0(int i, Drawable drawable) {
        byte b = this.a;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        yd ydVar;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj;
                Drawable drawable = ActionBarLayout.w1;
                iq5 H0 = gm.H0(wzcVar, false);
                iq5 H02 = gm.H0(wzcVar, true);
                actionBarLayout.u1 = H0;
                actionBarLayout.v1 = H02;
                actionBarLayout.t1 = wzcVar;
                int childCount = actionBarLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    actionBarLayout.m(actionBarLayout.getChildAt(i), wzcVar);
                }
                return wzc.b;
            default:
                yh4 yh4Var = (yh4) obj;
                yh4Var.getClass();
                iq5 H03 = gm.H0(wzcVar, false);
                rc0 rc0Var = (rc0) yh4Var.d;
                if (rc0Var == view && (ydVar = rc0Var.b) != null) {
                    ydVar.setPadding(H03.a, H03.b, H03.c, H03.d);
                }
                return wzc.b;
        }
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        byte b = this.a;
    }

    @Override
    public final void a(int i, ArrayList arrayList) {
        gm.d3(new x30((o1) this.b, arrayList, (byte) 5), 100L);
    }

    @Override
    public final void b(int i) {
        uh uhVar = (uh) this.b;
        if (i == 0) {
            uhVar.run();
        }
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 23:
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                duration.addUpdateListener(new f0((yy) obj, (byte) 9));
                duration.start();
                return;
            default:
                bf0 bf0Var = (bf0) obj;
                if (z && !z2) {
                    bf0Var.a();
                    return;
                }
                return;
        }
    }

    @Override
    public final void d(float r8, float r9, int r10, android.view.View r11) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l0.d(float, float, int, android.view.View):void");
    }

    @Override
    public final void e(boolean z) {
        m mVar = (m) this.b;
        sx sxVar = mVar.M.L;
        if (sxVar != null) {
            mVar.h = true;
            sxVar.a(true);
        }
    }

    @Override
    public final void f(float f) {
        bv bvVar = (bv) this.b;
        k47 k47Var = bvVar.N;
        if (k47Var == null) {
            return;
        }
        k47Var.b0 = f;
        MediaController.w().h0(bvVar.N, f);
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        rj rjVar = (rj) this.b;
        try {
            if (i == 0) {
                rjVar.setText(jb6.M0(2131751371, null));
            } else {
                rjVar.setText(jb6.M0(2131745274, null));
            }
        } catch (Exception unused) {
        }
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        jc jcVar = (jc) this.b;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        if (!jcVar.l2 && c6cVar.d == 1) {
            Object obj3 = c6cVar.H;
            if (obj3 instanceof TL_agent.agentProvider) {
                TL_agent.agentProvider agentprovider = (TL_agent.agentProvider) obj3;
                jcVar.k2 = agentprovider;
                jcVar.g2.setText("");
                jcVar.c1(false);
                jcVar.j2.i(jb6.a0(null, null, 2131754294, agentprovider.title), false, true);
                jcVar.d1();
                jcVar.b2.g3.O(false);
                jcVar.Z1.b(1, true);
                gm.d3(new fc(jcVar, (byte) 1), 250L);
            }
        }
    }

    @Override
    public final boolean l() {
        return false;
    }

    @Override
    public final boolean m(float f) {
        return false;
    }

    @Override
    public final void n(long j) {
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
    public final void q(KeyEvent keyEvent) {
        m8 m8Var;
        r7 r7Var = (r7) this.b;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (m8Var = r7Var.d) != null && m8Var.isShowing()) {
            r7Var.d.d(true);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                r0 r0Var = (r0) obj;
                k11 g = heVar.g(-1, true, true);
                g.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(r0Var.e2);
                ConnectionsManager.getInstance(r0Var.a).sendRequestTyped(deletetone, new kc((byte) 0), new p(r0Var, g, heVar, (byte) 2));
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 9:
            default:
                ((wz) obj).run();
                return;
            case 6:
                ((rb) obj).run();
                return;
            case 7:
                bc bcVar = (bc) obj;
                bcVar.getClass();
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = bcVar.getMessagesController().n1(bcVar.S);
                updatestarrefprogram.commission_permille = 0;
                he heVar2 = new he(3, null, bcVar.getParentActivity());
                heVar2.q(150L);
                bcVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ob(bcVar, heVar2, (byte) 0));
                return;
            case 10:
                he heVar3 = (he) obj;
                DialogInterface.OnCancelListener onCancelListener = heVar3.K;
                if (onCancelListener != null) {
                    onCancelListener.onCancel(heVar3);
                }
                heVar3.dismiss();
                return;
            case 11:
                ((l97) obj).run();
                return;
            case 12:
                ((fu) obj).run();
                return;
            case 13:
                ((jg) obj).run();
                return;
            case 14:
                ((kg) obj).run();
                return;
            case 15:
                ((ze3) obj).run();
                return;
            case 16:
                ((z62) obj).run();
                heVar.dismiss();
                return;
            case 17:
                ((qf2) obj).run();
                return;
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        int i3;
        y70 y70Var = (y70) this.b;
        int i4 = i * 60;
        if (i == 0) {
            i3 = 71;
        } else {
            i3 = 70;
        }
        y70Var.l(i4, i3);
    }

    private final void t(ImageReceiver imageReceiver) {
    }

    private final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void j(boolean z) {
    }

    @Override
    public final void o() {
    }

    private final void i(int i, Drawable drawable) {
    }

    private final void s(int i, Drawable drawable) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }
}
