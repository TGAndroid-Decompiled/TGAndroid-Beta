package di;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class i1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.d2 f6671a;
    public final Context f6672b;
    public final int f6673c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final f6 f6674f;
    public final org.telegram.ui.web.t f6675g;
    public final org.telegram.tgnet.g h;

    public i1(org.telegram.ui.ActionBar.d2 d2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.t tVar, org.telegram.tgnet.g gVar) {
        this.f6671a = d2Var;
        this.f6672b = context;
        this.f6673c = i10;
        this.d = j3;
        this.e = tL_messages_preparedInlineMessage;
        this.f6674f = f6Var;
        this.f6675g = tVar;
        this.h = gVar;
    }

    @Override
    public final void run(Object obj) {
        this.f6671a.dismiss();
        new s1(this.f6672b, this.f6673c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f6674f, this.f6675g, this.h).show();
    }
}
