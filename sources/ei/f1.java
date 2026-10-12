package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.a2 f9053a;
    public final Context f9054b;
    public final int f9055c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9056e;
    public final c6 f9057f;
    public final org.telegram.ui.web.s f9058g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9053a = a2Var;
        this.f9054b = context;
        this.f9055c = i10;
        this.d = j3;
        this.f9056e = tL_messages_preparedInlineMessage;
        this.f9057f = c6Var;
        this.f9058g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9053a.dismiss();
        new p1(this.f9054b, this.f9055c, this.d, this.f9056e, null, (TLRPC.WebPage) obj, this.f9057f, this.f9058g, this.h).show();
    }
}
