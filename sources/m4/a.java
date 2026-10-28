package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f17993a;
    public final b f17994b;

    public a(b bVar, int i10) {
        this.f17993a = i10;
        this.f17994b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f17993a;
        b bVar = this.f17994b;
        switch (i10) {
            case 0:
                bVar.f18001a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f18000g;
                bVar.b();
                return;
        }
    }
}
