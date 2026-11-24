package defpackage;

import android.net.Uri;
public final class yk implements Runnable {
    public final byte a;
    public final al b;

    public yk(al alVar, byte b) {
        this.a = b;
        this.b = alVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        al alVar = this.b;
        switch (b) {
            case 0:
                alVar.a.unregisterReceiver(alVar.d);
                return;
            case 1:
                alVar.a();
                return;
            default:
                Uri uri = al.g;
                alVar.b();
                return;
        }
    }
}
