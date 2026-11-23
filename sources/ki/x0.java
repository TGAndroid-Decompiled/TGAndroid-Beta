package ki;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
public final class x0 implements y10 {
    public final org.telegram.ui.ActionBar.t1 f19068a;
    public final Context f19069b;
    public final int f19070c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19071e;
    public final h6 f19072f;
    public final org.telegram.ui.web.q f19073g;
    public final bi.h0 h;

    public x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19068a = t1Var;
        this.f19069b = context;
        this.f19070c = i7;
        this.d = j3;
        this.f19071e = tL_messages_preparedInlineMessage;
        this.f19072f = h6Var;
        this.f19073g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19068a.dismiss();
        new g1(this.f19069b, this.f19070c, this.d, this.f19071e, null, (TLRPC.WebPage) obj, this.f19072f, this.f19073g, this.h).show();
    }
}
