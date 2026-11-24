package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
public final class ex3 extends taa {
    public final qx3 U2;

    public ex3(qx3 qx3Var, Context context, String str, String str2, wjb wjbVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = qx3Var;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        gl.e3(new va7(this, vf6Var, i, (byte) 23), 100L);
    }
}
