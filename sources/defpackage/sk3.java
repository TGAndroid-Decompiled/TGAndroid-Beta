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
public final class sk3 implements qac {
    public final byte a;
    public final Object b;

    public sk3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(Object obj) {
        int i;
        boolean z;
        TLRPC.User user;
        ylb ylbVar;
        ylb ylbVar2;
        String str;
        byte b = this.a;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        boolean z4 = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((zk3) obj2).M((TLRPC.User) obj);
                return;
            case 1:
                oc7.r1(((gl3) obj2).Q).B3(null, (TLRPC.User) obj, null, 0, null, false, false);
                return;
            case 2:
                TLRPC.User user2 = (TLRPC.User) obj;
                ov9 ov9Var = (ov9) ((mm3) obj2);
                sj3 sj3Var = ov9Var.L0;
                if (user2 != null) {
                    nk3 nk3Var = sj3Var.M0;
                    if (nk3Var != null) {
                        nk3Var.g3();
                    }
                    oc7.r1(sj3Var.K0).B3(null, user2, null, 0, null, false, false);
                    ov9Var.Q(user2.id, user2);
                    return;
                }
                return;
            case 3:
                un3 un3Var = (un3) obj2;
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    if (un3Var.r == 3) {
                        String charSequence2 = charSequence.toString();
                        if (!charSequence2.equals(un3Var.z())) {
                            if (un3Var.J == null) {
                                un3Var.J = un3Var.z();
                            }
                            un3Var.D(false);
                            un3Var.w(charSequence2);
                            un3Var.w.setRevert(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                un3Var.getClass();
                return;
            case 4:
                vq3 vq3Var = (vq3) obj2;
                rcc rccVar = (rcc) obj;
                k47 k47Var = vq3Var.c;
                if (k47Var != null) {
                    k47Var.r0 = rccVar;
                    MediaController.w().g0(vq3Var.c, false, true, false);
                    return;
                }
                return;
            case 5:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                ((Runnable) obj2).run();
                return;
            case 6:
                a14 a14Var = (a14) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (a14Var != null) {
                    a14Var.run();
                    return;
                }
                return;
            case 7:
                x34 x34Var = (x34) obj2;
                int intValue = ((Integer) obj).intValue();
                if (x34Var.e) {
                    i = 2;
                } else if (x34Var.d) {
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
                    x34Var.d = z;
                    if (intValue == 2) {
                        z2 = true;
                    }
                    x34Var.e = z2;
                    qp0 qp0Var = x34Var.h;
                    if (qp0Var != null) {
                        qp0Var.a(Boolean.valueOf(x34Var.c), Boolean.valueOf(x34Var.d), Boolean.valueOf(x34Var.e));
                    }
                    if (x34Var.d && x34Var.getParentLayout() != null) {
                        for (d dVar : x34Var.getParentLayout().getFragmentStack()) {
                            if (dVar instanceof nk3) {
                                dj3 dj3Var = ((nk3) dVar).H3;
                                if (dj3Var.c()) {
                                    dj3Var.a();
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
                ((lh4) obj2).e.g0(true);
                return;
            case 9:
                rk4 rk4Var = (rk4) obj2;
                rk4Var.h(-1.0f);
                gm.d3(new ve4(rk4Var, (Runnable) obj, (byte) 10), 80L);
                return;
            case 10:
                ((tt4) obj2).s.animate().translationY(((-((Integer) obj).intValue()) / 2.0f) + gm.L(80.0f)).setDuration(250L).setInterpolator(gb.w).start();
                return;
            case 11:
                ((pv4) obj2).F((TLObject) obj);
                return;
            case 12:
                Boolean bool2 = (Boolean) obj;
                ((tx4) obj2).a();
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
                w45.m("approve session", str2);
                ((f45) obj2).a(str2);
                return;
            case 15:
                n55 n55Var = (n55) obj2;
                n55Var.w = n55Var.d[((Integer) obj).intValue()];
                n55Var.Z(true);
                return;
            case 16:
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) obj;
                ((u85) obj2).c();
                return;
            case 17:
                Object[] objArr = (Object[]) obj;
                ((cg5) obj2).c(true);
                return;
            case 18:
                lg5 lg5Var = (lg5) obj2;
                lg5Var.f = (ArrayList) obj;
                va vaVar = lg5Var.a;
                if (vaVar.H) {
                    vaVar.g3.O(true);
                    return;
                }
                return;
            case 19:
                yp5 yp5Var = (yp5) obj2;
                dba dbaVar = (dba) obj;
                e99 e99Var = yp5Var.a;
                if (dbaVar != null) {
                    float currentWeight = e99Var.getCurrentWeight();
                    dbaVar.f = currentWeight;
                    double d = yp5Var.p;
                    if (d > 0.0d) {
                        dbaVar.f = (float) ((d / yp5Var.q) * currentWeight);
                    }
                    if (dbaVar.a.n() == 4) {
                        dbaVar.k *= dbaVar.f;
                    }
                }
                hw7 painting = e99Var.getPainting();
                if (painting.L == null) {
                    painting.f.f(new dw7(painting, dbaVar, (byte) 1));
                    return;
                }
                return;
            case 20:
                Boolean bool3 = (Boolean) obj;
                String str3 = LaunchActivity.C1;
                ((w06) obj2).run();
                return;
            case 21:
                ((i46) obj2).p1((HashMap) obj);
                return;
            case 22:
                a66 a66Var = (a66) obj2;
                Long l = (Long) obj;
                int i3 = a66Var.b;
                a66Var.c();
                if (l != null && l.longValue() > 0) {
                    user = oc7.r1(i3).W1(l);
                } else {
                    user = null;
                }
                if (user != null && user.bot) {
                    kr0.a(LaunchActivity.S(), i3, user);
                    return;
                } else {
                    mlb.y(null, 2131747868, a66.d(), null);
                    return;
                }
            case 23:
                Boolean bool4 = (Boolean) obj;
                ((m86) obj2).d0();
                return;
            case 24:
                wg6 wg6Var = (wg6) obj2;
                String str4 = (String) obj;
                fc4.b("LoginBilling purchased done " + str4);
                if ("CANCELLED".equalsIgnoreCase(str4)) {
                    wg6Var.b.setLoading(false);
                    return;
                }
                return;
            case 25:
                lh6 lh6Var = (lh6) obj2;
                List list = (List) obj;
                if (lh6Var.o()) {
                    if (list != null && !list.isEmpty()) {
                        Context context = lh6Var.getContext();
                        li0 a = ej4.a(context, (wbc) list.get(0));
                        mh6 mh6Var = lh6Var.h0;
                        ylbVar = ((d) mh6Var).resourceProvider;
                        mhb mhbVar = new mhb(context, ylbVar);
                        if (a.b != null) {
                            mhbVar.f(jb6.M0(2131750460, null), a.b, null, null);
                        }
                        if (a.a >= 0) {
                            mhbVar.f(jb6.M0(2131750457, null), jb6.a0(null, null, 2131750456, Integer.valueOf(a.a + 1)), null, null);
                        }
                        if (a.c != null) {
                            String M0 = jb6.M0(2131750458, null);
                            if (a.c.startsWith("+")) {
                                str = r58.f().e(a.c);
                            } else {
                                str = a.c;
                            }
                            mhbVar.f(M0, str, null, null);
                        }
                        FrameLayout frameLayout = new FrameLayout(context);
                        frameLayout.addView(mhbVar, qoe.d(-1, -2.0f, 55, 24.0f, 4.0f, 24.0f, 4.0f));
                        boolean[] zArr = new boolean[1];
                        ylbVar2 = ((d) mh6Var).resourceProvider;
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, context);
                        String M02 = jb6.M0(2131750454, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M02;
                        heVar.U = jb6.M0(2131750455, null);
                        alertDialog$Builder.n(frameLayout);
                        alertDialog$Builder.j(jb6.M0(2131750459, null), new nv4(lh6Var, zArr, (byte) 23));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        heVar.setOnDismissListener(new ah(lh6Var, heVar, zArr, (byte) 5));
                        lh6Var.d0 = heVar;
                        heVar.show();
                        return;
                    }
                    lh6Var.t(false);
                    return;
                }
                return;
            case 26:
                pv7 pv7Var = (pv7) obj2;
                TextureView textureView = (TextureView) obj;
                pv7Var.y0 = textureView;
                if (textureView != null) {
                    pv7Var.s0.addView(textureView, 0);
                    return;
                }
                return;
            case 27:
                l57 l57Var = (l57) obj2;
                Integer num = (Integer) obj;
                ArrayList arrayList2 = l57Var.e.a;
                q47 q47Var = l57Var.f;
                if (((i57) arrayList2.get(q47Var.getCurrentPosition())).a != num.intValue()) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            if (((i57) arrayList2.get(i4)).a == num.intValue()) {
                                i2 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                    if (q47Var.getCurrentPosition() != i2) {
                        q47Var.E(i2);
                        return;
                    }
                    return;
                }
                return;
            case 28:
                f57 f57Var = (f57) obj2;
                f57Var.n.y(f57Var.f.T((View) obj));
                return;
            default:
                j67 j67Var = (j67) obj2;
                Integer num2 = (Integer) obj;
                j67Var.getClass();
                if (num2.intValue() - j67Var.d.d > gm.L(20.0f)) {
                    z3 = true;
                }
                j67Var.b0 = z3;
                float f = j67Var.c0;
                if (z3) {
                    f = Math.min(f, (j67Var.F.getHeight() - num2.intValue()) - j67Var.d0.getMeasuredHeight());
                }
                j67Var.d0.animate().translationY(f - j67Var.d0.getTop()).setDuration(250L).setInterpolator(gb.w).start();
                return;
        }
    }
}
