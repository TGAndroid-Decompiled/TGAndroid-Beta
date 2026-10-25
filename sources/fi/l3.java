package fi;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class l3 extends View {
    public int f11165a;
    public final o3 f11166b;

    public l3(o3 o3Var, Context context) {
        super(context);
        this.f11166b = o3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        o3 o3Var = this.f11166b;
        y2 y2Var = o3Var.e;
        ArrayList arrayList = o3Var.f11339b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f11165a;
        if (i14 == -1) {
            if (o3Var.f11343e0 == o3.f11335j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = o3Var.f11345f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (o3Var.f11341c0 ? 1 : 0);
                    if (o3Var.f11342d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / y2Var.J)) * o3Var.O)) * ((int) Math.ceil(i12 / y2Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
