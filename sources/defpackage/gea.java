package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class gea implements Runnable {
    public final byte a;
    public final he[] b;
    public final int c;
    public final int d;

    public gea(he[] heVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = heVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        he[] heVarArr = this.b;
        switch (b) {
            case 0:
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    heVarArr[0].show();
                    return;
                }
                return;
            default:
                he heVar2 = heVarArr[0];
                if (heVar2 != null) {
                    heVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    heVarArr[0].show();
                    return;
                }
                return;
        }
    }
}
