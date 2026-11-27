package defpackage;

import android.content.DialogInterface;
public final class ba2 implements Runnable {
    public final byte a;
    public final na2 b;
    public final id[] c;
    public final int d;

    public ba2(na2 na2Var, id[] idVarArr, int i, byte b) {
        this.a = b;
        this.b = na2Var;
        this.c = idVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        id[] idVarArr = this.c;
        final na2 na2Var = this.b;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            na2 na2Var2 = na2Var;
                            switch (b2) {
                                case 0:
                                    na2Var2.b0(i2);
                                    return;
                                default:
                                    na2Var2.Z(i2);
                                    return;
                            }
                        }
                    });
                    na2Var.showDialog(idVarArr[0]);
                    return;
                }
                return;
            default:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            na2 na2Var2 = na2Var;
                            switch (b2) {
                                case 0:
                                    na2Var2.b0(i2);
                                    return;
                                default:
                                    na2Var2.Z(i2);
                                    return;
                            }
                        }
                    });
                    na2Var.showDialog(idVarArr[0]);
                    return;
                }
                return;
        }
    }
}
