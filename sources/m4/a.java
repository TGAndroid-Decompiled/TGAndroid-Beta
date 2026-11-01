package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f12689a;
    public final b f12690b;

    public a(b bVar, int i10) {
        this.f12689a = i10;
        this.f12690b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12689a;
        b bVar = this.f12690b;
        switch (i10) {
            case 0:
                bVar.f12699a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f12698g;
                bVar.b();
                return;
        }
    }
}
