package ki;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import di.v7;
import java.util.ArrayList;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.m60;
public final class e3 implements View.OnClickListener {
    public final int f18282a = 1;
    public final int f18283b;
    public final org.telegram.ui.ActionBar.u2 f18284c;
    public final e6 d;
    public final long f18285e;
    public final Context f18286f;
    public final TL_payments.connectedBotStarRef h;
    public final Object f18287n;

    public e3(int i7, org.telegram.ui.ActionBar.u2 u2Var, e6 e6Var, LinearLayout linearLayout, long j3, Context context, TL_payments.connectedBotStarRef connectedbotstarref) {
        this.f18283b = i7;
        this.f18284c = u2Var;
        this.d = e6Var;
        this.f18287n = linearLayout;
        this.f18285e = j3;
        this.f18286f = context;
        this.h = connectedbotstarref;
    }

    @Override
    public final void onClick(View view) {
        long j3;
        boolean z10;
        switch (this.f18282a) {
            case 0:
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.f18287n;
                TL_payments.connectedBotStarRef connectedbotstarref = this.h;
                if (connectedbotstarref.revoked) {
                    int i7 = this.f18283b;
                    TLRPC.User a22 = np.s1(i7).a2(Long.valueOf(connectedbotstarref.bot_id));
                    if (a22 != null) {
                        np.s1(i7).W2(a22, 0, true, new a3(this.f18284c, this.f18286f, i7, this.f18285e, this.d, 0));
                        return;
                    }
                    return;
                }
                aVar.run();
                return;
            default:
                LinearLayout linearLayout = (LinearLayout) this.f18287n;
                int i10 = this.f18283b;
                di.e0 g10 = di.e0.g(i10);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.f8441j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.f8443l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, m10.i(i10).f());
                org.telegram.ui.ActionBar.u2 u2Var = this.f18284c;
                ViewGroup viewGroup = u2Var.f29682b;
                e6 e6Var = this.d;
                m60 m60Var = new m60(viewGroup, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject).f28200id;
                    } else if (tLObject instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.f28051id;
                        }
                    }
                    long j10 = j3;
                    if (j10 == this.f18285e) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    boolean z11 = z10;
                    int i12 = i10;
                    e6 e6Var2 = e6Var;
                    m60Var.g(tLObject, z11, new v7(i12, j10, this.f18286f, this.h, u2Var, e6Var2));
                    i10 = i12;
                    e6Var = e6Var2;
                }
                m60Var.f37112t = false;
                m60Var.f37111s = 0;
                m60Var.V(5);
                m60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                m60Var.Z();
                return;
        }
    }

    public e3(TL_payments.connectedBotStarRef connectedbotstarref, int i7, org.telegram.ui.ActionBar.u2 u2Var, Context context, long j3, e6 e6Var, androidx.car.app.utils.a aVar) {
        this.h = connectedbotstarref;
        this.f18283b = i7;
        this.f18284c = u2Var;
        this.f18286f = context;
        this.f18285e = j3;
        this.d = e6Var;
        this.f18287n = aVar;
    }
}
