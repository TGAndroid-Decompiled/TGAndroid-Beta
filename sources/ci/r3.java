package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class r3 extends View {
    public int f5892a;
    public final v3 f5893b;

    public r3(v3 v3Var, Context context) {
        super(context);
        this.f5893b = v3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        v3 v3Var = this.f5893b;
        e3 e3Var = v3Var.f6135e;
        ArrayList arrayList = v3Var.f6131b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f5892a;
        if (i14 == -1) {
            if (v3Var.f6136e0 == v3.f6127j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = v3Var.f6138f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (v3Var.f6133c0 ? 1 : 0);
                    if (v3Var.f6134d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / e3Var.J)) * v3Var.O)) * ((int) Math.ceil(i12 / e3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
