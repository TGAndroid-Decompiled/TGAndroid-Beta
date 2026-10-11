package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.a2 f9055a;
    public final Context f9056b;
    public final int f9057c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9058e;
    public final d6 f9059f;
    public final org.telegram.ui.web.s f9060g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9055a = a2Var;
        this.f9056b = context;
        this.f9057c = i10;
        this.d = j3;
        this.f9058e = tL_messages_preparedInlineMessage;
        this.f9059f = d6Var;
        this.f9060g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9055a.dismiss();
        new p1(this.f9056b, this.f9057c, this.d, this.f9058e, null, (TLRPC.WebPage) obj, this.f9059f, this.f9060g, this.h).show();
    }
}
