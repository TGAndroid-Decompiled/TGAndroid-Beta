package ei;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class s extends s61 {
    public static final int f10011a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) t61Var.G;
        tVar.f10012a.setText(language.displayName);
        tVar.f10013b.setText(language.ownDisplayName);
        if (tVar.f10014c != z10) {
            tVar.invalidate();
        }
        tVar.f10014c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, u6 u6Var) {
        return new t(context);
    }
}
