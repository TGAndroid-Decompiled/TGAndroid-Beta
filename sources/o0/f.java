package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class f implements Callable {
    public final int f20485a;
    public final String f20486b;
    public final Context f20487c;
    public final int d;
    public final Object f20488e;

    public f(String str, Context context, Object obj, int i3, int i10) {
        this.f20485a = i10;
        this.f20486b = str;
        this.f20487c = context;
        this.f20488e = obj;
        this.d = i3;
    }

    @Override
    public final Object call() {
        int i3 = this.f20485a;
        int i10 = this.d;
        Object obj = this.f20488e;
        Context context = this.f20487c;
        String str = this.f20486b;
        switch (i3) {
            case 0:
                Object[] objArr = {(e) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return h.b(str, context, DesugarCollections.unmodifiableList(arrayList), i10);
            default:
                try {
                    return h.b(str, context, (List) obj, i10);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
