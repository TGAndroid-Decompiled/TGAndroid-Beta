package nh;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;

public final class b1 implements Utilities.Callback {

    public final org.telegram.ui.ActionBar.b2 f18560a;

    public final Context f18561b;

    public final int f18562c;
    public final long d;

    public final TLRPC.TL_messages_preparedInlineMessage f18563e;

    public final c6 f18564f;

    public final org.telegram.ui.web.u f18565g;
    public final cg.u0 h;

    public b1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.f18560a = b2Var;
        this.f18561b = context;
        this.f18562c = i10;
        this.d = j10;
        this.f18563e = tL_messages_preparedInlineMessage;
        this.f18564f = c6Var;
        this.f18565g = uVar;
        this.h = u0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f18560a.dismiss();
        new k1(this.f18561b, this.f18562c, this.d, this.f18563e, null, (TLRPC.WebPage) obj, this.f18564f, this.f18565g, this.h).show();
    }
}
