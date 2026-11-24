package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
public final class mf4 extends kf4 {
    public final nf4 F;

    public mf4(nf4 nf4Var, Context context, d dVar, int i, int i2) {
        super(context, dVar, i, i2);
        this.F = nf4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.r0(tL_exportedChatlistInvite);
    }
}
