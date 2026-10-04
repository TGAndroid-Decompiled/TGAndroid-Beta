package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class g1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f9057a;
    public final Context f9058b;
    public final int f9059c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9060e;
    public final d6 f9061f;
    public final org.telegram.ui.web.s f9062g;
    public final org.telegram.tgnet.e h;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9057a = b2Var;
        this.f9058b = context;
        this.f9059c = i10;
        this.d = j3;
        this.f9060e = tL_messages_preparedInlineMessage;
        this.f9061f = d6Var;
        this.f9062g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9057a.dismiss();
        new q1(this.f9058b, this.f9059c, this.d, this.f9060e, null, (TLRPC.WebPage) obj, this.f9061f, this.f9062g, this.h).show();
    }
}
