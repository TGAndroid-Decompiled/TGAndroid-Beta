package defpackage;

import android.content.DialogInterface;
public final class xa2 implements Runnable {
    public final byte a;
    public final ib2 b;
    public final he[] c;
    public final int d;

    public xa2(ib2 ib2Var, he[] heVarArr, int i, byte b) {
        this.a = b;
        this.b = ib2Var;
        this.c = heVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        he[] heVarArr = this.c;
        final ib2 ib2Var = this.b;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            ib2 ib2Var2 = ib2Var;
                            switch (b2) {
                                case 0:
                                    ib2Var2.c0(i2);
                                    return;
                                default:
                                    ib2Var2.a0(i2);
                                    return;
                            }
                        }
                    });
                    ib2Var.showDialog(heVarArr[0]);
                    return;
                }
                return;
            default:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            ib2 ib2Var2 = ib2Var;
                            switch (b2) {
                                case 0:
                                    ib2Var2.c0(i2);
                                    return;
                                default:
                                    ib2Var2.a0(i2);
                                    return;
                            }
                        }
                    });
                    ib2Var.showDialog(heVarArr[0]);
                    return;
                }
                return;
        }
    }
}
