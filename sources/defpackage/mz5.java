package defpackage;

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;
public final class mz5 extends zb3 {
    public final LanguageSelectActivity F;

    public mz5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(f89 f89Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        d79 d79Var = languageSelectActivity.b;
        int i = d79Var.D1;
        if (i != -1 && (view = d79Var.E1) != null) {
            d79Var.m1(i, view);
            d79Var.invalidate();
        }
    }
}
