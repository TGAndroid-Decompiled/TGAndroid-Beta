package ci;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public final class s3 extends View {
    public int f5901a;
    public final w3 f5902b;

    public s3(w3 w3Var, Context context) {
        super(context);
        this.f5902b = w3Var;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        w3 w3Var = this.f5902b;
        f3 f3Var = w3Var.f6215e;
        ArrayList arrayList = w3Var.f6211b0;
        int size = View.MeasureSpec.getSize(i10);
        int i14 = this.f5901a;
        if (i14 == -1) {
            if (w3Var.f6216e0 == w3.f6207j0) {
                i12 = arrayList.size();
            } else {
                ArrayList arrayList2 = w3Var.f6218f0;
                if (arrayList2 != null) {
                    int size2 = arrayList2.size() + (w3Var.f6213c0 ? 1 : 0);
                    if (w3Var.f6214d0) {
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
