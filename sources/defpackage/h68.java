package defpackage;

import android.animation.AnimatorSet;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.ui.PhotoViewer;
public final class h68 implements Runnable {
    public final PhotoViewer a;
    public final View b;
    public final c88 c;
    public final float d;
    public final float e;
    public final AnimatorSet f;

    public h68(PhotoViewer photoViewer, View view, c88 c88Var, float f, float f2, AnimatorSet animatorSet) {
        this.a = photoViewer;
        this.b = view;
        this.c = c88Var;
        this.d = f;
        this.e = f2;
        this.f = animatorSet;
    }

    @Override
    public final void run() {
        Drawable[] drawableArr = PhotoViewer.d9;
        View view = this.b;
        c88 c88Var = this.c;
        view.setOutlineProvider(c88Var);
        view.setClipToOutline(true);
        PhotoViewer photoViewer = this.a;
        photoViewer.x3.setOutlineProvider(c88Var);
        photoViewer.x3.setClipToOutline(true);
        j98 j98Var = photoViewer.F2;
        if (j98Var != null) {
            j98Var.setOutlineProvider(c88Var);
            photoViewer.F2.setClipToOutline(true);
        }
        photoViewer.x3.setTranslationY(this.d);
        float f = this.e;
        view.setTranslationY(f);
        j98 j98Var2 = photoViewer.F2;
        if (j98Var2 != null) {
            j98Var2.setTranslationY(f);
        }
        photoViewer.X5 = 0.0f;
        photoViewer.f0.invalidate();
        this.f.start();
    }
}
