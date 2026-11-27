package defpackage;

import android.os.Looper;
public final class j03 extends us4 implements sr4 {
    public final byte a;

    public j03(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        g9c g9cVar = g9c.a;
        switch (b) {
            case 0:
                ((k03) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                if (ddb.f(0, 2, name, "Firebase Background Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((k03) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                if (ddb.f(0, 2, name2, "Firebase Blocking Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((k03) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((vr7) this.receiver).c();
                return g9cVar;
            default:
                ((vr7) this.receiver).c();
                return g9cVar;
        }
    }
}
