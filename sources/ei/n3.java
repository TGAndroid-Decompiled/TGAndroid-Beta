package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends View {
    public int f9519a;
    public final q3 f9520b;

    public n3(q3 q3Var, Context context) {
        super(context);
        this.f9520b = q3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        q3 q3Var = this.f9520b;
        a3 a3Var = q3Var.e;
        ArrayList arrayList = q3Var.f9640b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f9519a;
        if (i14 == -1) {
            if (q3Var.f9644e0 == q3.f9636j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = q3Var.f9646f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (q3Var.f9642c0 ? 1 : 0);
                    if (q3Var.f9643d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / a3Var.J)) * q3Var.O)) * ((int) Math.ceil(i12 / a3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
