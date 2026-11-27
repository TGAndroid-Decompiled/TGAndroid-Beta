package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class bzb extends lt5 {
    public final long u2;
    public final dzb v2;

    public bzb(dzb dzbVar, Context context, int i, zh6 zh6Var, long j, e eVar, long j2) {
        super(context, i, zh6Var, j, eVar, null);
        this.v2 = dzbVar;
        this.u2 = j2;
    }

    @Override
    public final boolean N0() {
        TLRPC.Chat M0 = this.v2.b.getMessagesController().M0(Long.valueOf(this.u2));
        if (M0 != null && xc2.y(3, M0)) {
            return true;
        }
        return false;
    }
}
