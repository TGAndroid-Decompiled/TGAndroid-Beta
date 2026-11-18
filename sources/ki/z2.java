package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.l4;
import java.util.ArrayList;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.y60;
public final class z2 implements View.OnClickListener {
    public final int f19101a = 1;
    public final int f19102b;
    public final org.telegram.ui.ActionBar.x2 f19103c;
    public final i6 d;
    public final long f19104e;
    public final Context f19105f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f19106n;

    public z2(int i7, org.telegram.ui.ActionBar.x2 x2Var, i6 i6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f19102b = i7;
        this.f19103c = x2Var;
        this.d = i6Var;
        this.f19106n = linearLayout;
        this.f19104e = j3;
        this.f19105f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f19101a) {
            case 0:
                ai.s sVar = (ai.s) this.f19106n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f19102b;
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i7).c3(c22, 0, true, new w2(this.f19103c, this.f19105f, i7, this.f19104e, this.d, 0));
                        return;
                    }
                    return;
                }
                sVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f19106n;
                int i10 = this.f19102b;
                di.e0 g10 = di.e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8689j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8691l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, j10.i(i10).f());
                org.telegram.ui.ActionBar.x2 x2Var = this.f19103c;
                ViewGroup viewGroup = x2Var.f30190b;
                i6 i6Var = this.d;
                y60 y60Var = new y60(viewGroup, i6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f28552id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28403id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f19104e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = i10;
                    i6 i6Var2 = i6Var;
                    y60Var.g(tLObject, z11, new l4(i12, j10, this.f19105f, this.h, x2Var, i6Var2));
                    i10 = i12;
                    i6Var = i6Var2;
                }
                y60Var.f42377t = false;
                y60Var.f42375s = 0;
                y60Var.W(5);
                y60Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                y60Var.a0();
                return;
        }
    }

    public z2(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.x2 x2Var, Context context, long j3, i6 i6Var, ai.s sVar) {
        this.h = connectedbotstarref;
        this.f19102b = i7;
        this.f19103c = x2Var;
        this.f19105f = context;
        this.f19104e = j3;
        this.d = i6Var;
        this.f19106n = sVar;
    }
}
