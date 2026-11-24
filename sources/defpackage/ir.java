package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ir implements c39 {
    public final byte a;
    public final gk7 b;
    public final Object c;
    public final Object d;

    public ir(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = (gk7) obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void d(int i, View view) {
        kz9 kz9Var;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        byte b = this.a;
        int i2 = 8;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.d;
        gk7 gk7Var = this.b;
        boolean z = false;
        boolean z2 = false;
        z = false;
        switch (b) {
            case 0:
                or orVar = (or) gk7Var;
                d dVar = (d) obj;
                Context context = (Context) obj2;
                nr nrVar = (nr) view;
                c06 c06Var = (c06) orVar.f3.get(i);
                if (c06Var.e && !y6c.n()) {
                    dVar.showDialog(new jh8(dVar, 10, true));
                    return;
                } else if (!jme.a(c06Var)) {
                    u26 u26Var = new u26(context);
                    u26Var.a = i;
                    orVar.g3.v0(u26Var);
                    jme.b(c06Var);
                    int i3 = nr.h;
                    nrVar.b(true, true);
                    for (int i4 = 0; i4 < orVar.getChildCount(); i4++) {
                        nr nrVar2 = (nr) orVar.getChildAt(i4);
                        if (nrVar2 != nrVar) {
                            nrVar2.b(false, true);
                        }
                    }
                    kk7.e().k(295, 5, c06Var);
                    return;
                } else {
                    return;
                }
            case 1:
                xu4 xu4Var = (xu4) gk7Var;
                LinkedHashMap linkedHashMap = xu4Var.Z1;
                vu4 vu4Var = (vu4) obj;
                tu4 tu4Var = (tu4) obj2;
                ww0 ww0Var = xu4Var.c;
                c4c G = xu4Var.i2.G(i - 1);
                if (G != null) {
                    if (G.d == 1 && G.a == 3) {
                        ij.l(xu4Var.getContext(), k96.M0(2131751226, null), k96.M0(2131751231, null), null, new ou4(xu4Var, (byte) 2), new nu4(xu4Var, (byte) 3), false, false, xu4Var.J0).M2();
                        return;
                    } else if (vu4Var != null) {
                        if (G.H(uu4.class)) {
                            xu4Var.h1(G.d);
                            return;
                        }
                        Object obj3 = G.H;
                        if (obj3 instanceof TLRPC.User) {
                            xu4Var.h1(((TLRPC.User) obj3).id);
                            return;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            xu4Var.h1(-((TLRPC.Chat) obj3).id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            if (tu4Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj4;
                                o39 o39Var = xu4Var.n1;
                                if (linkedHashMap.remove(Long.valueOf(user2.id)) == null) {
                                    int size = linkedHashMap.size();
                                    xu4Var.U1.getClass();
                                    if (size >= 10) {
                                        new u21(ww0Var, xu4Var.J0).Q(2131623982, 36, k96.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            ww0Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.id));
                                for (int i5 = 0; i5 < xu4Var.i2.E.size(); i5++) {
                                    c4c G2 = xu4Var.i2.G(i5);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.y == user2.id) {
                                        G2.e = containsKey;
                                    }
                                }
                                for (int i6 = 0; i6 < o39Var.getChildCount(); i6++) {
                                    View childAt = o39Var.getChildAt(i6);
                                    if ((childAt instanceof kz9) && (user = (kz9Var = (kz9) childAt).getUser()) != null && user.id == user2.id) {
                                        kz9Var.c(containsKey, true);
                                    }
                                }
                                u41 u41Var = xu4Var.a2;
                                if (u41Var != null) {
                                    u41Var.c(linkedHashMap.size(), true);
                                    u41Var.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj4;
                            gl.t1(xu4Var.p2);
                            if (xu4Var.S1) {
                                vua vuaVar = new vua(xu4Var.getContext(), xu4Var.J0, user3, new nu4(xu4Var, (byte) 1));
                                if (!gl.O1()) {
                                    vuaVar.X(xu4Var.i1);
                                }
                                vuaVar.show();
                                return;
                            } else if (l7c.b(user3.id)) {
                                b00.u(k96.a0(null, null, 2131743503, cf3.s(user3.id)), new u21(ww0Var, xu4Var.J0), 2131624012, 36);
                                return;
                            } else {
                                tv4 tv4Var = new tv4(xu4Var.getContext(), xu4Var.a, user3.id, on0.d(on0.c(1, xu4Var.h2)), new ou4(xu4Var, (byte) 0));
                                long j = user3.id;
                                mj0 mj0Var = xu4Var.T1;
                                if (mj0Var != null && mj0Var.a(j)) {
                                    z = true;
                                }
                                tv4Var.a1(z);
                                tv4Var.show();
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            case 2:
                l18 l18Var = (l18) gk7Var;
                d76 d76Var = (d76) view;
                i76 i76Var = d76Var.L;
                cs5 G3 = cs5.G((b8b) obj, new f53(), view);
                G3.o(15, -1, k96.a0(null, null, 2131748616, k96.x(i76Var.d, true)));
                G3.j();
                G3.b(2131232271, k96.M0(2131747593, null), new kz5((m8b) obj2, i76Var, (byte) 8), false);
                G3.k(2131232108, k96.M0(2131751755, null), new kz5(l18Var, d76Var, (byte) 9), !i76Var.e);
                G3.k(2131232113, k96.M0(2131751586, null), new kz5(l18Var, i76Var, (byte) 10), (l18Var.N == y6c.h(l18Var.O).e() || l18Var.e()) ? true : true);
                G3.a0();
                return;
            case 3:
                ((pr8) gk7Var).n0((Context) obj2, (String) obj, view, i);
                return;
            case 4:
                yx9 yx9Var = (yx9) gk7Var;
                p8c p8cVar = (p8c) obj;
                f53 f53Var = (f53) obj2;
                if (view instanceof eba) {
                    k27 message = ((eba) view).getMessage();
                    if (message != null) {
                        up3.q(yx9Var.a).v(yx9Var);
                        if (yx9Var.b2 != null) {
                            ba4.G(yx9Var.a).f(yx9Var.b2.F0());
                            yx9Var.b2 = null;
                        }
                        if (!message.y0 && !message.z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                yx9Var.b2 = message;
                                up3.q(yx9Var.a).a(S0, message, yx9Var);
                                ba4.G(yx9Var.a).X(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        yx9Var.a2.a(message);
                        yx9 yx9Var2 = yx9Var.V1;
                        if (yx9Var2 != null) {
                            yx9Var2.dismiss();
                        }
                        yx9Var.dismiss();
                        return;
                    }
                    return;
                }
                c4c G4 = yx9Var.j2.G(i - 1);
                if (G4 != null) {
                    int i7 = G4.d;
                    if (i7 == 1) {
                        new yx9(yx9Var.getContext(), true, yx9Var, p8cVar, f53Var).show();
                        return;
                    } else if (i7 == 2) {
                        yx9Var.Z1.b();
                        return;
                    } else if (i7 == 3) {
                        yx9Var.c1();
                        return;
                    } else if (i7 == 4) {
                        yx9Var.b1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t4b t4bVar = (t4b) gk7Var;
                Context context2 = (Context) obj2;
                i7b i7bVar = (i7b) obj;
                it3 it3Var = t4bVar.U1;
                it3 it3Var2 = t4bVar.T1;
                c4c G5 = t4bVar.S1.G(i - 1);
                if (G5 != null) {
                    if (G5.H(r4b.class) && (webPage = t4bVar.b2) != null && !t4b.b1(webPage)) {
                        m4b m4bVar = new m4b(context2, t4bVar.a);
                        c46 c46Var = new c46();
                        c46Var.c = it3Var2.d.getText().toString();
                        if (t4bVar.h2) {
                            str = it3Var.d.getText().toString();
                        }
                        c46Var.b = str;
                        TLRPC.WebPage webPage2 = t4bVar.b2;
                        c46Var.d = webPage2;
                        c46Var.e = t4bVar.j2;
                        c46Var.f = t4bVar.i2;
                        ae9 ae9Var = new ae9(t4bVar, (byte) 16);
                        m4bVar.H = c46Var;
                        if (webPage2 != null && (webPage2.photo != null || k27.J4(webPage2.document))) {
                            i2 = 0;
                        }
                        k37 k37Var = m4bVar.y;
                        k37Var.setVisibility(i2);
                        m4bVar.f.b(m4bVar.a, c46Var, false);
                        m4bVar.x.a(!c46Var.f, false);
                        k37Var.a(!c46Var.e, false);
                        m4bVar.I = ae9Var;
                        m4bVar.e.setImageDrawable(new f6(i7bVar, (byte) 6));
                        m4bVar.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof ahb)) {
                        boolean z3 = !t4bVar.h2;
                        t4bVar.h2 = z3;
                        ((ahb) view).setChecked(z3);
                        t4bVar.S1.O(true);
                        if (t4bVar.h2) {
                            it3Var.requestFocus();
                            return;
                        } else {
                            it3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public ir(gk7 gk7Var, Context context, Object obj, byte b) {
        this.a = b;
        this.b = gk7Var;
        this.d = context;
        this.c = obj;
    }
}
