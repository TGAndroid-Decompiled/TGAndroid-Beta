package ii;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ci.d8;
import java.util.ArrayList;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.f60;
public final class h3 implements View.OnClickListener {
    public final int f14988a = 1;
    public final int f14989b;
    public final org.telegram.ui.ActionBar.t2 f14990c;
    public final e6 d;
    public final long f14991e;
    public final Context f14992f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f14993n;

    public h3(int i3, org.telegram.ui.ActionBar.t2 t2Var, e6 e6Var, LinearLayout linearLayout, long j10, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f14989b = i3;
        this.f14990c = t2Var;
        this.d = e6Var;
        this.f14993n = linearLayout;
        this.f14991e = j10;
        this.f14992f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean z10;
        switch (this.f14988a) {
            case 0:
                ai.z3 z3Var = (ai.z3) this.f14993n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i3 = this.f14989b;
                    TLRPC.User a22 = hp.s1(i3).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        hp.s1(i3).W2(a22, 0, true, new d3(this.f14990c, this.f14992f, i3, this.f14991e, this.d, 0));
                        return;
                    }
                    return;
                }
                z3Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f14993n;
                int i10 = this.f14989b;
                ci.i0 g7 = ci.i0.g(i10);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.f5275j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.f5277l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, h10.i(i10).f());
                org.telegram.ui.ActionBar.t2 t2Var = this.f14990c;
                ViewGroup viewGroup = t2Var.f28586b;
                e6 e6Var = this.d;
                f60 f60Var = new f60(viewGroup, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject).f27150id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j10 = -chat.f27001id;
                        }
                    }
                    long j11 = j10;
                    if (j11 == this.f14991e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = i10;
                    e6 e6Var2 = e6Var;
                    f60Var.g(tLObject, z11, new d8(i12, j11, this.f14992f, this.h, t2Var, e6Var2));
                    i10 = i12;
                    e6Var = e6Var2;
                }
                f60Var.f33748t = false;
                f60Var.f33747s = 0;
                f60Var.V(5);
                f60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                f60Var.Z();
                return;
        }
    }

    public h3(TL_payments.connectedBotStarRef connectedbotstarref, int i3, org.telegram.ui.ActionBar.t2 t2Var, Context context, long j10, e6 e6Var, ai.z3 z3Var) {
        this.h = connectedbotstarref;
        this.f14989b = i3;
        this.f14990c = t2Var;
        this.f14992f = context;
        this.f14991e = j10;
        this.d = e6Var;
        this.f14993n = z3Var;
    }
}
