package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f8310a;
    public final Context f8311b;
    public final int f8312c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final d6 f8313f;
    public final org.telegram.ui.web.s f8314g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8310a = b2Var;
        this.f8311b = context;
        this.f8312c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8313f = d6Var;
        this.f8314g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8310a.dismiss();
        new p1(this.f8311b, this.f8312c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8313f, this.f8314g, this.h).show();
    }
}
