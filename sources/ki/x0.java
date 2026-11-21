package ki;

import android.content.Context;
import org.telegram.messenger.x10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
public final class x0 implements x10 {
    public final org.telegram.ui.ActionBar.t1 f19065a;
    public final Context f19066b;
    public final int f19067c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19068e;
    public final h6 f19069f;
    public final org.telegram.ui.web.q f19070g;
    public final bi.h0 h;

    public x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19065a = t1Var;
        this.f19066b = context;
        this.f19067c = i7;
        this.d = j3;
        this.f19068e = tL_messages_preparedInlineMessage;
        this.f19069f = h6Var;
        this.f19070g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19065a.dismiss();
        new g1(this.f19066b, this.f19067c, this.d, this.f19068e, null, (TLRPC.WebPage) obj, this.f19069f, this.f19070g, this.h).show();
    }
}
