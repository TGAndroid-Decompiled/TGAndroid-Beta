package m4;

import android.net.Uri;
public final class a implements Runnable {
    public final int f15115a;
    public final b f15116b;

    public a(b bVar, int i10) {
        this.f15115a = i10;
        this.f15116b = bVar;
    }

    @Override
    public final void run() {
        int i10 = this.f15115a;
        b bVar = this.f15116b;
        switch (i10) {
            case 0:
                bVar.f15120a.unregisterReceiver(bVar.d);
                return;
            case 1:
                b.a(bVar);
                return;
            default:
                Uri uri = b.f15119g;
                bVar.b();
                return;
        }
    }
}
