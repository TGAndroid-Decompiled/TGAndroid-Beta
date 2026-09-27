package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.c2 f8311a;
    public final Context f8312b;
    public final int f8313c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final e6 f8314f;
    public final org.telegram.ui.web.s f8315g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8311a = c2Var;
        this.f8312b = context;
        this.f8313c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8314f = e6Var;
        this.f8315g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8311a.dismiss();
        new p1(this.f8312b, this.f8313c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8314f, this.f8315g, this.h).show();
    }
}
