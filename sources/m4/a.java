package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16475a;
    public final b f16476b;

    public a(b bVar, int i10) {
        this.f16475a = i10;
        this.f16476b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16475a;
        b bVar = this.f16476b;
        switch (i10) {
            case 0:
                bVar.f16481a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16480g;
                bVar.b();
                return;
        }
    }
}
