package kh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.TranslateController;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class s extends m41 {

    public static final int f15225a = 0;

    static {
        m41.setup(new s());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        t tVar = (t) view;
        TranslateController.Language language = (TranslateController.Language) n41Var.G;
        tVar.f15226a.setText(language.displayName);
        tVar.f15227b.setText(language.ownDisplayName);
        if (tVar.f15228c != z10) {
            tVar.invalidate();
        }
        tVar.f15228c = z10;
        tVar.setWillNotDraw(!z10);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, c6 c6Var) {
        return new t(context);
    }
}
