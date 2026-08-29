package mh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class s extends v41 {
    public static final int f17052a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) w41Var.G;
        tVar.f17053a.setText(language.displayName);
        tVar.f17054b.setText(language.ownDisplayName);
        if (tVar.f17055c != z10) {
            tVar.invalidate();
        }
        tVar.f17055c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, c6 c6Var) {
        return new t(context);
    }
}
