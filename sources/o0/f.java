package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class f implements Callable {

    public final int f19098a;

    public final String f19099b;

    public final Context f19100c;
    public final int d;

    public final Object f19101e;

    public f(String str, Context context, Object obj, int i10, int i11) {
        this.f19098a = i11;
        this.f19099b = str;
        this.f19100c = context;
        this.f19101e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f19098a;
        int i11 = this.d;
        Object obj = this.f19101e;
        Context context = this.f19100c;
        String str = this.f19099b;
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
