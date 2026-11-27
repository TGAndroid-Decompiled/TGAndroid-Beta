package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class dq8 extends kea {
    public final eq8 U2;

    public dq8(eq8 eq8Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = eq8Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        hl.d3(new hp8(this, zh6Var, i, (byte) 8), 250L);
    }
}
