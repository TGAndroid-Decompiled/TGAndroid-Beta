package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class f implements Callable {
    public final int f16807a;
    public final String f16808b;
    public final Context f16809c;
    public final int d;
    public final Object f16810e;

    public f(String str, Context context, Object obj, int i10, int i11) {
        this.f16807a = i11;
        this.f16808b = str;
        this.f16809c = context;
        this.f16810e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f16807a;
        int i11 = this.d;
        Object obj = this.f16810e;
        Context context = this.f16809c;
        String str = this.f16808b;
        switch (i10) {
            case 0:
                Object[] objArr = {(e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return h.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
