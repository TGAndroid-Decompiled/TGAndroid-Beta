package ei;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
public final class g1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f9056a;
    public final Context f9057b;
    public final int f9058c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9059e;
    public final d6 f9060f;
    public final org.telegram.ui.web.s f9061g;
    public final org.telegram.tgnet.e h;

    public g1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9056a = b2Var;
        this.f9057b = context;
        this.f9058c = i10;
        this.d = j3;
        this.f9059e = tL_messages_preparedInlineMessage;
        this.f9060f = d6Var;
        this.f9061g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9056a.dismiss();
        new q1(this.f9057b, this.f9058c, this.d, this.f9059e, null, (TLRPC.WebPage) obj, this.f9060f, this.f9061g, this.h).show();
    }
}
