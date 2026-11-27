package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class jr implements r69 {
    public final byte a;
    public final fn7 b;
    public final Object c;
    public final Object d;

    public jr(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = (fn7) obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void e(int i, View view) {
        e3a e3aVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i2;
        byte b = this.a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.d;
        fn7 fn7Var = this.b;
        boolean z = false;
        boolean z2 = false;
        z = false;
        switch (b) {
            case 0:
                pr prVar = (pr) fn7Var;
                e eVar = (e) obj;
                Context context = (Context) obj2;
                or orVar = (or) view;
                g26 g26Var = (g26) prVar.f3.get(i);
                if (g26Var.e && !yac.n()) {
                    eVar.showDialog(new xk8(eVar, 10, true));
                    return;
                } else if (!ere.a(g26Var)) {
                    y46 y46Var = new y46(context);
                    y46Var.a = i;
                    prVar.g3.v0(y46Var);
                    ere.b(g26Var);
                    int i3 = or.h;
                    orVar.b(true, true);
                    for (int i4 = 0; i4 < prVar.getChildCount(); i4++) {
                        or orVar2 = (or) prVar.getChildAt(i4);
                        if (orVar2 != orVar) {
                            orVar2.b(false, true);
                        }
                    }
                    jn7.e().k(296, 5, g26Var);
                    return;
                } else {
                    return;
                }
            case 1:
                bx4 bx4Var = (bx4) fn7Var;
                LinkedHashMap linkedHashMap = bx4Var.Z1;
                zw4 zw4Var = (zw4) obj;
                xw4 xw4Var = (xw4) obj2;
                ex0 ex0Var = bx4Var.c;
                b8c G = bx4Var.i2.G(i - 1);
                if (G != null) {
                    if (G.d == 1 && G.a == 3) {
                        jj.l(bx4Var.getContext(), ob6.M0(2131751203, null), ob6.M0(2131751208, null), null, new rw4(bx4Var, (byte) 2), new qw4(bx4Var, (byte) 3), false, false, bx4Var.J0).o1();
                        return;
                    } else if (zw4Var != null) {
                        if (G.H(yw4.class)) {
                            bx4Var.i1(G.d);
                            return;
                        }
                        Object obj3 = G.H;
                        if (obj3 instanceof TLRPC.User) {
                            bx4Var.i1(((TLRPC.User) obj3).id);
                            return;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            bx4Var.i1(-((TLRPC.Chat) obj3).id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            if (xw4Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj4;
                                d79 d79Var = bx4Var.n1;
                                if (linkedHashMap.remove(Long.valueOf(user2.id)) == null) {
                                    int size = linkedHashMap.size();
                                    bx4Var.U1.getClass();
                                    if (size >= 10) {
                                        new d31(ex0Var, bx4Var.J0).Q(2131623982, 36, ob6.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            ex0Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.id));
                                for (int i5 = 0; i5 < bx4Var.i2.E.size(); i5++) {
                                    b8c G2 = bx4Var.i2.G(i5);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.y == user2.id) {
                                        G2.e = containsKey;
                                    }
                                }
                                for (int i6 = 0; i6 < d79Var.getChildCount(); i6++) {
                                    View childAt = d79Var.getChildAt(i6);
                                    if ((childAt instanceof e3a) && (user = (e3aVar = (e3a) childAt).getUser()) != null && user.id == user2.id) {
                                        e3aVar.c(containsKey, true);
                                    }
                                }
                                c51 c51Var = bx4Var.a2;
                                if (c51Var != null) {
                                    c51Var.c(linkedHashMap.size(), true);
                                    c51Var.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj4;
                            hl.t1(bx4Var.p2);
                            if (bx4Var.S1) {
                                zya zyaVar = new zya(bx4Var.getContext(), bx4Var.J0, user3, new qw4(bx4Var, (byte) 1));
                                if (!hl.O1()) {
                                    zyaVar.X(bx4Var.i1);
                                }
                                zyaVar.show();
                                return;
                            } else if (lbc.b(user3.id)) {
                                c00.v(ob6.a0(null, null, 2131743397, wf3.s(user3.id)), new d31(ex0Var, bx4Var.J0), 2131624012, 36);
                                return;
                            } else {
                                yx4 yx4Var = new yx4(bx4Var.getContext(), bx4Var.a, user3.id, on0.d(on0.c(1, bx4Var.h2)), new rw4(bx4Var, (byte) 0));
                                long j = user3.id;
                                nj0 nj0Var = bx4Var.T1;
                                if (nj0Var != null && nj0Var.a(j)) {
                                    z = true;
                                }
                                yx4Var.b1(z);
                                yx4Var.show();
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            case 2:
                c58 c58Var = (c58) fn7Var;
                h96 h96Var = (h96) view;
                m96 m96Var = h96Var.L;
                fu5 G3 = fu5.G((acb) obj, new x53(), view);
                G3.o(15, -1, ob6.a0(null, null, 2131748562, ob6.x(m96Var.d, true)));
                G3.j();
                G3.b(2131232271, ob6.M0(2131747513, null), new z56((lcb) obj2, m96Var, (byte) 5), false);
                G3.k(2131232108, ob6.M0(2131751732, null), new z56(c58Var, h96Var, (byte) 6), !m96Var.e);
                G3.k(2131232113, ob6.M0(2131751563, null), new z56(c58Var, m96Var, (byte) 7), (c58Var.N == yac.h(c58Var.O).e() || c58Var.e()) ? true : true);
                G3.a0();
                return;
            case 3:
                ((zu8) fn7Var).n0((Context) obj2, (String) obj, view, i);
                return;
            case 4:
                r1a r1aVar = (r1a) fn7Var;
                pcc pccVar = (pcc) obj;
                x53 x53Var = (x53) obj2;
                if (view instanceof vea) {
                    r47 message = ((vea) view).getMessage();
                    if (message != null) {
                        lq3.q(r1aVar.a).v(r1aVar);
                        if (r1aVar.b2 != null) {
                            xb4.G(r1aVar.a).f(r1aVar.b2.F0());
                            r1aVar.b2 = null;
                        }
                        if (!message.y0 && !message.z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                r1aVar.b2 = message;
                                lq3.q(r1aVar.a).a(S0, message, r1aVar);
                                xb4.G(r1aVar.a).X(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        r1aVar.a2.a(message);
                        r1a r1aVar2 = r1aVar.V1;
                        if (r1aVar2 != null) {
                            r1aVar2.dismiss();
                        }
                        r1aVar.dismiss();
                        return;
                    }
                    return;
                }
                b8c G4 = r1aVar.j2.G(i - 1);
                if (G4 != null) {
                    int i7 = G4.d;
                    if (i7 == 1) {
                        new r1a(r1aVar.getContext(), true, r1aVar, pccVar, x53Var).show();
                        return;
                    } else if (i7 == 2) {
                        r1aVar.Z1.b();
                        return;
                    } else if (i7 == 3) {
                        r1aVar.d1();
                        return;
                    } else if (i7 == 4) {
                        r1aVar.c1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                r8b r8bVar = (r8b) fn7Var;
                Context context2 = (Context) obj2;
                hbb hbbVar = (hbb) obj;
                zt3 zt3Var = r8bVar.U1;
                zt3 zt3Var2 = r8bVar.T1;
                b8c G5 = r8bVar.S1.G(i - 1);
                if (G5 != null) {
                    if (G5.H(p8b.class) && (webPage = r8bVar.b2) != null && !r8b.c1(webPage)) {
                        k8b k8bVar = new k8b(context2, r8bVar.a);
                        g66 g66Var = new g66();
                        g66Var.c = zt3Var2.d.getText().toString();
                        if (r8bVar.h2) {
                            str = zt3Var.d.getText().toString();
                        }
                        g66Var.b = str;
                        TLRPC.WebPage webPage2 = r8bVar.b2;
                        g66Var.d = webPage2;
                        g66Var.e = r8bVar.j2;
                        g66Var.f = r8bVar.i2;
                        sh9 sh9Var = new sh9(r8bVar, (byte) 16);
                        k8bVar.H = g66Var;
                        if (webPage2 != null && (webPage2.photo != null || r47.J4(webPage2.document))) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        r57 r57Var = k8bVar.y;
                        r57Var.setVisibility(i2);
                        k8bVar.f.b(k8bVar.a, g66Var, false);
                        k8bVar.x.a(!g66Var.f, false);
                        r57Var.a(!g66Var.e, false);
                        k8bVar.I = sh9Var;
                        k8bVar.e.setImageDrawable(new g6(hbbVar, (byte) 6));
                        k8bVar.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof wkb)) {
                        boolean z3 = !r8bVar.h2;
                        r8bVar.h2 = z3;
                        ((wkb) view).setChecked(z3);
                        r8bVar.S1.O(true);
                        if (r8bVar.h2) {
                            zt3Var.requestFocus();
                            return;
                        } else {
                            zt3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public jr(fn7 fn7Var, Context context, Object obj, byte b) {
        this.a = b;
        this.b = fn7Var;
        this.d = context;
        this.c = obj;
    }
}
