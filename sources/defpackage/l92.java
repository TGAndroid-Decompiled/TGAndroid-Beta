package defpackage;

import android.content.DialogInterface;
public final class l92 implements Runnable {
    public final byte a;
    public final x92 b;
    public final hd[] c;
    public final int d;

    public l92(x92 x92Var, hd[] hdVarArr, int i, byte b) {
        this.a = b;
        this.b = x92Var;
        this.c = hdVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        hd[] hdVarArr = this.c;
        final x92 x92Var = this.b;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            x92 x92Var2 = x92Var;
                            switch (b2) {
                                case 0:
                                    x92Var2.b0(i2);
                                    return;
                                default:
                                    x92Var2.Z(i2);
                                    return;
                            }
                        }
                    });
                    x92Var.showDialog(hdVarArr[0]);
                    return;
                }
                return;
            default:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            x92 x92Var2 = x92Var;
                            switch (b2) {
                                case 0:
                                    x92Var2.b0(i2);
                                    return;
                                default:
                                    x92Var2.Z(i2);
                                    return;
                            }
                        }
                    });
                    x92Var.showDialog(hdVarArr[0]);
                    return;
                }
                return;
        }
    }
}
