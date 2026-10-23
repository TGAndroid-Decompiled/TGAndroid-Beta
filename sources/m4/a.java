package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16537a;
    public final b f16538b;

    public a(b bVar, int i10) {
        this.f16537a = i10;
        this.f16538b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16537a;
        b bVar = this.f16538b;
        switch (i10) {
            case 0:
                bVar.f16543a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16542g;
                bVar.b();
                return;
        }
    }
}
