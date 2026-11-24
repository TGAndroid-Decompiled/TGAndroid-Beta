package defpackage;

import android.net.Uri;
import org.telegram.messenger.MediaController;
public final class jn6 implements Runnable {
    public final byte a;
    public final qac b;
    public final Uri c;

    public jn6(qac qacVar, Uri uri, byte b) {
        this.a = b;
        this.b = qacVar;
        this.c = uri;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        qac qacVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                qacVar.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                qacVar.a(uri);
                return;
        }
    }
}
