package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class bha extends ScrollSlidingTextTabStrip {
    public final eja q0;

    public bha(eja ejaVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.q0 = ejaVar;
    }

    @Override
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
