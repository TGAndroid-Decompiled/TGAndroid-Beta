package defpackage;

import android.view.View;
public final class f5 implements View.OnClickListener {
    public final byte a;
    public final my0[] b;

    public f5(my0[] my0VarArr, byte b) {
        this.a = b;
        this.b = my0VarArr;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                my0VarArr[0].dismiss();
                return;
            case 1:
                my0VarArr[0].dismiss();
                return;
            case 2:
                my0VarArr[0].dismiss();
                return;
            case 3:
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    return;
                }
                return;
            case 4:
                my0VarArr[0].dismiss();
                return;
            case 5:
                my0 my0Var2 = my0VarArr[0];
                if (my0Var2 != null) {
                    my0Var2.dismiss();
                    return;
                }
                return;
            case 6:
                my0VarArr[0].dismiss();
                return;
            case 7:
                my0VarArr[0].dismiss();
                return;
            case 8:
                my0VarArr[0].dismiss();
                return;
            default:
                my0VarArr[0].dismiss();
                return;
        }
    }
}
