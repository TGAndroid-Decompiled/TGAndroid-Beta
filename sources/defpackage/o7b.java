package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class o7b extends x7b {
    public final v7b N;

    public o7b(v7b v7bVar, Context context, ylb ylbVar, m7b m7bVar) {
        super(context, ylbVar, m7bVar);
        this.N = v7bVar;
    }

    @Override
    public final void setContainerHeight(float f) {
        int paddingTop;
        super.setContainerHeight(f);
        v7b v7bVar = this.N;
        l55 l55Var = v7bVar.E;
        float y = getY();
        FrameLayout frameLayout = v7bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        l55Var.setTranslationY((Math.min(gm.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        int paddingTop;
        super.setTranslationY(f);
        v7b v7bVar = this.N;
        l55 l55Var = v7bVar.E;
        float y = getY();
        FrameLayout frameLayout = v7bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        l55Var.setTranslationY((Math.min(gm.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
