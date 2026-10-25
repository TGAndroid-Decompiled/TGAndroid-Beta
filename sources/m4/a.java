package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f17994a;
    public final b f17995b;

    public a(b bVar, int i10) {
        this.f17994a = i10;
        this.f17995b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f17994a;
        b bVar = this.f17995b;
        switch (i10) {
            case 0:
                bVar.f18002a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f18001g;
                bVar.b();
                return;
        }
    }
}
