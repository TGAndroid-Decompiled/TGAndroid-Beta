package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class f implements Callable {
    public final int f15508a;
    public final String f15509b;
    public final Context f15510c;
    public final int d;
    public final Object e;

    public f(String str, Context context, Object obj, int i10, int i11) {
        this.f15508a = i11;
        this.f15509b = str;
        this.f15510c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f15508a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f15510c;
        String str = this.f15509b;
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
