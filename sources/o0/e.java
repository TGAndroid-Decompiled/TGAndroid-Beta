package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f18929a;
    public final String f18930b;
    public final Context f18931c;
    public final int d;
    public final Object e;

    public e(String str, Context context, Object obj, int i10, int i11) {
        this.f18929a = i11;
        this.f18930b = str;
        this.f18931c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f18929a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f18931c;
        String str = this.f18930b;
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
