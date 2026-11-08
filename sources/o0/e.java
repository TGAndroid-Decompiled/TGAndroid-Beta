package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f20682a;
    public final String f20683b;
    public final Context f20684c;
    public final int d;
    public final Object f20685e;

    public e(String str, Context context, Object obj, int i7, int i10) {
        this.f20682a = i10;
        this.f20683b = str;
        this.f20684c = context;
        this.f20685e = obj;
        this.d = i7;
    }

    @Override
    public final Object call() {
        int i7 = this.f20682a;
        int i10 = this.d;
        Object obj = this.f20685e;
        Context context = this.f20684c;
        String str = this.f20683b;
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
