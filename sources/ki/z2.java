package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import bi.s4;
import java.util.ArrayList;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.x60;
public final class z2 implements View.OnClickListener {
    public final int f19197a = 1;
    public final int f19198b;
    public final org.telegram.ui.ActionBar.w2 f19199c;
    public final i6 d;
    public final long f19200e;
    public final Context f19201f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f19202n;

    public z2(int i7, org.telegram.ui.ActionBar.w2 w2Var, i6 i6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f19198b = i7;
        this.f19199c = w2Var;
        this.d = i6Var;
        this.f19202n = linearLayout;
        this.f19200e = j3;
        this.f19201f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f19197a) {
            case 0:
                ai.j jVar = (ai.j) this.f19202n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f19198b;
                    TLRPC.User c22 = mp.u1(i7).c2(Long.valueOf(connectedbotstarref.bot_id));
                    if (c22 != null) {
                        mp.u1(i7).c3(c22, 0, true, new w2(this.f19199c, this.f19201f, i7, this.f19200e, this.d, 0));
                        return;
                    }
                    return;
                }
                jVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f19202n;
                int i10 = this.f19198b;
                di.e0 g10 = di.e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8687j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8689l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, i10.i(i10).f());
                org.telegram.ui.ActionBar.w2 w2Var = this.f19199c;
                ViewGroup viewGroup = w2Var.f30226b;
                i6 i6Var = this.d;
                x60 x60Var = new x60(viewGroup, i6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f28641id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.v3.V(chat)) {
                            j3 = -chat.f28492id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f19200e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = i10;
                    i6 i6Var2 = i6Var;
                    x60Var.g(tLObject, z11, new s4(i12, j10, this.f19201f, this.h, w2Var, i6Var2));
                    i10 = i12;
                    i6Var = i6Var2;
                }
                x60Var.f41894t = false;
                x60Var.f41892s = 0;
                x60Var.W(5);
                x60Var.b0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                x60Var.a0();
                return;
        }
    }

    public z2(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.w2 w2Var, Context context, long j3, i6 i6Var, ai.j jVar) {
        this.h = connectedbotstarref;
        this.f19198b = i7;
        this.f19199c = w2Var;
        this.f19201f = context;
        this.f19200e = j3;
        this.d = i6Var;
        this.f19202n = jVar;
    }
}
