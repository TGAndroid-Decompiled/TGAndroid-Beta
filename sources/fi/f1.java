package fi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
public final class f1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.b2 f9676a;
    public final Context f9677b;
    public final int f9678c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage f9679e;
    public final f6 f9680f;
    public final org.telegram.ui.web.u f9681g;
    public final org.telegram.tgnet.e h;

    public f1(org.telegram.ui.ActionBar.b2 b2Var, Context context, int i10, long j3, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, f6 f6Var, org.telegram.ui.web.u uVar, org.telegram.tgnet.e eVar) {
        this.f9676a = b2Var;
        this.f9677b = context;
        this.f9678c = i10;
        this.d = j3;
        this.f9679e = tL_messages_preparedInlineMessage;
        this.f9680f = f6Var;
        this.f9681g = uVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9676a.dismiss();
        new p1(this.f9677b, this.f9678c, this.d, this.f9679e, null, (TLRPC.WebPage) obj, this.f9680f, this.f9681g, this.h).show();
    }
}
