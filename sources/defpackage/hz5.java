package defpackage;

import android.view.View;
import org.telegram.ui.LanguageSelectActivity;
public final class hz5 extends sc3 {
    public final LanguageSelectActivity F;

    public hz5(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(u69 u69Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.b.invalidate();
        r59 r59Var = languageSelectActivity.b;
        int i = r59Var.D1;
        if (i != -1 && (view = r59Var.E1) != null) {
            r59Var.l1(i, view);
            r59Var.invalidate();
        }
    }
}
