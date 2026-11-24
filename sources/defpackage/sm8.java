package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class sm8 extends taa {
    public final tm8 U2;

    public sm8(tm8 tm8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = tm8Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gl.d3(new ll8(this, vf6Var, i, (byte) 10), 250L);
    }
}
