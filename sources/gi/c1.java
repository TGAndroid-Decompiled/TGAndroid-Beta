package gi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
public final class c1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.c2 f11123a;
    public final Context f11124b;
    public final int f11125c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final g6 f11126f;
    public final org.telegram.ui.web.t f11127g;
    public final ai.s0 h;

    public c1(org.telegram.ui.ActionBar.c2 c2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11123a = c2Var;
        this.f11124b = context;
        this.f11125c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f11126f = g6Var;
        this.f11127g = tVar;
        this.h = s0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f11123a.dismiss();
        new l1(this.f11124b, this.f11125c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f11126f, this.f11127g, this.h).show();
    }
}
