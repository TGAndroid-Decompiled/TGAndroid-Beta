package defpackage;

import android.os.Handler;
public final class dl8 implements e16 {
    public static final dl8 r = new dl8();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final g16 f = new g16(this);
    public final w88 h = new w88(this, (byte) 18);
    public final pj4 n = new pj4(this, (byte) 26);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(u06.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            handler.getClass();
            handler.removeCallbacks(this.h);
        }
    }

    @Override
    public final g16 m() {
        return this.f;
    }
}
