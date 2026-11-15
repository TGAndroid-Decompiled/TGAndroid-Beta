package ki;

import android.content.Context;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class a1 implements z10 {
    public final org.telegram.ui.ActionBar.t1 f18183a;
    public final Context f18184b;
    public final int f18185c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f18186e;
    public final e6 f18187f;
    public final org.telegram.ui.web.q f18188g;
    public final bi.h0 h;

    public a1(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f18183a = t1Var;
        this.f18184b = context;
        this.f18185c = i7;
        this.d = j3;
        this.f18186e = tL_messages_preparedInlineMessage;
        this.f18187f = e6Var;
        this.f18188g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f18183a.dismiss();
        new j1(this.f18184b, this.f18185c, this.d, this.f18186e, null, (TLRPC.WebPage) obj, this.f18187f, this.f18188g, this.h).show();
    }
}
