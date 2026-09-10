package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class f implements Callable {
    public final int f14093a;
    public final String f14094b;
    public final Context f14095c;
    public final int d;
    public final Object e;

    public f(String str, Context context, Object obj, int i10, int i11) {
        this.f14093a = i11;
        this.f14094b = str;
        this.f14095c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f14093a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f14095c;
        String str = this.f14094b;
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
