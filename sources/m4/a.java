package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f15377a;
    public final b f15378b;

    public a(b bVar, int i10) {
        this.f15377a = i10;
        this.f15378b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15377a;
        b bVar = this.f15378b;
        switch (i10) {
            case 0:
                bVar.f15385a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f15384g;
                bVar.b();
                return;
        }
    }
}
