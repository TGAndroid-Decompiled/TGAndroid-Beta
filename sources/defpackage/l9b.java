package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class l9b extends t9b {
    public final r9b N;

    public l9b(r9b r9bVar, Context context, vnb vnbVar, i9b i9bVar) {
        super(context, vnbVar, i9bVar);
        this.N = r9bVar;
    }

    @Override
    public final void setContainerHeight(float f) {
        int paddingTop;
        super.setContainerHeight(f);
        r9b r9bVar = this.N;
        p55 p55Var = r9bVar.E;
        float y = getY();
        FrameLayout frameLayout = r9bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        p55Var.setTranslationY((Math.min(hl.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }

    @Override
    public final void setTranslationY(float f) {
        int paddingTop;
        super.setTranslationY(f);
        r9b r9bVar = this.N;
        p55 p55Var = r9bVar.E;
        float y = getY();
        FrameLayout frameLayout = r9bVar.e;
        if (frameLayout == null) {
            paddingTop = 0;
        } else {
            paddingTop = frameLayout.getPaddingTop();
        }
        p55Var.setTranslationY((Math.min(hl.L(150.0f), this.K) + (y - paddingTop)) - 1.0f);
        if (frameLayout != null) {
            frameLayout.invalidate();
        }
    }
}
