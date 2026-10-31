package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f12688a;
    public final b f12689b;

    public a(b bVar, int i10) {
        this.f12688a = i10;
        this.f12689b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f12688a;
        b bVar = this.f12689b;
        switch (i10) {
            case 0:
                bVar.f12698a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f12697g;
                bVar.b();
                return;
        }
    }
}
