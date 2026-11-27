package defpackage;

import android.net.Uri;
import org.telegram.messenger.MediaController;
public final class kn6 implements Runnable {
    public final byte a;
    public final pcc b;
    public final Uri c;

    public kn6(pcc pccVar, Uri uri, byte b) {
        this.a = b;
        this.b = pccVar;
        this.c = uri;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        pcc pccVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                pccVar.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                pccVar.a(uri);
                return;
        }
    }
}
