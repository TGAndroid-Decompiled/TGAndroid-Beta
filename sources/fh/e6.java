package fh;

import gh.n7;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
public final class e6 implements NotificationCenter.NotificationCenterDelegate {
    public final int f6428a;
    public final n7 f6429b;
    public final p5 f6430c;
    public t5 d;
    public boolean f6431e;

    public e6(int i9, long j10) {
        this.f6428a = i9;
        n7 n7Var = new n7(i9, 0L, false);
        this.f6429b = n7Var;
        n7Var.f8629p = j10;
        p5 p5Var = new p5(j10, i9, new bg.i(this, 9));
        p5Var.f6717s = true;
        this.f6430c = p5Var;
    }

    public final void a() {
        if (this.f6431e) {
            return;
        }
        NotificationCenter.getInstance(this.f6428a).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f6429b.a();
        this.f6430c.g(false);
        this.f6431e = true;
    }

    public final void b() {
        if (!this.f6431e) {
            return;
        }
        NotificationCenter.getInstance(this.f6428a).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        n7 n7Var = this.f6429b;
        if (n7Var.f8626m != -1) {
            ConnectionsManager.getInstance(n7Var.f8616a).cancelRequest(n7Var.f8626m, true);
            n7Var.f8626m = -1;
        }
        n7Var.f8622i = false;
        this.f6430c.f();
        this.f6431e = false;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        t5 t5Var;
        if (i9 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f6429b && (t5Var = this.d) != null) {
            t5Var.run();
        }
    }
}
