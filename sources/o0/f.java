package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class f implements Callable {
    public final int f16938a;
    public final String f16939b;
    public final Context f16940c;
    public final int d;
    public final Object f16941e;

    public f(String str, Context context, Object obj, int i10, int i11) {
        this.f16938a = i11;
        this.f16939b = str;
        this.f16940c = context;
        this.f16941e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f16938a;
        int i11 = this.d;
        Object obj = this.f16941e;
        Context context = this.f16940c;
        String str = this.f16939b;
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
