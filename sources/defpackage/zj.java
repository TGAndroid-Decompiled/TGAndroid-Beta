package defpackage;

import android.net.Uri;
public final class zj implements Runnable {
    public final byte a;
    public final bk b;

    public zj(bk bkVar, byte b) {
        this.a = b;
        this.b = bkVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        bk bkVar = this.b;
        switch (b) {
            case 0:
                bkVar.a.unregisterReceiver(bkVar.d);
                return;
            case 1:
                bkVar.a();
                return;
            default:
                Uri uri = bk.g;
                bkVar.b();
                return;
        }
    }
}
