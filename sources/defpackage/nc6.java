package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class nc6 extends eja {
    public final uc6 x2;

    public nc6(uc6 uc6Var, Context context, wia wiaVar, uc6 uc6Var2, mc6 mc6Var, vnb vnbVar) {
        super(context, 0L, wiaVar, 0, null, null, null, 8, 0, uc6Var2, mc6Var, 0, vnbVar, null);
        this.x2 = uc6Var;
    }

    @Override
    public final boolean H() {
        return true;
    }

    @Override
    public final int I0() {
        return 32;
    }

    @Override
    public final int Z0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.x2.T0;
    }
}
