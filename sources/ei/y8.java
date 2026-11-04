package ei;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import ci.tb;
import ci.vb;
import com.google.android.gms.tasks.OnSuccessListener;
import gi.ja;
import gi.la;
import gi.va;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bd;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.o10;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.ui0;
public final class y8 implements r0.m, OnSuccessListener, o10, hj0, g9.g1, org.telegram.ui.ActionBar.p1, ui0, s10, tg.j1, CameraController.VideoTakeCallback, et0, e3.g, g2.p, h2.u {
    public final int f11250a;
    public final Object f11251b;

    public y8(Object obj, int i3) {
        this.f11250a = i3;
        this.f11251b = obj;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        int a10;
        r9 r9Var = (r9) this.f11251b;
        int i3 = 0;
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) r9Var.f10957w.getLayoutParams();
        if (!r9Var.f10914c) {
            i3 = k1Var.d();
        }
        marginLayoutParams.topMargin = i3;
        if (r9Var.f10914c) {
            a10 = k1Var.f54026a.f(2).d;
        } else {
            a10 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a10;
        marginLayoutParams.leftMargin = I0.f14495a;
        marginLayoutParams.rightMargin = I0.f14497c;
        e9 e9Var = r9Var.f10948s;
        if (e9Var != null) {
            e9Var.requestLayout();
        }
        f9 f9Var = r9Var.f10957w;
        if (f9Var != null) {
            f9Var.requestLayout();
        }
        return r0.k1.f54025b;
    }

    @Override
    public void a(long j10, g2.y yVar) {
        switch (this.f11250a) {
            case 28:
                e3.b.c(j10, yVar, ((l4.c0) this.f11251b).f17766c);
                return;
            default:
                e3.b.d(j10, yVar, ((l4.c0) this.f11251b).f17766c);
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        tp0 tp0Var = (tp0) this.f11251b;
        Integer num = (Integer) obj;
        if (((Integer) number).intValue() == -1) {
            new fi.p(tp0Var.f11631a, bd.M0(2131746701, null), new ai.v2(tp0Var, 18)).show();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    @Override
    public boolean f(int r6, android.view.View r7) {
        throw new UnsupportedOperationException("Method not decompiled: ei.y8.f(int, android.view.View):boolean");
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f11250a) {
            case 5:
                va vaVar = ((la) ((gi.r) this.f11251b)).S1;
                ja jaVar = vaVar.Y0;
                if (jaVar != null) {
                    jaVar.s(null, null, true);
                }
                gi.x9 x9Var = vaVar.f13770w1;
                if (x9Var != null) {
                    x9Var.n0();
                }
                la laVar = vaVar.f13710d1;
                if (laVar != null) {
                    laVar.setHasRoundVideo(false);
                }
                gi.f7 f7Var = vaVar.L1;
                if (f7Var != null) {
                    File file = f7Var.f12733o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        vaVar.L1.f12733o0 = null;
                    }
                    if (vaVar.L1.f12735p0 != null) {
                        try {
                            new File(vaVar.L1.f12735p0).delete();
                        } catch (Exception unused2) {
                        }
                        vaVar.L1.f12735p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ((gi.f5) this.f11251b).f12699a.Z1.r();
                return;
            case 13:
                ((ii.d) this.f11251b).run();
                return;
            default:
                ii.k kVar = (ii.k) this.f11251b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = kVar.getMessagesController().o1(kVar.S);
                updatestarrefprogram.commission_permille = 0;
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, kVar.getParentActivity(), null);
                s1Var2.r(150L);
                kVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ii.b(kVar, s1Var2, 0));
                return;
        }
    }

    @Override
    public void h() {
        ((gi.m1) this.f11251b).invalidate();
    }

    @Override
    public float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void invoke(Object obj) {
        switch (this.f11250a) {
            case 18:
                ((d2.c1) obj).u((d2.f) this.f11251b);
                return;
            case 19:
                ((d2.c1) obj).B((d2.s1) this.f11251b);
                return;
            case 20:
                ((d2.c1) obj).k((f2.c) this.f11251b);
                return;
            case 21:
                ((d2.c1) obj).L(((k2.c0) this.f11251b).f16459a.Q);
                return;
            case 22:
                ((d2.c1) obj).m((d2.s0) this.f11251b);
                return;
            case 23:
            default:
                ((l2.b) obj).d((w2.c0) this.f11251b);
                return;
            case 24:
                ((l2.b) obj).j((d2.x0) this.f11251b);
                return;
            case 25:
                ((l2.b) obj).onSeekStarted((l2.a) this.f11251b);
                return;
            case 26:
                ((l2.b) obj).t((k2.d) this.f11251b);
                return;
        }
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        switch (this.f11250a) {
            case 8:
                gi.o9 o9Var = (gi.o9) this.f11251b;
                r31 r31Var = (r31) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                int i3 = r31Var.d;
                gi.f7 f7Var = (gi.f7) r31Var.G;
                o9Var.c(false, true);
                va vaVar = o9Var.P;
                if (f7Var != vaVar.L1 && !vaVar.Y1) {
                    vaVar.f13714e1.setSelected(i3);
                    vaVar.Y1 = true;
                    cg.l0 l0Var = new cg.l0(vaVar, i3, 9);
                    gi.x9 x9Var = vaVar.f13770w1;
                    gi.f7 f7Var2 = vaVar.L1;
                    if (x9Var != null && f7Var2 != null) {
                        if (!x9Var.r0()) {
                            l0Var.run();
                            return;
                        }
                        f7Var2.f();
                        boolean r02 = x9Var.r0();
                        boolean z10 = x9Var.f13239y0.getPainting().E;
                        Utilities.f21389g.c(new gi.y8(vaVar, x9Var, f7Var2.f12722i0, f7Var2.f12724j0, f7Var2, z10, r02, l0Var, 0));
                        return;
                    }
                    l0Var.run();
                    return;
                }
                return;
            case 15:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                ii.s.a0((ii.s) this.f11251b, (r31) obj);
                return;
            default:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                ((ii.p4) this.f11251b).a0((r31) obj);
                return;
        }
    }

    @Override
    public long k(long j10) {
        e3.u uVar = (e3.u) this.f11251b;
        return g2.n0.j((j10 * uVar.f9513e) / 1000000, 0L, uVar.f9517j - 1);
    }

    @Override
    public Object l(Object obj, Object obj2) {
        return g9.o.y((List) ((Collection) obj2), new tf.b(((g9.l1) this.f11251b).f12100f, obj));
    }

    @Override
    public RecyclerView m(View view) {
        ((vb) this.f11251b).getClass();
        return ((tb) view).f6049a;
    }

    @Override
    public void o() {
        float f10;
        gi.x9 x9Var = (gi.x9) this.f11251b;
        TextView textView = x9Var.Y0;
        boolean a10 = x9Var.f13217n0.a();
        ImageView imageView = x9Var.X0;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f11 = 0.6f;
        if (a10) {
            f10 = 1.0f;
        } else {
            f10 = 0.6f;
        }
        animate.alpha(f10).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a10);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a10) {
            f11 = 1.0f;
        }
        animate2.alpha(f11).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a10);
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        gi.s9 s9Var = (gi.s9) this.f11251b;
        va vaVar = s9Var.f13580a;
        gi.h6 h6Var = vaVar.P0;
        int i3 = vaVar.f13706c;
        if (h6Var != null) {
            h6Var.g(true);
        }
        if (vaVar.p0()) {
            vaVar.f13755s.d();
        }
        if (vaVar.H1 != null && vaVar.C0 != null) {
            vaVar.R1 = false;
            vaVar.S1 = false;
            gi.c6 c6Var = vaVar.D0;
            if (c6Var != null) {
                c6Var.c(false);
            }
            if (j10 <= 800) {
                vaVar.g(false, true);
                vaVar.c0(false);
                vaVar.K0.b(false, true);
                gi.h6 h6Var2 = vaVar.P0;
                if (h6Var2 != null) {
                    h6Var2.g(true);
                }
                try {
                    vaVar.H1.delete();
                    vaVar.H1 = null;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                        return;
                    }
                }
                return;
            }
            vaVar.h0(false, true);
            gi.f7 o10 = gi.f7.o(vaVar.H1, str, j10);
            o10.J0 = vaVar.f13769w0;
            o10.K0 = vaVar.f13773x0;
            o10.B();
            vaVar.g(false, true);
            vaVar.c0(false);
            vaVar.K0.b(false, true);
            gi.h6 h6Var3 = vaVar.P0;
            if (h6Var3 != null) {
                h6Var3.g(true);
            }
            if (vaVar.B0.j()) {
                vaVar.H1 = null;
                o10.P = 1.0f;
                if (vaVar.B0.l(o10)) {
                    gi.f7 a10 = gi.f7.a(vaVar.B0.getLayout(), vaVar.B0.getContent());
                    vaVar.L1 = a10;
                    gi.u8.a(i3, a10);
                    vaVar.M1 = false;
                    int videoWidth = vaVar.C0.getVideoWidth();
                    int videoHeight = vaVar.C0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        gi.f7 f7Var = vaVar.L1;
                        f7Var.f12726k0 = videoWidth;
                        f7Var.f12728l0 = videoHeight;
                        f7Var.A();
                    }
                }
                vaVar.l0(true);
                return;
            }
            vaVar.L1 = o10;
            gi.u8.a(i3, o10);
            vaVar.M1 = false;
            int videoWidth2 = vaVar.C0.getVideoWidth();
            int videoHeight2 = vaVar.C0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                gi.f7 f7Var2 = vaVar.L1;
                f7Var2.f12726k0 = videoWidth2;
                f7Var2.f12728l0 = videoHeight2;
                f7Var2.A();
            }
            vaVar.K(new gi.q9(s9Var, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((e1.b) this.f11251b).invoke(obj);
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public y8(l2.a aVar, Object obj, int i3) {
        this.f11250a = i3;
        this.f11251b = obj;
    }

    public y8(l2.a aVar, w2.u uVar, w2.c0 c0Var, IOException iOException, boolean z10) {
        this.f11250a = 27;
        this.f11251b = c0Var;
    }
}
