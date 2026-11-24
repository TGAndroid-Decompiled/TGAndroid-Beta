package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.FragmentContextView;
public final class gda extends FragmentContextView {
    public final nfa X0;

    public gda(nfa nfaVar, Context context, d dVar, nfa nfaVar2, wjb wjbVar) {
        super(context, dVar, nfaVar2, false, wjbVar);
        this.X0 = nfaVar;
    }

    @Override
    public final void setVisibility(int i) {
        boolean z;
        nfa nfaVar = this.X0;
        fj3 fj3Var = nfaVar.S0;
        FrameLayout frameLayout = nfaVar.T0;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        fj3Var.j(frameLayout, z, true);
    }
}
