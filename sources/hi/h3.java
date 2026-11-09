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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.l60;
public final class h3 implements View.OnClickListener {
    public final int f14696a = 1;
    public final int f14697b;
    public final org.telegram.ui.ActionBar.v2 f14698c;
    public final g6 d;
    public final long f14699e;
    public final Context f14700f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f14701n;

    public h3(int i7, org.telegram.ui.ActionBar.v2 v2Var, g6 g6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f14697b = i7;
        this.f14698c = v2Var;
        this.d = g6Var;
        this.f14701n = linearLayout;
        this.f14699e = j3;
        this.f14700f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z9;
        switch (this.f14696a) {
            case 0:
                ai.d0 d0Var = (ai.d0) this.f14701n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f14697b;
                    TLRPC.User a22 = qp.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        qp.s1(i7).W2(a22, 0, true, new d3(this.f14698c, this.f14700f, i7, this.f14699e, this.d, 0));
                        return;
                    }
                    return;
                }
                d0Var.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f14701n;
                int i10 = this.f14697b;
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
                org.telegram.ui.ActionBar.v2 v2Var = this.f14698c;
                ViewGroup viewGroup = v2Var.f28624b;
                g6 g6Var = this.d;
                l60 l60Var = new l60(viewGroup, g6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f27105id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.f26956id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f14699e) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean z10 = z9;
                    int i12 = i10;
                    g6 g6Var2 = g6Var;
                    l60Var.g(tLObject, z10, new d9(i12, j10, this.f14700f, this.h, v2Var, g6Var2));
                    i10 = i12;
                    g6Var = g6Var2;
                }
                l60Var.f35618t = false;
                l60Var.f35617s = 0;
                l60Var.V(5);
                l60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                l60Var.Z();
                return;
        }
    }

    public h3(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.v2 v2Var, Context context, long j3, g6 g6Var, ai.d0 d0Var) {
        this.h = connectedbotstarref;
        this.f14697b = i7;
        this.f14698c = v2Var;
        this.f14700f = context;
        this.f14699e = j3;
        this.d = g6Var;
        this.f14701n = d0Var;
    }
}
