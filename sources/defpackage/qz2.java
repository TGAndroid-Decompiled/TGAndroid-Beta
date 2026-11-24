package defpackage;

import android.os.Looper;
public final class qz2 extends qq4 implements op4 {
    public final byte a;

    public qz2(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        g5c g5cVar = g5c.a;
        switch (b) {
            case 0:
                ((rz2) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                if (f9b.f(0, 2, name, "Firebase Background Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((rz2) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                if (f9b.f(0, 2, name2, "Firebase Blocking Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((rz2) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((vo7) this.receiver).c();
                return g5cVar;
            default:
                ((vo7) this.receiver).c();
                return g5cVar;
        }
    }
}
