package defpackage;

import android.content.DialogInterface;
public final class lo1 implements Runnable {
    public final byte a;
    public final yv1 b;
    public final he[] c;
    public final int d;

    public lo1(yv1 yv1Var, he[] heVarArr, int i, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = heVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        he[] heVarArr = this.c;
        final yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b2) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    return;
                }
                return;
            case 1:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b2) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    return;
                }
                return;
            default:
                he heVar3 = heVarArr[0];
                if (heVar3 != null) {
                    heVar3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            yv1 yv1Var2 = yv1Var;
                            switch (b2) {
                                case 0:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    yv1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    yv1Var.showDialog(heVarArr[0]);
                    return;
                }
                return;
        }
    }
}
