package fi;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.s71;
public final class f4 extends s71 {
    public final ia f10859n3;

    public f4(ia iaVar, Context context, int i10, d4 d4Var, e1.c cVar, di.b bVar) {
        super(context, i10, 0, false, d4Var, cVar, null, bVar, -1, 0);
        this.f10859n3 = iaVar;
    }

    @Override
    public final void N1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f10859n3.f11106b, (Utilities.Callback<View>) new ai.i(this, 21));
    }

    @Override
    public final Integer W0(int i10) {
        return 0;
    }
}
