package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class tfa extends tca {
    public final d U2;

    public tfa(Context context, String str, String str2, ylb ylbVar, d dVar) {
        super(context, null, str, false, str2, false, ylbVar);
        this.U2 = dVar;
    }

    @Override
    public final void L0(vh6 vh6Var, int i, TLRPC.TL_forumTopic tL_forumTopic, boolean z) {
        gm.d3(new v99(this.U2, vh6Var, i, (byte) 7), 100L);
    }
}
