package bi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class k4 extends View {
    public int f2985a;
    public final p4 f2986b;

    public k4(p4 p4Var, Context context) {
        super(context);
        this.f2986b = p4Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        p4 p4Var = this.f2986b;
        x3 x3Var = p4Var.e;
        ArrayList arrayList = p4Var.f3371b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f2985a;
        if (i14 == -1) {
            if (p4Var.f3375e0 == p4.f3367j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = p4Var.f3377f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (p4Var.f3373c0 ? 1 : 0);
                    if (p4Var.f3374d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / x3Var.J)) * p4Var.O)) * ((int) Math.ceil(i12 / x3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
