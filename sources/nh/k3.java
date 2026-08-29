package nh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class k3 extends View {
    public int f18000a;
    public final n3 f18001b;

    public k3(n3 n3Var, Context context) {
        super(context);
        this.f18001b = n3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        n3 n3Var = this.f18001b;
        x2 x2Var = n3Var.f18174e;
        ArrayList arrayList = n3Var.U;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f18000a;
        if (i14 == -1) {
            if (n3Var.f18168a0 == n3.f18166f0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = n3Var.f18170b0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (n3Var.V ? 1 : 0);
                    if (n3Var.W) {
                        i13 = arrayList.size();
                    } else {
                        i13 = 0;
                    }
                    i12 = i13 + size2;
                } else {
                    i12 = 0;
                }
            }
            setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / x2Var.J)) * n3Var.K)) * ((int) Math.ceil(i12 / x2Var.J)))));
            return;
        }
        setMeasuredDimension(size, i14);
    }
}
