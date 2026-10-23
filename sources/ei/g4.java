package ei;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.j71;
public final class g4 extends j71 {
    public final ma f9075g3;

    public g4(ma maVar, Context context, int i10, f4 f4Var, e1.c cVar, ci.b bVar) {
        super(context, i10, 0, false, f4Var, cVar, null, bVar, -1, 0);
        this.f9075g3 = maVar;
    }

    @Override
    public final void N1() {
        AndroidUtilities.forEachViews((RecyclerView) this.f9075g3.f9376b, (Utilities.Callback<View>) new ai.r0(this, 17));
    }

    @Override
    public final Integer X0(int i10) {
        return 0;
    }
}
