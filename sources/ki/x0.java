package ki;

import android.content.Context;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
public final class x0 implements w10 {
    public final org.telegram.ui.ActionBar.t1 f19132a;
    public final Context f19133b;
    public final int f19134c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19135e;
    public final i6 f19136f;
    public final org.telegram.ui.web.q f19137g;
    public final bi.h0 h;

    public x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, i6 i6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19132a = t1Var;
        this.f19133b = context;
        this.f19134c = i7;
        this.d = j3;
        this.f19135e = tL_messages_preparedInlineMessage;
        this.f19136f = i6Var;
        this.f19137g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19132a.dismiss();
        new g1(this.f19133b, this.f19134c, this.d, this.f19135e, null, (TLRPC.WebPage) obj, this.f19136f, this.f19137g, this.h).show();
    }
}
