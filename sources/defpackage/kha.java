package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class kha extends kea {
    public final e U2;

    public kha(Context context, String str, String str2, vnb vnbVar, e eVar) {
        super(context, null, str, false, str2, false, vnbVar);
        this.U2 = eVar;
    }

    @Override
    public final void M0(zh6 zh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        hl.d3(new a39(this.U2, zh6Var, i, (byte) 8), 100L);
    }
}
