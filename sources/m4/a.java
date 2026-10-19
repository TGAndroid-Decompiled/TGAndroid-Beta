package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16476a;
    public final b f16477b;

    public a(b bVar, int i10) {
        this.f16476a = i10;
        this.f16477b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16476a;
        b bVar = this.f16477b;
        switch (i10) {
            case 0:
                bVar.f16482a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16481g;
                bVar.b();
                return;
        }
    }
}
