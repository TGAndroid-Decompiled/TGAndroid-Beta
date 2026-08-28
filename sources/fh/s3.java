package fh;

import android.content.Context;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.vq0;
public final class s3 extends i51 {
    public final vq0 f6751b3;

    public s3(Context context, int i9, bh.c cVar, q3 q3Var, q3 q3Var2, org.telegram.ui.ActionBar.b6 b6Var, vq0 vq0Var) {
        super(context, i9, 0, false, cVar, q3Var, q3Var2, b6Var, 3, 1);
        this.f6751b3 = vq0Var;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        this.f6751b3.o();
    }
}
