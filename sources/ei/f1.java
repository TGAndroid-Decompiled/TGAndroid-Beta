package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f8324a;
    public final Context f8325b;
    public final int f8326c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final e6 f8327f;
    public final org.telegram.ui.web.t f8328g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.e eVar) {
        this.f8324a = b2Var;
        this.f8325b = context;
        this.f8326c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8327f = e6Var;
        this.f8328g = tVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8324a.dismiss();
        new p1(this.f8325b, this.f8326c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8327f, this.f8328g, this.h).show();
    }
}
