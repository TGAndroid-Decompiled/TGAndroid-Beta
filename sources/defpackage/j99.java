package defpackage;

import android.app.Activity;
import android.widget.ImageView;
public final class j99 extends m31 {
    public final k99 c;

    public j99(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        k99 k99Var = new k99();
        this.c = k99Var;
        imageView.setImageDrawable(k99Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        k99 k99Var = this.c;
        k99Var.getClass();
        k99Var.g = System.currentTimeMillis();
        k99Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        k99 k99Var = this.c;
        k99Var.g = -1L;
        k99Var.invalidateSelf();
    }
}
