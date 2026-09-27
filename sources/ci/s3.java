package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends View {
    public int f5485a;
    public final w3 f5486b;

    public s3(w3 w3Var, Context context) {
        super(context);
        this.f5486b = w3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        w3 w3Var = this.f5486b;
        f3 f3Var = w3Var.e;
        ArrayList arrayList = w3Var.f5766b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f5485a;
        if (i14 == -1) {
            if (w3Var.f5770e0 == w3.f5762j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = w3Var.f5772f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (w3Var.f5768c0 ? 1 : 0);
                    if (w3Var.f5769d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / f3Var.J)) * w3Var.O)) * ((int) Math.ceil(i12 / f3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
