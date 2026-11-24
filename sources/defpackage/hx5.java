package defpackage;

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;
public final class hx5 extends gb3 {
    public final LanguageSelectActivity F;

    public hx5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s49 s49Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        o39 o39Var = languageSelectActivity.b;
        int i = o39Var.D1;
        if (i != -1 && (view = o39Var.E1) != null) {
            o39Var.l1(i, view);
            o39Var.invalidate();
        }
    }
}
