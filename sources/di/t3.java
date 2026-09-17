package di;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class t3 extends View {
    public int f8205a;
    public final x3 f8206b;

    public t3(x3 x3Var, Context context) {
        super(context);
        this.f8206b = x3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        x3 x3Var = this.f8206b;
        g3 g3Var = x3Var.f8397e;
        ArrayList arrayList = x3Var.f8393b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f8205a;
        if (i14 == -1) {
            if (x3Var.f8398e0 == x3.f8389j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = x3Var.f8400f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (x3Var.f8395c0 ? 1 : 0);
                    if (x3Var.f8396d0) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / g3Var.J)) * x3Var.O)) * ((int) Math.ceil(i12 / g3Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
