package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class ye implements View.OnClickListener {
    public final byte a;
    public final oh2[] b;

    public ye(oh2[] oh2VarArr, byte b) {
        this.a = b;
        this.b = oh2VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        oh2[] oh2VarArr = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) view.getTag();
                oh2VarArr[num.intValue()].c(!oh2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                Integer num2 = (Integer) view.getTag();
                oh2VarArr[num2.intValue()].c(!oh2VarArr[num2.intValue()].b(), true);
                return;
            case 2:
                Integer num3 = (Integer) view.getTag();
                oh2VarArr[num3.intValue()].c(!oh2VarArr[num3.intValue()].b(), true);
                return;
            case 3:
                oh2 oh2Var = oh2VarArr[0];
                oh2Var.c(!oh2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.e7;
                oh2 oh2Var2 = oh2VarArr[0];
                oh2Var2.c(!oh2Var2.b(), true);
                return;
        }
    }
}
