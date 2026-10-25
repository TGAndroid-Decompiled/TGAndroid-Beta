package hi;

import android.content.Context;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.u6;
public final class j1 implements Utilities.Callback {
    public final org.telegram.ui.ActionBar.e2 f13043a;
    public final Context f13044b;
    public final int f13045c;
    public final long d;
    public final TLRPC.TL_messages_preparedInlineMessage e;
    public final u6 f13046f;
    public final org.telegram.ui.web.t f13047g;
    public final bi.t0 h;

    public j1(org.telegram.ui.ActionBar.e2 e2Var, Context context, int i10, long j10, TLRPC.TL_messages_preparedInlineMessage tL_messages_preparedInlineMessage, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.f13043a = e2Var;
        this.f13044b = context;
        this.f13045c = i10;
        this.d = j10;
        this.e = tL_messages_preparedInlineMessage;
        this.f13046f = u6Var;
        this.f13047g = tVar;
        this.h = t0Var;
    }

    @Override
    public final void run(Object obj) {
        this.f13043a.dismiss();
        new s1(this.f13044b, this.f13045c, this.d, this.e, null, (TLRPC.WebPage) obj, this.f13046f, this.f13047g, this.h).show();
    }
}
