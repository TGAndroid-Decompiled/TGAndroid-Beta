package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f16468a;
    public final b f16469b;

    public a(b bVar, int i10) {
        this.f16468a = i10;
        this.f16469b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f16468a;
        b bVar = this.f16469b;
        switch (i10) {
            case 0:
                bVar.f16474a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f16473g;
                bVar.b();
                return;
        }
    }
}
