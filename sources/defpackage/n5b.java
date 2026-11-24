package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class n5b extends v5b {
    public final t5b N;

    public n5b(t5b t5bVar, Context context, wjb wjbVar, l5b l5bVar) {
        super(context, wjbVar, l5bVar);
        this.N = t5bVar;
    }

    @Override
    public final void setContainerHeight(float f) {
        int paddingTop;
        super.setContainerHeight(f);
        t5b t5bVar = this.N;
        l35 l35Var = t5bVar.E;
        float y = getY();
        FrameLayout frameLayout = t5bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        l35Var.setTranslationY((Math.min(gl.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        int paddingTop;
        super.setTranslationY(f);
        t5b t5bVar = this.N;
        l35 l35Var = t5bVar.E;
        float y = getY();
        FrameLayout frameLayout = t5bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        l35Var.setTranslationY((Math.min(gl.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
