package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tl0;
public final class l4 extends tl0 implements a7 {
    public final e5 U2;
    public final e5 V2;

    public l4(e5 e5Var, Context context, b bVar) {
        super(context, bVar);
        this.V2 = e5Var;
        this.U2 = e5Var;
    }

    @Override
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.U2.f17028e);
        iArr[1] = getMeasuredHeight();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.V2.f17030n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
