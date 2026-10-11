package bi;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class w extends p61 {
    public static final int f3936a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        x xVar = (x) view;
        TranslateController.Language language = (TranslateController.Language) q61Var.G;
        xVar.f3937a.setText(language.displayName);
        xVar.f3938b.setText(language.ownDisplayName);
        if (xVar.f3939c != z10) {
            xVar.invalidate();
        }
        xVar.f3939c = z10;
        xVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, d6 d6Var) {
        return new x(context);
    }
}
