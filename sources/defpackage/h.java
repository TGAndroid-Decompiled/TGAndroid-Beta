package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_aicompose;
public final class h implements pcc {
    public final byte a;
    public final b1 b;

    public h(b1 b1Var, byte b) {
        this.a = b;
        this.b = b1Var;
    }

    @Override
    public final void a(Object obj) {
        int f;
        byte b = this.a;
        int i = 0;
        b1 b1Var = this.b;
        switch (b) {
            case 0:
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                a1 a1Var = b1Var.u2;
                kg5 kg5Var = b1Var.y2;
                if (kg5Var != null) {
                    kg5Var.f(true);
                }
                if (aiComposeTone instanceof u0) {
                    a1Var.d(aiComposeTone, true);
                    b1Var.Q2.O(true);
                    hl.d3(new a(b1Var, (byte) 3), 150L);
                    return;
                } else if (aiComposeTone == null) {
                    ArrayList arrayList = b1Var.r2.b;
                    int i2 = 0;
                    while (i < arrayList.size()) {
                        if (arrayList.get(i) instanceof TL_aicompose.TL_aiComposeTone) {
                            i2++;
                        }
                        i++;
                    }
                    int i3 = i2 + 1;
                    boolean p = yac.h(b1Var.a).p();
                    int i4 = b1Var.a;
                    if (p) {
                        f = uc7.s1(i4).l4.e0.f();
                    } else {
                        f = uc7.s1(i4).l4.d0.f();
                    }
                    if (i3 > f) {
                        b1.s1(new d31(b1Var.D2, b1Var.J0), b1Var.a);
                        return;
                    }
                    s0 s0Var = new s0(b1Var.getContext(), b1Var.J0);
                    s0Var.f2 = new h(b1Var, (byte) 1);
                    s0Var.show();
                    return;
                } else if (a1Var.getSelectedTone() == aiComposeTone) {
                    if (b1Var.X2 || b1Var.X1) {
                        b1Var.b1();
                    }
                    a1Var.c(-1, true);
                    b1Var.X1 = false;
                    b1Var.Y1 = null;
                    b1Var.Z1 = null;
                    b1Var.Y2[1] = null;
                    if (b1Var.i1() && fc.b(b1Var.a, b1Var.g2) != null) {
                        fc.e(b1Var.a, b1Var.g2, null);
                        fw1 fw1Var = b1Var.T2;
                        if (fw1Var != null) {
                            fw1Var.run();
                        }
                    }
                    b1Var.u1(true);
                    b1Var.m1();
                    b1Var.Q2.O(true);
                    return;
                } else {
                    a1Var.d(aiComposeTone, true);
                    b1Var.m1();
                    b1Var.Q2.O(true);
                    return;
                }
            case 1:
                TL_aicompose.AiComposeTone aiComposeTone2 = (TL_aicompose.AiComposeTone) obj;
                b1Var.r2.b.add(0, aiComposeTone2);
                b1Var.w1();
                new d31(b1Var.D2, b1Var.J0).p(aiComposeTone2.emoji_id, ob6.a0(null, null, 2131754953, aiComposeTone2.title), ob6.M0(2131754954, null)).j();
                return;
            case 2:
                TL_aicompose.AiComposeTone aiComposeTone3 = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone3 instanceof TL_aicompose.TL_aiComposeTone) {
                    jc jcVar = b1Var.r2;
                    TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone3;
                    ArrayList arrayList2 = jcVar.b;
                    while (true) {
                        if (i < arrayList2.size()) {
                            if ((arrayList2.get(i) instanceof TL_aicompose.TL_aiComposeTone) && ((TL_aicompose.TL_aiComposeTone) arrayList2.get(i)).id == tL_aiComposeTone.id) {
                                arrayList2.set(i, tL_aiComposeTone);
                                jcVar.c();
                            } else {
                                i++;
                            }
                        }
                    }
                }
                b1Var.w1();
                return;
            default:
                int intValue = ((Integer) obj).intValue();
                a1 a1Var2 = b1Var.t2;
                if (a1Var2.getSelectedTab() != intValue) {
                    kg5 kg5Var2 = b1Var.y2;
                    if (kg5Var2 != null) {
                        kg5Var2.f(true);
                    }
                    a1Var2.c(intValue, true);
                    b1Var.m1();
                    b1Var.Q2.O(true);
                    return;
                }
                return;
        }
    }
}
