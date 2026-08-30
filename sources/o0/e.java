package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class e implements Callable {
    public final int f16156a;
    public final String f16157b;
    public final Context f16158c;
    public final int d;
    public final Object e;

    public e(String str, Context context, Object obj, int i10, int i11) {
        this.f16156a = i11;
        this.f16157b = str;
        this.f16158c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f16156a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f16158c;
        String str = this.f16157b;
        switch (i10) {
            case 0:
                Object[] objArr = {(d) obj};
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
