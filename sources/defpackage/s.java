package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatActivityEnterView;
public final class s implements View.OnLongClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public s(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override
    public final boolean onLongClick(View view) {
        boolean z;
        int i;
        ex1 ex1Var;
        boolean z2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj3;
                wjb wjbVar = (wjb) obj2;
                Context context = (Context) obj;
                if (a1Var.h2) {
                    return false;
                }
                if (a1Var.j2 != null) {
                    if (a1Var.f1() == null) {
                        return false;
                    }
                } else if (a1Var.i2 == null || a1Var.g1() == null) {
                    return false;
                }
                if (a1Var.g2 == y6c.h(a1Var.a).e()) {
                    z = true;
                } else {
                    z = false;
                }
                cs5 G = cs5.G(a1Var.c, wjbVar, a1Var.C2);
                G.k(2131231512, k96.M0(2131745391, null), new a(a1Var, (byte) 4), !z);
                if (z) {
                    i = 2131745322;
                } else {
                    i = 2131745667;
                }
                G.b(2131232082, k96.M0(i, null), new nn6(a1Var, context, wjbVar, (byte) 6), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                k27 k27Var = (k27) obj2;
                f27 f27Var = (f27) obj;
                int i2 = ChatActivityEnterView.r7;
                wjb wjbVar2 = chatActivityEnterView.L4;
                if (k27Var.F3() || (ex1Var = chatActivityEnterView.F0) == null || TextUtils.isEmpty(ex1Var.getTextToUse())) {
                    return false;
                }
                if (f27Var != null && (!f27Var.c || f27Var.i)) {
                    return false;
                }
                int i3 = k27Var.D;
                if (i3 != 1 && i3 != 3 && i3 != 8) {
                    return false;
                }
                j47 j47Var = new j47(chatActivityEnterView.getContext(), wjbVar2);
                j47Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (f27Var != null) {
                    ArrayList arrayList2 = f27Var.d;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        k27 k27Var2 = (k27) arrayList2.get(i4);
                        if (i4 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(chatActivityEnterView.x0(k27Var2, z2));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.x0(k27Var, true));
                }
                j47Var.r(arrayList);
                cs5 G2 = cs5.G(chatActivityEnterView.c2, wjbVar2, chatActivityEnterView.v2);
                k37 k37Var = new k37(chatActivityEnterView.getContext(), 2131624139, k96.M0(2131752548, null), 2131624138, k96.M0(2131752547, null), chatActivityEnterView.L4);
                k37Var.a(!chatActivityEnterView.N6, false);
                k37Var.setOnClickListener(new ee(chatActivityEnterView, arrayList, k37Var, j47Var, (byte) 8));
                G2.p(k37Var);
                G2.Z();
                j47Var.q(G2);
                j47Var.s(chatActivityEnterView.v2, false, new ee(chatActivityEnterView, f27Var, k27Var, j47Var, (byte) 9));
                j47Var.show();
                return true;
        }
    }
}
