package ei;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class n3 extends View {
    public int f9510a;
    public final q3 f9511b;

    public n3(q3 q3Var, Context context) {
        super(context);
        this.f9511b = q3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        q3 q3Var = this.f9511b;
        a3 a3Var = q3Var.e;
        ArrayList arrayList = q3Var.f9626b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f9510a;
        if (i14 == -1) {
            if (q3Var.f9630e0 == q3.f9622j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = q3Var.f9632f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (q3Var.f9628c0 ? 1 : 0);
                    if (q3Var.f9629d0) {
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
