package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f20687a;
    public final String f20688b;
    public final Context f20689c;
    public final int d;
    public final Object f20690e;

    public e(String str, Context context, Object obj, int i7, int i10) {
        this.f20687a = i10;
        this.f20688b = str;
        this.f20689c = context;
        this.f20690e = obj;
        this.d = i7;
    }

    @Override
    public final Object call() {
        int i7 = this.f20687a;
        int i10 = this.d;
        Object obj = this.f20690e;
        Context context = this.f20689c;
        String str = this.f20688b;
        switch (i7) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return g.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
