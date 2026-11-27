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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class zj3 implements pcc {
    public final byte a;
    public final Object b;

    public zj3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i;
        boolean z;
        TLRPC.User user;
        vnb vnbVar;
        vnb vnbVar2;
        String str;
        byte b = this.a;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((gk3) obj2).M((TLRPC.User) obj);
                return;
            case 1:
                uc7.s1(((nk3) obj2).Q).G3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 2:
                TLRPC.User user2 = (TLRPC.User) obj;
                gx9 gx9Var = (gx9) ((tl3) obj2);
                bj3 bj3Var = gx9Var.L0;
                if (user2 != null) {
                    uj3 uj3Var = bj3Var.M0;
                    if (uj3Var != null) {
                        uj3Var.g3();
                    }
                    uc7.s1(bj3Var.K0).G3(null, user2, null, 0, null, false, false);
                    gx9Var.Q(user2.id, user2);
                    return;
                }
                return;
            case 3:
                bn3 bn3Var = (bn3) obj2;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (bn3Var.r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(bn3Var.B())) {
                            if (bn3Var.J == null) {
                                bn3Var.J = bn3Var.B();
                            }
                            bn3Var.G(false);
                            bn3Var.y(charSequence2);
                            bn3Var.w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                bn3Var.getClass();
                return;
            case 4:
                cq3 cq3Var = (cq3) obj2;
                oec oecVar = (oec) obj;
                r47 r47Var = cq3Var.c;
                if (r47Var != null) {
                    r47Var.r0 = oecVar;
                    MediaController.z().j0(cq3Var.c, false, true, false);
                    return;
                }
                return;
            case 5:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) obj2).run();
                return;
            case 6:
                lw3 lw3Var = (lw3) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (lw3Var != null) {
                    lw3Var.run();
                    return;
                }
                return;
            case 7:
                h34 h34Var = (h34) obj2;
                int intValue = ((Integer) obj).intValue();
                if (h34Var.e) {
                    i = 2;
                } else if (h34Var.d) {
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
                    h34Var.d = z;
                    if (intValue == 2) {
                        z2 = true;
                    }
                    h34Var.e = z2;
                    qo0 qo0Var = h34Var.h;
                    if (qo0Var != null) {
                        qo0Var.a(Boolean.valueOf(h34Var.c), Boolean.valueOf(h34Var.d), Boolean.valueOf(h34Var.e));
                    }
                    if (h34Var.d && h34Var.getParentLayout() != null) {
                        for (e eVar : h34Var.getParentLayout().getFragmentStack()) {
                            if (eVar instanceof uj3) {
                                li3 li3Var = ((uj3) eVar).H3;
                                if (li3Var.c()) {
                                    li3Var.a();
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
                ((ih4) obj2).e.f0(true);
                return;
            case 9:
                rk4 rk4Var = (rk4) obj2;
                rk4Var.h(-1.0f);
                hl.d3(new se4(rk4Var, (Runnable) obj, (byte) 6), 80L);
                return;
            case 10:
                ((wt4) obj2).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + hl.L(80.0f)).setDuration(250L).setInterpolator(hb.w).start();
                return;
            case 11:
                ((rv4) obj2).F((TLObject) obj);
                return;
            case 12:
                Boolean bool2 = (Boolean) obj;
                ((xx4) obj2).a();
                return;
            case 13:
                sa saVar = (sa) obj2;
                if (((String) obj) == null) {
                    z4 = true;
                }
                saVar.a(Boolean.valueOf(z4));
                return;
            case 14:
                String str2 = (String) obj;
                a55.m("approve session", str2);
                ((o45) obj2).a(str2);
                return;
            case 15:
                r55 r55Var = (r55) obj2;
                r55Var.w = r55Var.d[((Integer) obj).intValue()];
                r55Var.Y(true);
                return;
            case 16:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((y85) obj2).c();
                return;
            case 17:
                Object[] objArr = (Object[]) obj;
                ((fg5) obj2).c(true);
                return;
            case 18:
                ng5 ng5Var = (ng5) obj2;
                ng5Var.f = (ArrayList) obj;
                wa waVar = ng5Var.a;
                if (waVar.H) {
                    waVar.g3.O(true);
                    return;
                }
                return;
            case 19:
                bq5 bq5Var = (bq5) obj2;
                tca tcaVar = (tca) obj;
                pa9 pa9Var = bq5Var.a;
                if (tcaVar != null) {
                    float currentWeight = pa9Var.getCurrentWeight();
                    tcaVar.f = currentWeight;
                    double d = bq5Var.p;
                    if (d > 0.0d) {
                        tcaVar.f = (float) ((d / bq5Var.q) * currentWeight);
                    }
                    if (tcaVar.a.n() == 4) {
                        tcaVar.k *= tcaVar.f;
                    }
                }
                nx7 painting = pa9Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new jx7(painting, tcaVar, (byte) 1));
                    return;
                }
                return;
            case 20:
                Boolean bool3 = (Boolean) obj;
                String str3 = LaunchActivity.C1;
                ((w06) obj2).run();
                return;
            case 21:
                ((l46) obj2).q1((HashMap) obj);
                return;
            case 22:
                e66 e66Var = (e66) obj2;
                Long l = (Long) obj;
                int i3 = e66Var.b;
                e66Var.c();
                if (l != null && l.longValue() > 0) {
                    user = uc7.s1(i3).X1(l);
                } else {
                    user = null;
                }
                if (user != null && user.bot) {
                    kq0.a(LaunchActivity.S(), i3, user);
                    return;
                } else {
                    xnb.x(null, 2131747865, e66.d(), null);
                    return;
                }
            case 23:
                Boolean bool4 = (Boolean) obj;
                ((q86) obj2).c0();
                return;
            case 24:
                zg6 zg6Var = (zg6) obj2;
                String str4 = (String) obj;
                cc4.b("LoginBilling purchased done " + str4);
                if ("CANCELLED".equalsIgnoreCase(str4)) {
                    zg6Var.b.setLoading(false);
                    return;
                }
                return;
            case 25:
                ph6 ph6Var = (ph6) obj2;
                List list = (List) obj;
                if (ph6Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = ph6Var.getContext();
                        mh0 a = dj4.a(context, (vdc) list.get(0));
                        qh6 qh6Var = ph6Var.h0;
                        vnbVar = ((e) qh6Var).resourceProvider;
                        hjb hjbVar = new hjb(context, vnbVar);
                        if (a.b != null) {
                            hjbVar.f(ob6.M0(2131750488, null), a.b, null, null);
                        }
                        if (a.a >= 0) {
                            hjbVar.f(ob6.M0(2131750485, null), ob6.a0(null, null, 2131750484, Integer.valueOf(a.a + 1)), null, null);
                        }
                        if (a.c != null) {
                            String M0 = ob6.M0(2131750486, null);
                            if (a.c.startsWith("+")) {
                                str = f78.f().e(a.c);
                            } else {
                                str = a.c;
                            }
                            hjbVar.f(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(hjbVar, tre.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        boolean[] zArr = new boolean[1];
                        vnbVar2 = ((e) qh6Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, context);
                        String M02 = ob6.M0(2131750482, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M02;
                        idVar.U = ob6.M0(2131750483, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.j(ob6.M0(2131750487, null), new u34(ph6Var, zArr, (byte) 27));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        idVar.setOnDismissListener(new cf(ph6Var, idVar, zArr, (byte) 6));
                        ph6Var.d0 = idVar;
                        idVar.show();
                        return;
                    }
                    ph6Var.t(false);
                    return;
                }
                return;
            case 26:
                vw7 vw7Var = (vw7) obj2;
                TextureView textureView = (TextureView) obj;
                vw7Var.y0 = textureView;
                if (textureView != null) {
                    vw7Var.s0.addView(textureView, 0);
                    return;
                }
                return;
            case 27:
                s57 s57Var = (s57) obj2;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = s57Var.e.a;
                x47 x47Var = s57Var.f;
                if (((p57) arrayList2.get(x47Var.getCurrentPosition())).a != num.intValue()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            if (((p57) arrayList2.get(i4)).a == num.intValue()) {
                                i2 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (x47Var.getCurrentPosition() != i2) {
                        x47Var.F(i2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                m57 m57Var = (m57) obj2;
                m57Var.n.y(m57Var.f.U((View) obj));
                return;
            default:
                q67 q67Var = (q67) obj2;
                Integer num2 = (Integer) obj;
                q67Var.getClass();
                if (num2.intValue() - q67Var.d.d > hl.L(20.0f)) {
                    z3 = true;
                }
                q67Var.b0 = z3;
                float f = q67Var.c0;
                if (z3) {
                    f = Math.min(f, (q67Var.F.getHeight() - num2.intValue()) - q67Var.d0.getMeasuredHeight());
                }
                q67Var.d0.animate().translationY(f - q67Var.d0.getTop()).setDuration(250L).setInterpolator(hb.w).start();
                return;
        }
    }
}
