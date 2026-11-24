package defpackage;

import android.net.Uri;
public final class yj implements Runnable {
    public final byte a;
    public final ak b;

    public yj(ak akVar, byte b) {
        this.a = b;
        this.b = akVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ak akVar = this.b;
        switch (b) {
            case 0:
                akVar.a.unregisterReceiver(akVar.d);
                return;
            case 1:
                akVar.a();
                return;
            default:
                Uri uri = ak.g;
                akVar.b();
                return;
        }
    }
}
