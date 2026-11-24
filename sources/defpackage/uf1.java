package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
public final class uf1 implements View.OnClickListener {
    public final byte a = 1;
    public final int b;
    public final Object c;
    public final wjb d;
    public final long e;
    public final Context f;
    public final Object h;
    public final Object n;

    public uf1(int i, fx0 fx0Var, wjb wjbVar, LinearLayout linearLayout, long j, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.b = i;
        this.c = fx0Var;
        this.d = wjbVar;
        this.n = linearLayout;
        this.e = j;
        this.f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j;
        boolean z;
        nj njVar;
        byte b = this.a;
        Object obj = this.n;
        Object obj2 = this.c;
        Object obj3 = this.h;
        switch (b) {
            case 0:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj3;
                fx0 fx0Var = (fx0) obj2;
                s67 s67Var = (s67) obj;
                if (connectedbotstarref.revoked) {
                    int i = this.b;
                    TLRPC.User V1 = na7.q1(i).V1(Long.valueOf(connectedbotstarref.bot_id));
                    if (V1 != null) {
                        na7.q1(i).Z2(V1, 0, true, new qf1(fx0Var, this.f, i, this.e, this.d, (byte) 0));
                        return;
                    }
                    return;
                }
                s67Var.run();
                return;
            case 1:
                fx0 fx0Var2 = (fx0) obj2;
                LinearLayout linearLayout = (LinearLayout) obj;
                TL_payments.connectedBotStarRef connectedbotstarref2 = (TL_payments.connectedBotStarRef) obj3;
                int i2 = this.b;
                ct0 g = ct0.g(i2);
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
                arrayList.add(0, y6c.h(i2).f());
                ViewGroup viewGroup = fx0Var2.b;
                wjb wjbVar = this.d;
                cs5 cs5Var = new cs5(viewGroup, wjbVar, linearLayout, false, false, true);
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
                            if (hc2.V(chat)) {
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
                    wjb wjbVar2 = wjbVar;
                    TL_payments.connectedBotStarRef connectedbotstarref3 = connectedbotstarref2;
                    cs5Var.f(tLObject, z2, new ue(i2, j, fx0Var2, wjbVar2, this.f, connectedbotstarref3));
                    connectedbotstarref2 = connectedbotstarref3;
                    i3 = i4;
                    wjbVar = wjbVar2;
                }
                cs5Var.t = false;
                cs5Var.s = (short) 0;
                cs5Var.W(5);
                cs5Var.b0(gl.L(24.0f), 0.0f);
                cs5Var.a0();
                return;
            default:
                t47 t47Var = (t47) obj3;
                p8c p8cVar = (p8c) obj;
                if (((mu1) obj2) != null && t47Var.r1.e0) {
                    int i5 = this.b;
                    if (na7.q1(i5).t2()) {
                        h5.b(i5);
                        return;
                    }
                    gta v = gta.v(i5, false);
                    if (v.e) {
                        njVar = nj.m(v.m());
                    } else {
                        njVar = null;
                    }
                    if (!t47Var.m1 && (njVar == null || njVar.b < t47Var.v1.b)) {
                        long a = t47Var.v1.a();
                        long j2 = this.e;
                        new zua(this.f, this.d, a, 13, mm4.i(i5, j2), null, j2).show();
                        return;
                    }
                    p8cVar.a(new u47(t47Var.v1, t47Var.w1));
                    t47Var.dismiss();
                    return;
                }
                return;
        }
    }

    public uf1(t47 t47Var, mu1 mu1Var, int i, Context context, wjb wjbVar, long j, p8c p8cVar) {
        this.h = t47Var;
        this.c = mu1Var;
        this.b = i;
        this.f = context;
        this.d = wjbVar;
        this.e = j;
        this.n = p8cVar;
    }

    public uf1(TL_payments.connectedBotStarRef connectedbotstarref, int i, fx0 fx0Var, Context context, long j, wjb wjbVar, s67 s67Var) {
        this.h = connectedbotstarref;
        this.b = i;
        this.c = fx0Var;
        this.f = context;
        this.e = j;
        this.d = wjbVar;
        this.n = s67Var;
    }
}
