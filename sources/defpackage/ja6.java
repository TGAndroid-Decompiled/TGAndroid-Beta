package defpackage;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ja6 extends nfa {
    public final qa6 x2;

    public ja6(qa6 qa6Var, Context context, ffa ffaVar, qa6 qa6Var2, ia6 ia6Var, wjb wjbVar) {
        super(context, 0L, ffaVar, 0, null, null, null, 8, 0, qa6Var2, ia6Var, 0, wjbVar, null);
        this.x2 = qa6Var;
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
