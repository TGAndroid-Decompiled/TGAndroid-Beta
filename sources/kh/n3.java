package kh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends View {
    public int f15743a;
    public final q3 f15744b;

    public n3(q3 q3Var, Context context) {
        super(context);
        this.f15744b = q3Var;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        q3 q3Var = this.f15744b;
        a3 a3Var = q3Var.f15865e;
        ArrayList arrayList = q3Var.U;
        int size = View.MeasureSpec.getSize(i9);
        int i13 = this.f15743a;
        if (i13 == -1) {
            if (q3Var.f15859a0 == q3.f15857f0) {
                i11 = arrayList.size();
            } else {
                ArrayList arrayList2 = q3Var.f15861b0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (q3Var.V ? 1 : 0);
                    if (q3Var.W) {
                        i12 = arrayList.size();
                    } else {
                        i12 = 0;
                    }
                    i11 = i12 + size2;
                } else {
                    i11 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / a3Var.J)) * q3Var.K)) * ((int) Math.ceil(i11 / a3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i13);
    }
}
