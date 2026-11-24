package defpackage;

import android.os.Looper;
public final class b13 extends rs4 implements pr4 {
    public final byte a;

    public b13(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }

    @Override
    public final Object invoke() {
        byte b = this.a;
        boolean z = false;
        g7c g7cVar = g7c.a;
        switch (b) {
            case 0:
                ((c13) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                name.getClass();
                if (hbb.f(0, 2, name, "Firebase Background Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                ((c13) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                name2.getClass();
                if (hbb.f(0, 2, name2, "Firebase Blocking Thread #") >= 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                ((c13) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((yq7) this.receiver).c();
                return g7cVar;
            default:
                ((yq7) this.receiver).c();
                return g7cVar;
        }
    }
}
