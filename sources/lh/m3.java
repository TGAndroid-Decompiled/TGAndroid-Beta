package lh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;

public final class m3 extends View {

    public int f16378a;

    public final p3 f16379b;

    public m3(p3 p3Var, Context context) {
        super(context);
        this.f16379b = p3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size;
        p3 p3Var = this.f16379b;
        z2 z2Var = p3Var.f16514e;
        ArrayList arrayList = p3Var.U;
        int size2 = View.MeasureSpec.getSize(i10);
        int i12 = this.f16378a;
        if (i12 != -1) {
            setMeasuredDimension(size2, i12);
            return;
        }
        if (p3Var.f16508a0 == p3.f16506f0) {
            size = arrayList.size();
        } else {
            ArrayList arrayList2 = p3Var.f16510b0;
            if (arrayList2 != null) {
                size = (p3Var.W ? arrayList.size() : 0) + arrayList2.size() + (p3Var.V ? 1 : 0);
            } else {
                size = 0;
            }
        }
        setMeasuredDimension(size2, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size2 / z2Var.J)) * p3Var.K)) * ((int) Math.ceil(size / z2Var.J)))));
    }
}
