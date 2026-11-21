package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.p4;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.a70;
public final class y2 implements View.OnClickListener {
    public final int f19111a = 1;
    public final int f19112b;
    public final org.telegram.ui.ActionBar.w2 f19113c;
    public final h6 d;
    public final long f19114e;
    public final Context f19115f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f19116n;

    public y2(int i7, org.telegram.ui.ActionBar.w2 w2Var, h6 h6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f19112b = i7;
        this.f19113c = w2Var;
        this.d = h6Var;
        this.f19116n = linearLayout;
        this.f19114e = j3;
        this.f19115f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f19111a) {
            case 0:
                ai.r rVar = (ai.r) this.f19116n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f19112b;
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i7).c3(c22, 0, true, new v2(this.f19113c, this.f19115f, i7, this.f19114e, this.d, 0));
                        return;
                    }
                    return;
                }
                rVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f19116n;
                int i10 = this.f19112b;
                di.e0 g10 = di.e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8723j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8725l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, j10.i(i10).f());
                org.telegram.ui.ActionBar.w2 w2Var = this.f19113c;
                ViewGroup viewGroup = w2Var.f30173b;
                h6 h6Var = this.d;
                a70 a70Var = new a70(viewGroup, h6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f28580id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28431id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f19114e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = i10;
                    h6 h6Var2 = h6Var;
                    a70Var.g(tLObject, z11, new p4(i12, j10, this.f19115f, this.h, w2Var, h6Var2));
                    i10 = i12;
                    h6Var = h6Var2;
                }
                a70Var.f33386t = false;
                a70Var.f33384s = 0;
                a70Var.W(5);
                a70Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                a70Var.a0();
                return;
        }
    }

    public y2(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.w2 w2Var, Context context, long j3, h6 h6Var, ai.r rVar) {
        this.h = connectedbotstarref;
        this.f19112b = i7;
        this.f19113c = w2Var;
        this.f19115f = context;
        this.f19114e = j3;
        this.d = h6Var;
        this.f19116n = rVar;
    }
}
