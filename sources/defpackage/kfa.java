package defpackage;

import android.content.Context;
import org.telegram.ui.Components.ScrollSlidingTextTabStrip;
public final class kfa extends ScrollSlidingTextTabStrip {
    public final nha q0;

    public kfa(nha nhaVar, Context context, ylb ylbVar) {
        super(context, ylbVar);
        this.q0 = nhaVar;
    }

    @Override
    public final int e(int i) {
        return this.q0.c1(i);
    }
}
