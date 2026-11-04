package aa;

import android.os.Looper;
import androidx.activity.v;
import dd.k;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
public final class e extends i implements od.a {
    public final int f285a;

    public e(int i3, Object obj, Class cls, String str, String str2, int i10, int i11) {
        super(i3, obj, cls, str, str2, i10);
        this.f285a = i11;
    }

    @Override
    public final Object invoke() {
        switch (this.f285a) {
            case 0:
                ((f) this.receiver).getClass();
                String name = Thread.currentThread().getName();
                j.d(name, "<get-threadName>(...)");
                return Boolean.valueOf(ud.d.e(name, "Firebase Background Thread #"));
            case 1:
                ((f) this.receiver).getClass();
                String name2 = Thread.currentThread().getName();
                j.d(name2, "<get-threadName>(...)");
                return Boolean.valueOf(ud.d.e(name2, "Firebase Blocking Thread #"));
            case 2:
                ((f) this.receiver).getClass();
                return Boolean.valueOf(!Looper.getMainLooper().isCurrentThread());
            case 3:
                ((v) this.receiver).d();
                return k.f8801a;
            default:
                ((v) this.receiver).d();
                return k.f8801a;
        }
    }
}
