package defpackage;

import android.view.View;
public final class f5 implements View.OnClickListener {
    public final byte a;
    public final fx0[] b;

    public f5(fx0[] fx0VarArr, byte b) {
        this.a = b;
        this.b = fx0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        fx0[] fx0VarArr = this.b;
        switch (b) {
            case 0:
                fx0VarArr[0].dismiss();
                return;
            case 1:
                fx0VarArr[0].dismiss();
                return;
            case 2:
                fx0VarArr[0].dismiss();
                return;
            case 3:
                fx0 fx0Var = fx0VarArr[0];
                if (fx0Var != null) {
                    fx0Var.dismiss();
                    return;
                }
                return;
            case 4:
                fx0VarArr[0].dismiss();
                return;
            case 5:
                fx0 fx0Var2 = fx0VarArr[0];
                if (fx0Var2 != null) {
                    fx0Var2.dismiss();
                    return;
                }
                return;
            case 6:
                fx0VarArr[0].dismiss();
                return;
            case 7:
                fx0VarArr[0].dismiss();
                return;
            case 8:
                fx0VarArr[0].dismiss();
                return;
            default:
                fx0VarArr[0].dismiss();
                return;
        }
    }
}
