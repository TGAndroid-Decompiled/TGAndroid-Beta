package defpackage;

import android.content.DialogInterface;
public final class xm1 implements Runnable {
    public final byte a;
    public final mu1 b;
    public final hd[] c;
    public final int d;

    public xm1(mu1 mu1Var, hd[] hdVarArr, int i, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = hdVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        hd[] hdVarArr = this.c;
        final mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b2) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    return;
                }
                return;
            case 1:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b2) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    return;
                }
                return;
            default:
                hd hdVar3 = hdVarArr[0];
                if (hdVar3 != null) {
                    hdVar3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            mu1 mu1Var2 = mu1Var;
                            switch (b2) {
                                case 0:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    mu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    mu1Var.showDialog(hdVarArr[0]);
                    return;
                }
                return;
        }
    }
}
