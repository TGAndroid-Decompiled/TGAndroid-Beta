package defpackage;

import org.telegram.messenger.MediaController;
public final class gn6 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final he c;

    public gn6(he heVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = heVar;
        this.b = zArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        he heVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    heVar.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    heVar.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (heVar.isShowing()) {
                        heVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
        }
    }

    public gn6(boolean[] zArr, he heVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = heVar;
    }
}
