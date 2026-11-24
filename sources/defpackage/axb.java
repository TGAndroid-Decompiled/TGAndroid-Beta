package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class axb extends it5 {
    public final long u2;
    public final cxb v2;

    public axb(cxb cxbVar, Context context, int i, vh6 vh6Var, long j, d dVar, long j2) {
        super(context, i, vh6Var, j, dVar, null);
        this.v2 = cxbVar;
        this.u2 = j2;
    }

    @Override
    public final boolean M0() {
        TLRPC.Chat L0 = this.v2.b.getMessagesController().L0(Long.valueOf(this.u2));
        if (L0 != null && sd2.y(3, L0)) {
            return true;
        }
        return false;
    }
}
