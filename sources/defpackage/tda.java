package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class tda extends taa {
    public final d U2;

    public tda(Context context, String str, String str2, wjb wjbVar, d dVar) {
        super(context, null, str, false, str2, false, wjbVar);
        this.U2 = dVar;
    }

    @Override
    public final void L0(vf6 vf6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        gl.e3(new t79(this.U2, vf6Var, i, (byte) 7), 100L);
    }
}
