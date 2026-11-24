package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.d;
public final class ld4 extends jd4 {
    public final md4 F;

    public ld4(md4 md4Var, Context context, d dVar, int i, int i2) {
        super(context, dVar, i, i2);
        this.F = md4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.q0(tL_exportedChatlistInvite);
    }
}
