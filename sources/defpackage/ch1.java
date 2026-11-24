package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class ch1 implements View.OnClickListener {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final ylb d;
    public final long e;
    public final Context f;
    public final Object h;
    public final Object n;

    public ch1(int i, my0 my0Var, ylb ylbVar, LinearLayout linearLayout, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i;
        this.c = my0Var;
        this.d = ylbVar;
        this.n = linearLayout;
        this.e = j;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j;
        boolean z;
        nk nkVar;
        byte b = this.a;
        Object obj = this.n;
        Object obj2 = this.c;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj3;
                my0 my0Var = (my0) obj2;
                l97 l97Var = (l97) obj;
                if (connectedbotstarref.revoked) {
                    int i = this.b;
                    TLRPC.User W1 = oc7.r1(i).W1(Long.valueOf(connectedbotstarref.bot_id));
                    if (W1 != null) {
                        oc7.r1(i).b3(W1, 0, true, new yg1(my0Var, this.f, i, this.e, this.d, (byte) 0));
                        return;
                    }
                    return;
                }
                l97Var.run();
                return;
            case 1:
                my0 my0Var2 = (my0) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj3;
                int i2 = this.b;
                ku0 g = ku0.g(i2);
                g.n();
                g.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, z8c.h(i2).f());
                ViewGroup viewGroup = my0Var2.b;
                ylb ylbVar = this.d;
                bu5 bu5Var = new bu5(viewGroup, ylbVar, linearLayout, false, false, true);
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    int i4 = i3 + 1;
                    TLObject tLObject = (TLObject) arrayList.get(i3);
                    if (tLObject instanceof TLRPC.User) {
                        j = ((TLRPC.User) tLObject).id;
                    } else {
                        if (tLObject instanceof TLRPC.Chat) {
                            TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                            if (sd2.V(chat)) {
                                j = -chat.id;
                            }
                        }
                        i3 = i4;
                    }
                    if (j == this.e) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean z2 = z;
                    ylb ylbVar2 = ylbVar;
                    TL_payments.connectedBotStarRef connectedbotstarref3 = connectedbotstarref2;
                    bu5Var.f(tLObject, z2, new vf(i2, j, my0Var2, ylbVar2, this.f, connectedbotstarref3));
                    connectedbotstarref2 = connectedbotstarref3;
                    i3 = i4;
                    ylbVar = ylbVar2;
                }
                bu5Var.t = false;
                bu5Var.s = (short) 0;
                bu5Var.W(5);
                bu5Var.b0(gm.L(24.0f), 0.0f);
                bu5Var.a0();
                return;
            default:
                u67 u67Var = (u67) obj3;
                qac qacVar = (qac) obj;
                if (((yv1) obj2) != null && u67Var.r1.e0) {
                    int i5 = this.b;
                    if (oc7.r1(i5).u2()) {
                        h5.b(i5);
                        return;
                    }
                    jva v = jva.v(i5, false);
                    if (v.e) {
                        nkVar = nk.m(v.m());
                    } else {
                        nkVar = null;
                    }
                    if (!u67Var.m1 && (nkVar == null || nkVar.b < u67Var.v1.b)) {
                        long a = u67Var.v1.a();
                        long j2 = this.e;
                        new dxa(this.f, this.d, a, 13, no4.i(i5, j2), null, j2).show();
                        return;
                    }
                    qacVar.a(new v67(u67Var.v1, u67Var.w1));
                    u67Var.dismiss();
                    return;
                }
                return;
        }
    }

    public ch1(u67 u67Var, yv1 yv1Var, int i, Context context, ylb ylbVar, long j, qac qacVar) {
        this.h = u67Var;
        this.c = yv1Var;
        this.b = i;
        this.f = context;
        this.d = ylbVar;
        this.e = j;
        this.n = qacVar;
    }

    public ch1(TL_payments.connectedBotStarRef connectedbotstarref, int i, my0 my0Var, Context context, long j, ylb ylbVar, l97 l97Var) {
        this.h = connectedbotstarref;
        this.b = i;
        this.c = my0Var;
        this.f = context;
        this.e = j;
        this.d = ylbVar;
        this.n = l97Var;
    }
}
