package defpackage;

import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.ProfileActivity;
public final class je implements View.OnClickListener {
    public final byte a;
    public final sg2[] b;

    public je(sg2[] sg2VarArr, byte b) {
        this.a = b;
        this.b = sg2VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        sg2[] sg2VarArr = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) view.getTag();
                sg2VarArr[num.intValue()].c(!sg2VarArr[num.intValue()].b(), true);
                return;
            case 1:
                Integer num2 = (Integer) view.getTag();
                sg2VarArr[num2.intValue()].c(!sg2VarArr[num2.intValue()].b(), true);
                return;
            case 2:
                Integer num3 = (Integer) view.getTag();
                sg2VarArr[num3.intValue()].c(!sg2VarArr[num3.intValue()].b(), true);
                return;
            case 3:
                sg2 sg2Var = sg2VarArr[0];
                sg2Var.c(!sg2Var.b(), true);
                return;
            default:
                RectF rectF = ProfileActivity.Z6;
                sg2 sg2Var2 = sg2VarArr[0];
                sg2Var2.c(!sg2Var2.b(), true);
                return;
        }
    }
}
