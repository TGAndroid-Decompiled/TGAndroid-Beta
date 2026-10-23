package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class s extends l61 {
    public static final int f8071a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) m61Var.G;
        tVar.f8072a.setText(language.displayName);
        tVar.f8073b.setText(language.ownDisplayName);
        if (tVar.f8074c != z10) {
            tVar.invalidate();
        }
        tVar.f8074c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, g6 g6Var) {
        return new t(context);
    }
}
