package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16473a;
    public final b f16474b;

    public a(b bVar, int i10) {
        this.f16473a = i10;
        this.f16474b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16473a;
        b bVar = this.f16474b;
        switch (i10) {
            case 0:
                bVar.f16479a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16478g;
                bVar.b();
                return;
        }
    }
}
