package ii;

import android.content.Context;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
public final class a1 implements u10 {
    public final org.telegram.ui.ActionBar.s1 f14781a;
    public final Context f14782b;
    public final int f14783c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f14784e;
    public final e6 f14785f;
    public final org.telegram.ui.web.r f14786g;
    public final ai.n0 h;

    public a1(org.telegram.ui.ActionBar.s1 s1Var, Context context, int i3, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, e6 e6Var, org.telegram.ui.web.r rVar, ai.n0 n0Var) {
        this.f14781a = s1Var;
        this.f14782b = context;
        this.f14783c = i3;
        this.d = j10;
        this.f14784e = tL_messages_preparedInlineMessage;
        this.f14785f = e6Var;
        this.f14786g = rVar;
        this.h = n0Var;
    }

    @Override
    public final void a(Object obj) {
        this.f14781a.dismiss();
        new j1(this.f14782b, this.f14783c, this.d, this.f14784e, null, (TLRPC.WebPage) obj, this.f14785f, this.f14786g, this.h).show();
    }
}
