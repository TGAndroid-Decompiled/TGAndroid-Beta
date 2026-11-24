package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class q83 extends taa {
    public final r83 U2;

    public q83(r83 r83Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = r83Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gl.d3(new gu2(this, vf6Var, i), 250L);
    }
}
