package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.a2 f8309a;
    public final Context f8310b;
    public final int f8311c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final d6 f8312f;
    public final org.telegram.ui.web.s f8313g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8309a = a2Var;
        this.f8310b = context;
        this.f8311c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8312f = d6Var;
        this.f8313g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8309a.dismiss();
        new p1(this.f8310b, this.f8311c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8312f, this.f8313g, this.h).show();
    }
}
