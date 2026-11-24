package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class zub extends jr5 {
    public final long u2;
    public final bvb v2;

    public zub(bvb bvbVar, Context context, int i, vf6 vf6Var, long j, d dVar, long j2) {
        super(context, i, vf6Var, j, dVar, null);
        this.v2 = bvbVar;
        this.u2 = j2;
    }

    @Override
    public final boolean M0() {
        TLRPC.Chat K0 = this.v2.b.getMessagesController().K0(Long.valueOf(this.u2));
        if (K0 != null && hc2.y(3, K0)) {
            return true;
        }
        return false;
    }
}
