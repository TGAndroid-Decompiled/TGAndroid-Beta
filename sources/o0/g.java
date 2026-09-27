package o0;

import android.content.Context;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
public final class g implements Callable {
    public final int f15531a;
    public final String f15532b;
    public final Context f15533c;
    public final int d;
    public final Object e;

    public g(String str, Context context, Object obj, int i10, int i11) {
        this.f15531a = i11;
        this.f15532b = str;
        this.f15533c = context;
        this.e = obj;
        this.d = i10;
    }

    @Override
    public final Object call() {
        int i10 = this.f15531a;
        int i11 = this.d;
        Object obj = this.e;
        Context context = this.f15533c;
        String str = this.f15532b;
        switch (i10) {
            case 0:
                Object[] objArr = {(f) obj};
                ArrayList arrayList = new ArrayList(1);
                Object obj2 = objArr[0];
                Objects.requireNonNull(obj2);
                arrayList.add(obj2);
                return i.b(str, context, DesugarCollections.unmodifiableList(arrayList), i11);
            default:
                try {
                    return i.b(str, context, (List) obj, i11);
                } catch (Throwable unused) {
                    return new h(-3);
                }
        }
    }
}
