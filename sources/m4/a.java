package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16474a;
    public final b f16475b;

    public a(b bVar, int i10) {
        this.f16474a = i10;
        this.f16475b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16474a;
        b bVar = this.f16475b;
        switch (i10) {
            case 0:
                bVar.f16480a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16479g;
                bVar.b();
                return;
        }
    }
}
