package defpackage;

import android.os.Handler;
public final class fn8 implements e36 {
    public static final fn8 r = new fn8();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final g36 f = new g36(this);
    public final q78 h = new q78(this, (byte) 26);
    public final lj4 n = new lj4(this);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(u26.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            handler.getClass();
            handler.removeCallbacks(this.h);
        }
    }

    @Override
    public final g36 m() {
        return this.f;
    }
}
