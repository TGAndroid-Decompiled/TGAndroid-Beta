package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class j88 implements Runnable {
    public final PhotoViewer a;
    public final View b;
    public final fa8 c;
    public final float d;
    public final float e;
    public final AnimatorSet f;

    public j88(PhotoViewer photoViewer, View view, fa8 fa8Var, float f, float f2, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = fa8Var;
        this.d = f;
        this.e = f2;
        this.f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.d9;
        View view = this.b;
        fa8 fa8Var = this.c;
        view.setOutlineProvider(fa8Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(fa8Var);
        photoViewer.x3.setClipToOutline(true);
        kb8 kb8Var = photoViewer.F2;
        if (kb8Var != null) {
            kb8Var.setOutlineProvider(fa8Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f = this.e;
        view.setTranslationY(f);
        kb8 kb8Var2 = photoViewer.F2;
        if (kb8Var2 != null) {
            kb8Var2.setTranslationY(f);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
