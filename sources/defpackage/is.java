package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class is implements f59 {
    public final byte a;
    public final jm7 b;
    public final Object c;
    public final Object d;

    public is(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = (jm7) obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final void g(int i, View view) {
        m1a m1aVar;
        TLRPC.User user;
        TLRPC.WebPage webPage;
        int i2;
        byte b = this.a;
        String str = null;
        Object obj = this.c;
        Object obj2 = this.d;
        jm7 jm7Var = this.b;
        boolean z = false;
        boolean z2 = false;
        z = false;
        switch (b) {
            case 0:
                os osVar = (os) jm7Var;
                d dVar = (d) obj;
                Context context = (Context) obj2;
                ns nsVar = (ns) view;
                c26 c26Var = (c26) osVar.f3.get(i);
                if (c26Var.e && !z8c.n()) {
                    dVar.showDialog(new kj8(dVar, 10, true));
                    return;
                } else if (!moe.a(c26Var)) {
                    v46 v46Var = new v46(context);
                    v46Var.a = i;
                    osVar.g3.v0(v46Var);
                    moe.b(c26Var);
                    int i3 = ns.h;
                    nsVar.b(true, true);
                    for (int i4 = 0; i4 < osVar.getChildCount(); i4++) {
                        ns nsVar2 = (ns) osVar.getChildAt(i4);
                        if (nsVar2 != nsVar) {
                            nsVar2.b(false, true);
                        }
                    }
                    nm7.e().k(297, 5, c26Var);
                    return;
                } else {
                    return;
                }
            case 1:
                yw4 yw4Var = (yw4) jm7Var;
                LinkedHashMap linkedHashMap = yw4Var.Z1;
                ww4 ww4Var = (ww4) obj;
                uw4 uw4Var = (uw4) obj2;
                dy0 dy0Var = yw4Var.c;
                c6c G = yw4Var.i2.G(i - 1);
                if (G != null) {
                    if (G.d == 1 && G.a == 3) {
                        ik.l(yw4Var.getContext(), jb6.M0(2131751175, null), jb6.M0(2131751180, null), null, new pw4(yw4Var, (byte) 2), new ow4(yw4Var, (byte) 3), false, false, yw4Var.J0).h1();
                        return;
                    } else if (ww4Var != null) {
                        if (G.H(vw4.class)) {
                            yw4Var.h1(G.d);
                            return;
                        }
                        Object obj3 = G.H;
                        if (obj3 instanceof TLRPC.User) {
                            yw4Var.h1(((TLRPC.User) obj3).id);
                            return;
                        } else if (obj3 instanceof TLRPC.Chat) {
                            yw4Var.h1(-((TLRPC.Chat) obj3).id);
                            return;
                        } else {
                            return;
                        }
                    } else {
                        Object obj4 = G.H;
                        if (obj4 instanceof TLRPC.User) {
                            if (uw4Var != null) {
                                TLRPC.User user2 = (TLRPC.User) obj4;
                                r59 r59Var = yw4Var.n1;
                                if (linkedHashMap.remove(Long.valueOf(user2.id)) == null) {
                                    int size = linkedHashMap.size();
                                    yw4Var.U1.getClass();
                                    if (size >= 10) {
                                        new c41(dy0Var, yw4Var.J0).Q(2131623982, 36, jb6.G(10, "BotMultiContactsSelectorLimit", new Object[0])).k(true);
                                        try {
                                            dy0Var.performHapticFeedback(3, 2);
                                            return;
                                        } catch (Exception unused) {
                                            return;
                                        }
                                    }
                                    linkedHashMap.put(Long.valueOf(user2.id), user2);
                                }
                                boolean containsKey = linkedHashMap.containsKey(Long.valueOf(user2.id));
                                for (int i5 = 0; i5 < yw4Var.i2.E.size(); i5++) {
                                    c6c G2 = yw4Var.i2.G(i5);
                                    if (G2 != null && (G2.H instanceof TLRPC.User) && G2.y == user2.id) {
                                        G2.e = containsKey;
                                    }
                                }
                                for (int i6 = 0; i6 < r59Var.getChildCount(); i6++) {
                                    View childAt = r59Var.getChildAt(i6);
                                    if ((childAt instanceof m1a) && (user = (m1aVar = (m1a) childAt).getUser()) != null && user.id == user2.id) {
                                        m1aVar.c(containsKey, true);
                                    }
                                }
                                b61 b61Var = yw4Var.a2;
                                if (b61Var != null) {
                                    b61Var.c(linkedHashMap.size(), true);
                                    b61Var.setEnabled(!linkedHashMap.isEmpty());
                                    return;
                                }
                                return;
                            }
                            TLRPC.User user3 = (TLRPC.User) obj4;
                            gm.t1(yw4Var.p2);
                            if (yw4Var.S1) {
                                zwa zwaVar = new zwa(yw4Var.getContext(), yw4Var.J0, user3, new ow4(yw4Var, (byte) 1));
                                if (!gm.O1()) {
                                    zwaVar.X(yw4Var.i1);
                                }
                                zwaVar.show();
                                return;
                            } else if (m9c.b(user3.id)) {
                                b10.u(jb6.a0(null, null, 2131743429, pg3.s(user3.id)), new c41(dy0Var, yw4Var.J0), 2131624012, 36);
                                return;
                            } else {
                                ux4 ux4Var = new ux4(yw4Var.getContext(), yw4Var.a, user3.id, oo0.d(oo0.c(1, yw4Var.h2)), new pw4(yw4Var, (byte) 0));
                                long j = user3.id;
                                mk0 mk0Var = yw4Var.T1;
                                if (mk0Var != null && mk0Var.a(j)) {
                                    z = true;
                                }
                                ux4Var.a1(z);
                                ux4Var.show();
                                return;
                            }
                        }
                        return;
                    }
                }
                return;
            case 2:
                n38 n38Var = (n38) jm7Var;
                d96 d96Var = (d96) view;
                i96 i96Var = d96Var.L;
                bu5 G3 = bu5.G((dab) obj, new r63(), view);
                G3.o(15, -1, jb6.a0(null, null, 2131748565, jb6.x(i96Var.d, true)));
                G3.j();
                G3.b(2131232272, jb6.M0(2131747519, null), new k16((oab) obj2, i96Var, (byte) 9), false);
                G3.k(2131232109, jb6.M0(2131751704, null), new k16(n38Var, d96Var, (byte) 10), !i96Var.e);
                G3.k(2131232114, jb6.M0(2131751535, null), new k16(n38Var, i96Var, (byte) 11), (n38Var.N == z8c.h(n38Var.O).e() || n38Var.e()) ? true : true);
                G3.a0();
                return;
            case 3:
                ((st8) jm7Var).o0((Context) obj2, (String) obj, view, i);
                return;
            case 4:
                zz9 zz9Var = (zz9) jm7Var;
                qac qacVar = (qac) obj;
                r63 r63Var = (r63) obj2;
                if (view instanceof eda) {
                    k47 message = ((eda) view).getMessage();
                    if (message != null) {
                        er3.q(zz9Var.a).v(zz9Var);
                        if (zz9Var.b2 != null) {
                            bc4.G(zz9Var.a).f(zz9Var.b2.F0());
                            zz9Var.b2 = null;
                        }
                        if (!message.y0 && !message.z0) {
                            String S0 = message.S0();
                            if (!TextUtils.isEmpty(S0)) {
                                zz9Var.b2 = message;
                                er3.q(zz9Var.a).a(S0, message, zz9Var);
                                bc4.G(zz9Var.a).X(message.F0(), message, 1, 0);
                                return;
                            }
                            return;
                        }
                        zz9Var.a2.a(message);
                        zz9 zz9Var2 = zz9Var.V1;
                        if (zz9Var2 != null) {
                            zz9Var2.dismiss();
                        }
                        zz9Var.dismiss();
                        return;
                    }
                    return;
                }
                c6c G4 = zz9Var.j2.G(i - 1);
                if (G4 != null) {
                    int i7 = G4.d;
                    if (i7 == 1) {
                        new zz9(zz9Var.getContext(), true, zz9Var, qacVar, r63Var).show();
                        return;
                    } else if (i7 == 2) {
                        zz9Var.Z1.b();
                        return;
                    } else if (i7 == 3) {
                        zz9Var.c1();
                        return;
                    } else if (i7 == 4) {
                        zz9Var.b1();
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                u6b u6bVar = (u6b) jm7Var;
                Context context2 = (Context) obj2;
                k9b k9bVar = (k9b) obj;
                su3 su3Var = u6bVar.U1;
                su3 su3Var2 = u6bVar.T1;
                c6c G5 = u6bVar.S1.G(i - 1);
                if (G5 != null) {
                    if (G5.H(s6b.class) && (webPage = u6bVar.b2) != null && !u6b.b1(webPage)) {
                        n6b n6bVar = new n6b(context2, u6bVar.a);
                        c66 c66Var = new c66();
                        c66Var.c = su3Var2.d.getText().toString();
                        if (u6bVar.h2) {
                            str = su3Var.d.getText().toString();
                        }
                        c66Var.b = str;
                        TLRPC.WebPage webPage2 = u6bVar.b2;
                        c66Var.d = webPage2;
                        c66Var.e = u6bVar.j2;
                        c66Var.f = u6bVar.i2;
                        eg9 eg9Var = new eg9(u6bVar, (byte) 16);
                        n6bVar.H = c66Var;
                        if (webPage2 != null && (webPage2.photo != null || k47.J4(webPage2.document))) {
                            i2 = 0;
                        } else {
                            i2 = 8;
                        }
                        k57 k57Var = n6bVar.y;
                        k57Var.setVisibility(i2);
                        n6bVar.f.b(n6bVar.a, c66Var, false);
                        n6bVar.x.a(!c66Var.f, false);
                        k57Var.a(!c66Var.e, false);
                        n6bVar.I = eg9Var;
                        n6bVar.e.setImageDrawable(new f6(k9bVar, (byte) 6));
                        n6bVar.show();
                        return;
                    } else if (G5.d == 2 && (view instanceof bjb)) {
                        boolean z3 = !u6bVar.h2;
                        u6bVar.h2 = z3;
                        ((bjb) view).setChecked(z3);
                        u6bVar.S1.O(true);
                        if (u6bVar.h2) {
                            su3Var.requestFocus();
                            return;
                        } else {
                            su3Var2.requestFocus();
                            return;
                        }
                    } else {
                        return;
                    }
                }
                return;
        }
    }

    public is(jm7 jm7Var, Context context, Object obj, byte b) {
        this.a = b;
        this.b = jm7Var;
        this.d = context;
        this.c = obj;
    }
}
