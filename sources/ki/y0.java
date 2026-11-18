package ki;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
public final class y0 implements x10 {
    public final org.telegram.ui.ActionBar.u1 f19058a;
    public final Context f19059b;
    public final int f19060c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19061e;
    public final i6 f19062f;
    public final org.telegram.ui.web.q f19063g;
    public final bi.h0 h;

    public y0(org.telegram.ui.ActionBar.u1 u1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19058a = u1Var;
        this.f19059b = context;
        this.f19060c = i7;
        this.d = j3;
        this.f19061e = tL_messages_preparedInlineMessage;
        this.f19062f = i6Var;
        this.f19063g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19058a.dismiss();
        new h1(this.f19059b, this.f19060c, this.d, this.f19061e, null, (TLRPC.WebPage) obj, this.f19062f, this.f19063g, this.h).show();
    }
}
