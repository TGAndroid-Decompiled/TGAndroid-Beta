package defpackage;

import org.telegram.messenger.MediaController;
public final class dl6 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final hd c;

    public dl6(hd hdVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = hdVar;
        this.b = zArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        hd hdVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    hdVar.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    hdVar.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (hdVar.isShowing()) {
                        hdVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (hdVar.isShowing()) {
                        hdVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
        }
    }

    public dl6(boolean[] zArr, hd hdVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = hdVar;
    }
}
