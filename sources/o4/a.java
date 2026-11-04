package o4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f20575a;
    public final b f20576b;

    public a(b bVar, int i3) {
        this.f20575a = i3;
        this.f20576b = bVar;
    }

    @Override
    public final void run() {
        int i3 = this.f20575a;
        b bVar = this.f20576b;
        switch (i3) {
            case 0:
                bVar.f20581a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f20580g;
                bVar.b();
                return;
        }
    }
}
