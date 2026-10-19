package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class c1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f11104a;
    public final Context f11105b;
    public final int f11106c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final d6 f11107f;
    public final org.telegram.ui.web.t f11108g;
    public final ai.s0 h;

    public c1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11104a = b2Var;
        this.f11105b = context;
        this.f11106c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f11107f = d6Var;
        this.f11108g = tVar;
        this.h = s0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f11104a.dismiss();
        new l1(this.f11105b, this.f11106c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f11107f, this.f11108g, this.h).show();
    }
}
