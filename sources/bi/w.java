package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xl0;
public final class w extends v51 {
    public static final int f3595a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) w51Var.G;
        xVar.f3596a.setText(language.displayName);
        xVar.f3597b.setText(language.ownDisplayName);
        if (xVar.f3598c != z10) {
            xVar.invalidate();
        }
        xVar.f3598c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, xl0 xl0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
