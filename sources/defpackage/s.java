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
        tx1 tx1Var;
        boolean z2;
        byte b = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                b1 b1Var = (b1) obj3;
                vnb vnbVar = (vnb) obj2;
                Context context = (Context) obj;
                if (b1Var.h2) {
                    return false;
                }
                if (b1Var.j2 != null) {
                    if (b1Var.g1() == null) {
                        return false;
                    }
                } else if (b1Var.i2 == null || b1Var.h1() == null) {
                    return false;
                }
                if (b1Var.g2 == yac.h(b1Var.a).e()) {
                    z = true;
                } else {
                    z = false;
                }
                fu5 G = fu5.G(b1Var.c, vnbVar, b1Var.C2);
                G.k(2131231512, ob6.M0(2131745311, null), new a(b1Var, (byte) 4), !z);
                if (z) {
                    i = 2131745242;
                } else {
                    i = 2131745587;
                }
                G.b(2131232082, ob6.M0(i, null), new es6(b1Var, context, vnbVar, (byte) 6), false);
                G.a0();
                return true;
            default:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj3;
                r47 r47Var = (r47) obj2;
                m47 m47Var = (m47) obj;
                int i2 = ChatActivityEnterView.X7;
                vnb vnbVar2 = chatActivityEnterView.K4;
                if (r47Var.F3() || (tx1Var = chatActivityEnterView.F0) == null || TextUtils.isEmpty(tx1Var.getTextToUse())) {
                    return false;
                }
                if (m47Var != null && (!m47Var.c || m47Var.i)) {
                    return false;
                }
                int i3 = r47Var.D;
                if (i3 != 1 && i3 != 3 && i3 != 8) {
                    return false;
                }
                q67 q67Var = new q67(chatActivityEnterView.getContext(), vnbVar2);
                q67Var.h0 = true;
                ArrayList arrayList = new ArrayList();
                if (m47Var != null) {
                    ArrayList arrayList2 = m47Var.d;
                    for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                        r47 r47Var2 = (r47) arrayList2.get(i4);
                        if (i4 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        arrayList.add(chatActivityEnterView.B0(r47Var2, z2));
                    }
                } else {
                    arrayList.add(chatActivityEnterView.B0(r47Var, true));
                }
                q67Var.r(arrayList);
                fu5 G2 = fu5.G(chatActivityEnterView.b2, vnbVar2, chatActivityEnterView.u2);
                r57 r57Var = new r57(chatActivityEnterView.getContext(), 2131624139, ob6.M0(2131752541, null), 2131624138, ob6.M0(2131752540, null), chatActivityEnterView.K4);
                r57Var.a(!chatActivityEnterView.n7, false);
                r57Var.setOnClickListener(new cg(chatActivityEnterView, arrayList, r57Var, q67Var, (byte) 8));
                G2.p(r57Var);
                G2.Z();
                q67Var.q(G2);
                q67Var.s(chatActivityEnterView.u2, false, new cg(chatActivityEnterView, m47Var, r47Var, q67Var, (byte) 9));
                q67Var.show();
                return true;
        }
    }
}
