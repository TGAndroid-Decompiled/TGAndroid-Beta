package defpackage;

import android.os.Handler;
public final class qo8 implements i36 {
    public static final qo8 r = new qo8();
    public int a;
    public int b;
    public Handler e;
    public boolean c = true;
    public boolean d = true;
    public final k36 f = new k36(this);
    public final uk8 h = new uk8(this, (byte) 4);
    public final xh4 n = new xh4(this, (byte) 23);

    public final void a() {
        int i = this.b + 1;
        this.b = i;
        if (i == 1) {
            if (this.c) {
                this.f.e(y26.ON_RESUME);
                this.c = false;
                return;
            }
            Handler handler = this.e;
            handler.getClass();
            handler.removeCallbacks(this.h);
        }
    }

    @Override
    public final k36 m() {
        return this.f;
    }
}
