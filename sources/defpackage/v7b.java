package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.SurfaceView;
import org.telegram.messenger.ImageReceiver;
public final class v7b extends AnimatorListenerAdapter {
    public final byte a;
    public final m8b b;

    public v7b(m8b m8bVar, byte b) {
        this.a = b;
        this.b = m8bVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        y28 w;
        ty8 ty8Var;
        byte b = this.a;
        m8b m8bVar = this.b;
        y28 y28Var = null;
        switch (b) {
            case 0:
                super.onAnimationEnd(animator);
                j8b j8bVar = m8bVar.t0;
                b8b b8bVar = m8bVar.w;
                if (b8bVar != null) {
                    b8bVar.a(true);
                }
                m8bVar.l();
                m8bVar.J0.e();
                k2b k2bVar = m8bVar.u1;
                if (k2bVar != null) {
                    k2bVar.b();
                    gl.B2(m8bVar.u1);
                    m8bVar.u1 = null;
                }
                ImageReceiver imageReceiver = j8bVar.b;
                if (imageReceiver != null) {
                    imageReceiver.v0(true, true);
                    j8bVar.b = null;
                }
                ImageReceiver imageReceiver2 = j8bVar.c;
                if (imageReceiver2 != null) {
                    imageReceiver2.setAlpha(1.0f);
                    j8bVar.c.v0(true, true);
                }
                if (j8bVar.d != null && (w = m8bVar.w()) != null && (ty8Var = w.e1.d) != null) {
                    ty8 ty8Var2 = j8bVar.d;
                    ty8Var2.getClass();
                    ty8Var2.c = ty8Var.c;
                    ty8Var2.f = ty8Var.f;
                    ty8Var2.b = ty8Var.b;
                    ty8Var2.a = System.currentTimeMillis();
                    ty8Var2.c();
                }
                c30 c30Var = m8bVar.G0;
                if (c30Var != null) {
                    c30Var.m();
                }
                SurfaceView surfaceView = m8bVar.D0;
                if (surfaceView != null) {
                    surfaceView.setVisibility(4);
                }
                m8bVar.M();
                try {
                    gl.d3(new kya(this, (byte) 20));
                } catch (Exception unused) {
                }
                m8bVar.n0 = false;
                m8bVar.d = false;
                g28 g28Var = m8bVar.o1;
                if (g28Var != null) {
                    g28Var.run();
                    m8bVar.o1 = null;
                    return;
                }
                return;
            case 1:
                m8bVar.I = null;
                m8bVar.a0 = 0.0f;
                m8bVar.e0 = 0.0f;
                c8b c8bVar = m8bVar.o0;
                if (c8bVar != null) {
                    y28Var = c8bVar.getCurrentPeerView();
                }
                if (y28Var != null) {
                    y28Var.invalidate();
                    return;
                }
                return;
            default:
                j8b j8bVar2 = m8bVar.t0;
                m8bVar.V = 1.0f;
                m8bVar.l();
                m8b.x1 = false;
                b8b b8bVar2 = m8bVar.w;
                if (b8bVar2 != null) {
                    b8bVar2.a(true);
                }
                a8b a8bVar = m8bVar.s;
                if (a8bVar != null) {
                    a8bVar.invalidate();
                }
                ImageReceiver imageReceiver3 = j8bVar2.b;
                if (imageReceiver3 != null && !m8bVar.d) {
                    imageReceiver3.v0(true, true);
                    j8bVar2.b = null;
                }
                ImageReceiver imageReceiver4 = j8bVar2.c;
                if (imageReceiver4 != null && !m8bVar.d) {
                    imageReceiver4.setAlpha(1.0f);
                    j8bVar2.c.v0(true, true);
                    j8bVar2.c = null;
                }
                y28 w2 = m8bVar.w();
                if (w2 != null) {
                    w2.c1(false);
                }
                t76 t76Var = m8bVar.B0;
                if (t76Var != null) {
                    t76Var.F((1.0f - m8bVar.W) * m8bVar.V);
                }
                if (m8bVar.w1) {
                    m8bVar.w1 = false;
                    m8bVar.m();
                    gl.e3(new g28(m8bVar, (byte) 1), 30L);
                } else if (!gba.T) {
                    if (m8bVar.u1 == null && m8bVar.w != null) {
                        k2b k2bVar2 = new k2b(m8bVar.w.getContext(), m8bVar.s);
                        m8bVar.u1 = k2bVar2;
                        k2bVar2.setAlpha(0.0f);
                        m8bVar.w.addView(m8bVar.u1);
                    }
                    k2b k2bVar3 = m8bVar.u1;
                    if (k2bVar3 != null) {
                        k2bVar3.setOnClickListener(new bna(this, (byte) 15));
                        m8bVar.u1.animate().alpha(1.0f).setDuration(150L).setListener(new f8b(this, (byte) 1)).start();
                    }
                    gba.F(true);
                }
                m8bVar.U();
                m8bVar.J0.e();
                return;
        }
    }
}
