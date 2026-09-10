package ai;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class d0 extends u51 {
    public static final int f430a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        e0 e0Var = (e0) view;
        TranslateController.Language language = (TranslateController.Language) v51Var.G;
        e0Var.f434a.setText(language.displayName);
        e0Var.f435b.setText(language.ownDisplayName);
        if (e0Var.f436c != z10) {
            e0Var.invalidate();
        }
        e0Var.f436c = z10;
        e0Var.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new e0(context);
    }
}
