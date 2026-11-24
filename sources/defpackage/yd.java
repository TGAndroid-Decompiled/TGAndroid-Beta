package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class yd implements View.OnClickListener {
    public final byte a;
    public final ag2[] b;

    public yd(ag2[] ag2VarArr, byte b) {
        this.a = b;
        this.b = ag2VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        ag2[] ag2VarArr = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) view.getTag();
                ag2VarArr[num.intValue()].c(!ag2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                Integer num2 = (Integer) view.getTag();
                ag2VarArr[num2.intValue()].c(!ag2VarArr[num2.intValue()].b(), true);
                return;
            case 2:
                Integer num3 = (Integer) view.getTag();
                ag2VarArr[num3.intValue()].c(!ag2VarArr[num3.intValue()].b(), true);
                return;
            case 3:
                ag2 ag2Var = ag2VarArr[0];
                ag2Var.c(!ag2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.Z6;
                ag2 ag2Var2 = ag2VarArr[0];
                ag2Var2.c(!ag2Var2.b(), true);
                return;
        }
    }
}
