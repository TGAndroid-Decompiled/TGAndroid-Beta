package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.a2 f8321a;
    public final Context f8322b;
    public final int f8323c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final d6 f8324f;
    public final org.telegram.ui.web.s f8325g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8321a = a2Var;
        this.f8322b = context;
        this.f8323c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f8324f = d6Var;
        this.f8325g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f8321a.dismiss();
        new p1(this.f8322b, this.f8323c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f8324f, this.f8325g, this.h).show();
    }
}
