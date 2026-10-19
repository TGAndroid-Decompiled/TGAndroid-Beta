package di;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
public final class s extends f61 {
    public static final int f8064a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) g61Var.G;
        tVar.f8065a.setText(language.displayName);
        tVar.f8066b.setText(language.ownDisplayName);
        if (tVar.f8067c != z10) {
            tVar.invalidate();
        }
        tVar.f8067c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new t(context);
    }
}
