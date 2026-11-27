package defpackage;

import android.app.Activity;
import org.telegram.tgnet.TLRPC;
public final class j93 extends kea {
    public final k93 U2;

    public j93(k93 k93Var, Activity activity, String str) {
        super(activity, null, str, false, null, false, null);
        this.U2 = k93Var;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        if (!z) {
            return;
        }
        hl.d3(new bv2(this, zh6Var, i), 250L);
    }
}
