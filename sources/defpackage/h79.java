package defpackage;

import android.app.Activity;
import android.widget.ImageView;
public final class h79 extends e21 {
    public final i79 c;

    public h79(Activity activity, String str) {
        super(activity, null);
        this.b.setText(str);
        this.b.setTranslationY(-1.0f);
        ImageView imageView = this.a;
        i79 i79Var = new i79();
        this.c = i79Var;
        imageView.setImageDrawable(i79Var);
    }

    @Override
    public final void onEnterTransitionEnd() {
        super.onEnterTransitionEnd();
        i79 i79Var = this.c;
        i79Var.getClass();
        i79Var.g = System.currentTimeMillis();
        i79Var.invalidateSelf();
    }

    @Override
    public final void onExitTransitionEnd() {
        super.onExitTransitionEnd();
        i79 i79Var = this.c;
        i79Var.g = -1L;
        i79Var.invalidateSelf();
    }
}
