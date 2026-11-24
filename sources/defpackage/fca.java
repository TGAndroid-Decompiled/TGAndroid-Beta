package defpackage;

import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
public final class fca implements Runnable {
    public final byte a;
    public final hd[] b;
    public final int c;
    public final int d;

    public fca(hd[] hdVarArr, int i, int i2, byte b) {
        this.a = b;
        this.b = hdVarArr;
        this.c = i;
        this.d = i2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        final int i = this.d;
        final int i2 = this.c;
        hd[] hdVarArr = this.b;
        switch (b) {
            case 0:
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    hdVarArr[0].show();
                    return;
                }
                return;
            default:
                hd hdVar2 = hdVarArr[0];
                if (hdVar2 != null) {
                    hdVar2.setOnCancelListener(new DialogInterface.OnCancelListener() {
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
                    hdVarArr[0].show();
                    return;
                }
                return;
        }
    }
}
