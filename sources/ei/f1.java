package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f8322a;
    public final Context f8323b;
    public final int f8324c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final e6 f8325f;
    public final org.telegram.ui.web.t f8326g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8322a = b2Var;
        this.f8323b = context;
        this.f8324c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8325f = e6Var;
        this.f8326g = tVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8322a.dismiss();
        new p1(this.f8323b, this.f8324c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8325f, this.f8326g, this.h).show();
    }
}
