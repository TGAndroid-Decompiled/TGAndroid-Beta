package defpackage;

import android.view.View;
public final class g5 implements View.OnClickListener {
    public final byte a;
    public final nx0[] b;

    public g5(nx0[] nx0VarArr, byte b) {
        this.a = b;
        this.b = nx0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                nx0VarArr[0].dismiss();
                return;
            case 1:
                nx0VarArr[0].dismiss();
                return;
            case 2:
                nx0VarArr[0].dismiss();
                return;
            case 3:
                nx0 nx0Var = nx0VarArr[0];
                if (nx0Var != null) {
                    nx0Var.dismiss();
                    return;
                }
                return;
            case 4:
                nx0VarArr[0].dismiss();
                return;
            case 5:
                nx0 nx0Var2 = nx0VarArr[0];
                if (nx0Var2 != null) {
                    nx0Var2.dismiss();
                    return;
                }
                return;
            case 6:
                nx0VarArr[0].dismiss();
                return;
            case 7:
                nx0VarArr[0].dismiss();
                return;
            case 8:
                nx0VarArr[0].dismiss();
                return;
            default:
                nx0VarArr[0].dismiss();
                return;
        }
    }
}
