package ki;

import android.content.Context;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
public final class x0 implements y10 {
    public final org.telegram.ui.ActionBar.t1 f19034a;
    public final Context f19035b;
    public final int f19036c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f19037e;
    public final h6 f19038f;
    public final org.telegram.ui.web.q f19039g;
    public final bi.h0 h;

    public x0(org.telegram.ui.ActionBar.t1 t1Var, Context context, int i7, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, h6 h6Var, org.telegram.ui.web.q qVar, bi.h0 h0Var) {
        this.f19034a = t1Var;
        this.f19035b = context;
        this.f19036c = i7;
        this.d = j3;
        this.f19037e = tL_messages_preparedInlineMessage;
        this.f19038f = h6Var;
        this.f19039g = qVar;
        this.h = h0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f19034a.dismiss();
        new g1(this.f19035b, this.f19036c, this.d, this.f19037e, null, (TLRPC.WebPage) obj, this.f19038f, this.f19039g, this.h).show();
    }
}
