package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
public final class j1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.e2 f13042a;
    public final Context f13043b;
    public final int f13044c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final u6 f13045f;
    public final org.telegram.ui.web.t f13046g;
    public final bi.t0 h;

    public j1(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.f13042a = e2Var;
        this.f13043b = context;
        this.f13044c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f13045f = u6Var;
        this.f13046g = tVar;
        this.h = t0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f13042a.dismiss();
        new s1(this.f13043b, this.f13044c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f13045f, this.f13046g, this.h).show();
    }
}
