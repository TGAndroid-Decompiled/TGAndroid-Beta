package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f16897a;
    public final String f16898b;
    public final Context f16899c;
    public final int d;
    public final Object f16900e;

    public e(String str, Context context, Object obj, int i10, int i11) {
        this.f16897a = i11;
        this.f16898b = str;
        this.f16899c = context;
        this.f16900e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f16897a;
        int i11 = this.d;
        Object obj = this.f16900e;
        Context context = this.f16899c;
        String str = this.f16898b;
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
