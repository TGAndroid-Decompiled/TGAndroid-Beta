package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class ca3 extends tca {
    public final da3 U2;

    public ca3(da3 da3Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = da3Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gm.d3(new mv2(this, vh6Var, i), 250L);
    }
}
