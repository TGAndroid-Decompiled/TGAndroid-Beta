package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class to8 extends tca {
    public final uo8 U2;

    public to8(uo8 uo8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = uo8Var;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        gm.d3(new mn8(this, vh6Var, i, (byte) 12), 250L);
    }
}
