package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class xfa implements Runnable {
    public final byte a;
    public final id[] b;
    public final int c;
    public final int d;

    public xfa(id[] idVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = idVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        id[] idVarArr = this.b;
        switch (b) {
            case 0:
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    return;
                            }
                        }
                    });
                    idVarArr[0].show();
                    return;
                }
                return;
            default:
                id idVar2 = idVarArr[0];
                if (idVar2 != null) {
                    idVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        @Override
                        public final void onCancel(DialogInterface dialogInterface) {
                            switch (r3) {
                                case 0:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    return;
                                default:
                                    ConnectionsManager.getInstance(i2).cancelRequest(i, true);
                                    return;
                            }
                        }
                    });
                    idVarArr[0].show();
                    return;
                }
                return;
        }
    }
}
