package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class c1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f11105a;
    public final Context f11106b;
    public final int f11107c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final d6 f11108f;
    public final org.telegram.ui.web.s f11109g;
    public final ai.s0 h;

    public c1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, ai.s0 s0Var) {
        this.f11105a = b2Var;
        this.f11106b = context;
        this.f11107c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f11108f = d6Var;
        this.f11109g = sVar;
        this.h = s0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f11105a.dismiss();
        new l1(this.f11106b, this.f11107c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f11108f, this.f11109g, this.h).show();
    }
}
