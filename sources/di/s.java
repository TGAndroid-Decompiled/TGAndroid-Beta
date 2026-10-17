package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
public final class s extends e61 {
    public static final int f8066a = 0;

    static {
        e61.setup(new e61());
    }

    @Override
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) f61Var.G;
        tVar.f8067a.setText(language.displayName);
        tVar.f8068b.setText(language.ownDisplayName);
        if (tVar.f8069c != z10) {
            tVar.invalidate();
        }
        tVar.f8069c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new t(context);
    }
}
