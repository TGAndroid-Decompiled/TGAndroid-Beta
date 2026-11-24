package defpackage;

import android.net.Uri;
import org.telegram.messenger.MediaController;
public final class hl6 implements Runnable {
    public final byte a;
    public final p8c b;
    public final Uri c;

    public hl6(p8c p8cVar, Uri uri, byte b) {
        this.a = b;
        this.b = p8cVar;
        this.c = uri;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Uri uri = this.c;
        p8c p8cVar = this.b;
        switch (b) {
            case 0:
                String[] strArr = MediaController.W1;
                p8cVar.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                p8cVar.a(uri);
                return;
        }
    }
}
