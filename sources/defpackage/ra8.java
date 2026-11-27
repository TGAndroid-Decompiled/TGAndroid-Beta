package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class ra8 implements Runnable {
    public final PhotoViewer a;
    public final View b;
    public final ub8 c;
    public final float d;
    public final float e;
    public final AnimatorSet f;

    public ra8(PhotoViewer photoViewer, View view, ub8 ub8Var, float f, float f2, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = ub8Var;
        this.d = f;
        this.e = f2;
        this.f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.d9;
        View view = this.b;
        ub8 ub8Var = this.c;
        view.setOutlineProvider(ub8Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(ub8Var);
        photoViewer.x3.setClipToOutline(true);
        zc8 zc8Var = photoViewer.F2;
        if (zc8Var != null) {
            zc8Var.setOutlineProvider(ub8Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f = this.e;
        view.setTranslationY(f);
        zc8 zc8Var2 = photoViewer.F2;
        if (zc8Var2 != null) {
            zc8Var2.setTranslationY(f);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
