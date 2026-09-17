package fi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f9648a;
    public final Context f9649b;
    public final int f9650c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9651e;
    public final f6 f9652f;
    public final org.telegram.ui.web.u f9653g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.f9648a = b2Var;
        this.f9649b = context;
        this.f9650c = i10;
        this.d = j3;
        this.f9651e = tL_messages_preparedInlineMessage;
        this.f9652f = f6Var;
        this.f9653g = uVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9648a.dismiss();
        new p1(this.f9649b, this.f9650c, this.d, this.f9651e, null, (TLRPC.WebPage) obj, this.f9652f, this.f9653g, this.h).show();
    }
}
