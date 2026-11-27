package defpackage;

import org.telegram.messenger.MediaController;
public final class in6 implements Runnable {
    public final byte a;
    public final boolean[] b;
    public final id c;

    public in6(id idVar, boolean[] zArr, byte b) {
        this.a = b;
        this.c = idVar;
        this.b = zArr;
    }

    @Override
    public final void run() {
        byte b = this.a;
        boolean[] zArr = this.b;
        id idVar = this.c;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                if (!zArr[0]) {
                    idVar.show();
                    return;
                }
                return;
            case 1:
                String[] strArr2 = MediaController.W1;
                if (!zArr[0]) {
                    idVar.show();
                    return;
                }
                return;
            case 2:
                String[] strArr3 = MediaController.W1;
                try {
                    if (idVar.isShowing()) {
                        idVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            default:
                String[] strArr4 = MediaController.W1;
                try {
                    if (idVar.isShowing()) {
                        idVar.dismiss();
                    } else {
                        zArr[0] = true;
                    }
                    return;
                } catch (Exception e2) {
                    cc4.g(e2, true);
                    return;
                }
        }
    }

    public in6(boolean[] zArr, id idVar, byte b) {
        this.a = b;
        this.b = zArr;
        this.c = idVar;
    }
}
