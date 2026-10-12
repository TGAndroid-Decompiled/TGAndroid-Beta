package fi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
public final class e1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.a2 f9241a;
    public final Context f9242b;
    public final int f9243c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final c6 f9244f;
    public final org.telegram.ui.web.s f9245g;
    public final org.telegram.tgnet.e h;

    public e1(org.telegram.ui.ActionBar.a2 a2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, c6 c6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f9241a = a2Var;
        this.f9242b = context;
        this.f9243c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f9244f = c6Var;
        this.f9245g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(Object obj) {
        this.f9241a.dismiss();
        new o1(this.f9242b, this.f9243c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f9244f, this.f9245g, this.h).show();
    }
}
