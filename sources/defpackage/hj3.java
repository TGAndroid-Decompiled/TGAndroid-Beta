package defpackage;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class hj3 implements p8c {
    public final byte a;
    public final Object b;

    public hj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i;
        boolean z;
        TLRPC.User user;
        wjb wjbVar;
        wjb wjbVar2;
        String str;
        byte b = this.a;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((oj3) obj2).M((TLRPC.User) obj);
                return;
            case 1:
                na7.q1(((vj3) obj2).Q).z3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 2:
                TLRPC.User user2 = (TLRPC.User) obj;
                mt9 mt9Var = (mt9) ((bl3) obj2);
                hi3 hi3Var = mt9Var.L0;
                if (user2 != null) {
                    cj3 cj3Var = hi3Var.M0;
                    if (cj3Var != null) {
                        cj3Var.e3();
                    }
                    na7.q1(hi3Var.K0).z3(null, user2, null, 0, null, false, false);
                    mt9Var.Q(user2.id, user2);
                    return;
                }
                return;
            case 3:
                jm3 jm3Var = (jm3) obj2;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (jm3Var.r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(jm3Var.z())) {
                            if (jm3Var.J == null) {
                                jm3Var.J = jm3Var.z();
                            }
                            jm3Var.D(false);
                            jm3Var.w(charSequence2);
                            jm3Var.w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                jm3Var.getClass();
                return;
            case 4:
                lp3 lp3Var = (lp3) obj2;
                oac oacVar = (oac) obj;
                k27 k27Var = lp3Var.c;
                if (k27Var != null) {
                    k27Var.r0 = oacVar;
                    MediaController.w().g0(lp3Var.c, false, true, false);
                    return;
                }
                return;
            case 5:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) obj2).run();
                return;
            case 6:
                li3 li3Var = (li3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (li3Var != null) {
                    li3Var.run();
                    return;
                }
                return;
            case 7:
                m24 m24Var = (m24) obj2;
                int intValue = ((Integer) obj).intValue();
                if (m24Var.e) {
                    i = 2;
                } else if (m24Var.d) {
                    i = 0;
                } else {
                    i = 1;
                }
                if (intValue != i) {
                    if (intValue == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m24Var.d = z;
                    if (intValue == 2) {
                        z2 = true;
                    }
                    m24Var.e = z2;
                    qo0 qo0Var = m24Var.h;
                    if (qo0Var != null) {
                        qo0Var.a(Boolean.valueOf(m24Var.c), Boolean.valueOf(m24Var.d), Boolean.valueOf(m24Var.e));
                    }
                    if (m24Var.d && m24Var.getParentLayout() != null) {
                        for (d dVar : m24Var.getParentLayout().getFragmentStack()) {
                            if (dVar instanceof cj3) {
                                rh3 rh3Var = ((cj3) dVar).H3;
                                if (rh3Var.c()) {
                                    rh3Var.a();
                                }
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                Boolean bool = (Boolean) obj;
                ((kf4) obj2).e.f0(true);
                return;
            case 9:
                mi4 mi4Var = (mi4) obj2;
                mi4Var.h(-1.0f);
                gl.d3(new vc4(mi4Var, (Runnable) obj, (byte) 9), 80L);
                return;
            case 10:
                ((sr4) obj2).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + gl.L(80.0f)).setDuration(250L).setInterpolator(gb.w).start();
                return;
            case 11:
                ((nt4) obj2).F((TLObject) obj);
                return;
            case 12:
                Boolean bool2 = (Boolean) obj;
                ((sv4) obj2).a();
                return;
            case 13:
                ra raVar = (ra) obj2;
                if (((String) obj) == null) {
                    z4 = true;
                }
                raVar.a(Boolean.valueOf(z4));
                return;
            case 14:
                String str2 = (String) obj;
                w25.m("approve session", str2);
                ((f25) obj2).a(str2);
                return;
            case 15:
                o35 o35Var = (o35) obj2;
                o35Var.w = o35Var.d[((Integer) obj).intValue()];
                o35Var.Y(true);
                return;
            case 16:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((w65) obj2).c();
                return;
            case 17:
                Object[] objArr = (Object[]) obj;
                ((ee5) obj2).c(true);
                return;
            case 18:
                me5 me5Var = (me5) obj2;
                me5Var.f = (ArrayList) obj;
                va vaVar = me5Var.a;
                if (vaVar.H) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            case 19:
                yn5 yn5Var = (yn5) obj2;
                d9a d9aVar = (d9a) obj;
                c79 c79Var = yn5Var.a;
                if (d9aVar != null) {
                    float currentWeight = c79Var.getCurrentWeight();
                    d9aVar.f = currentWeight;
                    double d = yn5Var.p;
                    if (d > 0.0d) {
                        d9aVar.f = (float) ((d / yn5Var.q) * currentWeight);
                    }
                    if (d9aVar.a.n() == 4) {
                        d9aVar.k *= d9aVar.f;
                    }
                }
                gu7 painting = c79Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new cu7(painting, d9aVar, (byte) 1));
                    return;
                }
                return;
            case 20:
                Boolean bool3 = (Boolean) obj;
                String str3 = LaunchActivity.C1;
                ((wy5) obj2).run();
                return;
            case 21:
                ((h26) obj2).p1((HashMap) obj);
                return;
            case 22:
                a46 a46Var = (a46) obj2;
                Long l = (Long) obj;
                int i3 = a46Var.b;
                a46Var.c();
                if (l != null && l.longValue() > 0) {
                    user = na7.q1(i3).V1(l);
                } else {
                    user = null;
                }
                if (user != null && user.bot) {
                    kq0.a(LaunchActivity.S(), i3, user);
                    return;
                } else {
                    yjb.x(null, 2131747942, a46.d(), null);
                    return;
                }
            case 23:
                Boolean bool4 = (Boolean) obj;
                ((m66) obj2).c0();
                return;
            case 24:
                ve6 ve6Var = (ve6) obj2;
                String str4 = (String) obj;
                fa4.b("LoginBilling purchased done " + str4);
                if ("CANCELLED".equalsIgnoreCase(str4)) {
                    ve6Var.b.setLoading(false);
                    return;
                }
                return;
            case 25:
                lf6 lf6Var = (lf6) obj2;
                List list = (List) obj;
                if (lf6Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = lf6Var.getContext();
                        lh0 a = ch4.a(context, (v9c) list.get(0));
                        mf6 mf6Var = lf6Var.h0;
                        wjbVar = ((d) mf6Var).resourceProvider;
                        mfb mfbVar = new mfb(context, wjbVar);
                        if (a.b != null) {
                            mfbVar.f(k96.M0(2131750511, null), a.b, null, null);
                        }
                        if (a.a >= 0) {
                            mfbVar.f(k96.M0(2131750508, null), k96.a0(null, null, 2131750507, Integer.valueOf(a.a + 1)), null, null);
                        }
                        if (a.c != null) {
                            String M0 = k96.M0(2131750509, null);
                            if (a.c.startsWith("+")) {
                                str = p38.f().e(a.c);
                            } else {
                                str = a.c;
                            }
                            mfbVar.f(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(mfbVar, nme.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        boolean[] zArr = new boolean[1];
                        wjbVar2 = ((d) mf6Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, context);
                        String M02 = k96.M0(2131750505, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M02;
                        hdVar.U = k96.M0(2131750506, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.j(k96.M0(2131750510, null), new h45(lf6Var, zArr, (byte) 22));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        hdVar.setOnDismissListener(new ag(lf6Var, hdVar, zArr, (byte) 5));
                        lf6Var.d0 = hdVar;
                        hdVar.show();
                        return;
                    }
                    lf6Var.t(false);
                    return;
                }
                return;
            case 26:
                ot7 ot7Var = (ot7) obj2;
                TextureView textureView = (TextureView) obj;
                ot7Var.y0 = textureView;
                if (textureView != null) {
                    ot7Var.s0.addView(textureView, 0);
                    return;
                }
                return;
            case 27:
                l37 l37Var = (l37) obj2;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = l37Var.e.a;
                q27 q27Var = l37Var.f;
                if (((i37) arrayList2.get(q27Var.getCurrentPosition())).a != num.intValue()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            if (((i37) arrayList2.get(i4)).a == num.intValue()) {
                                i2 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (q27Var.getCurrentPosition() != i2) {
                        q27Var.E(i2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                f37 f37Var = (f37) obj2;
                f37Var.n.y(f37Var.f.T((View) obj));
                return;
            default:
                j47 j47Var = (j47) obj2;
                Integer num2 = (Integer) obj;
                j47Var.getClass();
                if (num2.intValue() - j47Var.d.d > gl.L(20.0f)) {
                    z3 = true;
                }
                j47Var.b0 = z3;
                float f = j47Var.c0;
                if (z3) {
                    f = Math.min(f, (j47Var.F.getHeight() - num2.intValue()) - j47Var.d0.getMeasuredHeight());
                }
                j47Var.d0.animate().translationY(f - j47Var.d0.getTop()).setDuration(250L).setInterpolator(gb.w).start();
                return;
        }
    }
}
