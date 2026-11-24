package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class kda extends ScrollSlidingTextTabStrip {
    public final nfa q0;

    public kda(nfa nfaVar, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.q0 = nfaVar;
    }

    @Override
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
