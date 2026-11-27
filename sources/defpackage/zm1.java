package defpackage;

import android.content.DialogInterface;
public final class zm1 implements Runnable {
    public final byte a;
    public final zu1 b;
    public final id[] c;
    public final int d;

    public zm1(zu1 zu1Var, id[] idVarArr, int i, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = idVarArr;
        this.d = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        id[] idVarArr = this.c;
        final zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b2) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    return;
                }
                return;
            case 1:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b2) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    return;
                }
                return;
            default:
                id idVar3 = idVarArr[0];
                if (idVar3 != null) {
                    idVar3.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            byte b2 = r3;
                            int i2 = i;
                            zu1 zu1Var2 = zu1Var;
                            switch (b2) {
                                case 0:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                case 1:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                                default:
                                    zu1Var2.getConnectionsManager().cancelRequest(i2, true);
                                    return;
                            }
                        }
                    });
                    zu1Var.showDialog(idVarArr[0]);
                    return;
                }
                return;
        }
    }
}
