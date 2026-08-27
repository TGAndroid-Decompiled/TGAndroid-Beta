package gh;

import android.content.Context;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.wq0;

public final class n3 extends k51 {

    public final wq0 f7463b3;

    public n3(Context context, int i10, ch.c cVar, l3 l3Var, l3 l3Var2, org.telegram.ui.ActionBar.c6 c6Var, wq0 wq0Var) {
        super(context, i10, 0, false, cVar, l3Var, l3Var2, c6Var, 3, 1);
        this.f7463b3 = wq0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f7463b3.o();
    }
}
