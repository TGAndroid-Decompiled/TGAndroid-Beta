package defpackage;

import android.app.Activity;
import android.widget.ImageView;
public final class ua9 extends n21 {
    public final va9 c;

    public ua9(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        va9 va9Var = new va9();
        this.c = va9Var;
        imageView.setImageDrawable(va9Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        va9 va9Var = this.c;
        va9Var.getClass();
        va9Var.g = System.currentTimeMillis();
        va9Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        va9 va9Var = this.c;
        va9Var.g = -1L;
        va9Var.invalidateSelf();
    }
}
