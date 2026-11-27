package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.e;
public final class jf4 extends hf4 {
    public final kf4 F;

    public jf4(kf4 kf4Var, Context context, e eVar, int i, int i2) {
        super(context, eVar, i, i2);
        this.F = kf4Var;
    }

    @Override
    public final void b(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        this.F.e.q0(tL_exportedChatlistInvite);
    }
}
