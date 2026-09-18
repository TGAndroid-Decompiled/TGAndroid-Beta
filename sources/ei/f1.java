package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f8326a;
    public final Context f8327b;
    public final int f8328c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final e6 f8329f;
    public final org.telegram.ui.web.t f8330g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8326a = b2Var;
        this.f8327b = context;
        this.f8328c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8329f = e6Var;
        this.f8330g = tVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8326a.dismiss();
        new p1(this.f8327b, this.f8328c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8329f, this.f8330g, this.h).show();
    }
}
