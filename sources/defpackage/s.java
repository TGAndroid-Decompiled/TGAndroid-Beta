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
        sy1 sy1Var;
        boolean z2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                a1 a1Var = (a1) obj3;
                ylb ylbVar = (ylb) obj2;
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
                if (a1Var.g2 == z8c.h(a1Var.a).e()) {
                    z = true;
                } else {
                    z = false;
                }
                bu5 G = bu5.G(a1Var.c, ylbVar, a1Var.C2);
                G.k(2131231513, jb6.M0(2131745317, null), new a(a1Var, (byte) 4), !z);
                if (z) {
                    i = 2131745248;
                } else {
                    i = 2131745593;
                }
                G.b(2131232083, jb6.M0(i, null), new op6(a1Var, context, ylbVar, (byte) 6), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                k47 k47Var = (k47) obj2;
                f47 f47Var = (f47) obj;
                int i2 = ChatActivityEnterView.z7;
                ylb ylbVar2 = chatActivityEnterView.L4;
                if (k47Var.F3() || (sy1Var = chatActivityEnterView.F0) == null || TextUtils.isEmpty(sy1Var.getTextToUse())) {
                    return false;
                }
                if (f47Var != null && (!f47Var.c || f47Var.i)) {
                    return false;
                }
                int i3 = k47Var.D;
                if (i3 != 1 && i3 != 3 && i3 != 8) {
                    return false;
                }
                j67 j67Var = new j67(chatActivityEnterView.getContext(), ylbVar2);
                j67Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (f47Var != null) {
                    ArrayList arrayList2 = f47Var.d;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        k47 k47Var2 = (k47) arrayList2.get(i4);
                        if (i4 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(chatActivityEnterView.x0(k47Var2, z2));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.x0(k47Var, true));
                }
                j67Var.r(arrayList);
                bu5 G2 = bu5.G(chatActivityEnterView.c2, ylbVar2, chatActivityEnterView.v2);
                k57 k57Var = new k57(chatActivityEnterView.getContext(), 2131624139, jb6.M0(2131752513, null), 2131624138, jb6.M0(2131752512, null), chatActivityEnterView.L4);
                k57Var.a(!chatActivityEnterView.V6, false);
                k57Var.setOnClickListener(new ef(chatActivityEnterView, arrayList, k57Var, j67Var, (byte) 8));
                G2.p(k57Var);
                G2.Z();
                j67Var.q(G2);
                j67Var.s(chatActivityEnterView.v2, false, new ef(chatActivityEnterView, f47Var, k47Var, j67Var, (byte) 9));
                j67Var.show();
                return true;
        }
    }
}
