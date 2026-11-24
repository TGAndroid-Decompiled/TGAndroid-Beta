package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class h implements qac {
    public final byte a;
    public final a1 b;

    public h(a1 a1Var, byte b) {
        this.a = b;
        this.b = a1Var;
    }

    @Override
    public final void a(Object obj) {
        int f;
        byte b = this.a;
        int i = 0;
        a1 a1Var = this.b;
        switch (b) {
            case 0:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                z0 z0Var = a1Var.u2;
                hg5 hg5Var = a1Var.y2;
                if (hg5Var != null) {
                    hg5Var.f(true);
                }
                if (aiComposeTone instanceof t0) {
                    z0Var.d(aiComposeTone, true);
                    a1Var.O2.O(true);
                    gm.d3(new a(a1Var, (byte) 3), 150L);
                    return;
                } else if (aiComposeTone == null) {
                    ArrayList arrayList = a1Var.r2.b;
                    int i2 = 0;
                    while (i < arrayList.size()) {
                        if (arrayList.get(i) instanceof TL_aicompose.TL_aiComposeTone) {
                            i2++;
                        }
                        i++;
                    }
                    int i3 = i2 + 1;
                    boolean p = z8c.h(a1Var.a).p();
                    int i4 = a1Var.a;
                    if (p) {
                        f = oc7.r1(i4).l4.X.f();
                    } else {
                        f = oc7.r1(i4).l4.W.f();
                    }
                    if (i3 > f) {
                        a1.q1(new c41(a1Var.D2, a1Var.J0), a1Var.a);
                        return;
                    }
                    r0 r0Var = new r0(a1Var.getContext(), a1Var.J0);
                    r0Var.f2 = new h(a1Var, (byte) 1);
                    r0Var.show();
                    return;
                } else if (z0Var.getSelectedTone() == aiComposeTone) {
                    if (a1Var.V2 || a1Var.X1) {
                        a1Var.a1();
                    }
                    z0Var.c(-1, true);
                    a1Var.X1 = false;
                    a1Var.Y1 = null;
                    a1Var.Z1 = null;
                    a1Var.W2[1] = null;
                    if (a1Var.h1() && fd.b(a1Var.a, a1Var.g2) != null) {
                        fd.e(a1Var.a, a1Var.g2, null);
                        gx1 gx1Var = a1Var.R2;
                        if (gx1Var != null) {
                            gx1Var.run();
                        }
                    }
                    a1Var.s1(true);
                    a1Var.k1();
                    a1Var.O2.O(true);
                    return;
                } else {
                    z0Var.d(aiComposeTone, true);
                    a1Var.k1();
                    a1Var.O2.O(true);
                    return;
                }
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                a1Var.r2.b.add(0, aiComposeTone2);
                a1Var.v1();
                new c41(a1Var.D2, a1Var.J0).p(aiComposeTone2.emoji_id, jb6.a0(null, null, 2131754956, aiComposeTone2.title), jb6.M0(2131754957, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone3 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone3 instanceof TL_aicompose.TL_aiComposeTone) {
                    id idVar = a1Var.r2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone3;
                    ArrayList arrayList2 = idVar.b;
                    while (true) {
                        if (i < arrayList2.size()) {
                            if ((arrayList2.get(i) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList2.get(i)).id == tL_aiComposeTone.id) {
                                arrayList2.set(i, tL_aiComposeTone);
                                idVar.c();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                a1Var.v1();
                return;
            default:
                int intValue = ((Integer) obj).intValue();
                z0 z0Var2 = a1Var.t2;
                if (z0Var2.getSelectedTab() != intValue) {
                    hg5 hg5Var2 = a1Var.y2;
                    if (hg5Var2 != null) {
                        hg5Var2.f(true);
                    }
                    z0Var2.c(intValue, true);
                    a1Var.k1();
                    a1Var.O2.O(true);
                    return;
                }
                return;
        }
    }
}
