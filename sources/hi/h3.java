package hi;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.d9;
import java.util.ArrayList;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.k60;
public final class h3 implements View.OnClickListener {
    public final int f14698a = 1;
    public final int f14699b;
    public final org.telegram.ui.ActionBar.w2 f14700c;
    public final h6 d;
    public final long f14701e;
    public final Context f14702f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f14703n;

    public h3(int i7, org.telegram.ui.ActionBar.w2 w2Var, h6 h6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f14699b = i7;
        this.f14700c = w2Var;
        this.d = h6Var;
        this.f14703n = linearLayout;
        this.f14701e = j3;
        this.f14702f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z9;
        switch (this.f14698a) {
            case 0:
                ai.d0 d0Var = (ai.d0) this.f14703n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f14699b;
                    TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        qp.s1(i7).W2(a22, 0, true, new d3(this.f14700c, this.f14702f, i7, this.f14701e, this.d, 0));
                        return;
                    }
                    return;
                }
                d0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f14703n;
                int i10 = this.f14699b;
                bi.n0 g10 = bi.n0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f4391j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f4393l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, p10.i(i10).f());
                org.telegram.ui.ActionBar.w2 w2Var = this.f14700c;
                ViewGroup viewGroup = w2Var.f28672b;
                h6 h6Var = this.d;
                k60 k60Var = new k60(viewGroup, h6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f27109id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.f26960id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f14701e) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = z9;
                    int i12 = i10;
                    h6 h6Var2 = h6Var;
                    k60Var.g(tLObject, z10, new d9(i12, j10, this.f14702f, this.h, w2Var, h6Var2));
                    i10 = i12;
                    h6Var = h6Var2;
                }
                k60Var.f35220t = false;
                k60Var.f35219s = 0;
                k60Var.V(5);
                k60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                k60Var.Z();
                return;
        }
    }

    public h3(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.w2 w2Var, Context context, long j3, h6 h6Var, ai.d0 d0Var) {
        this.h = connectedbotstarref;
        this.f14699b = i7;
        this.f14700c = w2Var;
        this.f14702f = context;
        this.f14701e = j3;
        this.d = h6Var;
        this.f14703n = d0Var;
    }
}
