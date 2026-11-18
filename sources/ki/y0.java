package ki;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
public final class y0 implements x10 {
    public final org.telegram.ui.ActionBar.u1 f19055a;
    public final Context f19056b;
    public final int f19057c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19058e;
    public final i6 f19059f;
    public final org.telegram.ui.web.q f19060g;
    public final bi.h0 h;

    public y0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19055a = u1Var;
        this.f19056b = context;
        this.f19057c = i7;
        this.d = j3;
        this.f19058e = tL_messages_preparedInlineMessage;
        this.f19059f = i6Var;
        this.f19060g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19055a.dismiss();
        new h1(this.f19056b, this.f19057c, this.d, this.f19058e, null, (TLRPC.WebPage) obj, this.f19059f, this.f19060g, this.h).show();
    }
}
