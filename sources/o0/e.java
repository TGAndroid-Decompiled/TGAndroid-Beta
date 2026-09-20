package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f15481a;
    public final String f15482b;
    public final Context f15483c;
    public final int d;
    public final Object e;

    public e(String str, Context context, Object obj, int i10, int i11) {
        this.f15481a = i11;
        this.f15482b = str;
        this.f15483c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f15481a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f15483c;
        String str = this.f15482b;
        switch (i10) {
            case 0:
                Object[] objArr = {(d) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return g.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return g.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new f(-3);
                }
        }
    }
}
